public class minimizeXOR {
    public int minimizeXor(int num1, int num2) {
        int x = num1;
        int reqBitCount = Integer.bitCount(num2);
        int currSetBit = Integer.bitCount(x);

        int bit = 0; // current position of bit
        if (currSetBit < reqBitCount) {
            // If less, we need to set more bits
            while (currSetBit < reqBitCount) {
                if (!isSet(x, bit)) {
                    x = setBit(x, bit);
                    currSetBit++;
                }
                bit++;
            }
        } else if (currSetBit > reqBitCount) {
            bit = 0;
            while (currSetBit > reqBitCount) {
                if (isSet(x, bit)) {
                    x = unsetBit(x, bit);
                    currSetBit--;
                }
                bit++;
            }
        }
        return x;
    }

    boolean isSet(int x, int bit) {
        return (x & (1 << bit)) != 0;
    }

    int setBit(int x, int bit) {
        return x | (1 << bit);
    }

    int unsetBit(int x, int bit) {
        return x & ~(1 << bit);
    }
}
