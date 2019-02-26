package sumaveragerunningint;

public class SumAverageRunningInt {

    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;
            average = (double) sum / (double) (upperbound - lowerbound + 1);

        }
            System.out.println("La suma es " + sum);
            System.out.println("El promedio es " + average);
    }
}
