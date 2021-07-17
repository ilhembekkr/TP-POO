public abstract class Commande {
    protected String operande;

    public Commande(String op) {
        this.operande = op;
    }



    abstract public void executer(TableSymboles table);

}
