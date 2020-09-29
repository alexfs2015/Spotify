package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: mzv reason: default package */
public final class mzv implements gxk {
    private final mzs b;

    public mzv(mzs mzs) {
        this.b = mzs;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        Boolean bool = (Boolean) gwy.c.get("download");
        if (bool == null) {
            Logger.e("Missing event data!", new Object[0]);
        } else if (bool.booleanValue()) {
            this.b.a.a();
        } else {
            this.b.a.b();
        }
    }
}
