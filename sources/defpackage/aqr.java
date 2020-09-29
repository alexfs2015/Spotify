package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: aqr reason: default package */
public final class aqr {
    private static bca a;

    public static ark a(Context context, ari ari, bbw bbw, aqx aqx, asu<asy> asu, Looper looper) {
        return a(context, ari, bbw, aqx, null, new a(), looper);
    }

    private static ark a(Context context, ari ari, bbw bbw, aqx aqx, asu<asy> asu, a aVar, Looper looper) {
        return a(context, ari, bbw, aqx, asu, a(), aVar, looper);
    }

    public static ark a(Context context, ari ari, bbw bbw, aqx aqx, asu<asy> asu, bca bca) {
        return a(context, ari, bbw, aqx, asu, bca, new a(), ben.a());
    }

    private static ark a(Context context, ari ari, bbw bbw, aqx aqx, asu<asy> asu, bca bca, a aVar, Looper looper) {
        ark ark = new ark(context, ari, bbw, aqx, asu, bca, aVar, looper);
        return ark;
    }

    private static synchronized bca a() {
        bca bca;
        synchronized (aqr.class) {
            if (a == null) {
                a = new a().a();
            }
            bca = a;
        }
        return bca;
    }
}
