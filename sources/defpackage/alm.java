package defpackage;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import java.util.Locale;

/* renamed from: alm reason: default package */
class alm {
    private static final String a = alm.class.getCanonicalName();
    private static final long[] b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    alm() {
    }

    public static void a(String str, aln aln, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", "Unclassified");
        new akw(str, str2, null).a("fb_mobile_activate_app", bundle);
        if (aku.a() != FlushBehavior.EXPLICIT_ONLY) {
            aku.b();
        }
    }

    private static void a() {
        amp.a(LoggingBehavior.APP_EVENTS, a, "Clock skew detected");
    }

    private static int a(long j) {
        int i = 0;
        while (i < 19 && b[i] < j) {
            i++;
        }
        return i;
    }

    public static void a(String str, all all, String str2) {
        Long l = all.d;
        Long valueOf = Long.valueOf(0);
        Long valueOf2 = Long.valueOf((l == null ? 0 : all.d.longValue()) - all.b.longValue());
        if (valueOf2.longValue() < 0) {
            a();
            valueOf2 = valueOf;
        }
        Long valueOf3 = Long.valueOf((all.a == null || all.b == null) ? 0 : all.b.longValue() - all.a.longValue());
        if (valueOf3.longValue() < 0) {
            a();
        } else {
            valueOf = valueOf3;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", all.c);
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(a(valueOf2.longValue()))}));
        aln aln = all.e;
        bundle.putString("fb_mobile_launch_source", aln != null ? aln.toString() : "Unclassified");
        bundle.putLong("_logTime", all.b.longValue() / 1000);
        akw akw = new akw(str, str2, null);
        double longValue = (double) valueOf.longValue();
        Double.isNaN(longValue);
        akw.a("fb_mobile_deactivate_app", longValue / 1000.0d, bundle);
    }
}
