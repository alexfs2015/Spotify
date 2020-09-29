package defpackage;

/* renamed from: rud reason: default package */
public final class rud implements wig<ruc> {
    private final wzi<rue> a;
    private final wzi<jtz> b;

    private rud(wzi<rue> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rud a(wzi<rue> wzi, wzi<jtz> wzi2) {
        return new rud(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ruc((rue) this.a.get(), (jtz) this.b.get());
    }
}
