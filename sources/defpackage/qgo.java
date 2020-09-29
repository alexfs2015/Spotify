package defpackage;

/* renamed from: qgo reason: default package */
public final class qgo implements wig<Integer> {
    private final wzi<fqn> a;

    private qgo(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static qgo a(wzi<fqn> wzi) {
        return new qgo(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((Integer) ((fqn) this.a.get()).a(soz.b)).intValue());
    }
}
