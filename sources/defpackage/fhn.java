package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: fhn reason: default package */
public abstract class fhn extends Service {
    final ExecutorService a;
    private Binder b;
    private final Object c;
    private int d;
    private int e;

    public fhn() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = "Firebase-";
        this.a = Executors.newSingleThreadExecutor(new cal(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
        this.c = new Object();
        this.e = 0;
    }

    /* access modifiers changed from: private */
    public final void d(Intent intent) {
        if (intent != null) {
            lb.a(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Intent a(Intent intent) {
        return intent;
    }

    public abstract void b(Intent intent);

    public boolean c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.b == null) {
            this.b = new fhs(this);
        }
        return this.b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent a2 = a(intent);
        if (a2 == null) {
            d(intent);
            return 2;
        } else if (c(a2)) {
            d(intent);
            return 2;
        } else {
            this.a.execute(new fhp(this, a2, intent));
            return 3;
        }
    }
}
