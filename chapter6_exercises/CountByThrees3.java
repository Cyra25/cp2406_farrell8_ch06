public class CountByThrees3 {
    public static void main(String[] args){
        int number = 3;
        final int END = 300;
        for (int i =number; i<=END; i+= number){
            System.out.println(i);
            if (i % 30 == 0){
                System.out.println();
            }

        }
    }
}
