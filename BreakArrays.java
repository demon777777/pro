class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String words[]=scanner.nextLine().split("\\s+");

       String reversed[]=breakM(words);
        Arrays.stream(reversed).forEach(e-> System.out.print(e + " "));

    }
    private static String[] breakM(String ... args){
        String temp;
for(int i = 0;i<args.length/2;i++){
    temp = args[i];
    args[i]=args[args.length-1-i];
    args[args.length-1-i]=temp;
}
return args;
    }

}