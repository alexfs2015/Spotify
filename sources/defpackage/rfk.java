package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;

/* renamed from: rfk reason: default package */
public final class rfk implements kmm<MusicPagesModel, rey> {
    private final rkq a;
    private final rfo b;
    private final boolean c;
    private final ViewGroup d;
    /* access modifiers changed from: private */
    public final ViewGroup e;
    /* access modifiers changed from: private */
    public c f = $$Lambda$rfk$u0U0JJEyAX1P5ktmTApCGsoYDN4.INSTANCE;
    /* access modifiers changed from: private */
    public d g = $$Lambda$rfk$gOxUqQM0wK09OY15b_ePR_NoQAY.INSTANCE;
    /* access modifiers changed from: private */
    public e h = $$Lambda$rfk$TOInxyexOIB3qgI3gzdait9ULY.INSTANCE;
    /* access modifiers changed from: private */
    public f i = $$Lambda$rfk$40anr4gZRS8ocQoueqhZoT1Ab64.INSTANCE;
    /* access modifiers changed from: private */
    public b j = $$Lambda$rfk$_fIzGiKnp5WFXPvn0sGJ0yGPzEw.INSTANCE;
    /* access modifiers changed from: private */
    public a k = $$Lambda$rfk$6ALioxlFy6JytGFz0ZOVGXN9A4.INSTANCE;
    private boolean l;

    /* renamed from: rfk$a */
    interface a {
        void onFilterOptionActiveStateChanged(defpackage.rkm.b bVar);
    }

    /* renamed from: rfk$b */
    interface b {
        void onFilterShowing(boolean z);
    }

    /* renamed from: rfk$c */
    interface c {
        void onSortOptionChanged(vca vca);
    }

    /* renamed from: rfk$d */
    interface d {
        void onTextFilterCancelled();
    }

    /* renamed from: rfk$e */
    interface e {
        void onTextFilterChanged(String str);
    }

    /* renamed from: rfk$f */
    interface f {
        void onTextFilterFocusChanged(boolean z);
    }

    public rfk(ViewGroup viewGroup, ViewGroup viewGroup2, rkq rkq, rfo rfo, boolean z) {
        this.d = viewGroup;
        this.e = viewGroup2;
        this.a = rkq;
        this.b = rfo;
        this.c = z;
    }

    /* access modifiers changed from: private */
    public void a(MusicPagesModel musicPagesModel) {
        rkm d2 = musicPagesModel.a().d();
        if (!this.c) {
            d2 = d2.f().a(ImmutableList.d()).a();
        }
        this.e.addView(this.a.a(LayoutInflater.from(this.d.getContext()), this.e, this.d, d2, new defpackage.rkq.a() {
            public final void a() {
                rfk.this.c();
            }

            public final void a(SortOption sortOption) {
                rfk.this.f.onSortOptionChanged(vca.a(sortOption));
            }

            public final void a(String str) {
                rfk.this.h.onTextFilterChanged(str);
            }

            public final void a(defpackage.rkm.b bVar) {
                rfk.this.k.onFilterOptionActiveStateChanged(bVar);
            }

            public final void a(boolean z) {
                rfk.this.i.onTextFilterFocusChanged(z);
            }
        }));
        this.a.b(musicPagesModel.e());
        if (musicPagesModel.o()) {
            this.l = true;
            this.e.setVisibility(0);
            this.a.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        rkm rkm = (rkm) fbp.a(hoVar.a);
        ImmutableMap immutableMap = (ImmutableMap) ((Optional) fbp.a(hoVar.b)).a(ImmutableMap.f());
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        fdz R_ = rkm.e().R_();
        while (R_.hasNext()) {
            defpackage.rkm.b bVar = (defpackage.rkm.b) R_.next();
            boolean booleanValue = ((Boolean) jvi.a(immutableMap.get(bVar.a()), Boolean.FALSE)).booleanValue();
            g2.c(bVar.g().a(booleanValue).c(this.b.a(bVar.a())).a());
        }
        this.a.a(rkm.f().a(g2.a()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, boolean z) {
        if (this.c && z) {
            knw.accept(new y());
        }
        knw.accept(new ae(z));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(defpackage.rkm.b bVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vca vca) {
        this.a.b(vca.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (z) {
            this.j.onFilterShowing(z);
            this.a.b(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional b(ho hoVar) {
        return (Optional) hoVar.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(vca vca) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(ho hoVar) {
        return ((Optional) fbp.a(hoVar.a)).b() && !((ImmutableList) fbp.a(hoVar.b)).isEmpty();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f() {
    }

    public final void a() {
        if (!this.l) {
            this.l = true;
            this.e.clearAnimation();
            this.e.setVisibility(0);
            this.e.animate().alpha(1.0f).setDuration(300).setListener(null).start();
            this.a.c();
            this.j.onFilterShowing(true);
        }
    }

    public final void b() {
        this.a.e();
    }

    public final void c() {
        this.g.onTextFilterCancelled();
        e();
        this.a.d();
        if (this.c) {
            this.a.b(false);
        }
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.f = new $$Lambda$rfk$mOQAV0aH5EG90eZ1OoJ3gyTo_wc(knw);
        this.h = new $$Lambda$rfk$qf6sGt1GrRJ6azDG8Sg4Lhx1OnE(knw);
        this.g = new $$Lambda$rfk$fIX391_3uRVAhnmoqcE99E06g(knw);
        this.j = new $$Lambda$rfk$WzRIo31gof7ADQiobIoTaLsCHSw(this, knw);
        this.k = new $$Lambda$rfk$t83EfYM_lTRzPd0y7bZsLn0H1uE(knw);
        this.i = new $$Lambda$rfk$GV2JnU8AMfH6c1VmJxTVXXcEII0(this);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.c(1).a((Consumer<? super T>) new $$Lambda$rfk$JinjOWEqdG2HE_kyt05Q8FTAsCg<Object>(this), (Consumer<? super Throwable>) $$Lambda$rfk$liOIehVLW4A95CqazGQjFLSWtsM.INSTANCE);
        final Disposable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$rfk$aJnHcAlwI8MYjStt7QjJkjCfg4.INSTANCE).a((Predicate<? super T>) $$Lambda$rfk$wJtkuEIoEf_SVgfk7xVYEuELs6k.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$rfk$EjFtG5bO_pjiP7SkXUs_8SCWYs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$_DDURpq349NPbX7QY_YGXGYz9o.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$rfk$lksrJyD6P1upjN4zxnPxiY0Tg5M<Object>(this), (Consumer<? super Throwable>) $$Lambda$rfk$hgW_ndQ3hVx4h29JRW_keWMu8rA.INSTANCE);
        final Disposable a5 = this.c ? a2.a((Predicate<? super T>) $$Lambda$rfk$XxNRZB07r3XgAnFnA_kUIHWBlKs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$rfk$lPQA7zaxwYHwfbRY_QSRzRj3rE.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$rfk$Ls_6XBg2o6wQucC128vC57rnI4g<Object>(this), (Consumer<? super Throwable>) $$Lambda$rfk$g4hn3p_HK8ZcKtZu65U2vCKMCHg.INSTANCE) : Disposables.b();
        AnonymousClass1 r0 = new kmn<MusicPagesModel>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(String str) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(defpackage.rkm.b bVar) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(vca vca) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(boolean z) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void b(boolean z) {
            }

            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                a3.bd_();
                a4.bd_();
                a5.bd_();
                rfk.this.f = $$Lambda$rfk$1$1dPKfNA0o9igM5EnPwhsqpsoc9E.INSTANCE;
                rfk.this.h = $$Lambda$rfk$1$fdV8d2fIngW4Bjtka1kbviztUAk.INSTANCE;
                rfk.this.g = $$Lambda$rfk$1$IiBXBN6t7BEagT5ORHF1teXzlQ.INSTANCE;
                rfk.this.i = $$Lambda$rfk$1$XuSu4gU7LcRJGuj6L7HXfnagRo.INSTANCE;
                rfk.this.j = $$Lambda$rfk$1$QndMPVhKNhHcaJBpkgTRnOxGcng.INSTANCE;
                rfk.this.k = $$Lambda$rfk$1$ZZtBYVcTFPVASqbUuyVbyWS24Q.INSTANCE;
            }
        };
        return r0;
    }

    public final void d() {
        if (this.l) {
            if (this.c) {
                this.j.onFilterShowing(false);
                return;
            }
            this.l = false;
            this.e.clearAnimation();
            this.e.animate().alpha(0.0f).setDuration(200).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    rfk.this.e.setVisibility(8);
                    rfk.this.j.onFilterShowing(false);
                }
            }).start();
        }
    }

    public final void e() {
        this.a.b("");
    }
}
