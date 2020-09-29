package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: ese reason: default package */
public final class ese implements ServiceConnection {
    final /* synthetic */ esd a;
    /* access modifiers changed from: private */
    public final String b;

    ese(esd esd, String str) {
        this.a = esd;
        this.b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.a.a.q().f.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            emd a2 = emu.a(iBinder);
            if (a2 == null) {
                this.a.a.q().f.a("Install Referrer Service implementation was not found");
                return;
            }
            this.a.a.q().i.a("Install Referrer Service connected");
            this.a.a.p().a((Runnable) new esf(this, a2, this));
        } catch (Exception e) {
            this.a.a.q().f.a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a.q().i.a("Install Referrer Service disconnected");
    }
}
