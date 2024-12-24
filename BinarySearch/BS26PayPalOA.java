import java.util.Scanner;

public class BS26PayPalOA {
    static long isValueValid(long peakValue, long peakPosition, long arrayLength, long targetSum) {
        long[] arr = new long[(int) (arrayLength + 1)];
        arr[(int) peakPosition] = peakValue;
        long currentPosition = peakPosition + 1;
        long lowerSum = 0;

        // Calculate the lower bound sum by moving right
        while (currentPosition <= arrayLength) {
            arr[(int) currentPosition] = arr[(int) (currentPosition - 1)] - 1;
            if (arr[(int) currentPosition] == 0) {
                arr[(int) currentPosition] = 1;
            }
            lowerSum += arr[(int) currentPosition];
            currentPosition++;
        }

        lowerSum += arr[(int) peakPosition];
        currentPosition = peakPosition - 1;

        // Calculate the lower bound sum by moving left
        while (currentPosition >= 1) {
            arr[(int) currentPosition] = arr[(int) (currentPosition + 1)] - 1;
            if (arr[(int) currentPosition] == 0) {
                arr[(int) currentPosition] = 1;
            }
            lowerSum += arr[(int) currentPosition];
            currentPosition--;
        }

        long upperSum = 0;
        currentPosition = peakPosition + 1;

        // Calculate the upper bound sum by moving right
        while (currentPosition <= arrayLength) {
            arr[(int) currentPosition] = arr[(int) (currentPosition - 1)] + 1;
            upperSum += arr[(int) currentPosition];
            currentPosition++;
        }

        upperSum += arr[(int) peakPosition];
        currentPosition = peakPosition - 1;

        // Calculate the upper bound sum by moving left
        while (currentPosition >= 1) {
            arr[(int) currentPosition] = arr[(int) (currentPosition + 1)] + 1;
            upperSum += arr[(int) currentPosition];
            currentPosition--;
        }

        // Check if targetSum is within bounds
        if (lowerSum <= targetSum && targetSum <= upperSum) {
            return 1;
        }

        if (upperSum < targetSum) {
            return 2;
        }

        if (targetSum < lowerSum) {
            return 3;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long arrayLength = scanner.nextLong();
        long targetSum = scanner.nextLong();
        long peakPosition = scanner.nextLong();
        long result = -1;
        long minValue = 1;
        long maxValue = targetSum;
        long isPeakFound = 0;

        while (minValue <= maxValue && isPeakFound == 0) {
            long midValue = (minValue + maxValue) / 2;
            System.out.println(minValue + " " + midValue + " " + maxValue);
            System.out.println();

            if (isValueValid(midValue, peakPosition, arrayLength, targetSum) == 1) {
                if (isValueValid(midValue + 1, peakPosition, arrayLength, targetSum) != 1) {
                    isPeakFound = 1;
                    result = midValue;
                } else {
                    minValue = midValue + 1;
                }
            } else {
                if (isValueValid(midValue, peakPosition, arrayLength, targetSum) == 2) {
                    minValue = midValue + 1;
                } else {
                    maxValue = midValue - 1;
                }
            }
        }

        System.out.println(result);
    }
}
