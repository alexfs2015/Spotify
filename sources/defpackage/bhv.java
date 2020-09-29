package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@cey
/* renamed from: bhv reason: default package */
public final class bhv implements dht, Runnable {
    private final List<Object[]> a;
    private final AtomicReference<dht> b;
    private Context c;
    private coy d;
    private CountDownLatch e;

    private bhv(Context context, coy coy) {
        this.a = new Vector();
        this.b = new AtomicReference<>();
        this.e = new CountDownLatch(1);
        this.c = context;
        this.d = coy;
        dpn.a();
        if (col.b()) {
            cmb.a((Runnable) this);
        } else {
            run();
        }
    }

    public bhv(bjm bjm) {
        this(bjm.c, bjm.e);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void b() {
        if (!this.a.isEmpty()) {
            for (Object[] objArr : this.a) {
                if (objArr.length == 1) {
                    ((dht) this.b.get()).a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((dht) this.b.get()).a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.a.clear();
        }
    }

    public final String a(Context context) {
        if (a()) {
            dht dht = (dht) this.b.get();
            if (dht != null) {
                b();
                return dht.a(b(context));
            }
        }
        return "";
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        if (a()) {
            dht dht = (dht) this.b.get();
            if (dht != null) {
                b();
                return dht.a(b(context), str, view, activity);
            }
        }
        return "";
    }

    public final void a(int i, int i2, int i3) {
        dht dht = (dht) this.b.get();
        if (dht != null) {
            b();
            dht.a(i, i2, i3);
            return;
        }
        this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(MotionEvent motionEvent) {
        dht dht = (dht) this.b.get();
        if (dht != null) {
            b();
            dht.a(motionEvent);
            return;
        }
        this.a.add(new Object[]{motionEvent});
    }

    public final void a(View view) {
        dht dht = (dht) this.b.get();
        if (dht != null) {
            dht.a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.d.d;
            if (!((Boolean) dpn.f().a(dsp.aJ)).booleanValue() && z2) {
                z = true;
            }
            this.b.set(dhw.a(this.d.a, b(this.c), z));
        } finally {
            this.e.countDown();
            this.c = null;
            this.d = null;
        }
    }

    private final boolean a() {
        try {
            this.e.await();
            return true;
        } catch (InterruptedException unused) {
            cow.a(5);
            return false;
        }
    }
}
