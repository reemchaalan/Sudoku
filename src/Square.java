public class Square {
    //This class represents the small squares of the Sudoku Puzzle
    int value;
    int[] PV = {0,1,2,3,4,5,6,7,8,9}; //where PV stands for possible values
    public Square(int value){
        this.value = value;
        if (this.value!=0) {
            for (int i:PV) {
                PV[i]=0;
            }
            PV[value]=value;
        }
    }

    public Square(){
        this(0);
    }
}
