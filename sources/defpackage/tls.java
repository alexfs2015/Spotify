package defpackage;

/* renamed from: tls reason: default package */
public final class tls implements wig<tlr> {
    private final wzi<tlp> a;

    private tls(wzi<tlp> wzi) {
        this.a = wzi;
    }

    public static tls a(wzi<tlp> wzi) {
        return new tls(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tlr((tlp) this.a.get());
    }
}
