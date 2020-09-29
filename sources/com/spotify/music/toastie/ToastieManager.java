package com.spotify.music.toastie;

import android.view.View;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public class ToastieManager implements ll {
    public uzy a;
    public Snackbar b;
    private WeakReference<q> c;
    private final vsm d;
    private final uzw e;

    public ToastieManager(vsm vsm, uzw uzw) {
        this.d = vsm;
        this.e = uzw;
    }

    private void a(uzy uzy, View view) {
        this.b = Snackbar.a(view, uzy.a(), uzy.b());
        this.b.a(uzy.e(), uzy.f());
        if (this.d.a()) {
            uzw.a(this.b);
        } else {
            uzw.a(this.b, uzy);
        }
        this.b.c();
    }

    private static void b(q qVar) {
        Assertion.b(String.format("There is no CoordinatorLayout with id `content` in the view hierarchy of [%s] - [%s]", new Object[]{qVar, qVar.i().a((int) R.id.container)}));
    }

    private void c() {
        WeakReference<q> weakReference = this.c;
        if (weakReference != null) {
            q qVar = (q) weakReference.get();
            if (qVar != null) {
                qVar.a.b(this);
            }
        }
        this.c = null;
    }

    public final void a() {
        Snackbar snackbar = this.b;
        if (snackbar != null) {
            snackbar.d();
        }
    }

    public final void a(q qVar) {
        c();
        this.c = new WeakReference<>(qVar);
        qVar.a.a(this);
    }

    public final void a(uzy uzy) {
        WeakReference<q> weakReference = this.c;
        if (weakReference != null) {
            q qVar = (q) weakReference.get();
            if (qVar != null) {
                View findViewById = qVar.findViewById(R.id.content);
                if (findViewById == null) {
                    b(qVar);
                    return;
                }
                a(uzy, findViewById);
            }
        }
    }

    public final boolean b() {
        WeakReference<q> weakReference = this.c;
        if (weakReference != null) {
            q qVar = (q) weakReference.get();
            if (qVar != null) {
                return qVar.a.a().a(State.RESUMED);
            }
        }
        return false;
    }

    @lu(a = Event.ON_RESUME)
    public void onResume() {
        uzy uzy = this.a;
        if (uzy != null) {
            a(uzy);
            this.a = null;
        }
    }

    @lu(a = Event.ON_STOP)
    public void onStop() {
        c();
    }
}
