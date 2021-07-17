public class LigneDeCommande {
    private String ligneStr ;

    public LigneDeCommande(String Cmd){
        ligneStr = Cmd ;
    }

    public  Commande extraireCommande() throws CommandeIntrouvableException,DeclarationInterditeException  {
        String [] ligne =  ligneStr.split(" ");

        if (ligneStr.trim().startsWith("let") ) {
            String operande = ligneStr.trim().replace("let","") ;
            try {
                return new Let(operande);
            }catch(DeclarationInterditeException e){
                System.out.println("Declaration interdite !");
            }
        }
        else if (ligneStr.trim().startsWith("print") ) {
            String operande = ligneStr.trim().replace("print","") ;
            return new Print(operande);
        } else {
            throw new CommandeIntrouvableException() ;
        }

    }



}
