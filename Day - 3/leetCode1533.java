class leetCode1533 {
    public int getIndex(ArrayReader reader) {
        int left = 0;
        int right = reader.length() - 1;

        while (left < right) {
            int len = right - left + 1;
            int mid = left + (right - left) / 2;

            if (len % 2 == 0) {
                int result = reader.compareSub(left, mid, mid + 1, right);

                if (result == 1) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                int result = reader.compareSub(left, mid - 1, mid + 1, right);

                if (result == 0) {
                    return mid;
                } else if (result == 1) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return left;
    }
}