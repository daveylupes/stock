import java.util.ArrayList;

public class StockAnalysis {

    // Method to calculate the average stock price
    public static float calculateAveragePrice(float[] stockPrices) {
        if (stockPrices == null || stockPrices.length == 0) {
            throw new IllegalArgumentException("Stock prices array must not be null or empty.");
        }

        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
        }
        return sum / stockPrices.length;
    }

    // Method to find the maximum stock price
    public static float findMaximumPrice(float[] stockPrices) {
        if (stockPrices == null || stockPrices.length == 0) {
            throw new IllegalArgumentException("Stock prices array must not be null or empty.");
        }

        float maxPrice = stockPrices[0];
        for (float price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific price
    public static int countOccurrences(float[] stockPrices, float targetPrice) {
        if (stockPrices == null) {
            throw new IllegalArgumentException("Stock prices array must not be null.");
        }

        int count = 0;
        for (float price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices) {
        if (stockPrices == null || stockPrices.isEmpty()) {
            throw new IllegalArgumentException("Stock prices list must not be null or empty.");
        }

        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : stockPrices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Example stock prices for 10 days
        float[] stockPricesArray = {188.5f, 133.3f, 148.7f, 178.9f, 151.0f, 123.8f, 197.2f, 110.0f, 122.5f, 149.4f};

        // Convert array to ArrayList
        ArrayList<Float> stockPricesList = new ArrayList<>();
        for (float price : stockPricesArray) {
            stockPricesList.add(price);
        }

        try {
            // Calculate the average price
            float averagePrice = calculateAveragePrice(stockPricesArray);
            System.out.println("Average Stock Price: " + averagePrice);

            // Find the maximum price
            float maxPrice = findMaximumPrice(stockPricesArray);
            System.out.println("Maximum Stock Price: " + maxPrice);

            // Count occurrences of a specific price (e.g., 150.0)
            float targetPrice = 150.0f;
            int occurrences = countOccurrences(stockPricesArray, targetPrice);
            System.out.println("Occurrences of " + targetPrice + ": " + occurrences);

            // Compute the cumulative sum
            ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);
            System.out.println("Cumulative Sum: " + cumulativeSum);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
