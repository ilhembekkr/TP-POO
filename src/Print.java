public class Print extends Commande {


    public Print(String op){
        super(op);
    }


    public void executer(TableSymboles table){
        Expression expVar = new Expression(operande);
        double valeur=0 ;
        if (expVar.isNumber()) {  valeur = Double.parseDouble(String.valueOf(expVar)) ;}
        else {
            try {
                expVar.analyserParent();
                valeur  = expVar.evaluer(table);


            } catch (ParFermManqException e1) {
                System.out.println("parenthese fermante manquante !");
            } catch (ParOuvManqException e2) {
                System.out.println("parenthese ouvrante manquante !");
            }
        }
        System.out.println("valeurde"+operande+"="+valeur);
    }

}
