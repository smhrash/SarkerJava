package array;

public class Use2DArray {

    public static void main(String[] args) {

        int nums[][]={{66, 55, 44, 33,22},
                {45, 32, 19, 37,75},
                {88, 46, 63,20,49},
                {91, 72,80, 100, 11},
                {12, 13, 14, 15,16}

        };
        for (int i = 0; i<5; i++){
            for (int j= 0; j<5; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===================");
        System.out.println(nums[1][2]);

    }
}
