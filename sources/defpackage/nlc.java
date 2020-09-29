package defpackage;

/* renamed from: nlc reason: default package */
public final class nlc implements wig<Boolean> {
    private final wzi<gvk> a;

    private nlc(wzi<gvk> wzi) {
        this.a = wzi;
    }

    public static nlc a(wzi<gvk> wzi) {
        return new nlc(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((gvk) this.a.get()).b);
    }
}
