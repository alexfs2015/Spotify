package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@cfp
/* renamed from: bim reason: default package */
public final class bim implements dik, Runnable {
    private final List<Object[]> a;
    private final AtomicReference<dik> b;
    private Context c;
    private cpp d;
    private CountDownLatch e;

    private bim(Context context, cpp cpp) {
        this.a = new Vector();
        this.b = new AtomicReference<>();
        this.e = new CountDownLatch(1);
        this.c = context;
        this.d = cpp;
        dqe.a();
        if (cpc.b()) {
            cms.a((Runnable) this);
        } else {
            run();
        }
    }

    public bim(bkd bkd) {
        this(bkd.c, bkd.e);
    }

    private final boolean a() {
        try {
            this.e.await();
            return true;
        } catch (InterruptedException unused) {
            cpn.a(5);
            return false;
        }
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void b() {
        if (!this.a.isEmpty()) {
            for (Object[] objArr : this.a) {
                if (objArr.length == 1) {
                    ((dik) this.b.get()).a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((dik) this.b.get()).a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.a.clear();
        }
    }

    public final String a(Context context) {
        if (a()) {
            dik dik = (dik) this.b.get();
            if (dik != null) {
                b();
                return dik.a(b(context));
            }
        }
        return "";
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        if (a()) {
            dik dik = (dik) this.b.get();
            if (dik != null) {
                b();
                return dik.a(b(context), str, view, activity);
            }
        }
        return "";
    }

    public final void a(int i, int i2, int i3) {
        dik dik = (dik) this.b.get();
        if (dik != null) {
            b();
            dik.a(i, i2, i3);
            return;
        }
        this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void a(MotionEvent motionEvent) {
        dik dik = (dik) this.b.get();
        if (dik != null) {
            b();
            dik.a(motionEvent);
            return;
        }
        this.a.add(new Object[]{motionEvent});
    }

    public final void a(View view) {
        dik dik = (dik) this.b.get();
        if (dik != null) {
            dik.a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.d.d;
            if (!((Boolean) dqe.f().a(dtg.aJ)).booleanValue() && z2) {
                z = true;
            }
            this.b.set(din.a(this.d.a, b(this.c), z));
        } finally {
            this.e.countDown();
            this.c = null;
            this.d = null;
        }
    }
}
