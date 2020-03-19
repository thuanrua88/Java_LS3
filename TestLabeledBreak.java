package Java_LS2;

public class TestLabeledBreak {
    public static void main(String[] args) {
        int[][] testArray = {
                {1, 2, 3, 4},
                {4, 3, 1, 4},
                {9, 2, 3, 4}
        };
        int magicNumber = 1;
        boolean found = false;
        mainLoop :
        for (int i = 0; i < testArray.length; i++){
            for(int j = 0; j < testArray[i].length; ++j){
                if (testArray[i][j] == magicNumber){
                    found = true;
                    break mainLoop;
                }
            }
        }
        System.out.println("Magic number " + (found ? "found" : "NOT found"));
    }
}
