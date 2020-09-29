package defpackage;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: wkc reason: default package */
public final class wkc {
    public static boolean b(Context context) {
        wka a = wkb.a(context);
        if (a == null) {
            return true;
        }
        return a.a();
    }

    private static boolean c(Context context) {
        new wju();
        if (!TextUtils.isEmpty(wju.b(context))) {
            return true;
        }
        new wju();
        return !TextUtils.isEmpty(wju.c(context));
    }

    private static boolean d(Context context) {
        int a = CommonUtils.a(context, "google_app_id", "string");
        return a != 0 && !TextUtils.isEmpty(context.getResources().getString(a));
    }

    public final boolean a(Context context) {
        if (CommonUtils.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        return d(context) && !c(context);
    }
}
