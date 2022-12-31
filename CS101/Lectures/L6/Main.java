package CS101.Lectures.L6;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        float[] heights = { 1.0F, 2.3F, 7.2F };
        mystery(heights);
        System.out.println(heights[1]);
    }

    public static void mystery(float[] x) {
        x = new float[3];
        x[0] = 3.4F;
        x[1] = 4.5F;
        x[2] = 76.7F;

    }

    public static float sum(float[] x) {
        float sum = 0F;
        return sum;
    }
}