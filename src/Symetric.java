
public class Symetric {
    public static void main(String[] args) {
        String[] myArray = {"a", "b", "c", "d", "d", "c", "b", "a"};
        int n = myArray.length;
 
        //Split array by half
        String[] a = new String[(n + 1)/2];
        String[] b = new String[n - a.length];
        String[] reverseB = new String[b.length];
 
        System.arraycopy(myArray, 0, a, 0, a.length);
        System.arraycopy(myArray, a.length, b, 0, b.length);

        //Reverse B array
        int j = b.length;
        for (int i = 0; i < b.length; i++) {
            reverseB[j - 1] = b[i];
            j = j - 1;
        }

        //checking if are Symmetric
        int count =0;
        for (int i = 0; i < reverseB.length; i++) {
            if (reverseB[i] == a[i]) {
                count++;

            }
        }

        if (count == (n/2)) {
            System.out.println("Symmetric");
        }else{
            System.out.println("Asymmetric");
        }

    }    
}
