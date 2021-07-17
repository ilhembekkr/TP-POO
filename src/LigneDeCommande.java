public class LigneDeCommande {
    private String ligneStr ;

    public LigneDeCommande(String Cmd){
        ligneStr = Cmd ;
    }

    public  Commande extraireCommande() throws CommandeIntrouvableException  {
        //String [] ligne =  ligneStr.split(" ");

        if (ligneStr.trim().startsWith("let") ) {
            String operande = ligneStr.trim().replace("let","") ;
            String variableInterdite[] = {"log", "l", "o", "s", "g", "lo", "og", "sin", "s", "i", "n", "si", "in", "cos", "c", "co", "os","sqrt","t","q" , "sq","rt","qr","sqr","qrt","r"};
            String[] s=operande.trim().split("=");
            String variable = s[0].trim();
            boolean trouv = false ;
            int i =0 ;
            while ((trouv == false ) && (  i < variableInterdite.length  )){
                if (variable.compareTo(variableInterdite[i])==0 ) {
                    trouv = true ;
                    System.out.println("Declaration interdite !");
                }
                i++;
            }

                return new Let(operande);

        }
        else if (ligneStr.trim().startsWith("print") ) {
            String operande = ligneStr.trim().replace("print","") ;
            return new Print(operande);
        } else {
            throw new CommandeIntrouvableException() ;
        }

    }



}
