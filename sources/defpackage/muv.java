package defpackage;

/* renamed from: muv reason: default package */
public final class muv implements gxk {
    private final mvf b;

    public muv(mvf mvf) {
        this.b = mvf;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("entity_uri");
        String string2 = hci.data().string("id");
        if (string != null && string2 != null) {
            this.b.a(new d(string, string2));
        }
    }
}
