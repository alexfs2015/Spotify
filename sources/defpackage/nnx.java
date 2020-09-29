package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.homemix.models.HomeMixPlanType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;

/* renamed from: nnx reason: default package */
public final class nnx {
    public final CompositeDisposable a = new CompositeDisposable();
    public nny b;
    public nnf c;
    public HomeMixPlanType d = HomeMixPlanType.OTHER;
    public boolean e;
    private final oix f;
    private final nkd g;
    private final String h;
    private final HomeMixFormatListAttributesHelper i;
    private final uxh j;
    private final nnl<wsj<Void>> k;

    public nnx(oix oix, nkd nkd, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, kxz kxz, uxh uxh, String str) {
        this.f = oix;
        this.g = nkd;
        this.i = homeMixFormatListAttributesHelper;
        this.j = uxh;
        this.h = str;
        this.k = new nnl<>(kxz, $$Lambda$nnx$CIN9HprzFar3I0LmmFxRACdtvY.INSTANCE);
    }

    public final void a() {
        this.a.c();
        this.a.a(this.f.c().c((Function<? super T, ? extends R>) $$Lambda$SEWkB4evPqcStZLbRB5gaRBSsI.INSTANCE).a(AndroidSchedulers.a()).d((Consumer<? super T>) new $$Lambda$nnx$vTi3HgFc9KcjSy6KnGzjQtnlmU<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyz uyz) {
        HomeMixPlanType homeMixPlanType;
        HomeMix a2 = this.i.a(uyz);
        HomeMix a3 = this.i.a(uyz);
        this.c = a3 != null ? new nnb(a3.isUserEnabled(), a3.includeExplicit(), a3.isFamilyMember()) : null;
        this.e = a2 != null && a2.needsTasteOnboarding();
        if (a2 == null) {
            homeMixPlanType = HomeMixPlanType.OTHER;
        } else {
            homeMixPlanType = a2.planType();
        }
        this.d = homeMixPlanType;
    }

    public final void b() {
        fay.a(this.c);
        boolean z = !this.c.b();
        this.a.a(this.g.a(ImmutableMap.b("publish_explicit", Boolean.valueOf(z))).a((SingleTransformer<? super T, ? extends R>) this.k).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nnx$DIFXR9a11NkHbQazvGvfxnH9Mts<Object,Object>(this)).d().e(nnk.a()).c(10, TimeUnit.SECONDS).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$nnx$M9oFNuzHnGBykj5jan1u5peE<Object>(this, z), (Consumer<? super Throwable>) new $$Lambda$nnx$16cn0fb9_Qlx3RiCBUzEuJ7S3OU<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(nnk nnk) {
        if (nnk.e()) {
            return this.j.a(this.h).a((SingleSource<T>) Single.b(nnk));
        }
        return Single.b(nnk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, nnk nnk) {
        Logger.b(nnk.toString(), new Object[0]);
        if (!nnk.b() && this.b != null) {
            if (nnk.c()) {
                this.b.at();
            } else if (nnk.d()) {
                this.b.ay();
            } else if (z) {
                this.b.av();
            } else {
                this.b.au();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        nny nny = this.b;
        if (nny != null) {
            nny.at();
        }
    }

    public final void c() {
        fay.a(this.c);
        boolean z = !this.c.a();
        this.a.a(this.g.a(ImmutableMap.b("enabled", Boolean.valueOf(z))).a((SingleTransformer<? super T, ? extends R>) this.k).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$nnx$ud_sefehuGqH3CN4lR2LsTKRy7M<Object,Object>(this)).d().e(nnk.a()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$nnx$b5vJ_jPkuf16iliuzRYRpC6Sqfk<Object>(this, z), (Consumer<? super Throwable>) new $$Lambda$nnx$yLevq8UATMgtGBssIHng7kcLyh0<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(nnk nnk) {
        if (nnk.e()) {
            return this.j.a(this.h).a((SingleSource<T>) Single.b(nnk));
        }
        return Single.b(nnk);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, nnk nnk) {
        Logger.b(nnk.toString(), new Object[0]);
        if (!nnk.b() && this.b != null) {
            if (nnk.c()) {
                this.b.at();
            } else if (nnk.d()) {
                this.b.ay();
            } else if (z) {
                this.b.aw();
            } else {
                this.b.ax();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        nny nny = this.b;
        if (nny != null) {
            nny.at();
        }
    }

    public final boolean d() {
        nnf nnf = this.c;
        return nnf != null && nnf.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(wsj wsj) {
        return wsj != null && (wsj.a.c == 200 || wsj.a.c == 202);
    }
}
