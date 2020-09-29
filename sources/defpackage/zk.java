package defpackage;

/* renamed from: zk reason: default package */
public final class zk {
    public final String a;
    public final String b;
    public final double c;
    public final int d;
    public final double e;
    public final int f;
    public final int g;
    public final double h;
    public final boolean i;
    private int j;
    private double k;

    public zk(String str, String str2, double d2, int i2, int i3, double d3, double d4, int i4, int i5, double d5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d2;
        this.j = i2;
        this.d = i3;
        this.k = d3;
        this.e = d4;
        this.f = i4;
        this.g = i5;
        this.h = d5;
        this.i = z;
    }

    public final int hashCode() {
        double hashCode = (double) (((this.a.hashCode() * 31) + this.b.hashCode()) * 31);
        double d2 = this.c;
        Double.isNaN(hashCode);
        int i2 = (((((int) (hashCode + d2)) * 31) + this.j) * 31) + this.d;
        long doubleToLongBits = Double.doubleToLongBits(this.k);
        return (((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f;
    }
}
