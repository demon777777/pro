
public class Main {


        public static int searchInSubArray(int[] numbers, int startIndex, int endIndex, int value) {
            int index = -1;

            if(numbers[startIndex] == value && numbers[endIndex] == value){
                return startIndex;
            }

            return index;
        }



        /* Do not change code below */
        public static void main(String[] args) {
            while (true) {
                final Scanner scanner = new Scanner(System.in);
                final int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                final String[] parts = scanner.nextLine().split("\\s+");
                final int startIndex = Integer.parseInt(parts[0]);
                final int endIndex = Integer.parseInt(parts[1]);
                final int k = Integer.parseInt(scanner.nextLine());
                System.out.println(searchInSubArray(numbers, startIndex, endIndex, k));
            }
        }
    }
