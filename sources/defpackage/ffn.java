package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ffn reason: default package */
public class ffn implements ffm {
    private static volatile ffm a;
    private final AppMeasurement b;
    private Map<String, Object> c = new ConcurrentHashMap();

    private ffn(AppMeasurement appMeasurement) {
        bxo.a(appMeasurement);
        this.b = appMeasurement;
    }

    public static ffm a(FirebaseApp firebaseApp, Context context, fgl fgl) {
        bxo.a(firebaseApp);
        bxo.a(context);
        bxo.a(fgl);
        bxo.a(context.getApplicationContext());
        if (a == null) {
            synchronized (ffn.class) {
                if (a == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.c()) {
                        fgl.a(ffk.class, ffq.a, ffr.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    eri eri = new eri(0, 0, true, null, null, null, bundle);
                    a = new ffn(esp.a(context, eri).h);
                }
            }
        }
        return a;
    }

    static final /* synthetic */ void a(fgi fgi) {
        boolean z = ((ffk) fgi.b).a;
        synchronized (ffn.class) {
            ((ffn) a).b.a.d().a(z);
        }
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (ffp.a(str) && ffp.a(str2, bundle) && ffp.a(str, str2, bundle)) {
            this.b.logEventInternal(str, str2, bundle);
        }
    }

    public final void a(String str, String str2, Object obj) {
        if (ffp.a(str) && ffp.a(str, str2)) {
            AppMeasurement appMeasurement = this.b;
            bxo.a(str);
            appMeasurement.a.d().a(str, str2, obj, true);
        }
    }
}
