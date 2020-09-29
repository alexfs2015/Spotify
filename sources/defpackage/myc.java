package defpackage;

/* renamed from: myc reason: default package */
public final class myc implements wig<String> {
    private final wzi<String> a;

    private myc(wzi<String> wzi) {
        this.a = wzi;
    }

    public static myc a(wzi<String> wzi) {
        return new myc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (String) wil.a((String) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
