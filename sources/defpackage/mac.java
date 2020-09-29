package defpackage;

/* renamed from: mac reason: default package */
public final class mac implements wig<mab> {
    private final wzi<Boolean> a;
    private final wzi<uxj> b;

    private mac(wzi<Boolean> wzi, wzi<uxj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mac a(wzi<Boolean> wzi, wzi<uxj> wzi2) {
        return new mac(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mab(((Boolean) this.a.get()).booleanValue(), (uxj) this.b.get());
    }
}
