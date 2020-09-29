package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: mgw reason: default package */
public final class mgw implements mgq {
    private final PackageManager a;
    private final a b;

    /* renamed from: mgw$a */
    public interface a {
        void b(Intent intent);
    }

    public mgw(PackageManager packageManager, a aVar) {
        this.a = packageManager;
        this.b = aVar;
    }

    public final void a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (!this.a.queryIntentActivities(intent, 0).isEmpty()) {
            this.b.b(intent);
        }
    }
}
