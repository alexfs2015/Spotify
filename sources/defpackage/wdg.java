package defpackage;

/* renamed from: wdg reason: default package */
public final class wdg implements wig<String> {
    private static final wdg a = new wdg();

    public static wdg a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        StringBuilder sb = new StringBuilder("--");
        sb.append(xdp.b(30));
        return (String) wil.a(sb.toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
