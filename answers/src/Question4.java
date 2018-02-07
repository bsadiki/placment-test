public class Question4 {
    public static void main(String[] args) {
        System.out.println(questionA());
        questionB();
        System.out.println(execute(1,10));
        System.out.println(execute(1,5));
    }
    static String questionA(){
        String output="|";
        Character[] xAndO = {'O','O','X','O','X','X','X',' ','O'};
        for (int i = 0 ; i< xAndO.length;i++){
            output+= xAndO[i] + "|";
            if ((i+1)%3==0 && i+1<xAndO.length)
                output += "\n|";
        }
        return output;
    }
    static void questionB(){
        int lignesNumber = 9;
        int [][] triangle = new int[lignesNumber][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;
        for (int row = 1; row < lignesNumber; row++) {
            triangle[row] = new int [triangle [row - 1].length + 1];
            for (int col = 0; col <= row; col++) {
                if ((col == 0) || (col == row)) {
                    triangle[row][col] = 1;
                } else {
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
                }
            }
        }
        for (int row = 0; row < lignesNumber; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(triangle[row][col] + " ");
            }
            System.out.println();
        }
    }
    static int execute(int m, int n) {
        if(n == 0){ return 0;}
        else if(m == 0){ return 2 * n;}
        else if(n == 1){ return 2;}
        else { return execute(m - 1, execute(m, n - 1));}

    }
}
