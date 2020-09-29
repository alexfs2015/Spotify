package defpackage;

/* renamed from: uwp reason: default package */
public final class uwp implements wig<uwo> {
    private final wzi<jlr> a;
    private final wzi<String> b;

    private uwp(wzi<jlr> wzi, wzi<String> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uwp a(wzi<jlr> wzi, wzi<String> wzi2) {
        return new uwp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uwo((jlr) this.a.get(), (String) this.b.get());
    }
}
