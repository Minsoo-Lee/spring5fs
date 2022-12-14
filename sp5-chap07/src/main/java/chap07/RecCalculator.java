package chap07;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long start = System.currentTimeMillis();
        try {
            if (num == 0)
                return 1;
            else
                return num * factorial(num - 1);
        } finally {
            long end = System.currentTimeMillis();
            System.out.printf("Rec.fac(%d) runtime = %d\n", num, (end - start));
        }
    }
}
