
public class Week2Task1 {
    public static void main(String[] args) {
        /*
         * Write a program to check whether a person can cast a vote or not.
         * The condition is you must be over 18 years old to vote.
         */
        int age = 18;
        if (age < 18) {
            System.out.print("You cannot cast vote");
        } else {
            System.out.print("You can cast vote");
        }

        /* Write a program to calculate SI. Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        int principleamount = 1200;
        int time= 2;
        float rate = 10;
        float si=(principleamount*time*rate)/100;
        System.out.println("The SI is:"+si);

        /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        int l = 4;
        int b = 6;
        int h = 2;

        int volumeofcuboid = l*b*h;
        float area = (b*h)/2;
        int volumeofcube = l*l*l;
        System.out.println("The volume of cuboid:" +volumeofcuboid);
        System.out.println("The area of triangle is :"+area);
        System.out.println("The volume of cube is:"+volumeofcube);

        /* Write the ternary operator for question no. 1*/
        int age2= 20 ;
        boolean tExpression1 = age2>20;
        String output =tExpression1 ? "Can vote":"Cannot vote";
        System.out.println(output);

        
       


    }
}
