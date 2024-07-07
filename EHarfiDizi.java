public class EHarfiDizi {
    public static void main(String[] args) {
        String [][] letterE = new String[7][4];

        for (int i = 0 ; i<letterE.length; i++){
            for (int j = 0 ; j<letterE[i].length ; j++){

                if (i==0 || i==3 || i==6) {
                    letterE[i][j] = " * ";
                }
                else if (j==0){
                    letterE[i][j] = " * ";
                }
                else {
                    letterE[i][j] = "   ";
                }
            }
                }
            for (String[] row : letterE){
                for (String col : row){
                    System.out.print(col);
                }
                System.out.println();

        }
    }
}