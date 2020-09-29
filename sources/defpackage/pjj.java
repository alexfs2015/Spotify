package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: pjj reason: default package */
public final class pjj implements pji {
    private final who<a> a;
    private final shg b;
    private LottieAnimationView c;
    private Context d;

    public pjj(who<a> who, shg shg) {
        this.a = who;
        this.b = shg;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        ((a) this.a.get()).c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        ((a) this.a.get()).c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar) {
        this.c.setOnClickListener(new $$Lambda$pjj$cFHc1uZEXG_hUOf1c87gG2aXbFA(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, b bVar) {
        c(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, c cVar) {
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, d dVar) {
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, e eVar) {
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, f fVar) {
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, g gVar) {
        b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, h hVar) {
        c(str);
    }

    private void b(String str) {
        this.c.setOnClickListener(new $$Lambda$pjj$9SdS2bcBJ77VhmIQFtcwfoU7Nmg(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, View view) {
        ((a) this.a.get()).b(str);
    }

    private void c(String str) {
        this.c.setOnClickListener(new $$Lambda$pjj$K7QZQqjJoNmQt5a6Bswu_rtp_w(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, View view) {
        ((a) this.a.get()).a(str);
    }

    public final void a(LottieAnimationView lottieAnimationView) {
        this.c = (LottieAnimationView) fbp.a(lottieAnimationView);
        this.d = lottieAnimationView.getContext();
    }

    public final void a(String str) {
        pja.a(this.d, (OnClickListener) new $$Lambda$pjj$zj0K2wclBQXc3SLH0y_W1UIaY(this, str));
    }

    public final void a(phs phs) {
        Object tag = this.c.getTag();
        shk a2 = tag instanceof shk ? (shk) tag : this.b.a();
        this.c.setTag(a2);
        String b2 = phs.b();
        vli g = phs.g();
        sif.a(g, this.c, a2, b2);
        g.a((ged<f>) new $$Lambda$pjj$h2axI_xFUrqDSSjq1n8xCQwDzj0<f>(this, b2), (ged<h>) new $$Lambda$pjj$TuPq6sYpcO1E1vXkZ5DCcsXQodk<h>(this, b2), (ged<b>) new $$Lambda$pjj$RKNe8GmIRGbIY_wRhdSfpQB0Aw4<b>(this, b2), (ged<a>) new $$Lambda$pjj$XSJWzgs2zKzo_qW9rKHPJMwPn8<a>(this, b2), (ged<c>) new $$Lambda$pjj$TSoKKzP54WAx8koyCfq6b6enw8<c>(this, b2), (ged<e>) new $$Lambda$pjj$hiDcetKexOpNvG5KFdCSeWpTJGA<e>(this, b2), (ged<d>) new $$Lambda$pjj$vyz2xK7SIB5M64iei5uA829B6Io<d>(this, b2), (ged<g>) new $$Lambda$pjj$9sm67sFryvUcS7wyjHV0qX_El8<g>(this, b2));
    }
}
