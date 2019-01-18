import java.util.Random;

public class Bubblesort {

    public static void main(String[] args){
        Random randomGenerator = new Random();
        int length = 7;
        int max = 100;
        int[] nummern = new int[]{1,2,3,4,5,6,7,8};//[length];
//        for (int i = 0; i < length ; i++) {
//            //nummern[i] = length-i;
//            nummern[i] = randomGenerator.nextInt(max);
//        }

//        for (int i = 0; i < length ; i++) {
//            System.out.println(nummern[i]);
//        }
        System.out.println(bubbleSort(nummern));
        //bubbleSort(nummern);
        for (int i = 0; i < nummern.length ; i++) {
            System.out.println(nummern[i]);
        }
    }


    public static int bubbleSort(int[] f){
        int count = 1;
        int cnt = 0;
        int zwischenspeicher;
        for (int i = 0; i <f.length-1 ; i++) {
            for (int j = 0; j < f.length-count ; j++) {
                cnt++;
                if (f[j] > f[j + 1]) {
                    zwischenspeicher = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = zwischenspeicher;
                }
            }
            count++;
        }
        return cnt;
    }
}
