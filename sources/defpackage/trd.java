package defpackage;

/* renamed from: trd reason: default package */
public final class trd implements trc {
    private final wzi<tqy> a;
    private final wzi<rwl> b;

    public trd(wzi<tqy> wzi, wzi<rwl> wzi2) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final trb a(tqw tqw, int i) {
        return new trb((tqw) a((T) tqw, 1), 1, (tqy) a((T) this.a.get(), 3), (rwl) a((T) this.b.get(), 4));
    }
}
