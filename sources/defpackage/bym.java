package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

/* renamed from: bym reason: default package */
final class bym extends bwn implements Callback {
    /* access modifiers changed from: private */
    public final HashMap<a, byn> a = new HashMap<>();
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final Handler c;
    /* access modifiers changed from: private */
    public final bzb d;
    private final long e;
    private final long f;

    bym(Context context) {
        this.b = context.getApplicationContext();
        this.c = new eiz(context.getMainLooper(), this);
        this.d = bzb.a();
        this.e = 5000;
        this.f = 300000;
    }

    static /* synthetic */ long e(bym bym) {
        return 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean a(a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        bwx.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            byn byn = (byn) this.a.get(aVar);
            if (byn == null) {
                byn = new byn(this, aVar);
                byn.a(serviceConnection);
                byn.a(str);
                this.a.put(aVar, byn);
            } else {
                this.c.removeMessages(0, aVar);
                if (!byn.b(serviceConnection)) {
                    byn.a(serviceConnection);
                    int i = byn.b;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(byn.f, byn.d);
                    } else if (i == 2) {
                        byn.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = byn.c;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final void b(a aVar, ServiceConnection serviceConnection, String str) {
        bwx.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            byn byn = (byn) this.a.get(aVar);
            if (byn == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (byn.b(serviceConnection)) {
                bzb bzb = byn.g.d;
                Context context = byn.g.b;
                byn.a.remove(serviceConnection);
                if (byn.a()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, aVar), 5000);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a) {
                a aVar = (a) message.obj;
                byn byn = (byn) this.a.get(aVar);
                if (byn != null && byn.a()) {
                    if (byn.c) {
                        byn.g.c.removeMessages(1, byn.e);
                        bzb bzb = byn.g.d;
                        bzb.a(byn.g.b, byn);
                        byn.c = false;
                        byn.b = 2;
                    }
                    this.a.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a) {
                a aVar2 = (a) message.obj;
                byn byn2 = (byn) this.a.get(aVar2);
                if (byn2 != null && byn2.b == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName componentName = byn2.f;
                    if (componentName == null) {
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(aVar2.a, "unknown");
                    }
                    byn2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
