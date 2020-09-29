package defpackage;

/* renamed from: qev reason: default package */
public final class qev implements gxk {
    private final spq b;
    private final squ c;

    public qev(spq spq, squ squ) {
        this.b = spq;
        this.c = squ;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String str = (String) fbp.a(hci.data().string("query"));
        String str2 = (String) fbp.a(hci.data().string("requestId"));
        int intValue = hci.data().intValue("suggestionIndex", -1);
        if (gwy.a.equals("rightAccessoryClick")) {
            this.b.a(str, intValue);
            return;
        }
        this.b.onSuggestionClicked(str, str2, intValue);
        this.c.a();
    }
}
