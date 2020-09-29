package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.feature.facebooksso.createaccount.model.Failure;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.FacebookSignupResponse;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.IOException;

/* renamed from: lln reason: default package */
public final class lln implements a, vno {
    final ujc a;
    final lmb b;
    final gnj c;
    final qfz d;
    final vnk e;
    Disposable f = Disposables.b();
    Disposable g = Disposables.b();
    Disposable h = Disposables.a();
    Disposable i = Disposables.a();
    Disposable j = Disposables.a();
    b k;
    boolean l;
    private final llr m;
    private final vju n;
    private final SpSharedPreferences<Object> o;
    private final vof p;
    private final gne q;
    private final Scheduler r;
    private Observable<Boolean> s;
    private Single<SignupConfigurationResponse> t;
    private a u = new a() {
        public final void a() {
            lln.c(lln.this);
        }

        public final void b() {
            lln.this.c.h();
        }

        public final void c() {
            lln.this.c.h();
        }
    };

    /* renamed from: lln$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[SpotifyError.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.util.SpotifyError[] r0 = com.spotify.mobile.android.util.SpotifyError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.SpotifyError r1 = com.spotify.mobile.android.util.SpotifyError.DNS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.SpotifyError r1 = com.spotify.mobile.android.util.SpotifyError.LOGIN_ACCOUNT_EXISTS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lln.AnonymousClass4.<clinit>():void");
        }
    }

    public final void a(Credential credential) {
    }

    public final void d() {
    }

    public lln(Scheduler scheduler, vju vju, llr llr, ujc ujc, SpSharedPreferences<Object> spSharedPreferences, lmb lmb, vof vof, kyb kyb, a aVar, vnk vnk, qfz qfz, gnj gnj, gne gne) {
        this.r = scheduler;
        this.m = llr;
        this.n = vju;
        this.t = RxJavaPlugins.a((Single<T>) new SingleCache<T>(vju.a()));
        this.a = ujc;
        this.o = spSharedPreferences;
        this.b = lmb;
        this.p = vof;
        this.s = kyb.a;
        this.d = qfz;
        this.e = vnk;
        this.c = gnj;
        this.q = gne;
        aVar.a(new c() {
            public final void c() {
                super.c();
                lln.a(lln.this);
                lln.b(lln.this);
            }

            public final void a() {
                super.a();
                lln.this.j.bf_();
                lln.this.f.bf_();
                lln.this.i.bf_();
                lln.this.h.bf_();
                lln.this.g.bf_();
            }
        });
    }

    public final void a(b bVar) {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT);
        this.k = bVar;
    }

    public final void b() {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT, ClickIdentifier.CONTINUE_BUTTON);
        this.h.bf_();
        this.h = this.s.c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$lln$J_PUI17Cf8JpglM6QT1Ju6ZriNk<Object,Object>(this), false).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$lln$3TvzglpogeZxwndpjhtOu1dCvM<Object>(this), (Consumer<? super Throwable>) new $$Lambda$lln$ccQ_keOBJuGW2jAOpMXoNWNRWpM<Object>(this));
    }

    public final void c() {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT, ClickIdentifier.CANCEL_BUTTON);
        this.c.h();
    }

    public final void a() {
        this.c.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.b(llm.a(Failure.OFFLINE));
        }
        return this.t.d().c((Function<? super T, ? extends R>) $$Lambda$hCUL9OMNC3lPMtI1hh3bQjUIOeE.INSTANCE).e(new b()).e((Function<? super Throwable, ? extends T>) $$Lambda$lln$N321swRaPUCIAA4NGMn_vvDF4Q.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ llm f(Throwable th) {
        if (th instanceof IOException) {
            return llm.a(Failure.NO_CONNECTION);
        }
        return llm.a(Failure.SPOTIFY_IS_DOWN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(llm llm) {
        llm.a(new $$Lambda$lln$W0_AGCDd7GfOUvacEF7gcTv3jHA(this), new $$Lambda$lln$xv_pt4hNeBTYCujNj5HFMZqcbWI(this), new $$Lambda$lln$IZq7gK408mAfO8i6F4ctqkbtI6M(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Throwable th) {
        this.d.a();
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.b(lll.a(Failure.OFFLINE));
        }
        vju vju = this.n;
        FacebookSignupRequest create = FacebookSignupRequest.create(this.b.a(), this.b.b());
        if (!fax.a(vju.b)) {
            create = create.withCreationPoint(vju.b);
        }
        return vju.a.a(create).d().c((Function<? super T, ? extends R>) $$Lambda$lln$RktZgFxykXRuhEKwnZrRjPukg.INSTANCE).e(new b()).e((Function<? super Throwable, ? extends T>) $$Lambda$lln$p0fjPSaVLbzKxIPHzhj2zqDxk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lll a(FacebookSignupResponse facebookSignupResponse) {
        if (facebookSignupResponse.status().isOk()) {
            return new c();
        }
        return lll.a(Failure.a(facebookSignupResponse.status().asError().statusCode()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lll d(Throwable th) {
        if (th instanceof IOException) {
            return lll.a(Failure.NO_CONNECTION);
        }
        return lll.a(Failure.SPOTIFY_IS_DOWN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lll lll) {
        lll.a(new $$Lambda$lln$ye1TVR9VOl4qveF5Kv9cXQclxgc(this), new $$Lambda$lln$2X2ZqSP4IYQfMmWlih2LhJqfaII(this), new $$Lambda$lln$Y0ffGDnH2p8N99cDi6GYUCco29U(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.d.a();
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            this.c.a(this.b.d());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SignupConfigurationResponse signupConfigurationResponse) {
        this.k.d(signupConfigurationResponse.requiresMarketingOptInText);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.k.a(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(ErrorTypeIdentifier errorTypeIdentifier) {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT, errorTypeIdentifier, (InputFieldIdentifier) null);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.k.a(!z);
        this.k.b(!z);
        this.k.b_(z);
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar.a == Failure.OFFLINE || aVar.a == Failure.NO_CONNECTION) {
            this.d.a(ScreenIdentifier.SIGN_UP);
        } else if (aVar.a == Failure.EMAIL_ALREADY_EXIST) {
            qfz qfz = this.d;
            $$Lambda$lln$g0jxMs7rxcW6_LV_yodwE5hlXoQ r6 = new $$Lambda$lln$g0jxMs7rxcW6_LV_yodwE5hlXoQ(this);
            ErrorTypeIdentifier errorTypeIdentifier = ErrorTypeIdentifier.FACEBOOK_EMAIL_EXISTS;
            qfz.a(R.string.facebook_error_email_exists_title, qfz.b.getString(R.string.facebook_error_email_exists_body), R.string.facebook_error_email_exists_login, R.string.facebook_error_email_exists_close, r6);
            qfz.c.a(ScreenIdentifier.CREATE_FB_ACCOUNT, errorTypeIdentifier, (InputFieldIdentifier) null);
        } else {
            this.d.a();
        }
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.q.a(this.b.a(), this.b.b(), true).a(this.r).b((SingleObserver<? super T>) new SingleObserver<gnf>() {
            public final /* synthetic */ void c_(Object obj) {
                ((gnf) obj).a((gcs<b>) new $$Lambda$lln$2$mONsQxia2aDzlms8GAfXEK9dDU<b>(this), (gcs<a>) new $$Lambda$lln$2$APAT5SnLgZk1m6Idv3bPSULdBtE<a>(this));
            }

            public final void onSubscribe(Disposable disposable) {
                lln.this.j.bf_();
                lln.this.j = disposable;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                lln lln = lln.this;
                lln.a.b(ScreenIdentifier.CREATE_FB_ACCOUNT);
                lln.e.b = new d();
                lln.e.a((String) fay.a(lln.b.c()), (String) null, "https://www.facebook.com", (vno) lln);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                lln lln = lln.this;
                SpotifyError a2 = SpotifyError.a(aVar.a);
                lln.a(false);
                if (lln.l) {
                    int i = AnonymousClass4.a[a2.ordinal()];
                    if (i == 1) {
                        lln.a(ErrorTypeIdentifier.NO_CONNECTION);
                    } else if (i != 2) {
                        lln.a(ErrorTypeIdentifier.FACEBOOK_GENERIC);
                    } else {
                        lln.a(ErrorTypeIdentifier.FACEBOOK_NOT_REGISTERED);
                    }
                    lln.k.a(a2);
                    lln.c.h();
                }
            }

            public final void onError(Throwable th) {
                Logger.e(th, "could not login with facebook", new Object[0]);
                lln.this.d.a();
                lln.this.a(false);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        if (aVar.a == Failure.NO_CONNECTION || aVar.a == Failure.OFFLINE) {
            a(ErrorTypeIdentifier.NO_CONNECTION);
            this.d.a(ScreenIdentifier.SIGN_UP);
        } else {
            this.d.a();
        }
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        SignupConfigurationResponse signupConfigurationResponse = cVar.a;
        if (signupConfigurationResponse.requiresMarketingOptIn) {
            this.o.a().a(qfl.a, true).a(qfl.b, signupConfigurationResponse.contactUrl).b();
        }
        this.p.a(voi.a(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition, signupConfigurationResponse.canAcceptLicensesInOneStep, signupConfigurationResponse.requiresSpecificLicenses), this.u);
    }

    static /* synthetic */ void a(lln lln) {
        lln.i.bf_();
        lln.i = lln.t.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$lln$CB2p3YpP4k2G2yKr_hEGVzLqlXI<Object>(lln), (Consumer<? super Throwable>) $$Lambda$lln$f8TGQqit9uikgVE4SOeAw9Aq_A.INSTANCE);
    }

    static /* synthetic */ void b(lln lln) {
        if (lln.f.b()) {
            lln.f = lln.m.a().a(lln.r).a((Consumer<? super T>) new $$Lambda$lln$iIH5Vv7cTmKNjgBpn2nQJ82qTaU<Object>(lln), (Consumer<? super Throwable>) $$Lambda$lln$Q5yrvZ1knXsUdYDe1_7FGt3Bfo4.INSTANCE);
        }
    }

    static /* synthetic */ void c(lln lln) {
        lln.l = true;
        lln.g = lln.s.c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$lln$LO7Nyq7m8Jx2aMPeXglhfGk8hN4<Object,Object>(lln), false).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$lln$6hTB0GvgbtUHIftHdvHl_Bz4s08<Object>(lln), (Consumer<? super Throwable>) new $$Lambda$lln$A5kdfjKmP35gb0kSRiGMZqJ4Xo<Object>(lln));
    }
}
