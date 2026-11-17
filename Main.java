public class Main{
    public static void main(String[] args){
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {

                if ((row + col) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}

