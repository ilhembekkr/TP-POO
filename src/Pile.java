import java.util.ArrayDeque;
import java.util.Deque;




    class PileVideException extends Exception{}

    public class Pile {
        private Deque<Character> pile = new ArrayDeque<Character>(); //ligne5

        // empile x au sommet de la pile
        public void empiler(char x) {
            pile.addFirst(x);   //ligne 9
        }

        /*retourne l’élément qui est au sommet de la pile en le supprimant de la pile. Elle  lance une exception si la pile est vide*/
        public char depiler() throws PileVideException { //ligne 13
            if (this.estVide()){ throw  new PileVideException() ;}   //ligne 14
            else   {return pile.removeFirst();}//ligne 15

        }
        public boolean estVide() {//retourne true si la pile est vide et false dans le cas contraire
            if (pile.isEmpty() ) { return true ;} //ligne 19
            else { return false ;}
        }
    }


