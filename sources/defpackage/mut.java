package defpackage;

/* renamed from: mut reason: default package */
public final class mut implements gxk {
    private final mvf b;

    public mut(mvf mvf) {
        this.b = mvf;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("id");
        String str = (String) gwy.c.get("artist_uri");
        if (str != null && string != null) {
            this.b.a(mvx.a(str, string));
        }
    }
}
