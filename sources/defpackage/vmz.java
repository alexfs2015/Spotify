package defpackage;

/* renamed from: vmz reason: default package */
public final class vmz implements wig<vms> {
    private final wzi<kf> a;

    private vmz(wzi<kf> wzi) {
        this.a = wzi;
    }

    public static vmz a(wzi<kf> wzi) {
        return new vmz(wzi);
    }

    public final /* synthetic */ Object get() {
        kf kfVar = (kf) this.a.get();
        return (vms) wil.a(new vms(kfVar, kfVar.i()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
