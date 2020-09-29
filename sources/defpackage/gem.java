package defpackage;

/* renamed from: gem reason: default package */
public final class gem implements b {
    private final wzi<gel> a;

    public gem(wzi<gel> wzi) {
        this.a = wzi;
    }

    public final <T extends ly> T a(Class<T> cls) {
        if (cls == gel.class) {
            return (ly) this.a.get();
        }
        StringBuilder sb = new StringBuilder("unsupported view model class: ");
        sb.append(cls);
        throw new RuntimeException(sb.toString());
    }
}
