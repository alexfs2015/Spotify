package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: wju reason: default package */
public final class wju {
    protected static String b(Context context) {
        String str = "Fabric";
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    wja.a().a(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                wja.a().a(str, "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                e = e;
                str2 = string;
                wji a = wja.a();
                StringBuilder sb = new StringBuilder("Caught non-fatal exception while retrieving apiKey: ");
                sb.append(e);
                a.a(str, sb.toString());
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
            wji a2 = wja.a();
            StringBuilder sb2 = new StringBuilder("Caught non-fatal exception while retrieving apiKey: ");
            sb2.append(e);
            a2.a(str, sb2.toString());
            return str2;
        }
    }

    protected static String c(Context context) {
        String str = "string";
        int a = CommonUtils.a(context, "io.fabric.ApiKey", str);
        if (a == 0) {
            wja.a().a("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = CommonUtils.a(context, "com.crashlytics.ApiKey", str);
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    public final String a(Context context) {
        String b = b(context);
        if (TextUtils.isEmpty(b)) {
            b = c(context);
        }
        String str = "Fabric";
        if (TextUtils.isEmpty(b)) {
            new wkc();
            int a = CommonUtils.a(context, "google_app_id", "string");
            if (a != 0) {
                wja.a().a(str, "Generating Crashlytics ApiKey from google_app_id in Strings");
                b = CommonUtils.b(context.getResources().getString(a)).substring(0, 40);
            } else {
                b = null;
            }
        }
        if (TextUtils.isEmpty(b)) {
            String str2 = "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
            if (wja.b() || CommonUtils.h(context)) {
                throw new IllegalArgumentException(str2);
            }
            wja.a().e(str, str2);
        }
        return b;
    }
}
