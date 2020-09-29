package defpackage;

/* renamed from: uxd reason: default package */
public final class uxd implements wig<uxc> {
    private final wzi<jlr> a;

    private uxd(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static uxd a(wzi<jlr> wzi) {
        return new uxd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uxc((jlr) this.a.get());
    }
}
