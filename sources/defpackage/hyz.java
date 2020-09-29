package defpackage;

/* renamed from: hyz reason: default package */
public final class hyz implements wig<ihr> {
    private final wzi<hxs> a;
    private final wzi<gcb> b;
    private final wzi<gix> c;

    private hyz(wzi<hxs> wzi, wzi<gcb> wzi2, wzi<gix> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hyz a(wzi<hxs> wzi, wzi<gcb> wzi2, wzi<gix> wzi3) {
        return new hyz(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (ihr) wil.a(new ihr((hxs) this.a.get(), (gcb) this.b.get(), new ihu((ihx) ((gix) this.c.get()).a(ihx.class))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
