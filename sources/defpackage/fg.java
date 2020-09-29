package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: fg reason: default package */
public final class fg {
    public static Intent a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        String b = b(activity);
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b);
        try {
            return b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
            sb.append(b);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b = b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String b(Activity activity) {
        try {
            return b(activity, activity.getComponentName());
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String b(Context context, ComponentName componentName) {
        PackageManager packageManager = context.getPackageManager();
        int i = VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 640);
        if (VERSION.SDK_INT >= 16) {
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string = sb.toString();
        }
        return string;
    }
}
