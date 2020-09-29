package defpackage;

/* renamed from: aab reason: default package */
public final class aab implements zs {
    public final String a;
    public final zk b;
    private final int c;

    public aab(String str, int i, zk zkVar) {
        this.a = str;
        this.c = i;
        this.b = zkVar;
    }

    public final xm a(xc xcVar, aac aac) {
        return new ya(xcVar, aac, this);
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
