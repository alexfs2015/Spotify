package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: mct reason: default package */
public final class mct implements mcn {
    private final PackageManager a;
    private final a b;

    /* renamed from: mct$a */
    public interface a {
        void b(Intent intent);
    }

    public mct(PackageManager packageManager, a aVar) {
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
