public class Ennead {
    //Ennead means a set or series of nine. This class represents the rows, columns, and blocks of a sudoku puzzle
    Square[] squares = new Square[9];
    public Ennead(int[] values){
        for (int i=0; i <10; i++) {
            squares[i]= new Square(values[i]);
        }
    }
}
