package ch12_array;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A","B","C","D","F"};

        for(int i=0; i< scores.length-1; i++) {
            scores[i] += "+";
        }

        System.out.print("점수 : ");
        for(int i=0; i< scores.length; i++) {
            System.out.print(scores[i]+" / ");
        }
    }
}
