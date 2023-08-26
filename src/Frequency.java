public class Frequency {
    public static void main(String[] args) {
        int[] myArray = {1,2,1,3,3,1,2,1,5,1};
        int frequency;

        for (int i = 1; i <= 5; i++) {
            frequency = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (i == myArray[j]) {
                    frequency++;
                }
            }
            System.out.println(i+": "+"*".repeat(frequency));
        }
    }
}
