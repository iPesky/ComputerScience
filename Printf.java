public class Printf {
    public static void main(String[] args) {

        double tau = Math.PI * 2;

        String name = "Thomas Huber";
        String month = "November";
        String day = "10";
        String year = "2000";

        System.out.printf("THE REAL CIRCLE CONSTANT IS TAU!!! which is equal to %f", tau);
    
        System.out.printf("\nMy name is %s and I was born %s %s %s", name, month, day, year);
    }
}