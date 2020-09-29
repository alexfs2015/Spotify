package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: amx reason: default package */
public final class amx {
    static {
        amx.class.getName();
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    public static void a(String str, String str2) {
        if (amw.a(str)) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str2);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void a() {
        if (!akc.a()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static String b() {
        String k = akc.k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static String c() {
        String m = akc.m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public static void a(Context context) {
        a(context, true);
    }

    public static void a(Context context, boolean z) {
        a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static void b(Context context) {
        b(context, true);
    }

    public static void b(Context context, boolean z) {
        ActivityInfo activityInfo;
        a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (NameNotFoundException unused) {
            }
            if (activityInfo == null && z) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
        }
        activityInfo = null;
        if (activityInfo == null) {
        }
    }

    public static boolean c(Context context) {
        List<ResolveInfo> list;
        a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder sb = new StringBuilder("fb");
            sb.append(akc.k());
            sb.append("://authorize");
            intent.setData(Uri.parse(sb.toString()));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        boolean z = false;
        if (list != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }

    public static void d(Context context) {
        a((Object) context, "context");
        String b = b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            StringBuilder sb = new StringBuilder("com.facebook.app.FacebookContentProvider");
            sb.append(b);
            String sb2 = sb.toString();
            if (packageManager.resolveContentProvider(sb2, 0) == null) {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{sb2}));
            }
        }
    }

    public static <T> void a(Collection<T> collection, String str) {
        String str2;
        a((Object) collection, str);
        Iterator it = collection.iterator();
        do {
            str2 = "Container '";
            if (!it.hasNext()) {
                if (collection.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(str);
                    sb.append("' cannot be empty");
                    throw new IllegalArgumentException(sb.toString());
                }
                return;
            }
        } while (it.next() != null);
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.append(str);
        sb2.append("' cannot contain null values");
        throw new NullPointerException(sb2.toString());
    }
}
