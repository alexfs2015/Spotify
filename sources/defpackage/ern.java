package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: ern reason: default package */
public final class ern implements ServiceConnection {
    final /* synthetic */ erm a;
    /* access modifiers changed from: private */
    public final String b;

    ern(erm erm, String str) {
        this.a = erm;
        this.b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.a.a.q().f.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            elm a2 = emd.a(iBinder);
            if (a2 == null) {
                this.a.a.q().f.a("Install Referrer Service implementation was not found");
                return;
            }
            this.a.a.q().i.a("Install Referrer Service connected");
            this.a.a.p().a((Runnable) new ero(this, a2, this));
        } catch (Exception e) {
            this.a.a.q().f.a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a.q().i.a("Install Referrer Service disconnected");
    }
}
