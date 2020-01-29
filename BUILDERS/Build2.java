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
interface  Builder {
  RobotBuilder setCPU(String cpu);

    RobotBuilder setLegs(int legs);

    RobotBuilder setHands(int hands);

    RobotBuilder setEyes(int eyes);
}
    public static class RobotBuilder implements Builder{
        private String CPU;
        private int legs;
        private int hands;
        private int eyes;

        public RobotBuilder setCPU(String cpu) {
         CPU = cpu;
         return RobotBuilder.this;
        }

       public RobotBuilder setLegs(int legs){
           this.legs = legs;
           return RobotBuilder.this;
        }

      public RobotBuilder setHands(int hands) {
          this.hands =hands;
          return RobotBuilder.this;
        }

       public RobotBuilder setEyes(int eyes) {
           this.eyes = eyes;
           return RobotBuilder.this;
        }

        Robot build() {
           return new Robot(CPU,legs,hands,eyes);
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
        final Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();
        /* Set CPU */
        robotBuilder.setCPU("Intel Core i5");
        /* Would like to set legs? */
        int legs = scanner.nextInt();
        /* Would like to set hands? */
        int hands = scanner.nextInt();
        /* Would like to set eyes? */
        int eyes = scanner.nextInt();

        Robot robot = new Robot("Intel Core i5",legs,hands,eyes);

        System.out.println(robot);
        scanner.close();
    }
}