package defpackage;

/* renamed from: nfi reason: default package */
public final class nfi implements vua<nfc> {
    private static final nfi a = new nfi();

    public static nfi a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (nfc) vuf.a(new nfc(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
