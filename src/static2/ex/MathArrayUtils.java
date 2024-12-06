package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스 생성 막기
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minVal = values[0];
        for (int value : values) {
            if (value < minVal) {
                minVal = value;
            }
        }
        return minVal;
    }

    public static int max(int[] values) {
        int maxVal = values[0];
        for (int value : values) {
            if (value > maxVal) {
                maxVal = value;
            }
        }
        return maxVal;
    }
}
