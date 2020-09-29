package defpackage;

/* renamed from: wdr reason: default package */
public final class wdr implements wig<wci> {
    private final wzi<jtz> a;

    private wdr(wzi<jtz> wzi) {
        this.a = wzi;
    }

    public static wdr a(wzi<jtz> wzi) {
        return new wdr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (wci) wil.a(new wcj((jtz) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
