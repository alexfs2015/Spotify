package com.spotify.music;

import android.content.Context;
import androidx.multidex.MultiDex;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.AndroidLowMemory;

public class SpotifyApplication extends vtl implements vhv {
    public wlc<rkq> a;
    public wlc<klf> b;
    public wlc<vhl> c;
    public gdz<fko> d;
    public rwf e;
    private final glp g = new glp();
    private final jrf h = new jrf();

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
        this.g.a = this.h.b();
    }

    public void onCreate() {
        this.g.b = this.h.b();
        super.onCreate();
        ((rkq) this.a.get()).a();
        ((klf) this.b.get()).a(this.g);
        this.g.c = this.h.b();
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        rwf rwf = this.e;
        boolean z = false;
        if (rwf.a.e() && i >= rwf.a.d()) {
            int i2 = rwf.b.get(i, 0) + 1;
            rwf.b.put(i, i2);
            if (i2 % rwf.a.c() == 1) {
                z = true;
            }
        }
        if (z) {
            this.d.a(AndroidLowMemory.k().a(i).g());
        }
    }

    public final vtk<? extends vtl> a() {
        return lak.a().a(this).a();
    }

    public final vhl b() {
        Logger.c("Providing remote configuration.", new Object[0]);
        return (vhl) this.c.get();
    }
}
