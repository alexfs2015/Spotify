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

/* renamed from: qwv reason: default package */
public final class qwv implements kjd<MusicPagesModel, qwj> {
    private final rbu a;
    private final qwz b;
    private final boolean c;
    private final ViewGroup d;
    /* access modifiers changed from: private */
    public final ViewGroup e;
    /* access modifiers changed from: private */
    public c f = $$Lambda$qwv$bEOvT5hQANPW5CmBXOnuF2xIKMc.INSTANCE;
    /* access modifiers changed from: private */
    public d g = $$Lambda$qwv$kBZ7T74qo4316sTqm9vQjuVMzvA.INSTANCE;
    /* access modifiers changed from: private */
    public e h = $$Lambda$qwv$XxZjF8wnD8TIBBGFGXJcmu9MQ4.INSTANCE;
    /* access modifiers changed from: private */
    public f i = $$Lambda$qwv$y_hKSZYg2gJDb53ufAi45KHKXWU.INSTANCE;
    /* access modifiers changed from: private */
    public b j = $$Lambda$qwv$FfjVmMmexUCiCE9f9jJ6uck9X4k.INSTANCE;
    /* access modifiers changed from: private */
    public a k = $$Lambda$qwv$gIOrAbkjl7W4CXPo7zzHZWBPRo.INSTANCE;
    private boolean l;

    /* renamed from: qwv$a */
    interface a {
        void onFilterOptionActiveStateChanged(defpackage.rbq.b bVar);
    }

    /* renamed from: qwv$b */
    interface b {
        void onFilterShowing(boolean z);
    }

    /* renamed from: qwv$c */
    interface c {
        void onSortOptionChanged(uqv uqv);
    }

    /* renamed from: qwv$d */
    interface d {
        void onTextFilterCancelled();
    }

    /* renamed from: qwv$e */
    interface e {
        void onTextFilterChanged(String str);
    }

    /* renamed from: qwv$f */
    interface f {
        void onTextFilterFocusChanged(boolean z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(String str) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(defpackage.rbq.b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(uqv uqv) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f() {
    }

    public qwv(ViewGroup viewGroup, ViewGroup viewGroup2, rbu rbu, qwz qwz, boolean z) {
        this.d = viewGroup;
        this.e = viewGroup2;
        this.a = rbu;
        this.b = qwz;
        this.c = z;
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        Disposable disposable;
        this.f = new $$Lambda$qwv$hU2bc0jqznv04co9dsj4NAd1NtE(kkn);
        this.h = new $$Lambda$qwv$J1K02dFqcxO4vP2JDOZNj0OT3Pc(kkn);
        this.g = new $$Lambda$qwv$oXGASz5SgJG7jxVsJEFfX6piCjA(kkn);
        this.j = new $$Lambda$qwv$6Ppny9mBesSCRgjEn6V7iCeHOc(this, kkn);
        this.k = new $$Lambda$qwv$8gE5idYPQ_ANQilSv6YCKOIKK8(kkn);
        this.i = new $$Lambda$qwv$YIme17DG3_RZjpRHzIOr86ovcH4(this);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.c(1).a((Consumer<? super T>) new $$Lambda$qwv$a912_Gmcl6MUbstQWY514IbmOmY<Object>(this), (Consumer<? super Throwable>) $$Lambda$qwv$yQ54QBQFIIc7agKyheBO55sqUKs.INSTANCE);
        final Disposable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$qwv$u35HExEaD4z4mPm0JPv2pAY7ao.INSTANCE).a((Predicate<? super T>) $$Lambda$qwv$PzDcTe9kn_7lQ1rfhlQ0LEQBZPs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$qwv$tniupuRnn2ZdSpk9FJP4WvqnSOc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$nvqQrvCS5mgLmC2Nvu_jjUMuH8.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qwv$7imWr6IXu1OKpzQYcSReyrM7KMQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$qwv$pgn3GFJYbrQZ7S7dlIMoK60zlZA.INSTANCE);
        if (this.c) {
            disposable = a2.a((Predicate<? super T>) $$Lambda$qwv$e10hLGut5_wYOewt8ce4pnYDL5o.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$qwv$W10PlPzR9JZCewRVbFeLin_PrTg.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qwv$PtoOSINy4wKkoa1XrZb8YJyfI<Object>(this), (Consumer<? super Throwable>) $$Lambda$qwv$LlEyE6_xykY0E6fO5bjfz_JHqE.INSTANCE);
        } else {
            disposable = Disposables.b();
        }
        final Disposable disposable2 = disposable;
        AnonymousClass1 r0 = new kje<MusicPagesModel>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a() {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(String str) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(defpackage.rbq.b bVar) {
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(uqv uqv) {
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
                a3.bf_();
                a4.bf_();
                disposable2.bf_();
                qwv.this.f = $$Lambda$qwv$1$TuCwIrtzkOmtqBiyn04c_jsDhpQ.INSTANCE;
                qwv.this.h = $$Lambda$qwv$1$Kbk6Y02oP2BsZuNMaGjor6l8GYY.INSTANCE;
                qwv.this.g = $$Lambda$qwv$1$v3E1i9I_eBEZuJBTpUQW2IPgGdk.INSTANCE;
                qwv.this.i = $$Lambda$qwv$1$BEy7C2XinCMOqrfvEXJZLLu4nSI.INSTANCE;
                qwv.this.j = $$Lambda$qwv$1$LuH9Jh9ml4Z3rphURGhlPk37A0.INSTANCE;
                qwv.this.k = $$Lambda$qwv$1$iJwcLz2bNynqY4hx8yLQJRLOhwA.INSTANCE;
            }
        };
        return r0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, boolean z) {
        if (this.c && z) {
            kkn.accept(new y());
        }
        kkn.accept(new ae(z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (z) {
            this.j.onFilterShowing(z);
            this.a.b(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(ho hoVar) {
        return ((Optional) fay.a(hoVar.a)).b() && !((ImmutableList) fay.a(hoVar.b)).isEmpty();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Optional b(ho hoVar) {
        return (Optional) hoVar.a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uqv uqv) {
        this.a.b(uqv.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        rbq rbq = (rbq) fay.a(hoVar.a);
        ImmutableMap immutableMap = (ImmutableMap) ((Optional) fay.a(hoVar.b)).a(ImmutableMap.f());
        com.google.common.collect.ImmutableList.a g2 = ImmutableList.g();
        fdh R_ = rbq.e().R_();
        while (R_.hasNext()) {
            defpackage.rbq.b bVar = (defpackage.rbq.b) R_.next();
            boolean booleanValue = ((Boolean) jtc.a(immutableMap.get(bVar.a()), Boolean.FALSE)).booleanValue();
            g2.c(bVar.g().a(booleanValue).c(this.b.a(bVar.a())).a());
        }
        this.a.a(rbq.f().a(g2.a()).a());
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

    /* access modifiers changed from: private */
    public void a(MusicPagesModel musicPagesModel) {
        rbq d2 = musicPagesModel.a().d();
        if (!this.c) {
            d2 = d2.f().a(ImmutableList.d()).a();
        }
        this.e.addView(this.a.a(LayoutInflater.from(this.d.getContext()), this.e, this.d, d2, new defpackage.rbu.a() {
            public final void a(SortOption sortOption) {
                qwv.this.f.onSortOptionChanged(uqv.a(sortOption));
            }

            public final void a(String str) {
                qwv.this.h.onTextFilterChanged(str);
            }

            public final void a() {
                qwv.this.c();
            }

            public final void a(boolean z) {
                qwv.this.i.onTextFilterFocusChanged(z);
            }

            public final void a(defpackage.rbq.b bVar) {
                qwv.this.k.onFilterOptionActiveStateChanged(bVar);
            }
        }));
        this.a.b(musicPagesModel.e());
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
                    qwv.this.e.setVisibility(8);
                    qwv.this.j.onFilterShowing(false);
                }
            }).start();
        }
    }

    public final void e() {
        this.a.b("");
    }
}
