import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TableSymboles {
    private ArrayList<Symbole>  tableSymboles ;

    public TableSymboles(){

        this.tableSymboles=new ArrayList<Symbole>();
    }


    public Symbole recherche(String nomSymb)//rechercher un symbole dans la table  ,
                                            // retourne le symbole si trouvé , null sinon
    {
        boolean trouv=false ;
        for (int i=0 ; i< tableSymboles.size() ; i++){
          if  (tableSymboles.get(i).getNom()==nomSymb) {
              trouv=true ;
              return tableSymboles.get(i);
          }
        }
        if (trouv==false) { return null ;}
        return null ;
    }

    public boolean ajouterSymbole (Symbole symb){
        if (this.recherche(symb.getNom()) == null )
        { tableSymboles.add(symb );
        return true ;}
        else
        {return false ;}
    }
}
