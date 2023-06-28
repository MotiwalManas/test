import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findPairs {
    public static int[] printPairs(int arr[], int n, int sum) {
        List<int[]> values = new ArrayList<int[]>();
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {

                    values.add(new int[] { arr[i], arr[j] });
                    newArr.add(arr[i]);
                    newArr.add(arr[j]);
                }

            }
        }
        Collections.sort(newArr);
        for (int[] eachRow : values) {
            System.out.print(Arrays.toString(eachRow));
        }
        System.out.println();

        System.out.print(newArr);
        int[] Arr = newArr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return Arr;

    }

    public static void secondPair(int[] arr, int sum) {
        int Double = sum * 2;
        List<int[]> values = new ArrayList<int[]>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Double) {
                values.add(new int[] { arr[i] });
            }
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {

                        if (arr[i] + arr[j] + arr[k] + arr[l] == Double) {
                            values.add(new int[] { arr[i], arr[j], arr[k], arr[l] });
                        }
                    }

                }
            }
        }
        System.out.println();
        for (int[] eachRow : values) {

            System.out.print(Arrays.toString(eachRow));

        }
    }

    public static void main(String[] arg) {
        int arr[] = { 1, 3, 2, 2, -4, -6, -2, 8 };
        int n = arr.length;
        int sum = 4;
        int[] Arr = printPairs(arr, n, sum);
        secondPair(Arr, sum);

    }
}
