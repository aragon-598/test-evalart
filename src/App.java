public class App {
    public static void main(String[] args){

        int[] myArray = {13,2,4,35,1};
        for (int i = myArray.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j]>myArray[j+1]) {
                    int value = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = value;
                }
            }
        }
            int maxNumber = myArray[myArray.length-1];
            System.out.println(maxNumber);
    }
}