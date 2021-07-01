public class LigneDeCommande {
    private String chaine ;
    private String[] list =new String[2];
    private Commande cmd ;

    public LigneDeCommande(String ch){
        this.chaine=ch;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public String getChaine() {
        return chaine;
    }

    public void interpreter() throws CommandeIntrouvableException {
        list=this.chaine.split(" ",2);
        System.out.println(list[0]);
        System.out.println(list[1]);
        switch (list[0]){
            case "print" :
                 this.cmd = new Print(list[1]);
                break ;
            case "let" :
                this.cmd=new Let(list[1]);
                break ;
            default :  throw new CommandeIntrouvableException();
        }
    }
}
