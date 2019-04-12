public class DiagonalOs {
    public static void main(String[] args){
        final String CHAR = "O";
        final String SPACE =" ";


            for (int i = 0; i < 10; i++) {
                String repeated = SPACE.repeat(i);

                System.out.println(repeated + CHAR);
            }

    }
}
