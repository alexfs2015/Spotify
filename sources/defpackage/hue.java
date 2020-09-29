package defpackage;

/* renamed from: hue reason: default package */
public final class hue implements wig<hud> {
    private final wzi<iqq> a;
    private final wzi<hrc> b;

    private hue(wzi<iqq> wzi, wzi<hrc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hue a(wzi<iqq> wzi, wzi<hrc> wzi2) {
        return new hue(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hud((iqq) this.a.get(), (hrc) this.b.get());
    }
}
