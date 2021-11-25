import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list ={1,2,5,9,2,5,6,7,6};
        int [] duplicate = new int[list.length];
        int startindex = 0;

        for (int i=0;i < list.length;i++){
            for (int j=0 ; j < list.length;j++){
                if ((i != j) && (list[i] == list[j]) && (list[i] %2==0)){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startindex++] = list[i];
                    }
                    break;
                }

            }
        }
        for (int i : duplicate){
            if (i != 0)
                System.out.println(i);
        }
    }
}
