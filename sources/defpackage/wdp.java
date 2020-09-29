package defpackage;

/* renamed from: wdp reason: default package */
public class wdp extends wdm implements wej {
    private wel b;

    public wdp(wen wen, wel wel, boolean z) {
        this(wen, wel, z, false);
    }

    public wdp(wen wen, wel wel, boolean z, boolean z2) {
        super(wen, z, z2);
        this.b = (wel) wjk.a(wel, "status");
    }

    public final wel f() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        wed.a(sb, (wec) this);
        wed.a(sb, (wej) this);
        wed.a(sb, d());
        wed.a(sb);
        return sb.toString();
    }
}
