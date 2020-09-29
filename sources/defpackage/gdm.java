package defpackage;

import android.content.Context;
import android.provider.Settings.Secure;

/* renamed from: gdm reason: default package */
public final class gdm {
    private final Context a;
    private String b;

    gdm(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        if (this.b == null) {
            this.b = Secure.getString(this.a.getContentResolver(), "android_id");
        }
        return this.b;
    }
}
