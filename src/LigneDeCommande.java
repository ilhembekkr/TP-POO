public class LigneDeCommande {
    private String ligneStr ;

    LigneDeCommande(String Cmd){
        ligneStr = Cmd ;
    }
    public  Commande extraireCommande() throws CommandeIntrouvableException  {
        String [] ligne =  ligneStr.split(" ");

        if (ligneStr.trim().startsWith("let") ) {
            String operande = ligneStr.trim().replace("let","") ;
            return new Let(operande);

        }
        else if (ligneStr.trim().startsWith("print") ) {
            String operande = ligneStr.trim().replace("print","") ;
            return new Print(operande);
        } else {
            throw new CommandeIntrouvableException() ;
        }

    }

    public String extraireOperande(){
        String [] ligne =  ligneStr.split(" ");
        return "";
    }

}
