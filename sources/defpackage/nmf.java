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

/* renamed from: nmf reason: default package */
public final class nmf {
    public final CompositeDisposable a = new CompositeDisposable();
    nmh b;
    private final oix c;
    private final Scheduler d;
    private final uxh e;
    private final nke f;
    private final HomeMixInteractionLogger g;
    private final njy h;
    private final String i;
    private final HomeMixFormatListAttributesHelper j;
    private final nnl<wsj<Void>> k;
    private HomeMix l;

    /* renamed from: nmf$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nmf.AnonymousClass1.<clinit>():void");
        }
    }

    public nmf(oix oix, Scheduler scheduler, uxh uxh, nke nke, HomeMixInteractionLogger homeMixInteractionLogger, njy njy, String str, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, kxz kxz) {
        this.c = oix;
        this.d = scheduler;
        this.e = uxh;
        this.f = nke;
        this.g = homeMixInteractionLogger;
        this.h = njy;
        this.i = str;
        this.j = homeMixFormatListAttributesHelper;
        this.k = new nnl<>(kxz, $$Lambda$nmf$hju7clV3ABiAjSTmbMQwKdosboI.INSTANCE);
    }

    public final void a() {
        this.a.c();
        this.a.a(this.c.c().c((Function<? super T, ? extends R>) $$Lambda$SEWkB4evPqcStZLbRB5gaRBSsI.INSTANCE).c((Function<? super T, ? extends R>) new $$Lambda$nmf$Ov7wI1bPTC1czvjsIszDFNf9kQc<Object,Object>(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$nmf$FVf87ubhpQWpBDdnIFNf9mzxXFk<Object>(this), (Consumer<? super Throwable>) new $$Lambda$nmf$nK_iRfXXM9IZ7YfLQ37QOqTarRw<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HomeMix a(uyz uyz) {
        this.l = this.j.a(uyz);
        HomeMix homeMix = this.l;
        if (homeMix != null) {
            return homeMix;
        }
        throw new IllegalStateException("Could not parse format list attribute from metadata");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(HomeMix homeMix) {
        nmh nmh = this.b;
        int i2 = AnonymousClass1.a[homeMix.style().ordinal()];
        if (i2 == 1) {
            if (nmh.g != null) {
                nmh.g.setSelected(false);
            }
            if (nmh.f != null) {
                nmh.f.setSelected(false);
            }
        } else if (i2 == 2) {
            if (nmh.g != null) {
                nmh.g.setSelected(false);
            }
            if (nmh.f != null) {
                nmh.f.setSelected(true);
            }
        } else if (i2 == 3) {
            if (nmh.g != null) {
                nmh.g.setSelected(true);
            }
            if (nmh.f != null) {
                nmh.f.setSelected(false);
            }
        }
        nmh nmh2 = this.b;
        HomeMixPlanType planType = homeMix.planType();
        nmh2.h.a(nmh2.d.getString(R.string.home_mix_chill_style_suggestion, new Object[]{planType.a(nmh2.d)}));
        nmh2.i.a(nmh2.d.getString(R.string.home_mix_upbeat_style_suggestion, new Object[]{planType.a(nmh2.d)}));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.b(th.getMessage(), new Object[0]);
        nmh nmh = this.b;
        if (nmh.g != null) {
            nmh.g.setVisibility(8);
        }
        if (nmh.f != null) {
            nmh.f.setVisibility(8);
        }
    }

    public final void a(View view, Style style, View view2) {
        this.a.a(Single.b(Boolean.valueOf(view.isSelected())).f(new $$Lambda$nmf$6PvOlOpFboeQOLCOi9BGVaV5aCk(view2, view)).b((Consumer<? super T>) new $$Lambda$nmf$gSJ6V7GDC_IyoE23ipwvzU9H2dA<Object>(this, style)).f(new $$Lambda$nmf$Iqv2EKvdt1ei8pf5q1oDy2r5TxQ(this, style)).d((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$nmf$ypkIxBpk67GXL9BOdD4A_E0GcC4<Object,Object>(this)).a(this.d).c((Function<? super T, ? extends R>) new $$Lambda$nmf$lGusCTxewgNYGh4OH7SqMe0Lc<Object,Object>(this)).a((Consumer<? super T>) new $$Lambda$nmf$ZJKWOf35CZSmXhPORazraA5CK7A<Object>(this, view), (Consumer<? super Throwable>) new $$Lambda$nmf$WWRWT3cNbjj6iJnH5_El9VmfXo<Object>(this, view)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, nnk nnk) {
        view.setEnabled(true);
        if ((nnk.a instanceof a) || (nnk.a instanceof c)) {
            view.setSelected(true ^ view.isSelected());
            if (nnk.a instanceof a) {
                this.b.a((int) R.string.home_mix_unknown_error_title);
            } else if (nnk.a instanceof c) {
                this.b.a((int) R.string.home_mix_no_internet_connection);
            }
            Logger.e(nnk.toString(), new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, Throwable th) {
        view.setEnabled(true);
        view.setSelected(true ^ view.isSelected());
        this.b.a((int) R.string.home_mix_unknown_error_title);
        Logger.e(th.getMessage(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public Observable<nnk<HomeMixTuning>> a(HomeMixTuning homeMixTuning) {
        return this.f.a(this.i, homeMixTuning).a((SingleTransformer<? super T, ? extends R>) this.k).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nmf$j0SajMMB7hSO3hpBKv0VCaYBRI<Object,Object>(this, homeMixTuning)).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Style style, Boolean bool) {
        int i2 = AnonymousClass1.a[style.ordinal()];
        String str = "default";
        if (i2 != 1) {
            if (i2 == 2) {
                HomeMixInteractionLogger homeMixInteractionLogger = this.g;
                HomeMix homeMix = this.l;
                Section section = Section.CHILL_BUTTON;
                String str2 = homeMixInteractionLogger.a;
                if (bool.booleanValue()) {
                    str = "chill";
                }
                homeMixInteractionLogger.a(section, str2, str, homeMix);
            }
            return;
        }
        HomeMixInteractionLogger homeMixInteractionLogger2 = this.g;
        HomeMix homeMix2 = this.l;
        Section section2 = Section.UPBEAT_BUTTON;
        String str3 = homeMixInteractionLogger2.a;
        if (bool.booleanValue()) {
            str = "upbeat";
        }
        homeMixInteractionLogger2.a(section2, str3, str, homeMix2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HomeMixTuning a(Style style, Boolean bool) {
        if (!bool.booleanValue()) {
            style = Style.DEFAULT;
        }
        return HomeMixTuning.create(style, this.l.excludedUserIds());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(View view, View view2, Boolean bool) {
        view.setSelected(false);
        view2.setEnabled(false);
        view2.setSelected(!bool.booleanValue());
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(HomeMixTuning homeMixTuning, nnk nnk) {
        if (nnk.a instanceof d) {
            return this.e.a(this.i).a((SingleSource<T>) Single.b(nnk.a(homeMixTuning)));
        }
        return Single.b(nnk.a(nnk.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ nnk a(nnk nnk) {
        if (nnk.a instanceof d) {
            HomeMixTuning homeMixTuning = (HomeMixTuning) ((d) nnk.a).a;
            this.b.c.a(false, nmh.a, nmh.b);
            if (this.h.c.a(njy.a, false)) {
                DebugFlag debugFlag = DebugFlag.HOME_MIX_SHOW_TUNING_EDUCATION_ONCE;
            } else {
                nmh nmh = this.b;
                if (nmh.c.i(nmh.a) || nmh.c.i(nmh.b)) {
                    nmh.c.a(false, nmh.a, nmh.b);
                } else {
                    int i2 = AnonymousClass1.a[Style.fromValue(homeMixTuning.a()).ordinal()];
                    if (i2 == 2) {
                        nmh.c.a(true, nmh.a);
                    } else if (i2 == 3) {
                        nmh.c.a(true, nmh.b);
                    }
                }
                this.h.c.a().a(njy.a, true).b();
            }
        }
        return nnk;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(wsj wsj) {
        return wsj != null && (wsj.a.c == 200 || wsj.a.c == 202);
    }
}
