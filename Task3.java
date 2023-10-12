public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        for (int elem:input
             ) {
            if(elem % 3 == 0){
                System.out.println(elem);
            }
        }
    }
}
