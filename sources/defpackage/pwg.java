package defpackage;

import android.app.Activity;
import android.provider.Settings.System;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: pwg reason: default package */
public final class pwg {
    public pxc a;
    public kk b;
    public View c;
    public FrameLayout d;
    public int e;
    public SnackBar f;
    private b<pwy, pww> g;
    private final pwl h;
    private final pwn i;
    private final pxf j;
    private ViewGroup k;
    private pya l;
    private OnLayoutChangeListener m = new $$Lambda$pwg$zZJjkRGy2MbOYc8RUAka47u8Tg8(this);
    private a n = new $$Lambda$pwg$bYFzT1paoi1knDjN44Xq207ci6k(this);
    private Runnable o = new $$Lambda$pwg$Ut7mKzyQ6Q_CAGxBpRHgwIr0Pxs(this);
    private final pxd p;
    private final pxy q;
    private final pwj r;
    private final pxh s;
    private knd<pxp, pxn, pxm> t;
    private Disposable u = Disposables.b();
    private Disposable v = Disposables.b();
    private final pxj w;
    private final String x;
    private final qbc y;
    private final ToastieManager z;

    public pwg(pwn pwn, pwl pwl, pxd pxd, pwj pwj, pxy pxy, pxh pxh, pxj pxj, Activity activity, qbc qbc, ToastieManager toastieManager, pxf pxf) {
        this.i = pwn;
        this.h = pwl;
        this.p = pxd;
        this.r = pwj;
        this.q = pxy;
        this.s = pxh;
        this.w = pxj;
        this.x = activity.getLocalClassName();
        this.y = qbc;
        this.z = toastieManager;
        this.j = pxf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        this.d.setY(f2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (System.getFloat(this.c.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.d.post(new $$Lambda$pwg$XtV_1EXfCgBIOTVSDtTxEdip8w(this, this.d.getY() + ((float) (i3 - i7))));
            return;
        }
        this.d.animate().yBy((float) (i3 - i7)).setInterpolator(new LinearInterpolator()).setDuration(200).start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        qag qag = (qag) hoVar.a;
        NoteMessage noteMessage = (NoteMessage) hoVar.b;
        ToastieManager toastieManager = this.z;
        int i2 = 0;
        if (toastieManager.b != null && toastieManager.b.e()) {
            this.y.a("ToastieShowing", qag.getTriggerString(), qag.getType(), "notes", noteMessage.getId());
        } else if (d()) {
            SnackBar snackBar = this.f;
            if (snackBar != null) {
                i2 = snackBar.getHeight();
            }
            this.d.getLayoutParams().height = this.c.getHeight() - (i2 + this.e);
            this.l = pya.a(qag, noteMessage);
            this.l.a(this.n);
            this.b.a().b(this.d.getId(), this.l, "QuicksilverNoteTag").b();
            SnackBar snackBar2 = this.f;
            if (snackBar2 != null) {
                snackBar2.addOnLayoutChangeListener(this.m);
            }
            return;
        }
        pxf.a("notes");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        qag qag = (qag) hoVar.a;
        QuicksilverCardMessage quicksilverCardMessage = (QuicksilverCardMessage) hoVar.b;
        if (e()) {
            this.b.a().b(this.k.getId(), qar.a(qag, quicksilverCardMessage), "QuicksilverCardTag").b();
            return;
        }
        pxf.a("cards");
    }

    private boolean c() {
        return this.a != null;
    }

    private boolean d() {
        return (this.b == null || this.d == null) ? false : true;
    }

    private boolean e() {
        return (this.b == null || this.k == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null && this.c != null) {
            frameLayout.setY(0.0f);
            SnackBar snackBar = this.f;
            this.d.getLayoutParams().height = this.c.getHeight() - ((snackBar == null ? 0 : snackBar.getHeight()) + this.e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.b.a().a((Fragment) this.l).c();
        this.d.setY(0.0f);
        SnackBar snackBar = this.f;
        if (snackBar != null) {
            snackBar.removeOnLayoutChangeListener(this.m);
        }
    }

    public final void a() {
        b();
        if (c()) {
            this.g = knc.a(this.h.a(this.r.a), this.i.a, knm.a());
            this.g.a(this.a);
            this.g.c();
        }
        pxp pxp = (pxp) this.w.a.get(this.x);
        if (pxp == null) {
            pxp = pxp.e().c(e() ? new b() : new c()).a(c() ? new b() : new c()).b(d() ? new b() : new c()).a();
        }
        this.t = this.s.a(this.p, this.r, this.q).a((kmx<M, F>) $$Lambda$CsaF0GDlMpcvjtqpYiVfaeqOmIE.INSTANCE).a(pxp);
        kk kkVar = this.b;
        if (!(kkVar == null || kkVar.a("QuicksilverNoteTag") == null)) {
            this.c.post(this.o);
        }
        if (e()) {
            this.v = this.p.a.a((Consumer<? super T>) new $$Lambda$pwg$oY_jfWkVWdSGvxuu_9ln4Do0_Us<Object>(this), (Consumer<? super Throwable>) $$Lambda$pwg$iC1Jp6MVnZmaloiFjypOK5yqEE.INSTANCE);
        }
        if (d()) {
            this.u = this.q.a.a((Consumer<? super T>) new $$Lambda$pwg$tUbCQrRlBru6mxOHIrkBKr73yI<Object>(this), (Consumer<? super Throwable>) $$Lambda$pwg$QjOQCsJXOr1mBKx26hSU3MKksAw.INSTANCE);
        }
    }

    public final void a(kk kkVar, ViewGroup viewGroup) {
        this.b = kkVar;
        this.k = viewGroup;
    }

    public final void b() {
        b<pwy, pww> bVar = this.g;
        if (bVar != null && bVar.a()) {
            this.i.a = ((pwy) this.g.e()).a(false);
            this.g.d();
            this.g.b();
        }
        knd<pxp, pxn, pxm> knd = this.t;
        if (knd != null) {
            this.w.a(this.x, (pxp) knd.b);
            this.t.dispose();
            this.t = null;
        }
        if (!this.v.b()) {
            this.v.bd_();
        }
        if (!this.u.b()) {
            this.u.bd_();
        }
    }
}
