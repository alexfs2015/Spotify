package defpackage;

/* renamed from: wrv reason: default package */
public class wrv extends wrs implements wsp {
    private wsr b;

    public wrv(wst wst, wsr wsr, boolean z) {
        this(wst, wsr, z, false);
    }

    public wrv(wst wst, wsr wsr, boolean z, boolean z2) {
        super(wst, z, z2);
        this.b = (wsr) wxq.a(wsr, "status");
    }

    public final wsr f() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        wsj.a(sb, (wsi) this);
        wsj.a(sb, (wsp) this);
        wsj.a(sb, d());
        wsj.a(sb);
        return sb.toString();
    }
}
