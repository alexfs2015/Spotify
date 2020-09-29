package defpackage;

/* renamed from: kbz reason: default package */
public final class kbz implements kcb {
    public static final kbz a = new kbz("endplay");
    public static final kbz b = new kbz("trackdone");
    public static final kbz c = new kbz("trackerror");
    public static final kbz d = new kbz("unexpected-exit");
    public static final kbz e = new kbz("unexpected-exit-while-paused");
    public static final kbz f = new kbz("unknown");
    private final String g;

    static {
        new kbz("clickrow");
        new kbz("interupted");
    }

    private kbz(String str) {
        this.g = str;
    }

    public final String a() {
        return this.g;
    }
}
