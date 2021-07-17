public class Let extends Commande {

    private String variable ;
    private Double valeur ;

    public Let (String op){
        super(op);
    }



  /*  private boolean isVariable(TableSymboles table) {
        if (table.recherche(variable) == null ) {
            // variable introuvable
        }
        else {

        }

    }*/


    public void executer(TableSymboles table) throws ParFermManqException, ParOuvManqException {
        if ( table.recherche(variable) == null ){
            try {
                System.out.println("hi");
                Expression expVar = new Expression(variable);
                Double newval = expVar.evaluer(table) ;
                table.ajouterSymbole(variable,newval); ;

            }
            catch(ParFermManqException e1){
                System.out.println("parenthese fermante manquante !");
            }
            catch(ParOuvManqException e2){
                System.out.println("parenthese ouvrante manquante !");
            }
            catch (FonctionIntrouvableException e){
                System.out.println("FonctionIntrouvable !");}
            catch (SyntaxErrorException e) {
                System.out.println("erreur de syntaxe  !");
            }

        } else {
            table.ajouterSymbole(variable,valeur);
        }

    }












    }

