package defpackage;

/* renamed from: pwj reason: default package */
public final class pwj implements gvk {
    private final sgn b;
    private final upd c;
    private final upi d;

    public pwj(sgn sgn, upd upd, upi upi) {
        this.b = sgn;
        this.c = upd;
        this.d = upi;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String str = (String) fay.a(gzp.data().string("trendingSearchQuery"));
        this.d.a(str, gzp.data().intValue("trendingSearchItemIndex", 0));
        this.c.onSuggestionClicked(str);
        this.b.a();
    }
}
