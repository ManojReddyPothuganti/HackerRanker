public class MinMax2DArray {
  public static double[][] array1 = //array to be used
   {{7.51, 9.57, 6.28, 5.29, 8.7},
    {8.07, 6.54, 5.44, 8.78, 8.66},
    {9.34, 9.73, 7.19, 6.87, 6.48}};
  public static void main(String[] args) {
    double max = array1[0][0];// highest value
    double min = array1[0][0];// lowest value 
    for (int row = 0; row < array1.length; row++){ //find highest value
      for (int col = 0; col < array1[row].length; col++){
        if (array1[row][col] > max){
         max = array1[row][col]; 
        }
      }
    }
    for (int r = 0; r < array1.length; r++){ //find lowest value
      for (int c = 0; c < array1[r].length; c++){
        if (array1[r][c] < min){
         min = array1[r][c]; 
        }
      }
    }
    System.out.println("Maximum is  : " + max);//print highest
    System.out.println("Minimum is  : " + min);//print lowest
  }
}