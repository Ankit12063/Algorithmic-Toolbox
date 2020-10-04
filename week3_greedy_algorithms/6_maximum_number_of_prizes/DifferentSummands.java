public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int start = 1;
        int newNumber = n;

        if (n == 2) {
            summands.add(2);
            return summands;
        }

        while (true) {
            if (summands.contains(newNumber - start)) {
                start++;
                continue;
            } else {
                newNumber -= start;
                summands.add(start);
                start++;
            }

            if (newNumber == 0) {
                return summands;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());

        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}
