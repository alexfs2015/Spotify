package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: vxi reason: default package */
public final class vxi implements vxh {
    private final SharedPreferences a;
    private final String b;
    private final Context c;

    public vxi(Context context, String str) {
        if (context != null) {
            this.c = context;
            this.b = str;
            this.a = this.c.getSharedPreferences(this.b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public final SharedPreferences a() {
        return this.a;
    }

    public final Editor b() {
        return this.a.edit();
    }

    public final boolean a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    @Deprecated
    public vxi(vuz vuz) {
        this(vuz.h, vuz.getClass().getName());
    }
}
