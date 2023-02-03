public class ArrayUtil {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int operationEnum(int[] arr, Enum MULTIPLICATION) {
        int result = arr[0] * arr[1];
        System.out.println(result);
        return result;
    }
    public static int operationEnum2(int[] arr, Enum ADDITION) {
        int result = arr[9] % arr[1];
        System.out.println(result);
        return result;
    }
    public static int operationEnum3(int[] arr, Enum AVERAGE) {
        int result = arr[9] + arr[1] % 2;
        System.out.println(result);
        return result;
    }
}