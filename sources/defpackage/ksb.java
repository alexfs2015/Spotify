package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ksb reason: default package */
public final class ksb {
    private final Context a;
    private final szp b;

    public ksb(Context context, szp szp) {
        this.a = context;
        this.b = szp;
    }

    public final void a() {
        Intent launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage("fm.anchor.android");
        if (launchIntentForPackage != null) {
            this.a.startActivity(launchIntentForPackage);
        } else {
            this.b.a("spotify:internal:anchorfunnel:yourlibrary");
        }
    }
}
