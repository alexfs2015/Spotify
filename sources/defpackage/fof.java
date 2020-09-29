package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;

/* renamed from: fof reason: default package */
public final class fof {
    private static final Uri a;
    private static volatile fof b = null;

    static {
        Uri parse = Uri.parse("content://com.samsung.android.app.spage.provider");
        a = parse;
        Uri.withAppendedPath(parse, LogMessage.SEVERITY_INFO);
        Uri.withAppendedPath(a, "card");
        Uri.withAppendedPath(a, "instant");
        Uri.withAppendedPath(a, "customize");
        Uri.withAppendedPath(a, "change");
    }

    private fof() {
    }

    public static fof a() {
        Class<fof> cls = fof.class;
        if (b == null) {
            synchronized (cls) {
                if (b == null) {
                    b = new fof();
                }
                cls.notifyAll();
            }
        }
        return b;
    }
}
