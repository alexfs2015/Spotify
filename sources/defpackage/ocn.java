package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ocn reason: default package */
final class ocn {
    final CompositeDisposable a = new CompositeDisposable();
    boolean b;
    private final ocl c;
    private final seq d;
    private final och e;
    private final obi f;
    private ocp g;
    private final Scheduler h;
    private final sff i;

    ocn(ocl ocl, seq seq, obi obi, och och, Scheduler scheduler, sff sff) {
        this.c = ocl;
        this.d = seq;
        this.e = och;
        this.f = obi;
        this.h = scheduler;
        this.i = sff;
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        if (i2 == 360) {
            if (((ocp) fbp.a(this.g)).aF_()) {
                this.i.h();
            }
            ((ocp) fbp.a(this.g)).a(false);
            return;
        }
        ((ProgressBar) fbp.a(((ocp) fbp.a(this.g)).m)).setProgress(i2);
    }

    /* access modifiers changed from: private */
    public void a(ImmutableMap<PartnerType, sex> immutableMap) {
        boolean z;
        ocp ocp = (ocp) fbp.a(this.g);
        fdz R_ = immutableMap.values().iterator();
        while (true) {
            if (R_.hasNext()) {
                if (a((sex) R_.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            View view = (View) fbp.a(ocp.f);
            View view2 = (View) fbp.a(ocp.k);
            View view3 = (View) fbp.a(ocp.l);
            ((TextView) fbp.a(ocp.g)).setText(((Context) fbp.a(ocp.h)).getText(R.string.starttrip_banner_starttrip));
            view2.setVisibility(0);
            view3.setVisibility(0);
            view.setOnClickListener(null);
            View view4 = (View) fbp.a(ocp.i);
            if (a((sex) immutableMap.get(PartnerType.GOOGLE_MAPS))) {
                view4.setVisibility(0);
            } else {
                view4.setVisibility(8);
            }
            View view5 = (View) fbp.a(ocp.j);
            if (a((sex) immutableMap.get(PartnerType.WAZE))) {
                view5.setVisibility(0);
            } else {
                view5.setVisibility(8);
            }
        } else {
            ocl ocl = this.c;
            ocl.getClass();
            ocp.a((Runnable) new $$Lambda$bxGXgJaiGeYyiXHlK__YOiDWiMk(ocl));
        }
        this.i.a(a((sex) immutableMap.get(PartnerType.WAZE)), a((sex) immutableMap.get(PartnerType.GOOGLE_MAPS)));
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        ((ocp) fbp.a(this.g)).a(false);
        Logger.e(th, "Error getting integrations", new Object[0]);
    }

    private static boolean a(sex sex) {
        return sex != null && sex.a() && sex.b();
    }

    /* access modifiers changed from: private */
    public void b() {
        ((ocp) fbp.a(this.g)).a(false);
        if (this.f.a(PartnerType.GOOGLE_MAPS.mPackageName)) {
            this.i.c();
            ocl ocl = this.c;
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage(PartnerType.GOOGLE_MAPS.mPackageName);
            ocl.b.startActivity(intent);
            return;
        }
        this.c.a();
    }

    /* access modifiers changed from: private */
    public void c() {
        ((ocp) fbp.a(this.g)).a(false);
        if (this.f.a(PartnerType.WAZE.mPackageName)) {
            this.i.e();
            this.c.a.a();
            return;
        }
        this.c.b();
    }

    /* access modifiers changed from: private */
    public void d() {
        ((ocp) fbp.a(this.g)).a(false);
        this.b = true;
        this.i.i();
    }

    /* access modifiers changed from: private */
    public void e() {
        this.c.c();
        ((ocp) fbp.a(this.g)).a(false);
        this.i.g();
    }

    public final void a() {
        this.a.a(this.d.a().a(this.h).a((Consumer<? super T>) new $$Lambda$ocn$hlqlEW78cENOKSECX78DxO_63NE<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ocn$46L0IB3QdEIQmQnxEm3NIKHgGs<Object>(this)));
    }

    public final void a(ocp ocp) {
        this.g = ocp;
        ocp.c = new $$Lambda$ocn$y35d3m48os_HjoSJ8rCkb_xh3cI(this);
        ocp.b = new $$Lambda$ocn$eu3IeK6rrIFw_eafPv88RgdVdQ(this);
        ocp.d = new $$Lambda$ocn$C1baLLG7_Khcd31RorPFw75rrZ8(this);
        ocp.e = new $$Lambda$ocn$FJi3E9Ue301e0ToSOBf1FPx601Y(this);
        this.a.a(this.e.a().a(this.h).a((Consumer<? super T>) new $$Lambda$ocn$WAjXcr1r0Lehx7tb1lS8DK8G_5U<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocn$1o1yhVGQtRrp0xzs7exSjdgM7wY.INSTANCE));
    }
}
