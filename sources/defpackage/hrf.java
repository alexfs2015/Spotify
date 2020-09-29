package defpackage;

/* renamed from: hrf reason: default package */
public final class hrf implements wig<hre> {
    private final wzi<String> a;
    private final wzi<jty> b;

    private hrf(wzi<String> wzi, wzi<jty> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hrf a(wzi<String> wzi, wzi<jty> wzi2) {
        return new hrf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hre((String) this.a.get(), (jty) this.b.get());
    }
}
