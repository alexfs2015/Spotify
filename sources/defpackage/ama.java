package defpackage;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import java.util.Locale;

/* renamed from: ama reason: default package */
class ama {
    private static final String a = ama.class.getCanonicalName();
    private static final long[] b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    ama() {
    }

    private static int a(long j) {
        int i = 0;
        while (i < 19 && b[i] < j) {
            i++;
        }
        return i;
    }

    private static void a() {
        and.a(LoggingBehavior.APP_EVENTS, a, "Clock skew detected");
    }

    public static void a(String str, alz alz, String str2) {
        Long l = alz.d;
        Long valueOf = Long.valueOf(0);
        Long valueOf2 = Long.valueOf((l == null ? 0 : alz.d.longValue()) - alz.b.longValue());
        if (valueOf2.longValue() < 0) {
            a();
            valueOf2 = valueOf;
        }
        Long valueOf3 = Long.valueOf((alz.a == null || alz.b == null) ? 0 : alz.b.longValue() - alz.a.longValue());
        if (valueOf3.longValue() < 0) {
            a();
        } else {
            valueOf = valueOf3;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", alz.c);
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(a(valueOf2.longValue()))}));
        amb amb = alz.e;
        bundle.putString("fb_mobile_launch_source", amb != null ? amb.toString() : "Unclassified");
        bundle.putLong("_logTime", alz.b.longValue() / 1000);
        alk alk = new alk(str, str2, null);
        double longValue = (double) valueOf.longValue();
        Double.isNaN(longValue);
        alk.a("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
    }

    public static void a(String str, amb amb, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", "Unclassified");
        new alk(str, str2, null).a("fb_mobile_activate_app", bundle);
        if (ali.a() != FlushBehavior.EXPLICIT_ONLY) {
            ali.b();
        }
    }
}
