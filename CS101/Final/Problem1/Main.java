package CS101.Final.Problem1;

public class Main {

    public static void main(String[] args) {

        String results = "TTHTHHHTTTHHHHHTTTTHHTTTHTHHTHHHTTHTHHTHTTHHTHHHTT" +
                "TTTHHTTHHHTHTHHHTHHTTTTHTTHHTTHHTHTTTTTHTHHTTTTTHT" +
                "HTTTTHTHTHTHTTTTHHTTTHHHTHHHTHHHHHHHHHTTTTTTHTTHHH" +
                "HTTHTTHTTHTHHTTHHHHHHTTHTTHHHHHTTTHTTHTHHTTTTTTTTT" +
                "HHHTTTHTTTTHTTHHTTTHHTHHTTHHTHTTTTTHTTHTTTTTTTHTHH" +
                "THTTTTTHTHHHHHTTHTHTTHHTTTTHTTTHHTHTHHTHTTTHTHTHTT" +
                "HHHTHTHTTHHTHHHHTHHHTTHTHTHHHHTTTHTHHHTTHHHHHHHHTT" +
                "HHHHTHTHHTHHHTTTTHHHHHHTHTHHTHTHTHTTTTTTTTHHTTHTTT" +
                "TTHTTTTTTTHTHTTTHHTHHHTHHHTTHHTTHTTTTHTTHHHTHHTTTT" +
                "TTTHHHTTHTHTTTHTTTTHTHTHHHHTHTHHTTTHTHTHHHHHHTHTTT" +
                "THTTHTTTTHTHHHHTHHTTTHHHTTHHHHTHHTTHHHTTHTTTHTTTTH" +
                "HHHHTTTHTHTHHHHHTTTTTTHHHHTHTHHHTHTHHHHTHHTHHTTTHH" +
                "HHHHHTTHHTTTTTTTTTTHHTTHHHTTHTTHTTTTTHHHTTTHTTTHTH" +
                "THTHHTHHTTHTHTHHTTHHTHTTHTHHHHHHHHTTHTTTHHTHTTTTTT" +
                "THTTHHTHTTHTTTTTTTTTHTHTHHTTTTHTHTTHTTHHTTHTHHHHTH" +
                "HTTTTTTHHHHHHHHHHHHHHHTTHHTHHHTTTHTTHHTTTHHHTHTHTT" +
                "HTTHHTHHHTHHHHHHTHTHTTHHHTTTTTHHTTHHHHHTHHTTTHHHTT" +
                "HHHHHHHHTTHHTTHTHHHHTHTTHTHHTHHHHHHTHHTTHHHHHHTTHT" +
                "TTTHTTTHHTTHTTTHTHHTTTHTTTTTTTTTHHTTTTTHTTHHHHHTTT" +
                "THHTHHTHTHHHTTTTHHTHHTHTHHHTHTHTTTTTHTTTTHTHHTTHTT";

        int lowestPoint = computeLowestPoint(results);
        int endPoint = computeEndPoint(results);
        int highestPoint = computeHighestPointMartingale(results);
        
        System.out.println(lowestPoint);
        System.out.println(endPoint);
        System.out.println(highestPoint);
        

    }

    public static int computeLowestPoint(String results) {
        int current = 100; // Start with 100 tokens.
        int lowestPoint = current;
        for (int i = 0; i < results.length(); i++) {
            char result = results.charAt(i);
            if (result == 'T') {
                current--;
            } else {
                current++;
            }
            if (current < lowestPoint) {
                lowestPoint = current;
            }
        }
        return lowestPoint;
    }

    public static int computeEndPoint(String results) {
        int current = 100; // Start with 100 tokens.
        int endPoint = current;
        for (int i = 0; i < results.length(); i++) {
            char result = results.charAt(i);
            if (result == 'H') {
                current--;
            } else {
                current++;
            }
            if (current < endPoint) {
                endPoint = current;
            }
        }
        return endPoint;
    }

    public static int computeHighestPointMartingale(String results) {
        int current = 100; // He starts with 100 tokens. (Just a suggestion)
        int bet = 1; // He starts betting one token (Just a suggestion)
        int highestPoint = current;
        for (char result : results.toCharArray()) {
            if (result == 'H') {
                current += bet;
                bet = 1;
            } else {
                current -= bet;
                bet *= 2;
            }

            if (current > highestPoint) {
                highestPoint = current;
            }
        }

        return highestPoint;
    }
    
}