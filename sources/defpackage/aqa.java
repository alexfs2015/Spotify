package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: aqa reason: default package */
public final class aqa {
    private static bbj a;

    public static aqt a(Context context, aqr aqr, bbf bbf, aqg aqg, asd<ash> asd, bbj bbj) {
        return a(context, aqr, bbf, aqg, asd, bbj, new a(), bdw.a());
    }

    public static aqt a(Context context, aqr aqr, bbf bbf, aqg aqg, asd<ash> asd, Looper looper) {
        return a(context, aqr, bbf, aqg, null, new a(), looper);
    }

    private static aqt a(Context context, aqr aqr, bbf bbf, aqg aqg, asd<ash> asd, a aVar, Looper looper) {
        return a(context, aqr, bbf, aqg, asd, a(), aVar, looper);
    }

    private static aqt a(Context context, aqr aqr, bbf bbf, aqg aqg, asd<ash> asd, bbj bbj, a aVar, Looper looper) {
        aqt aqt = new aqt(context, aqr, bbf, aqg, asd, bbj, aVar, looper);
        return aqt;
    }

    private static synchronized bbj a() {
        bbj bbj;
        synchronized (aqa.class) {
            if (a == null) {
                a = new a().a();
            }
            bbj = a;
        }
        return bbj;
    }
}
