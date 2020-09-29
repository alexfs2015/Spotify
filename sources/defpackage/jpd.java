package defpackage;

/* renamed from: jpd reason: default package */
public final class jpd implements wig<jpc> {
    private final wzi<jpl> a;

    private jpd(wzi<jpl> wzi) {
        this.a = wzi;
    }

    public static jpd a(wzi<jpl> wzi) {
        return new jpd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new jpc((jpl) this.a.get());
    }
}
