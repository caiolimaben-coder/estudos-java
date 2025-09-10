public class Fibonacci {
    /** Print out the Fibonacci sequence for values < 50 */
    public static void main(String[] args) {
        System.out.println("Fibonacci Test");
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        while (hi < 100) {
            System.out.println(hi);
            hi = lo + hi;       // new hi
            lo = hi - lo;       /* new lo is (sum - old lo)
                                  that is, the old hi */

        }
    }
}