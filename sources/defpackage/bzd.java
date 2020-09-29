package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

/* renamed from: bzd reason: default package */
final class bzd extends bxe implements Callback {
    /* access modifiers changed from: private */
    public final HashMap<a, bze> a = new HashMap<>();
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final Handler c;
    /* access modifiers changed from: private */
    public final bzs d;
    private final long e;
    private final long f;

    bzd(Context context) {
        this.b = context.getApplicationContext();
        this.c = new ejq(context.getMainLooper(), this);
        this.d = bzs.a();
        this.e = 5000;
        this.f = 300000;
    }

    static /* synthetic */ long e(bzd bzd) {
        return 300000;
    }

    /* access modifiers changed from: protected */
    public final boolean a(a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        bxo.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            bze bze = (bze) this.a.get(aVar);
            if (bze == null) {
                bze = new bze(this, aVar);
                bze.a(serviceConnection);
                bze.a(str);
                this.a.put(aVar, bze);
            } else {
                this.c.removeMessages(0, aVar);
                if (!bze.b(serviceConnection)) {
                    bze.a(serviceConnection);
                    int i = bze.b;
                    if (i == 1) {
                        serviceConnection.onServiceConnected(bze.f, bze.d);
                    } else if (i == 2) {
                        bze.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = bze.c;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final void b(a aVar, ServiceConnection serviceConnection, String str) {
        bxo.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            bze bze = (bze) this.a.get(aVar);
            if (bze == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (bze.b(serviceConnection)) {
                bzs bzs = bze.g.d;
                Context context = bze.g.b;
                bze.a.remove(serviceConnection);
                if (bze.a()) {
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
                bze bze = (bze) this.a.get(aVar);
                if (bze != null && bze.a()) {
                    if (bze.c) {
                        bze.g.c.removeMessages(1, bze.e);
                        bzs bzs = bze.g.d;
                        bzs.a(bze.g.b, bze);
                        bze.c = false;
                        bze.b = 2;
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
                bze bze2 = (bze) this.a.get(aVar2);
                if (bze2 != null && bze2.b == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName componentName = bze2.f;
                    if (componentName == null) {
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(aVar2.a, "unknown");
                    }
                    bze2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
