package defpackage;

/* renamed from: mfp reason: default package */
public final class mfp implements wig<mfo> {
    private final wzi<jty> a;

    private mfp(wzi<jty> wzi) {
        this.a = wzi;
    }

    public static mfp a(wzi<jty> wzi) {
        return new mfp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new mfo((jty) this.a.get());
    }
}
