import java.util.HashMap;

public class Expression {

    private String string ;

    public Expression(String exp){
        this.string= exp ;
    }


    public  boolean isNumber()
    {
        for (char c : string.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public void analyserParent() throws ParOuvManqException , ParFermManqException{
        Pile pile = new Pile();
        int i=0 ;
        //System.out.println(string.length());
        while (i<string.length()){
           if( string.charAt(i) == '('){pile.empiler('(');}
           else if ( string.charAt(i) == ')' ) {
               try {
                   pile.depiler() ;
               } catch (PileVideException e) {
                   throw new ParOuvManqException();
               }
           }
           i++;
        }



        if (!pile.estVide()){ throw new ParFermManqException();}

    }


    public  double eval() throws SyntaxErrorException {
        final String str=this.string;
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() throws SyntaxErrorException {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) {throw new SyntaxErrorException();}
                return x;
            }



            double parseExpression() throws SyntaxErrorException {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() throws SyntaxErrorException {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() throws SyntaxErrorException {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("abs")) x = Math.abs(x);
                    else if (func.equals("log"))
                    {
                        if( x>0 ) { x = Math.log(x);}
                        else  { System.out.println("parametre de log negatif !"); }
                    }
                    else //throw new RuntimeException("fonction non existante : " + func);
                        throw new FonctionIntrouvableException();
                } else {
                    //throw new RuntimeException("Unexpected: " + (char)ch);
                    throw new SyntaxErrorException();
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    public double  evaluer (TableSymboles table) {
        double val=0;
        for (HashMap.Entry<String, Double> entry : table.getTableSymboles().entrySet()) {
            String key = entry.getKey().trim();
            Double value = entry.getValue();
            if (string.contains(key.trim())) {
                string= string.replace(key.trim(), value.toString().trim());
            }
        }

        try {
            val=eval();
        }
        catch (FonctionIntrouvableException e) {
            System.out.println("FonctionIntrouvable !");
        } catch (SyntaxErrorException e) {
            System.out.println("erreur de syntaxe  !");
        }
        return val ;
    }

}
