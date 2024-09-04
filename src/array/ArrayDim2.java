package array;

public class ArrayDim2 {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

//        int[][] arr = new int[][]{
//            {1, 2, 3},
//            {4, 5, 6}
//        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
