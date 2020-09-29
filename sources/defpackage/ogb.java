package defpackage;

/* renamed from: ogb reason: default package */
public final class ogb implements vua<ofy> {
    private final wlc<String> a;
    private final wlc<oga> b;
    private final wlc<osd> c;

    private ogb(wlc<String> wlc, wlc<oga> wlc2, wlc<osd> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ogb a(wlc<String> wlc, wlc<oga> wlc2, wlc<osd> wlc3) {
        return new ogb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ofy((String) this.a.get(), (oga) this.b.get(), (osd) this.c.get());
    }
}
