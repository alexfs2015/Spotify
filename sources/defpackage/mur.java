package defpackage;

import com.google.common.base.Optional;

/* renamed from: mur reason: default package */
public final class mur implements gxk {
    private final mvf b;

    public mur(mvf mvf) {
        this.b = mvf;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("artist_uri");
        Optional c = Optional.c(hci.data().string("id"));
        if (string != null) {
            this.b.a(mvx.a(string, (String) c.a("")));
        }
    }
}
