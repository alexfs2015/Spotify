package defpackage;

/* renamed from: sfe reason: default package */
public final class sfe implements wig<sfd> {
    private final wzi<jlr> a;

    private sfe(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static sfe a(wzi<jlr> wzi) {
        return new sfe(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sfd((jlr) this.a.get());
    }
}
