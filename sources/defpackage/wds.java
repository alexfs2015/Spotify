package defpackage;

/* renamed from: wds reason: default package */
public final class wds implements wig<wcu> {
    private static final wds a = new wds();

    public static wds a() {
        return a;
    }

    public static wcu b() {
        return (wcu) wil.a(new wcv(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}
