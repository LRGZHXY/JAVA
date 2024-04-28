package test;

public class NumberPyramid {
    public static void main(String[] args) {
        int numberOfRows = 8;

        for (int row = 0; row < numberOfRows; row++) {
            // 打印前导空格以达到居中效果
            for (int space = 0; space < numberOfRows - row - 1; space++) {
                System.out.print("    ");
            }

            // 打印左侧升序的数字（包括中间的最大值）
            int num = 1;
            for (int i = 0; i <= row; i++) {
                System.out.printf("%-4d", num);
                num *= 2;
            }

            // 打印右侧降序的数字
            num /= 4; // 回退到中间值的前一个数字
            for (int i = 0; i < row; i++) {
                System.out.printf("%-4d", num);
                num /= 2;
            }

            // 换行
            System.out.println();
        }
    }
}


