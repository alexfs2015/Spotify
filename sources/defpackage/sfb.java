package defpackage;

/* renamed from: sfb reason: default package */
public final class sfb implements wig<sfa> {
    private final wzi<sff> a;

    private sfb(wzi<sff> wzi) {
        this.a = wzi;
    }

    public static sfb a(wzi<sff> wzi) {
        return new sfb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new sfa((sff) this.a.get());
    }
}
