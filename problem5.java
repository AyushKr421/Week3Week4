class AccountSearch {

    static int linearSearch(String arr[], String key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(key))
                return i;
        }

        return -1;
    }

    static int binarySearch(String arr[], String key) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid].equals(key))
                return mid;

            if (arr[mid].compareTo(key) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}