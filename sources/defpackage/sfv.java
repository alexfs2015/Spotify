package defpackage;

/* renamed from: sfv reason: default package */
public final class sfv implements wig<sfz> {
    private final wzi<gnb> a;

    private sfv(wzi<gnb> wzi) {
        this.a = wzi;
    }

    public static sfv a(wzi<gnb> wzi) {
        return new sfv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (sfz) wil.a(new sfz((gnb) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
