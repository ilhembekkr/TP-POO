public class LigneDeCommande {
    private String ligneStr ;

    LigneDeCommande(String Cmd){
        ligneStr = Cmd ;
    }
    public Commande extraireCommande() throws CommandeIntrouvableException ,SyntaxErrorException {
        String [] ligne =  ligneStr.split(" ");

        if (ligneStr.trim().startsWith("let") ) {
            String operande = ligneStr.trim().replace("let","") ;
            new Let(operande);

        }
        else if (ligneStr.trim().startsWith("print") ) {
            String operande = ligneStr.trim().replace("let","") ;
            new Print(operande);
        } else {
            throw new SyntaxErrorException() ;
        }

    }

    public String extraireOperande(){
        String [] ligne =  ligneStr.split(" ");
        return
    }

}
