package defpackage;

/* renamed from: kvm reason: default package */
public final class kvm implements wig<kvl> {
    private final wzi<kvi> a;

    private kvm(wzi<kvi> wzi) {
        this.a = wzi;
    }

    public static kvm a(wzi<kvi> wzi) {
        return new kvm(wzi);
    }

    public final /* synthetic */ Object get() {
        return new kvl(this.a);
    }
}
