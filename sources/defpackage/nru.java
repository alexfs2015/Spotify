package defpackage;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import com.spotify.music.features.homemix.models.HomeMixTuning;
import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: nru reason: default package */
public final class nru {
    public final CompositeDisposable a = new CompositeDisposable();
    nrw b;
    private final Scheduler c;
    private final vjj d;
    private final npy e;
    private final HomeMixInteractionLogger f;
    private final nps g;
    private final String h;
    private final HomeMixFormatListAttributesHelper i;
    private final ntm<xgo<Void>> j;
    private HomeMix k;

    /* renamed from: nru$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Style.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.homemix.models.HomeMixTuning$Style[] r0 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.homemix.models.HomeMixTuning$Style r1 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.UPBEAT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.homemix.models.HomeMixTuning$Style r1 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.CHILL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.homemix.models.HomeMixTuning$Style r1 = com.spotify.music.features.homemix.models.HomeMixTuning.Style.DEFAULT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nru.AnonymousClass1.<clinit>():void");
        }
    }

    public nru(Scheduler scheduler, vjj vjj, npy npy, HomeMixInteractionLogger homeMixInteractionLogger, nps nps, String str, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, lbi lbi) {
        this.c = scheduler;
        this.d = vjj;
        this.e = npy;
        this.f = homeMixInteractionLogger;
        this.g = nps;
        this.h = str;
        this.i = homeMixFormatListAttributesHelper;
        this.j = new ntm<>(lbi, $$Lambda$nru$5ESn76Lu0L7lm8uDKmLgAenriBE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HomeMix a(vlc vlc) {
        this.k = this.i.a(vlc);
        HomeMix homeMix = this.k;
        if (homeMix != null) {
            return homeMix;
        }
        throw new IllegalStateException("Could not parse format list attribute from metadata");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HomeMixTuning a(Style style, Boolean bool) {
        if (!bool.booleanValue()) {
            style = Style.DEFAULT;
        }
        return HomeMixTuning.create(style, this.k.excludedUserIds());
    }

    /* access modifiers changed from: private */
    public Observable<ntl<HomeMixTuning>> a(HomeMixTuning homeMixTuning) {
        return this.e.a(this.h, homeMixTuning).a((SingleTransformer<? super T, ? extends R>) this.j).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nru$hc8xtxLZEsFEZbQHCFSDH6kDNNc<Object,Object>(this, homeMixTuning)).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(HomeMixTuning homeMixTuning, ntl ntl) {
        return ntl.a instanceof d ? this.d.a(this.h).a((SingleSource<T>) Single.b(ntl.a(homeMixTuning))) : Single.b(ntl.a(ntl.a));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(View view, View view2, Boolean bool) {
        view.setSelected(false);
        view2.setEnabled(false);
        view2.setSelected(!bool.booleanValue());
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ntl a(ntl ntl) {
        if (ntl.a instanceof d) {
            HomeMixTuning homeMixTuning = (HomeMixTuning) ((d) ntl.a).a;
            this.b.c.a(false, nrw.a, nrw.b);
            if (this.g.c.a(nps.a, false)) {
                DebugFlag debugFlag = DebugFlag.HOME_MIX_SHOW_TUNING_EDUCATION_ONCE;
            } else {
                nrw nrw = this.b;
                if (nrw.c.i(nrw.a) || nrw.c.i(nrw.b)) {
                    nrw.c.a(false, nrw.a, nrw.b);
                } else {
                    int i2 = AnonymousClass1.a[Style.fromValue(homeMixTuning.a()).ordinal()];
                    if (i2 == 2) {
                        nrw.c.a(true, nrw.a);
                    } else if (i2 == 3) {
                        nrw.c.a(true, nrw.b);
                    }
                }
                this.g.c.a().a(nps.a, true).b();
            }
        }
        return ntl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, Throwable th) {
        view.setEnabled(true);
        view.setSelected(true ^ view.isSelected());
        this.b.a((int) R.string.home_mix_unknown_error_title);
        Logger.e(th.getMessage(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, ntl ntl) {
        view.setEnabled(true);
        if ((ntl.a instanceof a) || (ntl.a instanceof c)) {
            view.setSelected(true ^ view.isSelected());
            if (ntl.a instanceof a) {
                this.b.a((int) R.string.home_mix_unknown_error_title);
            } else if (ntl.a instanceof c) {
                this.b.a((int) R.string.home_mix_no_internet_connection);
            }
            Logger.e(ntl.toString(), new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(HomeMix homeMix) {
        nrw nrw = this.b;
        int i2 = AnonymousClass1.a[homeMix.style().ordinal()];
        if (i2 == 1) {
            if (nrw.g != null) {
                nrw.g.setSelected(false);
            }
            if (nrw.f != null) {
                nrw.f.setSelected(false);
            }
        } else if (i2 == 2) {
            if (nrw.g != null) {
                nrw.g.setSelected(false);
            }
            if (nrw.f != null) {
                nrw.f.setSelected(true);
            }
        } else if (i2 == 3) {
            if (nrw.g != null) {
                nrw.g.setSelected(true);
            }
            if (nrw.f != null) {
                nrw.f.setSelected(false);
            }
        }
        nrw nrw2 = this.b;
        HomeMixPlanType planType = homeMix.planType();
        nrw2.h.a(nrw2.d.getString(R.string.home_mix_chill_style_suggestion, new Object[]{planType.a(nrw2.d)}));
        nrw2.i.a(nrw2.d.getString(R.string.home_mix_upbeat_style_suggestion, new Object[]{planType.a(nrw2.d)}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.b(th.getMessage(), new Object[0]);
        nrw nrw = this.b;
        if (nrw.g != null) {
            nrw.g.setVisibility(8);
        }
        if (nrw.f != null) {
            nrw.f.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(xgo xgo) {
        return xgo != null && (xgo.a.c == 200 || xgo.a.c == 202);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Style style, Boolean bool) {
        int i2 = AnonymousClass1.a[style.ordinal()];
        String str = "default";
        if (i2 != 1) {
            if (i2 == 2) {
                HomeMixInteractionLogger homeMixInteractionLogger = this.f;
                HomeMix homeMix = this.k;
                Section section = Section.CHILL_BUTTON;
                String str2 = homeMixInteractionLogger.a;
                if (bool.booleanValue()) {
                    str = "chill";
                }
                homeMixInteractionLogger.a(section, str2, str, homeMix);
            }
            return;
        }
        HomeMixInteractionLogger homeMixInteractionLogger2 = this.f;
        HomeMix homeMix2 = this.k;
        Section section2 = Section.UPBEAT_BUTTON;
        String str3 = homeMixInteractionLogger2.a;
        if (bool.booleanValue()) {
            str = "upbeat";
        }
        homeMixInteractionLogger2.a(section2, str3, str, homeMix2);
    }

    public final void a(View view, Style style, View view2) {
        this.a.a(Single.b(Boolean.valueOf(view.isSelected())).f(new $$Lambda$nru$lIUxfXOh7Qfqh3FQOpfluJlVSk(view2, view)).b((Consumer<? super T>) new $$Lambda$nru$_BNNb6ZZxfgz5aJXINGPPYWNYb8<Object>(this, style)).f(new $$Lambda$nru$sUOZw7ToZSQDotuBUgUahyaq5Q(this, style)).d((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nru$EuXL836NzN1Na9px_HCNj9jO7oI<Object,Object>(this)).a(this.c).c((Function<? super T, ? extends R>) new $$Lambda$nru$pQfU89GIyww76vVeLvcSo_zT2Cc<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$nru$GY2uOJKZWR0emAZIxz5sAl8meHU<Object>(this, view), (Consumer<? super Throwable>) new $$Lambda$nru$vreNZr_nHGGn6ZUG4hwN5LHG3QQ<Object>(this, view)));
    }

    public final void a(a aVar) {
        this.a.c();
        this.a.a(aVar.b().c().c((Function<? super T, ? extends R>) $$Lambda$HYgVOKXzvBPMUz8gp5LwXVmeGk.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$nru$7_2AnIXbe6Oo0N95SSReQtO7R5s<Object,Object>(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$nru$t0RjqYVajGDV0hOaH6K7Gj_qLPQ<Object>(this), (Consumer<? super Throwable>) new $$Lambda$nru$4MMijr2tV3UcroQv6srOqOu3Qfs<Object>(this)));
    }
}
