package defpackage;

/* renamed from: gdb reason: default package */
public final class gdb implements b {
    private final wlc<gda> a;

    public gdb(wlc<gda> wlc) {
        this.a = wlc;
    }

    public final <T extends lt> T a(Class<T> cls) {
        if (cls == gda.class) {
            return (lt) this.a.get();
        }
        StringBuilder sb = new StringBuilder("unsupported view model class: ");
        sb.append(cls);
        throw new RuntimeException(sb.toString());
    }
}
