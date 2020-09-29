package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bfm reason: default package */
public final class bfm {
    final Context a;
    final dhx b;
    final View c;

    public bfm(Context context, dhx dhx, View view) {
        this.a = context;
        this.b = dhx;
        this.c = view;
    }

    static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    static Intent a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String str = "android.intent.action.VIEW";
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction(str);
        return intent;
    }

    /* access modifiers changed from: 0000 */
    public final ResolveInfo a(Intent intent) {
        return a(intent, new ArrayList<>());
    }

    /* access modifiers changed from: 0000 */
    public final ResolveInfo a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            bjl.i().a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }
}
