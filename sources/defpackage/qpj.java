package defpackage;

/* renamed from: qpj reason: default package */
public final class qpj implements wig<qox> {
    private final wzi<gix> a;

    private qpj(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static qpj a(wzi<gix> wzi) {
        return new qpj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (qox) wil.a((qox) ((gix) this.a.get()).a(qox.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
