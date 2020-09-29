package defpackage;

/* renamed from: axd reason: default package */
public final class axd implements Comparable<axd> {
    public final int a;
    public final int b;
    private int c;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        axd axd = (axd) obj;
        int i = this.c - axd.c;
        if (i != 0) {
            return i;
        }
        int i2 = this.a - axd.a;
        return i2 == 0 ? this.b - axd.b : i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        String str = ".";
        sb.append(str);
        sb.append(this.a);
        sb.append(str);
        sb.append(this.b);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axd axd = (axd) obj;
            return this.c == axd.c && this.a == axd.a && this.b == axd.b;
        }
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a) * 31) + this.b;
    }
}
