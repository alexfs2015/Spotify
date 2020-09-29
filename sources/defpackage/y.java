package defpackage;

/* renamed from: y reason: default package */
final class y {
    static y a;
    public long b;
    public long c;
    public int d;

    y() {
    }

    public final void a(long j, double d2, double d3) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d4 = (double) f2;
        double sin = Math.sin(d4) * 0.03341960161924362d;
        Double.isNaN(d4);
        double sin2 = sin + d4 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = (double) (f - 9.0E-4f);
        Double.isNaN(d6);
        double round = (double) (((float) Math.round(d6 - d5)) + 9.0E-4f);
        Double.isNaN(round);
        double sin3 = round + d5 + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin2) * -0.0069d);
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d2;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(asin))) / (Math.cos(d7) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.d = 1;
            this.b = -1;
            this.c = -1;
        } else if (sin4 <= -1.0d) {
            this.d = 0;
            this.b = -1;
            this.c = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin4) / 6.283185307179586d));
            Double.isNaN(acos);
            this.b = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            this.c = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
            if (this.c >= j || this.b <= j) {
                this.d = 1;
            } else {
                this.d = 0;
            }
        }
    }
}
