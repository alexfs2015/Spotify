package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: lv reason: default package */
public final class lv implements lm {
    private static final lv i = new lv();
    int a = 0;
    int b = 0;
    boolean c = true;
    boolean d = true;
    Handler e;
    final ln f = new ln(this);
    Runnable g = new Runnable() {
        public final void run() {
            lv lvVar = lv.this;
            if (lvVar.b == 0) {
                lvVar.c = true;
                lvVar.f.a(Event.ON_PAUSE);
            }
            lv.this.c();
        }
    };
    a h = new a() {
        public final void a() {
            lv lvVar = lv.this;
            lvVar.a++;
            if (lvVar.a == 1 && lvVar.d) {
                lvVar.f.a(Event.ON_START);
                lvVar.d = false;
            }
        }

        public final void b() {
            lv lvVar = lv.this;
            lvVar.b++;
            if (lvVar.b == 1) {
                if (lvVar.c) {
                    lvVar.f.a(Event.ON_RESUME);
                    lvVar.c = false;
                    return;
                }
                lvVar.e.removeCallbacks(lvVar.g);
            }
        }
    };

    private lv() {
    }

    public static void a(Context context) {
        lv lvVar = i;
        lvVar.e = new Handler();
        lvVar.f.a(Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new lf() {
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                lw.b(activity).a = lv.this.h;
            }

            public final void onActivityPaused(Activity activity) {
                lv lvVar = lv.this;
                lvVar.b--;
                if (lvVar.b == 0) {
                    lvVar.e.postDelayed(lvVar.g, 700);
                }
            }

            public final void onActivityStopped(Activity activity) {
                lv lvVar = lv.this;
                lvVar.a--;
                lvVar.c();
            }
        });
    }

    public static lm b() {
        return i;
    }

    public final Lifecycle Y_() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        if (this.a == 0 && this.c) {
            this.f.a(Event.ON_STOP);
            this.d = true;
        }
    }
}
