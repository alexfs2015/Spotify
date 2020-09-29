package defpackage;

/* renamed from: jzz reason: default package */
public final class jzz implements kab {
    public static final jzz a = new jzz("endplay");
    public static final jzz b = new jzz("trackdone");
    public static final jzz c = new jzz("trackerror");
    public static final jzz d = new jzz("unexpected-exit");
    public static final jzz e = new jzz("unexpected-exit-while-paused");
    public static final jzz f = new jzz("unknown");
    private final String g;

    static {
        new jzz("clickrow");
        new jzz("interupted");
    }

    private jzz(String str) {
        this.g = str;
    }

    public final String a() {
        return this.g;
    }
}
