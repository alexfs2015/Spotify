package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: lq reason: default package */
public final class lq implements lh {
    private static final lq i = new lq();
    int a = 0;
    int b = 0;
    boolean c = true;
    boolean d = true;
    Handler e;
    final li f = new li(this);
    Runnable g = new Runnable() {
        public final void run() {
            lq lqVar = lq.this;
            if (lqVar.b == 0) {
                lqVar.c = true;
                lqVar.f.a(Event.ON_PAUSE);
            }
            lq.this.c();
        }
    };
    a h = new a() {
        public final void a() {
            lq lqVar = lq.this;
            lqVar.a++;
            if (lqVar.a == 1 && lqVar.d) {
                lqVar.f.a(Event.ON_START);
                lqVar.d = false;
            }
        }

        public final void b() {
            lq lqVar = lq.this;
            lqVar.b++;
            if (lqVar.b == 1) {
                if (lqVar.c) {
                    lqVar.f.a(Event.ON_RESUME);
                    lqVar.c = false;
                    return;
                }
                lqVar.e.removeCallbacks(lqVar.g);
            }
        }
    };

    public static lh b() {
        return i;
    }

    public static void a(Context context) {
        lq lqVar = i;
        lqVar.e = new Handler();
        lqVar.f.a(Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new la() {
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                lr.b(activity).a = lq.this.h;
            }

            public final void onActivityPaused(Activity activity) {
                lq lqVar = lq.this;
                lqVar.b--;
                if (lqVar.b == 0) {
                    lqVar.e.postDelayed(lqVar.g, 700);
                }
            }

            public final void onActivityStopped(Activity activity) {
                lq lqVar = lq.this;
                lqVar.a--;
                lqVar.c();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        if (this.a == 0 && this.c) {
            this.f.a(Event.ON_STOP);
            this.d = true;
        }
    }

    private lq() {
    }

    public final Lifecycle Y_() {
        return this.f;
    }
}
