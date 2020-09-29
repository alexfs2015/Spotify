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

/* renamed from: pnk reason: default package */
public final class pnk {
    public pog a;
    public kf b;
    public View c;
    public FrameLayout d;
    public int e;
    public SnackBar f;
    private b<poc, poa> g;
    private final pnp h;
    private final pnr i;
    private final poj j;
    private ViewGroup k;
    private ppe l;
    private OnLayoutChangeListener m = new $$Lambda$pnk$PULGI116r8rdwxkC9FcN5wpbE(this);
    private a n = new $$Lambda$pnk$6AG3XadK5fUxtYoKdNn0W4gpBOI(this);
    private Runnable o = new $$Lambda$pnk$dKb6PGZD9couKPPL444vGcswERE(this);
    private final poh p;
    private final ppc q;
    private final pnn r;
    private final pol s;
    private kju<pot, por, poq> t;
    private Disposable u = Disposables.b();
    private Disposable v = Disposables.b();
    private final pon w;
    private final String x;
    private final psg y;
    private final ToastieManager z;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (System.getFloat(this.c.getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.d.post(new $$Lambda$pnk$26chzsT5RhJhzYtxrKpDH6ylg0(this, this.d.getY() + ((float) (i3 - i7))));
            return;
        }
        this.d.animate().yBy((float) (i3 - i7)).setInterpolator(new LinearInterpolator()).setDuration(200).start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        this.d.setY(f2);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null && this.c != null) {
            frameLayout.setY(0.0f);
            SnackBar snackBar = this.f;
            this.d.getLayoutParams().height = this.c.getHeight() - ((snackBar == null ? 0 : snackBar.getHeight()) + this.e);
        }
    }

    public pnk(pnr pnr, pnp pnp, poh poh, pnn pnn, ppc ppc, pol pol, pon pon, Activity activity, psg psg, ToastieManager toastieManager, poj poj) {
        this.i = pnr;
        this.h = pnp;
        this.p = poh;
        this.r = pnn;
        this.q = ppc;
        this.s = pol;
        this.w = pon;
        this.x = activity.getLocalClassName();
        this.y = psg;
        this.z = toastieManager;
        this.j = poj;
    }

    public final void a(kf kfVar, ViewGroup viewGroup) {
        this.b = kfVar;
        this.k = viewGroup;
    }

    public final void a() {
        pou pou;
        pou pou2;
        pou pou3;
        b();
        if (c()) {
            pnp pnp = this.h;
            this.g = kjt.a(pnp.a(this.r.a), this.i.a, kkd.a());
            this.g.a(this.a);
            this.g.c();
        }
        pon pon = this.w;
        pot pot = (pot) pon.a.get(this.x);
        if (pot == null) {
            a e2 = pot.e();
            if (e()) {
                pou = new b();
            } else {
                pou = new c();
            }
            a c2 = e2.c(pou);
            if (c()) {
                pou2 = new b();
            } else {
                pou2 = new c();
            }
            a a2 = c2.a(pou2);
            if (d()) {
                pou3 = new b();
            } else {
                pou3 = new c();
            }
            pot = a2.b(pou3).a();
        }
        this.t = this.s.a(this.p, this.r, this.q).a((kjo<M, F>) $$Lambda$HGYa1PGZzkewVvBE6u5rOKGdSdU.INSTANCE).a(pot);
        kf kfVar = this.b;
        if (!(kfVar == null || kfVar.a("QuicksilverNoteTag") == null)) {
            this.c.post(this.o);
        }
        if (e()) {
            this.v = this.p.a.a((Consumer<? super T>) new $$Lambda$pnk$fyp9LQt0hQqzMvdhUx_OtjEHF7Y<Object>(this), (Consumer<? super Throwable>) $$Lambda$pnk$BH4aEgDLnFzhf4FxBx8LiVZU9vQ.INSTANCE);
        }
        if (d()) {
            this.u = this.q.a.a((Consumer<? super T>) new $$Lambda$pnk$xIjv2JtbUFuDvclA6LQjyjR_4eQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$pnk$c5641unDNpsBNC156zjCugTzZo.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        prk prk = (prk) hoVar.a;
        QuicksilverCardMessage quicksilverCardMessage = (QuicksilverCardMessage) hoVar.b;
        if (e()) {
            this.b.a().b(this.k.getId(), prv.a(prk, quicksilverCardMessage), "QuicksilverCardTag").b();
            return;
        }
        poj.a("cards");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        prk prk = (prk) hoVar.a;
        NoteMessage noteMessage = (NoteMessage) hoVar.b;
        ToastieManager toastieManager = this.z;
        int i2 = 0;
        if (toastieManager.b != null && toastieManager.b.e()) {
            this.y.a("ToastieShowing", prk.getTriggerString(), prk.getType(), "notes", noteMessage.getId());
        } else if (d()) {
            SnackBar snackBar = this.f;
            if (snackBar != null) {
                i2 = snackBar.getHeight();
            }
            this.d.getLayoutParams().height = this.c.getHeight() - (i2 + this.e);
            this.l = ppe.a(prk, noteMessage);
            this.l.a(this.n);
            this.b.a().b(this.d.getId(), this.l, "QuicksilverNoteTag").b();
            SnackBar snackBar2 = this.f;
            if (snackBar2 != null) {
                snackBar2.addOnLayoutChangeListener(this.m);
            }
            return;
        }
        poj.a("notes");
    }

    public final void b() {
        b<poc, poa> bVar = this.g;
        if (bVar != null && bVar.a()) {
            this.i.a = ((poc) this.g.e()).a(false);
            this.g.d();
            this.g.b();
        }
        kju<pot, por, poq> kju = this.t;
        if (kju != null) {
            this.w.a(this.x, (pot) kju.b);
            this.t.dispose();
            this.t = null;
        }
        if (!this.v.b()) {
            this.v.bf_();
        }
        if (!this.u.b()) {
            this.u.bf_();
        }
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
}
