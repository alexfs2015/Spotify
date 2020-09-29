package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: air reason: default package */
final class air implements ajl {
    private final Context a;
    private final String b;

    public air(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final String a() {
        try {
            Bundle bundle = this.a.getPackageManager().getApplicationInfo(this.b, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
