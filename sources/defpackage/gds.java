package defpackage;

/* renamed from: gds reason: default package */
public final class gds implements wig<gdr> {
    private final wzi<lbs> a;

    private gds(wzi<lbs> wzi) {
        this.a = wzi;
    }

    public static gds a(wzi<lbs> wzi) {
        return new gds(wzi);
    }

    public final /* synthetic */ Object get() {
        return new gdr((lbs) this.a.get());
    }
}
