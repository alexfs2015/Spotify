package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

@cey
/* renamed from: dtk reason: default package */
public final class dtk implements dgv {
    dg a;
    dd b;
    df c;
    dtl d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(dgt.a(context));
                }
            }
        }
        return false;
    }

    public final void a() {
        this.b = null;
        this.a = null;
    }

    public final void a(Activity activity) {
        if (this.b == null) {
            String a2 = dgt.a(activity);
            if (a2 != null) {
                this.c = new dgu(this);
                dd.a(activity, a2, this.c);
            }
        }
    }

    public final void a(dd ddVar) {
        this.b = ddVar;
        this.b.a(0);
        dtl dtl = this.d;
        if (dtl != null) {
            dtl.a();
        }
    }
}
