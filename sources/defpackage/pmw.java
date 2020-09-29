package defpackage;

/* renamed from: pmw reason: default package */
public final class pmw implements wig<String> {
    private final wzi<fqn> a;

    private pmw(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pmw a(wzi<fqn> wzi) {
        return new pmw(wzi);
    }

    public final /* synthetic */ Object get() {
        String str = (String) ((fqn) this.a.get()).a(pnr.f);
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }
}
