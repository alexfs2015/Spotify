package com.spotify.mobile.android.spotlets.player.v2;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.BehaviorProcessor;
import java.util.Map;

public class NowPlayingActivity extends kyd implements kye, a, tbu {
    public Map<NowPlayingMode, wlc<Single<sxh>>> g;
    public Flowable<NowPlayingMode> h;
    public Flowable<fpt> i;
    public kf j;
    public Scheduler k;
    public Scheduler l;
    public joh m;
    public ToastieManager n;
    public pni o;
    public rvq p;
    public pnk q;
    private kyf r;
    private final BehaviorProcessor<Boolean> s = BehaviorProcessor.k();
    private final CompositeDisposable t = new CompositeDisposable();

    public static Intent a(Context context) {
        fay.a(context);
        Intent intent = new Intent(context, NowPlayingActivity.class);
        intent.setFlags(603979776);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.npv_v2_activity);
        gaa.a((Context) this);
        if (VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.q.a(i(), (ViewGroup) findViewById(R.id.quicksilver_card_container));
    }

    public void onStart() {
        super.onStart();
        CompositeDisposable compositeDisposable = this.t;
        Flowable<NowPlayingMode> flowable = this.h;
        $$Lambda$NowPlayingActivity$8Cnc5YdO0blSaD2JWrc73yKh8gQ r2 = new Function() {
            public final Object apply(Object obj) {
                return NowPlayingActivity.this.a((NowPlayingMode) obj);
            }
        };
        ObjectHelper.a(r2, "mapper is null");
        ObjectHelper.a(Integer.MAX_VALUE, "maxConcurrency");
        compositeDisposable.a(RxJavaPlugins.a((Flowable<T>) new FlowableFlatMapSingle<T>(flowable, r2, false, Integer.MAX_VALUE)).a((Predicate<? super T>) new Predicate() {
            public final boolean test(Object obj) {
                return NowPlayingActivity.this.a((sxh) obj);
            }
        }).b(this.k).a(this.l).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                NowPlayingActivity.this.b((sxh) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$NowPlayingActivity$o7CQbSn8dudum2BMbwQG8KGRNA0.INSTANCE));
        CompositeDisposable compositeDisposable2 = this.t;
        Flowable<fpt> flowable2 = this.i;
        joh joh = this.m;
        joh.getClass();
        compositeDisposable2.a(flowable2.c((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                joh.this.a((fpt) obj);
            }
        }));
        this.o.a(ViewUris.V.toString());
        this.p.a(ViewUris.V.toString());
    }

    public void onStop() {
        super.onStop();
        this.t.c();
    }

    public void onResume() {
        super.onResume();
        this.n.a((q) this);
        this.q.a();
    }

    public void onPause() {
        super.onPause();
        this.q.b();
    }

    public void onBackPressed() {
        kyf kyf = this.r;
        if (kyf == null || !kyf.onBackPressed()) {
            Fragment a = this.j.a((int) R.id.container);
            if (a instanceof tcc) {
                ((tcc) a).ae();
            }
            super.onBackPressed();
        }
    }

    public final void a(kyf kyf) {
        this.r = kyf;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.s.b_(Boolean.valueOf(z));
    }

    public final Flowable<Boolean> k() {
        return this.s.a(Functions.a());
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.NOWPLAYING, ViewUris.Y.toString());
    }

    public final sih ae_() {
        return ViewUris.Y;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(NowPlayingMode nowPlayingMode) {
        return (Single) ((wlc) this.g.get(nowPlayingMode)).get();
    }

    /* access modifiers changed from: private */
    public void b(Fragment fragment) {
        if (fragment.i == null) {
            fragment.g(new Bundle());
        }
        km a = this.j.a();
        a.a((int) R.anim.fade_in_hard, (int) R.anim.fade_out_hard);
        a.b(R.id.container, fragment, fragment.getClass().getName());
        a.d();
        ip.s(findViewById(R.id.container));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(sxh sxh) {
        return !(this.j.a(sxh.getClass().getName()) != null);
    }
}
