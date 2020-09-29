package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bze reason: default package */
final class bze implements ServiceConnection {
    final Set<ServiceConnection> a = new HashSet();
    int b = 2;
    boolean c;
    IBinder d;
    final a e;
    ComponentName f;
    final /* synthetic */ bzd g;

    public bze(bzd bzd, a aVar) {
        this.g = bzd;
        this.e = aVar;
    }

    public final void a(ServiceConnection serviceConnection) {
        this.g.d;
        this.g.b;
        a aVar = this.e;
        this.g.b;
        aVar.a();
        this.a.add(serviceConnection);
    }

    public final void a(String str) {
        this.b = 3;
        this.g.d;
        Context c2 = this.g.b;
        a aVar = this.e;
        this.g.b;
        this.c = bzs.a(c2, aVar.a(), this, this.e.b);
        if (this.c) {
            this.g.c.sendMessageDelayed(this.g.c.obtainMessage(1, this.e), bzd.e(this.g));
            return;
        }
        this.b = 2;
        try {
            this.g.d;
            bzs.a(this.g.b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final boolean b(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
