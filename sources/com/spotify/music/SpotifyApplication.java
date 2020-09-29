package com.spotify.music;

import android.content.Context;
import androidx.multidex.MultiDex;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.AndroidLowMemory;

public class SpotifyApplication extends whr implements vva {
    public wzi<rtw> a;
    public wzi<koo> b;
    public wzi<vuq> c;
    public gfk<fli> d;
    public sfp e;
    private final gne g = new gne();
    private final jtp h = new jtp();

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        super.onCreate();
    }

    public final whq<? extends whr> a() {
        return ldx.a().a(this).a();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
        this.g.a = this.h.b();
    }

    public final vuq b() {
        Logger.c("Providing remote configuration.", new Object[0]);
        return (vuq) this.c.get();
    }

    public void onCreate() {
        this.g.b = this.h.b();
        gbz.a(new Runnable() {
            public final void run() {
                SpotifyApplication.this.c();
            }
        });
        ((rtw) this.a.get()).a();
        ((koo) this.b.get()).a(this.g);
        this.g.c = this.h.b();
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        sfp sfp = this.e;
        boolean z = false;
        if (sfp.a.e() && i >= sfp.a.d()) {
            int i2 = sfp.b.get(i, 0) + 1;
            sfp.b.put(i, i2);
            if (i2 % sfp.a.c() == 1) {
                z = true;
            }
        }
        if (z) {
            this.d.a(AndroidLowMemory.k().a(i).g());
        }
    }
}
