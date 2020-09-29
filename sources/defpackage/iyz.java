package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.spotify.core.http.HttpConnection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iyz reason: default package */
public final class iyz {
    private final PackageManager a;
    private List<ActivityInfo> b;

    /* renamed from: iyz$a */
    public static class a {
        private final PackageManager a;
        private final ActivityInfo b;

        public a(PackageManager packageManager, ActivityInfo activityInfo) {
            this.a = packageManager;
            this.b = activityInfo;
        }

        public final Drawable a() {
            return this.b.loadIcon(this.a);
        }

        public final Intent b() {
            Intent intent = new Intent();
            intent.setPackage(this.b.packageName);
            return intent;
        }
    }

    public iyz(Context context) {
        this(context.getPackageManager());
    }

    public iyz(PackageManager packageManager) {
        this.a = packageManager;
    }

    private List<ActivityInfo> a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(HttpConnection.kDefaultContentType);
        List<ResolveInfo> queryIntentActivities = this.a.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (resolveInfo.activityInfo != null) {
                arrayList.add(resolveInfo.activityInfo);
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        return b(str) != null;
    }

    public final a b(String str) {
        if (this.b == null) {
            this.b = a();
        }
        for (ActivityInfo activityInfo : this.b) {
            if (activityInfo.packageName.equals(str)) {
                return new a(this.a, activityInfo);
            }
        }
        return null;
    }
}
