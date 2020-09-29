package defpackage;

/* renamed from: qff reason: default package */
public final class qff implements gxk {
    private final squ b;
    private final vai c;
    private final van d;

    public qff(squ squ, vai vai, van van) {
        this.b = squ;
        this.c = vai;
        this.d = van;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String str = (String) fbp.a(hci.data().string("trendingSearchQuery"));
        this.d.a(str, hci.data().intValue("trendingSearchItemIndex", 0));
        this.c.onSuggestionClicked(str);
        this.b.a();
    }
}
