package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger.Section;
import com.spotify.music.features.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: nrp reason: default package */
public final class nrp {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    nrq c;
    private final nrl d;
    private final HomeMixFormatListAttributesHelper e;
    private final oss f;
    private final BehaviorSubject<ho<oqf, oqg>> g = BehaviorSubject.a();
    private final SerialDisposable h = new SerialDisposable();
    private oyl i;
    private final HomeMixInteractionLogger j;
    private final String k;
    private HomeMix l;
    private final a m = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            if (z) {
                nrp.this.c.e();
            } else {
                nrp.this.c.f();
            }
        }
    };

    public nrp(oss oss, String str, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, npm npm, HomeMixInteractionLogger homeMixInteractionLogger) {
        this.f = oss;
        nrm nrm = npm.a;
        boolean z = true;
        a a2 = new a().a(true);
        if (nrm.a.a() != LicenseLayout.SHUFFLE_WHEN_FREE) {
            z = false;
        }
        this.d = a2.b(z).a();
        this.k = str;
        this.j = homeMixInteractionLogger;
        this.e = homeMixFormatListAttributesHelper;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        oqf oqf = (oqf) fbp.a(hoVar.a);
        vlc a2 = ((oqg) fbp.a(hoVar.b)).a();
        String imageUri = a2.getImageUri(Size.LARGE);
        this.l = this.e.a(a2);
        this.c.a(a2.a());
        nrq nrq = this.c;
        HomeMix homeMix = this.l;
        int i2 = -16777216;
        if (homeMix != null) {
            i2 = npl.a(homeMix.secondaryColor(), -16777216);
        }
        nrq.a(imageUri, i2);
        HomeMix homeMix2 = this.l;
        boolean z = true;
        boolean z2 = homeMix2 != null && homeMix2.needsTasteOnboarding();
        HomeMix homeMix3 = this.l;
        boolean z3 = homeMix3 != null && !homeMix3.isUserEnabled();
        if (!z2) {
            if (oqf.d() != 0) {
                z = false;
            }
            if (!z || !z3) {
                this.c.h();
                return;
            }
        }
        this.c.g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.g.onNext(hoVar);
        this.b.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public final void a() {
        if (this.i.d() || !this.d.b()) {
            if (this.i.d()) {
                this.f.a(this.k);
                HomeMixInteractionLogger homeMixInteractionLogger = this.j;
                homeMixInteractionLogger.a(Section.PLAY_BUTTON, homeMixInteractionLogger.a, "pause", this.l);
            } else {
                this.f.b(this.k);
                this.j.a(this.l);
            }
            this.a.a(this.i.a().a((Action) $$Lambda$nrp$rmHiNWmVcuqFQ7yHfYj__glaOA0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$nrp$0dDaD15KJ90QKeNYmjOXNclMqSk.INSTANCE));
            return;
        }
        this.f.b(this.k);
        this.j.a(this.l);
        this.a.a(this.i.c().a((Action) $$Lambda$nrp$B__1S5iT2JMgtLkPSSkiRLDNdwY.INSTANCE, (Consumer<? super Throwable>) $$Lambda$nrp$DCfAhaaJ54gxVq4Xb9jDVbF6AQw.INSTANCE));
    }

    public final void a(nrq nrq) {
        this.c = nrq;
        if (nrq != null) {
            this.h.a(this.g.d((Consumer<? super T>) new $$Lambda$nrp$n71HAlbtxxX7u_PHOVyjaJuFw<Object>(this)));
            if (this.d.a()) {
                this.i.a(this.m);
            }
        } else {
            this.h.a(Disposables.a());
            this.i.b(this.m);
        }
    }

    public final void a(a aVar) {
        this.i = aVar.a();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$XOFTafTE3HUAHpkswss2ae2f3w.INSTANCE).a(Functions.a()).a(AndroidSchedulers.a());
        $$Lambda$nrp$1ZSymR5y9cQeDEtjAtk_c4gcBz4 r1 = new $$Lambda$nrp$1ZSymR5y9cQeDEtjAtk_c4gcBz4(this);
        CompletableSubject completableSubject = this.b;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }
}
