package defpackage;

import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: vvw reason: default package */
public final class vvw {
    public final boolean a(Context context) {
        if (CommonUtils.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        return d(context) && !c(context);
    }

    private static boolean c(Context context) {
        new vvo();
        if (!TextUtils.isEmpty(vvo.b(context))) {
            return true;
        }
        new vvo();
        if (!TextUtils.isEmpty(vvo.c(context))) {
            return true;
        }
        return false;
    }

    private static boolean d(Context context) {
        int a = CommonUtils.a(context, "google_app_id", "string");
        if (a != 0 && !TextUtils.isEmpty(context.getResources().getString(a))) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        vvu a = vvv.a(context);
        if (a == null) {
            return true;
        }
        return a.a();
    }
}
