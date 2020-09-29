package defpackage;

/* renamed from: oql reason: default package */
public final class oql implements wig<rkn> {
    private final wzi<osg> a;
    private final wzi<oma> b;

    private oql(wzi<osg> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oql a(wzi<osg> wzi, wzi<oma> wzi2) {
        return new oql(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (rkn) wil.a(new osi((owh) osg.a(((osg) this.a.get()).a.get(), 1), (gkq) osg.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
