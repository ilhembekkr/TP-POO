import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class TableSymboles {
    private HashMap<String , Double>  tableSymboles ; // <variable , valeur >

    public TableSymboles(){

        this.tableSymboles=new HashMap<String , Double>();
    }


    public Double recherche(String nomSymb)//rechercher une variable dans la table  ,
    // retourne la valeur symbole si trouvé , null sinon
    {
        if (tableSymboles.containsKey(nomSymb) ) {
            return tableSymboles.get(nomSymb) ;
        }
        return null ;
    }

    public void ajouterSymbole (String nomSymb,Double valeur){
        tableSymboles.put(nomSymb,valeur);
    }
}

