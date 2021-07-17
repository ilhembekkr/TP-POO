public class Let extends Commande {

    private String variable ;
    private String expression  ;

    public Let (String op){
        super(op);
        String[] s=op.trim().split("=");
        this.variable=s[0].trim();
        System.out.println(variable);
        this.expression=s[1].trim();
        System.out.println(expression);
    }






    public void executer(TableSymboles table)  {
        Expression expVar = new Expression(expression);
        boolean erreur=false ;
        //boolean isNum = false ;
        double valeur=0 ;
        if (expVar.isNumber()) {  valeur = Double.parseDouble(String.valueOf(expression)) ;System.out.println("hhh");}
        else {
            try {
                expVar.analyserParent();
                valeur  = expVar.evaluer(table);


            } catch (ParFermManqException e1) {
                erreur=true ;
                System.out.println("parenthese fermante manquante !");
            } catch (ParOuvManqException e2) {
                erreur=true ;
                System.out.println("parenthese ouvrante manquante !");
            }
        }

        System.out.println(variable);

           if (!erreur ){ table.ajouterSymbole(variable,valeur);

        System.out.println("valeur ajoutee"+valeur);}

    }












    }

