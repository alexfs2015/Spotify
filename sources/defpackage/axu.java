package defpackage;

/* renamed from: axu reason: default package */
public final class axu implements Comparable<axu> {
    public final int a;
    public final int b;
    private int c;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        axu axu = (axu) obj;
        int i = this.c - axu.c;
        if (i != 0) {
            return i;
        }
        int i2 = this.a - axu.a;
        return i2 == 0 ? this.b - axu.b : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axu axu = (axu) obj;
            return this.c == axu.c && this.a == axu.a && this.b == axu.b;
        }
    }

    public final int hashCode() {
        return (((this.c * 31) + this.a) * 31) + this.b;
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
}
