package CS101.Lectures.L2;

public class Main {
    public static void main(String[] args) {
        float heights[] = new float[111];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = i;
        }
        heights[5] = 1.90F;
    }
}
