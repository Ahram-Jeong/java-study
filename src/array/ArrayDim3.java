package array;

public class ArrayDim3 {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] arr = new int[5][5];
        int num = 1;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
