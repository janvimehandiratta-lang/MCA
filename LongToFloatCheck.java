public class LongToFloatCheck {
    public static void main(String[] args) {

        long smallLong = 100000L;
        float smallFloat = (float) smallLong;

        if ((long) smallFloat == smallLong) {
            System.out.println("Small value: " + smallLong + " can be safely stored in a float.");
        } else {
            System.out.println("Small value: " + smallLong + " cannot be stored accurately in a float.");
        }

        long largeLong = 9223372036854775807L; // Long.MAX_VALUE
        float largeFloat = (float) largeLong;

        if ((long) largeFloat == largeLong) {
            System.out.println("Large value: " + largeLong + " can be safely stored in a float.");
        } else {
            System.out.println("Large value: " + largeLong + " cannot be stored accurately in a float.");
        }
    }
}
