package defpackage;

/* renamed from: moc reason: default package */
public final class moc implements wig<mob> {
    private final wzi<gix> a;

    private moc(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static moc a(wzi<gix> wzi) {
        return new moc(wzi);
    }

    public final /* synthetic */ Object get() {
        return (mob) wil.a((mob) ((gix) this.a.get()).a(mob.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
