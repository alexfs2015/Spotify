package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fet reason: default package */
public class fet implements fes {
    private static volatile fes a;
    private final AppMeasurement b;
    private Map<String, Object> c = new ConcurrentHashMap();

    private fet(AppMeasurement appMeasurement) {
        bwx.a(appMeasurement);
        this.b = appMeasurement;
    }

    public static fes a(FirebaseApp firebaseApp, Context context, ffr ffr) {
        bwx.a(firebaseApp);
        bwx.a(context);
        bwx.a(ffr);
        bwx.a(context.getApplicationContext());
        if (a == null) {
            synchronized (fet.class) {
                if (a == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.c()) {
                        ffr.a(feq.class, few.a, fex.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    eqr eqr = new eqr(0, 0, true, null, null, null, bundle);
                    a = new fet(ery.a(context, eqr).h);
                }
            }
        }
        return a;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (fev.a(str) && fev.a(str2, bundle) && fev.a(str, str2, bundle)) {
            this.b.logEventInternal(str, str2, bundle);
        }
    }

    public final void a(String str, String str2, Object obj) {
        if (fev.a(str) && fev.a(str, str2)) {
            AppMeasurement appMeasurement = this.b;
            bwx.a(str);
            appMeasurement.a.d().a(str, str2, obj, true);
        }
    }

    static final /* synthetic */ void a(ffo ffo) {
        boolean z = ((feq) ffo.b).a;
        synchronized (fet.class) {
            ((fet) a).b.a.d().a(z);
        }
    }
}
