import java.lang.Math;
public class FonctionStandard extends Symbole {
    private double operande;

    public FonctionStandard(String nom ){
        super(nom);
    }
    public double calculer(){
        switch (super.getNom()){
            case "sin" :
                //return sin(this.operande);
                break;
            case "cos" :
                break;
            case "log" :
                break;

        }
        return 0;
    }
}
