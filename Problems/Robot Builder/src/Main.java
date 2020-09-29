import java.util.Scanner;

class Robot {

    private String CPU;
    private int legs;
    private int hands;
    private int eyes;

    Robot(String CPU, int legs, int hands, int eyes) {
        this.CPU = CPU;
        this.legs = legs;
        this.hands = hands;
        this.eyes = eyes;
    }

    public static class RobotBuilder {

        /* write your code here (fields) */

        /* write your code here (constructor) */

        RobotBuilder setCPU(String cpu) {
            /* write your code here */
        }

        RobotBuilder setLegs(int legs) {
            /* write your code here */
        }

        RobotBuilder setHands(int hands) {
            /* write your code here */
        }

        RobotBuilder setEyes(int eyes) {
            /* write your code here */
        }

        Robot build() {
            /* write your code here */
        }
    }

    @Override
    public String toString() {
        return "CPU : " + CPU + "\n" +
                "Legs : " + legs + "\n" +
                "Hands : " + hands + "\n" +
                "Eyes : " + eyes + "\n";
    }
}

class TestDrive {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Robot.RobotBuilder robotBuilder = /* write your code here */
        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();

        Robot robot = /* write your code here */

        System.out.println(robot);
        scanner.close();
    }
}