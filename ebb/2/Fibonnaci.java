public class Fibonnaci {

    public long getSumForFibonnaciLessThan(int number) {
        int currentElement = 1;
        int nextElement = 1;

        long sum = 0;

        while (currentElement < number) {

            currentElement = currentElement + nextElement;
            nextElement = currentElement - nextElement;

            if (currentElement % 2 == 0) {
                sum = sum + currentElement;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Fibonnaci fib = new Fibonnaci();
        System.out.println(fib.getSumForFibonnaciLessThan(4 * 1000 * 1000));
    }
}
