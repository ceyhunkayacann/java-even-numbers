import java.util.Arrays;

public class Main {

    static Boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = new int[]{2, 6, 17, 23, 44, 14, 6, 24, 24, 48, 2, 48, 10, 22, 88,17,21,91,88};
        int[] tempList = new int[list.length];
        int startingIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (i % 2 == 0) {
                        if (!isFind(tempList, list[i])){
                            tempList[startingIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int value : tempList){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
