public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 2);
        ComplexNumber b = new ComplexNumber(2, 2);
        System.out.println(a.equals(b));
        System.out.println("a.hashCode:"+a.hashCode()+", b.hashCode:"+b.hashCode());

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        if (obj.getClass() == this.getClass()) {
            ComplexNumber other = (ComplexNumber) obj;
            if (other.re == this.re && other.im == this.im)
                return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        final int prime = 666;
        int re_int = Double.hashCode(re);
        int im_int = Double.hashCode(im);
        int result = 1;
        result = prime * result + re_int;
        result = prime * result + im_int;
        return result;
    }

}