public class Main {


        public void main(String[] args) {
            byte[] x = new byte[]{65,66,67,68,69,70,71};
            AsciiCharSequence myX = new AsciiCharSequence(x);
            System.out.println(myX.length());
            System.out.println(myX.charAt(3));
            System.out.println(myX.subSequence(3,5));
            System.out.println(myX.toString());
        }



    class AsciiCharSequence implements CharSequence {
        private final byte[] byteSequence;

        public AsciiCharSequence(byte[] bytesSequence) {
            this.byteSequence = bytesSequence;
        }

        @Override
        public int length() {
            return byteSequence.length;
        }

        @Override
        public char charAt(int index) {
            return (char) byteSequence[index];
        }

        @Override
        public CharSequence subSequence(int start, int stop) {
            return new AsciiCharSequence(java.util.Arrays.copyOfRange(byteSequence, start, stop));
        }

        @Override
        public String toString() {
            return new String(byteSequence);
        }
    }
}
