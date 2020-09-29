package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcw;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: dil reason: default package */
public abstract class dil implements dik {
    protected static volatile djc a;
    protected MotionEvent b;
    protected LinkedList<MotionEvent> c = new LinkedList<>();
    protected long d = 0;
    protected long e = 0;
    protected long f = 0;
    protected long g = 0;
    protected long h = 0;
    protected long i = 0;
    protected long j = 0;
    protected double k;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    protected boolean p = false;
    protected DisplayMetrics q;
    private double r;
    private double s;
    private boolean t = false;

    protected dil(Context context) {
        try {
            if (((Boolean) dqe.f().a(dtg.bJ)).booleanValue()) {
                dhr.a();
            } else {
                dji.a(a);
            }
            this.q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String a(Context context, String str, boolean z, View view, Activity activity) {
        dci dci;
        int i2;
        if (z) {
            try {
                dci = a(context, view, activity);
                this.t = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                i2 = 7;
                return Integer.toString(i2);
            } catch (Throwable unused2) {
                i2 = 3;
                return Integer.toString(i2);
            }
        } else {
            dci = b(context);
        }
        return dci.d() == 0 ? Integer.toString(5) : dhr.a(dci, str);
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract dci a(Context context, View view, Activity activity);

    public final String a(Context context) {
        if (djk.a()) {
            if (((Boolean) dqe.f().a(dtg.bL)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, null, false, null, null);
    }

    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    public final String a(Context context, String str, View view, Activity activity) {
        return a(context, str, true, view, activity);
    }

    public final void a(int i2, int i3, int i4) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2 = this.b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        DisplayMetrics displayMetrics = this.q;
        if (displayMetrics != null) {
            motionEvent = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * displayMetrics.density, this.q.density * ((float) i3), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.b = motionEvent;
        this.p = false;
    }

    public final void a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.t) {
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.c.clear();
            this.b = null;
            this.t = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = 0.0d;
            this.r = (double) motionEvent.getRawX();
            this.s = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d2 = this.r;
            Double.isNaN(rawX);
            double d3 = rawX - d2;
            double d4 = this.s;
            Double.isNaN(rawY);
            double d5 = rawY - d4;
            this.k += Math.sqrt((d3 * d3) + (d5 * d5));
            this.r = rawX;
            this.s = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.l = motionEvent.getX();
            this.m = motionEvent.getY();
            this.n = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
            this.d++;
        } else if (action2 == 1) {
            this.b = MotionEvent.obtain(motionEvent);
            this.c.add(this.b);
            if (this.c.size() > 6) {
                ((MotionEvent) this.c.remove()).recycle();
            }
            this.f++;
            this.h = a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.e += (long) (motionEvent.getHistorySize() + 1);
            try {
                djj b2 = b(motionEvent);
                if ((b2.d == null || b2.g == null) ? false : true) {
                    this.i += b2.d.longValue() + b2.g.longValue();
                }
                if (!(this.q == null || b2.e == null || b2.h == null)) {
                    z = true;
                }
                if (z) {
                    this.j += b2.e.longValue() + b2.h.longValue();
                }
            } catch (zzcw unused) {
            }
        } else if (action2 == 3) {
            this.g++;
        }
        this.p = true;
    }

    public void a(View view) {
    }

    /* access modifiers changed from: protected */
    public abstract dci b(Context context);

    /* access modifiers changed from: protected */
    public abstract djj b(MotionEvent motionEvent);
}
