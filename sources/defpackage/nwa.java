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

/* renamed from: nwa reason: default package */
final class nwa {
    final CompositeDisposable a = new CompositeDisposable();
    boolean b;
    private final nvy c;
    private final rvg d;
    private final nvu e;
    private final nuv f;
    private nwc g;
    private final Scheduler h;
    private final rvv i;

    nwa(nvy nvy, rvg rvg, nuv nuv, nvu nvu, Scheduler scheduler, rvv rvv) {
        this.c = nvy;
        this.d = rvg;
        this.e = nvu;
        this.f = nuv;
        this.h = scheduler;
        this.i = rvv;
    }

    public final void a(nwc nwc) {
        this.g = nwc;
        nwc.c = new $$Lambda$nwa$7VIsQ1Lbfb4AvHT9jKL0MfBINfo(this);
        nwc.b = new $$Lambda$nwa$xlFiCPOhlyAXtQNb02XThgeUQ(this);
        nwc.d = new $$Lambda$nwa$kNMDuGNkLvTvox1B3vinfoWnL4c(this);
        nwc.e = new $$Lambda$nwa$MCa2gAa00319IVsDc0jWz_Hezg(this);
        this.a.a(this.e.a().a(this.h).a((Consumer<? super T>) new $$Lambda$nwa$71xJ_ZtPVrft9ktpggWLW4qo0_s<Object>(this), (Consumer<? super Throwable>) $$Lambda$nwa$jJ9zec8mfcrLgdhAIXvRtFNtPqc.INSTANCE));
    }

    public final void a() {
        this.a.a(this.d.a().a(this.h).a((Consumer<? super T>) new $$Lambda$nwa$DH9T81Ggc3s0yYpqLDFFzAIpzvU<Object>(this), (Consumer<? super Throwable>) new $$Lambda$nwa$6tcylkKGiGkAMPR7TgdAlUypo<Object>(this)));
    }

    /* access modifiers changed from: private */
    public void a(ImmutableMap<PartnerType, rvn> immutableMap) {
        boolean z;
        nwc nwc = (nwc) fay.a(this.g);
        fdh R_ = immutableMap.values().iterator();
        while (true) {
            if (R_.hasNext()) {
                if (a((rvn) R_.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            View view = (View) fay.a(nwc.f);
            View view2 = (View) fay.a(nwc.k);
            View view3 = (View) fay.a(nwc.l);
            ((TextView) fay.a(nwc.g)).setText(((Context) fay.a(nwc.h)).getText(R.string.starttrip_banner_starttrip));
            view2.setVisibility(0);
            view3.setVisibility(0);
            view.setOnClickListener(null);
            View view4 = (View) fay.a(nwc.i);
            if (a((rvn) immutableMap.get(PartnerType.GOOGLE_MAPS))) {
                view4.setVisibility(0);
            } else {
                view4.setVisibility(8);
            }
            View view5 = (View) fay.a(nwc.j);
            if (a((rvn) immutableMap.get(PartnerType.WAZE))) {
                view5.setVisibility(0);
            } else {
                view5.setVisibility(8);
            }
        } else {
            nvy nvy = this.c;
            nvy.getClass();
            nwc.a((Runnable) new $$Lambda$9hujWy2wAfDTWlkrTkt3xmHGg8(nvy));
        }
        this.i.a(a((rvn) immutableMap.get(PartnerType.WAZE)), a((rvn) immutableMap.get(PartnerType.GOOGLE_MAPS)));
    }

    /* access modifiers changed from: private */
    public void a(Throwable th) {
        ((nwc) fay.a(this.g)).a(false);
        Logger.e(th, "Error getting integrations", new Object[0]);
    }

    private static boolean a(rvn rvn) {
        return rvn != null && rvn.a() && rvn.b();
    }

    /* access modifiers changed from: private */
    public void b() {
        ((nwc) fay.a(this.g)).a(false);
        if (this.f.a(PartnerType.GOOGLE_MAPS.mPackageName)) {
            this.i.c();
            nvy nvy = this.c;
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setPackage(PartnerType.GOOGLE_MAPS.mPackageName);
            nvy.b.startActivity(intent);
            return;
        }
        this.c.a();
    }

    /* access modifiers changed from: private */
    public void c() {
        ((nwc) fay.a(this.g)).a(false);
        if (this.f.a(PartnerType.WAZE.mPackageName)) {
            this.i.e();
            this.c.a.a();
            return;
        }
        this.c.b();
    }

    /* access modifiers changed from: private */
    public void d() {
        ((nwc) fay.a(this.g)).a(false);
        this.b = true;
        this.i.i();
    }

    /* access modifiers changed from: private */
    public void e() {
        this.c.c();
        ((nwc) fay.a(this.g)).a(false);
        this.i.g();
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        if (i2 == 360) {
            if (((nwc) fay.a(this.g)).aH_()) {
                this.i.h();
            }
            ((nwc) fay.a(this.g)).a(false);
            return;
        }
        ((ProgressBar) fay.a(((nwc) fay.a(this.g)).m)).setProgress(i2);
    }
}
