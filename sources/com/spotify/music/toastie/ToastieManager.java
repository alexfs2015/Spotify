package com.spotify.music.toastie;

import android.view.View;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

public class ToastieManager implements lg {
    public uos a;
    public Snackbar b;
    private WeakReference<q> c;

    public final void a(q qVar) {
        c();
        this.c = new WeakReference<>(qVar);
        qVar.a.a(this);
    }

    @lp(a = Event.ON_RESUME)
    public void onResume() {
        uos uos = this.a;
        if (uos != null) {
            a(uos);
            this.a = null;
        }
    }

    @lp(a = Event.ON_STOP)
    public void onStop() {
        c();
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

    public final void a(uos uos) {
        WeakReference<q> weakReference = this.c;
        if (weakReference != null) {
            q qVar = (q) weakReference.get();
            if (qVar != null) {
                View findViewById = qVar.findViewById(R.id.content);
                if (findViewById == null) {
                    b(qVar);
                    return;
                }
                a(uos, findViewById);
            }
        }
    }

    private static void b(q qVar) {
        Assertion.b(String.format("There is no CoordinatorLayout with id `content` in the view hierarchy of [%s] - [%s]", new Object[]{qVar, qVar.i().a((int) R.id.container)}));
    }

    private void a(uos uos, View view) {
        this.b = Snackbar.a(view, uos.a(), uos.b());
        this.b.a(uos.e(), uos.f());
        uor.a(this.b, uos);
        this.b.c();
    }

    public final void a() {
        Snackbar snackbar = this.b;
        if (snackbar != null) {
            snackbar.d();
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
}
