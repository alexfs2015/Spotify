package defpackage;

/* renamed from: ksx reason: default package */
public final class ksx implements wig<ksw> {
    private final wzi<ksv> a;

    private ksx(wzi<ksv> wzi) {
        this.a = wzi;
    }

    public static ksx a(wzi<ksv> wzi) {
        return new ksx(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ksw((ksv) this.a.get());
    }
}
