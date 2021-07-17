public abstract class Commande {
    protected String operande;

    public Commande(String op) {
        this.operande = op;
    }

    public String getOperande(){
        return this.operande;
    }

    protected boolean isVariable(String exp)throws DeclarationInterditeException {
        return false ;
    }
    protected Variable operandeToVariable(String op) throws DeclarationInterditeException {
        return null ;
    }
    protected Expression operandeToExpression (String op) throws SyntaxErrorException{
        return null ;
    }

    //abstract public void executer();

}
