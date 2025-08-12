public class Months {
    public static void main(String[] args) {
        String[] months = { " ",
                "Jan", "Feb", "Mar",
                "Apr", "May", "Jun",
                "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec"
        };
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        int n = 1000;
        int[] a = new int[n];
        a[1000] = 10;
        System.out.println(a[1000]);
    }
}