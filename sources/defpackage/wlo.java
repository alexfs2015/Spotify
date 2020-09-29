package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: wlo reason: default package */
public final class wlo implements wln {
    private final SharedPreferences a;
    private final String b;
    private final Context c;

    public wlo(Context context, String str) {
        if (context != null) {
            this.c = context;
            this.b = str;
            this.a = this.c.getSharedPreferences(this.b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public wlo(wjf wjf) {
        this(wjf.h, wjf.getClass().getName());
    }

    public final SharedPreferences a() {
        return this.a;
    }

    public final boolean a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public final Editor b() {
        return this.a.edit();
    }
}
