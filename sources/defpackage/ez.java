package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: ez reason: default package */
public final class ez extends fr {

    /* renamed from: ez$a */
    public interface a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: ez$b */
    public interface b {
        boolean a();
    }

    /* renamed from: ez$c */
    public interface c {
        void l_(int i);
    }

    public static b a() {
        return null;
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void a(final Activity activity, final String[] strArr, int i) {
        if (VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).l_(49374);
            }
            activity.requestPermissions(strArr, 49374);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable(49374) {
            public final void run() {
                int[] iArr = new int[strArr.length];
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                }
                ((a) activity).onRequestPermissionsResult(49374, strArr, iArr);
            }
        });
    }

    @Deprecated
    public static boolean a(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void b(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static Uri c(Activity activity) {
        if (VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static void d(Activity activity) {
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return;
        }
        if (!fc.a(activity)) {
            activity.recreate();
        }
    }
}
