package defpackage;

/* renamed from: aap reason: default package */
public final class aap implements aag {
    public final String a;
    public final zy b;
    private final int c;

    public aap(String str, int i, zy zyVar) {
        this.a = str;
        this.c = i;
        this.b = zyVar;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new yo(xqVar, aaq, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
