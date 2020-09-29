package defpackage;

/* renamed from: npi reason: default package */
public final class npi implements wig<nph> {
    private final wzi<nit> a;

    private npi(wzi<nit> wzi) {
        this.a = wzi;
    }

    public static npi a(wzi<nit> wzi) {
        return new npi(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nph((nit) this.a.get());
    }
}
