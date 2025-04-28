package ch12_array;

public class Array02 {
    public static void main(String[] args) {
        int[] intArr01 = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int evenSum = 0;

        for(int i=0; i< intArr01.length; i++) {
            sum += intArr01[i];
        }
        for(int i=1; i< intArr01.length; i+=2) {
            evenSum += intArr01[i];
        }

        System.out.println(sum);
        System.out.println(evenSum);


        int[] intArr02 = new int[100];
        int total = 0;
        int total3 = 0;
        int total33 = 0;
        for(int i=0; i< intArr02.length; i++) {
            intArr02[i] = i+1;

            total += intArr02[i];

            if(intArr02[i]%3 == 0) {
                total3 += intArr02[i];
            }
        }

        System.out.println(total);
        System.out.println(total3);
    }
}
