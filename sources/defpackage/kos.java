package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: kos reason: default package */
public final class kos {
    private final Context a;
    private final spi b;

    public kos(Context context, spi spi) {
        this.a = context;
        this.b = spi;
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
