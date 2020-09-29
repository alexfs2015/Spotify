package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;

/* renamed from: foz reason: default package */
public final class foz {
    private static final Uri a;
    private static volatile foz b = null;

    static {
        Uri parse = Uri.parse("content://com.samsung.android.app.spage.provider");
        a = parse;
        Uri.withAppendedPath(parse, LogMessage.SEVERITY_INFO);
        Uri.withAppendedPath(a, "card");
        Uri.withAppendedPath(a, "instant");
        Uri.withAppendedPath(a, "customize");
        Uri.withAppendedPath(a, "change");
    }

    private foz() {
    }

    public static foz a() {
        Class<foz> cls = foz.class;
        if (b == null) {
            synchronized (cls) {
                if (b == null) {
                    b = new foz();
                }
                cls.notifyAll();
            }
        }
        return b;
    }
}
