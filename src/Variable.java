public class Variable extends Symbole {

    private double valeur ;

    public Variable(String nom,Double val){
        super(nom);
        this.valeur=val ;
    }

    public void affecter(Double valeur){
        this.valeur=valeur;
    }

    public void afficher(){
        System.out.println(getNom()+'='+this.valeur);
    }


}
