package defpackage;

/* renamed from: mux reason: default package */
public final class mux implements gxk {
    private final mvf b;

    public mux(mvf mvf) {
        this.b = mvf;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String str = (String) gwy.c.get("artist_uri");
        if (str != null) {
            this.b.a(new i(str));
        }
    }
}
