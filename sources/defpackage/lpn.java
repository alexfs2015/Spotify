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

/* renamed from: lpn reason: default package */
public final class lpn implements a, wau {
    final uun a;
    final lqb b;
    final goy c;
    final qoo d;
    final waq e;
    Disposable f = Disposables.b();
    Disposable g = Disposables.b();
    Disposable h = Disposables.a();
    Disposable i = Disposables.a();
    Disposable j = Disposables.a();
    b k;
    boolean l;
    private final lpr m;
    private final vxa n;
    private final SpSharedPreferences<Object> o;
    private final wbn p;
    private final got q;
    private final Scheduler r;
    private Observable<Boolean> s;
    private Single<SignupConfigurationResponse> t;
    private a u = new a() {
        public final void a() {
            lpn.c(lpn.this);
        }

        public final void b() {
            lpn.this.c.g();
        }

        public final void c() {
            lpn.this.c.g();
        }
    };

    /* renamed from: lpn$4 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lpn.AnonymousClass4.<clinit>():void");
        }
    }

    public lpn(Scheduler scheduler, vxa vxa, lpr lpr, uun uun, SpSharedPreferences<Object> spSharedPreferences, lqb lqb, wbn wbn, lbk lbk, a aVar, waq waq, qoo qoo, goy goy, got got) {
        this.r = scheduler;
        this.m = lpr;
        this.n = vxa;
        this.t = RxJavaPlugins.a((Single<T>) new SingleCache<T>(vxa.a()));
        this.a = uun;
        this.o = spSharedPreferences;
        this.b = lqb;
        this.p = wbn;
        this.s = lbk.a;
        this.d = qoo;
        this.e = waq;
        this.c = goy;
        this.q = got;
        aVar.a(new c() {
            public final void a() {
                super.a();
                lpn.this.j.bd_();
                lpn.this.f.bd_();
                lpn.this.i.bd_();
                lpn.this.h.bd_();
                lpn.this.g.bd_();
            }

            public final void c() {
                super.c();
                lpn.a(lpn.this);
                lpn.b(lpn.this);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.b(lpl.a(Failure.OFFLINE));
        }
        vxa vxa = this.n;
        FacebookSignupRequest create = FacebookSignupRequest.create(this.b.a(), this.b.b());
        if (!fbo.a(vxa.b)) {
            create = create.withCreationPoint(vxa.b);
        }
        return vxa.a.a(create).d().c((Function<? super T, ? extends R>) $$Lambda$lpn$IMPUTg5lEPPqs7fooJdHy1XTBgU.INSTANCE).e(new b()).e((Function<? super Throwable, ? extends T>) $$Lambda$lpn$HOM40GH5XiJxzhq_j3wfbFc2_mU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lpl a(FacebookSignupResponse facebookSignupResponse) {
        return facebookSignupResponse.status().isOk() ? new c() : lpl.a(Failure.a(facebookSignupResponse.status().asError().statusCode()));
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

    /* access modifiers changed from: private */
    public void a(a aVar) {
        if (aVar.a == Failure.OFFLINE || aVar.a == Failure.NO_CONNECTION) {
            this.d.a(new j());
        } else if (aVar.a == Failure.EMAIL_ALREADY_EXIST) {
            qoo qoo = this.d;
            $$Lambda$lpn$LwAxHgyajn4wYKBJSeQFjzimks r6 = new $$Lambda$lpn$LwAxHgyajn4wYKBJSeQFjzimks(this);
            f fVar = new f();
            qoo.a(R.string.facebook_error_email_exists_title, qoo.a.getString(R.string.facebook_error_email_exists_body), R.string.facebook_error_email_exists_login, R.string.facebook_error_email_exists_close, r6);
            qoo.b.a(gbr.a((gbo) new b(), (gbk) fVar, (gbl) new d(), ""));
        } else {
            this.d.a();
        }
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.q.a(this.b.a(), this.b.b(), true).a(this.r).b((SingleObserver<? super T>) new SingleObserver<gou>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                lpn lpn = lpn.this;
                SpotifyError a2 = SpotifyError.a(aVar.a);
                lpn.a(false);
                if (lpn.l) {
                    int i = AnonymousClass4.a[a2.ordinal()];
                    if (i == 1) {
                        lpn.a(ErrorTypeIdentifier.NO_CONNECTION);
                    } else if (i != 2) {
                        lpn.a(ErrorTypeIdentifier.FACEBOOK_GENERIC);
                    } else {
                        lpn.a(ErrorTypeIdentifier.FACEBOOK_NOT_REGISTERED);
                    }
                    lpn.k.a(a2);
                    lpn.c.g();
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                lpn lpn = lpn.this;
                lpn.a.b(ScreenIdentifier.CREATE_FB_ACCOUNT);
                lpn.e.a = new e();
                lpn.e.a((String) fbp.a(lpn.b.c()), (String) null, "https://www.facebook.com", (wau) lpn);
            }

            public final /* synthetic */ void c_(Object obj) {
                ((gou) obj).a((ged<b>) new $$Lambda$lpn$2$X37Z2AMwt4yKPWpp8X53NxvV1yE<b>(this), (ged<a>) new $$Lambda$lpn$2$emf6VoPpQg7B5etvnhXSeUuWa5o<a>(this));
            }

            public final void onError(Throwable th) {
                Logger.e(th, "could not login with facebook", new Object[0]);
                lpn.this.d.a();
                lpn.this.a(false);
            }

            public final void onSubscribe(Disposable disposable) {
                lpn.this.j.bd_();
                lpn.this.j = disposable;
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lpl lpl) {
        lpl.a(new $$Lambda$lpn$Qe2yTxrBEgV2ijonMnslcdz_9fs(this), new $$Lambda$lpn$TjbkAzsRJf_lVES68Bh8lWF94Ag(this), new $$Lambda$lpn$_5WEUeTHqRQkbiHz001OLdgIvto(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        if (aVar.a == Failure.NO_CONNECTION || aVar.a == Failure.OFFLINE) {
            a(ErrorTypeIdentifier.NO_CONNECTION);
            this.d.a(new j());
        } else {
            this.d.a();
        }
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        SignupConfigurationResponse signupConfigurationResponse = cVar.a;
        if (signupConfigurationResponse.requiresMarketingOptIn) {
            this.o.a().a(gqm.a, true).a(gqm.b, signupConfigurationResponse.contactUrl).b();
        }
        this.p.a(wbq.a(signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition, signupConfigurationResponse.canAcceptLicensesInOneStep, signupConfigurationResponse.requiresSpecificLicenses), this.u);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lpm lpm) {
        lpm.a(new $$Lambda$lpn$TsWeqI9zB7BZi9ruHrfXJkxUkrg(this), new $$Lambda$lpn$721nGh_W8jtHzTZDFpM4RUmeo7o(this), new $$Lambda$lpn$EYud1KM0g96Vs0DmFKRvzMamTE(this));
    }

    static /* synthetic */ void a(lpn lpn) {
        lpn.i.bd_();
        lpn.i = lpn.t.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$lpn$2T8q6kv3htuiRKQf0UmKfcL8o1U<Object>(lpn), (Consumer<? super Throwable>) $$Lambda$lpn$XeMPXoryQvFCs45GD_AH4gM1kXo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(Boolean bool) {
        return !bool.booleanValue() ? Observable.b(lpm.a(Failure.OFFLINE)) : this.t.d().c((Function<? super T, ? extends R>) $$Lambda$4DrfGzn7_11wLY4pV66SPxPEYY.INSTANCE).e(new b()).e((Function<? super Throwable, ? extends T>) $$Lambda$lpn$hh5rT4FhizgW4m1e3Nhvyt9V9cU.INSTANCE);
    }

    static /* synthetic */ void b(lpn lpn) {
        if (lpn.f.b()) {
            lpn.f = lpn.m.a().a(lpn.r).a((Consumer<? super T>) new $$Lambda$lpn$QG4Q4KlzINEimMtOt0jT1AoUX0<Object>(lpn), (Consumer<? super Throwable>) $$Lambda$lpn$sw0rMCeSsP3bEtRXhWNNoZ0mLRU.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.d.a();
        a(false);
    }

    static /* synthetic */ void c(lpn lpn) {
        lpn.l = true;
        lpn.g = lpn.s.c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$lpn$5OK6yr2pGIgJW4MzN8O72D1_zl8<Object,Object>(lpn), false).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$lpn$vkm7CTaJ400xKyyMBRG5kP02JA<Object>(lpn), (Consumer<? super Throwable>) new $$Lambda$lpn$nn71QS0UmZvy0w5PCGKx8ivvmac<Object>(lpn));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lpl d(Throwable th) {
        return th instanceof IOException ? lpl.a(Failure.NO_CONNECTION) : lpl.a(Failure.SPOTIFY_IS_DOWN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Throwable th) {
        this.d.a();
        a(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ lpm f(Throwable th) {
        return th instanceof IOException ? lpm.a(Failure.NO_CONNECTION) : lpm.a(Failure.SPOTIFY_IS_DOWN);
    }

    public final void a(Credential credential) {
    }

    /* access modifiers changed from: 0000 */
    public void a(ErrorTypeIdentifier errorTypeIdentifier) {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT, errorTypeIdentifier, (InputFieldIdentifier) null);
    }

    public final void a(b bVar) {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT);
        this.k = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.k.a(!z);
        this.k.b(!z);
        this.k.b_(z);
    }

    public final void ar_() {
        this.c.e();
    }

    public final void b() {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT, ClickIdentifier.CONTINUE_BUTTON);
        this.h.bd_();
        this.h = this.s.c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$lpn$5XNc6zSQBuC1mIrC_29MaD4xL9c<Object,Object>(this), false).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$lpn$tluM5wMoig9WwAG8VjD0N2MuzkQ<Object>(this), (Consumer<? super Throwable>) new $$Lambda$lpn$tw1MmKNhdkTRZKwSARrGZpIz_Q<Object>(this));
    }

    public final void c() {
        this.a.a(ScreenIdentifier.CREATE_FB_ACCOUNT, ClickIdentifier.CANCEL_BUTTON);
        this.c.g();
    }

    public final void d() {
    }
}
