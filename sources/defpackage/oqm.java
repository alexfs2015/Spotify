package defpackage;

/* renamed from: oqm reason: default package */
public final class oqm implements wig<ous> {
    private final wzi<out> a;
    private final wzi<oma> b;

    private oqm(wzi<out> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqm a(wzi<out> wzi, wzi<oma> wzi2) {
        return new oqm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ous) wil.a(((out) this.a.get()).a(((oma) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
