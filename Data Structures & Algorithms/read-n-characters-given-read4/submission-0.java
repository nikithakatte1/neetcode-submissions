// The inherited read4(char[] buf4) API is provided by the judge.
class Solution extends Reader4 {
    public Solution() {}

    public int read(char[] buf, int n) {
        char[] temp = new char[4];
        int total = 0;

        while (total < n) {
            int count = read4(temp);

            if (count == 0) {
                break;
            }

            int copy = Math.min(count, n - total);

            for (int i = 0; i < copy; i++) {
                buf[total + i] = temp[i];
            }
            total += copy;
        }

        return total;
    }
}

