package array;

public class LotteryTicket {

    public static void main(String[] args) {

        int[][] lotteryCard = {{23, 24, 50},
                {33, 44, 77},
                {30, 31, 45}
        };

        int[][] lotteryCard2 = new int[3][3];
        System.out.println(lotteryCard[2][2]);
        System.out.println("==========================================");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(lotteryCard[i][j]);
            }
        }
    }
}
