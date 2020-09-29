package defpackage;

/* renamed from: nfb reason: default package */
public final class nfb implements wig<String> {
    private final wzi<sso> a;

    private nfb(wzi<sso> wzi) {
        this.a = wzi;
    }

    public static nfb a(wzi<sso> wzi) {
        return new nfb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a(((sso) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
