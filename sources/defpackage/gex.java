package defpackage;

import android.content.Context;
import android.provider.Settings.Secure;

/* renamed from: gex reason: default package */
public final class gex {
    private final Context a;
    private String b;

    gex(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        if (this.b == null) {
            this.b = Secure.getString(this.a.getContentResolver(), "android_id");
        }
        return this.b;
    }
}
