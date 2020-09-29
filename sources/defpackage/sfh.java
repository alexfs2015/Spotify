package defpackage;

/* renamed from: sfh reason: default package */
public final class sfh implements wig<sfg> {
    private final wzi<sfd> a;
    private final wzi<jtz> b;

    private sfh(wzi<sfd> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sfh a(wzi<sfd> wzi, wzi<jtz> wzi2) {
        return new sfh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sfg((sfd) this.a.get(), (jtz) this.b.get());
    }
}
