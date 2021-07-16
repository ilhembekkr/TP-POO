//changement de logique
// creer une liste de termes de l'xpression : split (+ / -)
// pour chaque terme instancier un objet terme
// dans la classe terme creer une liste de facteurs
// et ainsi de suite

public class Expression {

    private String expressionStr ;

    public void Expression(String exp){
        this.expressionStr= exp ;
    }

    public void analyser() throws SyntaxErrorException {
        Pile pile = new Pile();
        int i=0 ;


    }

    public double evaluer(){
        System.out.println("evaluer");
        return 0;
    }


}
