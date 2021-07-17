public class Print extends Commande {


    public Print(String op){
        super(op);
    }


    public void executer(TableSymboles table){
        Expression expVar = new Expression(operande);
        boolean erreur=false ;
        double valeur=0 ;
        if (expVar.isNumber()) {  valeur = Double.parseDouble(operande );}
        else {
            try {
                expVar.analyserParent();
                valeur  = expVar.evaluer(table);


            } catch (ParFermManqException e1) {
                System.out.println("parenthese fermante manquante !");
                erreur=true ;
            } catch (ParOuvManqException e2) {
                System.out.println("parenthese ouvrante manquante !");
                erreur=true ;
            }
        }
        if(!erreur)
        {System.out.println("valeur de"+operande+"="+valeur);}
    }

}
