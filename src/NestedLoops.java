public class NestedLoops {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++)
        {
            for(int column = 1; column <= row; column++)
            {

                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("-----------");
        for(int row = 5; row > 0; row--)
        {
            for(int column = 1; column <= row; column++)
            {

                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("-----------");
        for(int row = 1; row <= 5; row++)
        {
            for(int column = 1; column <= 5; column++)
            {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
