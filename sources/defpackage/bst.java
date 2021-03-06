package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.spotify.music.R;

@Deprecated
/* renamed from: bst reason: default package */
public final class bst {
    private static final Object a = new Object();
    private static bst b;
    private final String c;
    private final Status d;
    private final boolean e;
    private final boolean f;

    private bst(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f = !z;
        } else {
            this.f = false;
        }
        this.e = z;
        String a2 = byx.a(context);
        if (a2 == null) {
            a2 = new bxd(context).a("google_app_id");
        }
        if (TextUtils.isEmpty(a2)) {
            this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.c = null;
            return;
        }
        this.c = a2;
        this.d = Status.a;
    }

    public static Status a(Context context) {
        Status status;
        bwx.a(context, (Object) "Context must not be null.");
        synchronized (a) {
            if (b == null) {
                b = new bst(context);
            }
            status = b.d;
        }
        return status;
    }

    public static String a() {
        return a("getGoogleAppId").c;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f;
    }

    private static bst a(String str) {
        bst bst;
        synchronized (a) {
            if (b != null) {
                bst = b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return bst;
    }
}
