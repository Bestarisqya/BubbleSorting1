package BubbleSorting;

public interface BubbleSorting {
    public static void main(String[]args ) {
        String nama [] = {"Spiderman","superman","batman","wonderwomen","gundala"} ;
        String temp;
        System.out.println("String in sorted order:");
        for (int j = 0; j < nama.length; j++){
            for (int i = j+1; i< nama.length; i++){
                if (nama[i].compareTo(nama[j]) < 0){
                    temp = nama [j];
                    nama[j] = nama[i];
                    nama[i] = temp;
                }
            }
            System.out.println(nama[j]);
        }
    }
}
// 21090074_BestaRisqyaFiesta_2C