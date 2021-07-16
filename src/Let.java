public class Let extends Commande {
    private String variable ;
    private String valeur ;

    Let (String op){
        super(op);
    }

    private boolean isVariable(TableSymboles table) {
        if (table.recherche(variable) == null ) {
            // variable introuvable
        }
        else {

        }

    }
    public void executer(TableSymboles table){
        String[] stringlist = operande.split("=") ;
            if (stringlist == null){
                new SyntaxErrorException() ;
            }
            else {
                this.variable = stringlist[0] ;
                this.valeur = stringlist[1] ;
            }
            if(table.recherche(variable) == null ) {
                // exception

            }



        }










    }

