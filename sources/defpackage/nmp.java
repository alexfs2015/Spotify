package defpackage;

/* renamed from: nmp reason: default package */
public final class nmp implements wig<xii<Boolean>> {
    private final wzi<nki> a;

    private nmp(wzi<nki> wzi) {
        this.a = wzi;
    }

    public static nmp a(wzi<nki> wzi) {
        return new nmp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(((nki) this.a.get()).b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
