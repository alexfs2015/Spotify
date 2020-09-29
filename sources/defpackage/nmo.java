package defpackage;

/* renamed from: nmo reason: default package */
public final class nmo implements wig<xii<Boolean>> {
    private final wzi<nki> a;

    private nmo(wzi<nki> wzi) {
        this.a = wzi;
    }

    public static nmo a(wzi<nki> wzi) {
        return new nmo(wzi);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(((nki) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
