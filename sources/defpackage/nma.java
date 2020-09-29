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
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: nma reason: default package */
public final class nma {
    final CompositeDisposable a = new CompositeDisposable();
    final orf b;
    final CompletableSubject c = CompletableSubject.f();
    nmb d;
    final a e = new a() {
        public final void a(String str, boolean z) {
        }

        public final void a(boolean z) {
            if (z) {
                nma.this.d.e();
            } else {
                nma.this.d.f();
            }
        }
    };
    private final nlw f;
    private final oix g;
    private final HomeMixFormatListAttributesHelper h;
    private final olo i;
    private final HomeMixInteractionLogger j;
    private final String k;
    private HomeMix l;

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    public nma(oix oix, orf orf, olo olo, String str, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, njq njq, HomeMixInteractionLogger homeMixInteractionLogger) {
        this.b = orf;
        this.i = olo;
        nlx nlx = njq.a;
        boolean z = true;
        a a2 = new a().a(true);
        if (nlx.a.a() != LicenseLayout.SHUFFLE_WHEN_FREE) {
            z = false;
        }
        this.f = a2.b(z).a();
        this.k = str;
        this.j = homeMixInteractionLogger;
        this.h = homeMixFormatListAttributesHelper;
        this.g = oix;
    }

    public final void a() {
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) this.g.c(), (ObservableSource<? extends T2>) this.g.b(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$PtKgV6KBRJCtwM5ZttNm5I6IZI.INSTANCE).a(Functions.a()).a(AndroidSchedulers.a());
        $$Lambda$nma$kOM4KN_hUDGQRGvAtcUuMSKqRPM r2 = new $$Lambda$nma$kOM4KN_hUDGQRGvAtcUuMSKqRPM(this);
        CompletableSubject completableSubject = this.c;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        if (this.f.a()) {
            this.b.a(this.e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        ojc ojc = (ojc) fay.a(hoVar.a);
        ojb ojb = (ojb) fay.a(hoVar.b);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.h;
        uyz a2 = ojc.a();
        String imageUri = a2.getImageUri(Size.LARGE);
        this.l = homeMixFormatListAttributesHelper.a(a2);
        this.d.a(a2.a());
        nmb nmb = this.d;
        HomeMix homeMix = this.l;
        int i2 = -16777216;
        if (homeMix != null) {
            i2 = njp.a(homeMix.secondaryColor(), -16777216);
        }
        nmb.a(imageUri, i2);
        HomeMix homeMix2 = this.l;
        boolean z = true;
        boolean z2 = homeMix2 != null && homeMix2.needsTasteOnboarding();
        HomeMix homeMix3 = this.l;
        boolean z3 = homeMix3 != null && !homeMix3.isUserEnabled();
        if (!z2) {
            if (ojb.d() != 0) {
                z = false;
            }
            if (!z || !z3) {
                this.d.h();
                this.c.onComplete();
            }
        }
        this.d.g();
        this.c.onComplete();
    }

    public final void b() {
        if (this.b.d() || !this.f.b()) {
            if (this.b.d()) {
                this.i.a(this.k);
                HomeMixInteractionLogger homeMixInteractionLogger = this.j;
                homeMixInteractionLogger.a(Section.PLAY_BUTTON, homeMixInteractionLogger.a, "pause", this.l);
            } else {
                this.i.b(this.k);
                this.j.a(this.l);
            }
            this.a.a(this.b.a().a((Action) $$Lambda$nma$v8Ogd50F60qFPcEh_JOhxTRruM0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$nma$pANPrqelEgSoHaZEgwmZrCWA8Jc.INSTANCE));
            return;
        }
        this.i.b(this.k);
        this.j.a(this.l);
        this.a.a(this.b.c().a((Action) $$Lambda$nma$CN3MhZxO3NUv1fFcS5gziLc47s.INSTANCE, (Consumer<? super Throwable>) $$Lambda$nma$G7k3bBG9N9oBDv4FpDKRD1e2rfM.INSTANCE));
    }
}
