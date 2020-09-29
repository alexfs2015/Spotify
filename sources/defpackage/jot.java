package defpackage;

/* renamed from: jot reason: default package */
public final class jot implements wig<jos> {
    private final wzi<jpl> a;
    private final wzi<jou> b;

    private jot(wzi<jpl> wzi, wzi<jou> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jot a(wzi<jpl> wzi, wzi<jou> wzi2) {
        return new jot(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jos((jpl) this.a.get(), (jou) this.b.get());
    }
}
