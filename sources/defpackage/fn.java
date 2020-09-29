package defpackage;

import android.os.Build.VERSION;

/* renamed from: fn reason: default package */
public abstract class fn extends ff {
    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.a = new fo(this);
        }
    }
}
