class Portfolio {

    String name;
    double returnRate;
    double volatility;

    Portfolio(String n, double r, double v) {

        name = n;
        returnRate = r;
        volatility = v;
    }
}

class PortfolioSort {

    static void mergeSort(Portfolio arr[], int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    static void merge(Portfolio arr[], int l, int m, int r) {

        Portfolio temp[] = new Portfolio[r - l + 1];

        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {

            if (arr[i].returnRate <= arr[j].returnRate)
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[l + x] = temp[x];
    }
}