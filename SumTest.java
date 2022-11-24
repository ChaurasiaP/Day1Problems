class SumTest {
    public static void main(String[] values) {
        int sum = 0;
        int c=0;
        int invalInt=0;
        System.out.println("Calculate sum for below integers");
        for (String value : values) {
            System.out.println(value);
            sum = sum + Integer.parseInt(value);
            invalInt=Integer.parseInt(value);
            if (invalInt < 0){
                c=c+1;
        }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Number of invalid integers: "+c);
    }
}
