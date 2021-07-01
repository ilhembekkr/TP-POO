public class Variable extends Symbole {

    private double valeur ;

    public void Variable(String nom,Double val){
        super.Symbole(nom);
        this.valeur=val ;
    }

    public void affecter(Double valeur){
        this.valeur=valeur;
    }

    public void afficher(){
        System.out.println(getNom()+'='+this.valeur);
    }


}
