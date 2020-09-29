package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: muu reason: default package */
public final class muu implements gvk {
    private final mur b;

    public muu(mur mur) {
        this.b = mur;
    }

    public final void handleCommand(gzp gzp, guy guy) {
        Boolean bool = (Boolean) guy.c.get("download");
        if (bool == null) {
            Logger.e("Missing event data!", new Object[0]);
        } else if (bool.booleanValue()) {
            this.b.a.a();
        } else {
            this.b.a.b();
        }
    }
}
