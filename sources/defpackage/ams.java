package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: ams reason: default package */
public abstract class ams implements ServiceConnection {
    final Context a;
    public a b;
    public boolean c;
    int d;
    private final Handler e;
    private Messenger f;
    private int g;
    private final String h;
    private final int i;

    /* renamed from: ams$a */
    public interface a {
        void a(Bundle bundle);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bundle bundle);

    public ams(Context context, int i2, int i3, int i4, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.a = context;
        this.g = i2;
        this.d = i3;
        this.h = str;
        this.i = i4;
        this.e = new Handler() {
            public final void handleMessage(Message message) {
                ams ams = ams.this;
                if (message.what == ams.d) {
                    Bundle data = message.getData();
                    if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                        ams.b(null);
                    } else {
                        ams.b(data);
                    }
                    try {
                        ams.a.unbindService(ams);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        };
    }

    public final boolean a() {
        if (this.c || amr.b(this.i) == -1) {
            return false;
        }
        Intent a2 = amr.a(this.a);
        if (a2 == null) {
            return false;
        }
        this.c = true;
        this.a.bindService(a2, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        a(bundle);
        Message obtain = Message.obtain(null, this.g);
        obtain.arg1 = this.i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.e);
        try {
            this.f.send(obtain);
        } catch (RemoteException unused) {
            b(null);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        b(null);
    }

    /* access modifiers changed from: 0000 */
    public void b(Bundle bundle) {
        if (this.c) {
            this.c = false;
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(bundle);
            }
        }
    }
}
