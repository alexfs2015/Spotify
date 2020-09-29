package defpackage;

/* renamed from: teg reason: default package */
public final class teg implements wig<tea> {
    private final wzi<ted> a;
    private final wzi<tch> b;

    private teg(wzi<ted> wzi, wzi<tch> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static teg a(wzi<ted> wzi, wzi<tch> wzi2) {
        return new teg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tea((ted) this.a.get(), (tch) this.b.get());
    }
}
