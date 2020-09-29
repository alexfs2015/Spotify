package defpackage;

/* renamed from: tmd reason: default package */
public final class tmd implements wig<tmc> {
    private final wzi<tln> a;

    private tmd(wzi<tln> wzi) {
        this.a = wzi;
    }

    public static tmd a(wzi<tln> wzi) {
        return new tmd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tmc((tln) this.a.get());
    }
}
