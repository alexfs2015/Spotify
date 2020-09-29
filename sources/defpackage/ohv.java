package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.libs.signup.validators.AgeValidator.AgeVerification;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: ohv reason: default package */
public final class ohv implements a {
    /* access modifiers changed from: private */
    public static final ScreenIdentifier a = ScreenIdentifier.SIGN_UP_STEP_TWO;
    /* access modifiers changed from: private */
    public final fot<Calendar> b = fot.a();
    private final BehaviorSubject<Boolean> c = BehaviorSubject.a(Boolean.FALSE);
    private final BehaviorSubject<Boolean> d = BehaviorSubject.a(Boolean.FALSE);
    private final AgeValidator e;
    private final Scheduler f;
    /* access modifiers changed from: private */
    public final oji g;
    private final ohk h;
    private final kk i;
    private final uun j;
    private final ftm k;
    private final DateFormat l;
    /* access modifiers changed from: private */
    public CompositeDisposable m;
    private b n;
    private boolean o;
    /* access modifiers changed from: private */
    public Observable<Gender> p;
    private Gender q;
    private Calendar r;

    /* renamed from: ohv$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[AgeVerification.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.libs.signup.validators.AgeValidator$AgeVerification[] r0 = com.spotify.libs.signup.validators.AgeValidator.AgeVerification.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.libs.signup.validators.AgeValidator$AgeVerification r1 = com.spotify.libs.signup.validators.AgeValidator.AgeVerification.BAD_AGE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.libs.signup.validators.AgeValidator$AgeVerification r1 = com.spotify.libs.signup.validators.AgeValidator.AgeVerification.TOO_YOUNG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.libs.signup.validators.AgeValidator$AgeVerification r1 = com.spotify.libs.signup.validators.AgeValidator.AgeVerification.NOT_SET     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ohv.AnonymousClass2.<clinit>():void");
        }
    }

    public ohv(AgeValidator ageValidator, Scheduler scheduler, oji oji, uun uun, ohk ohk, kk kkVar, a aVar, ftm ftm, gcb gcb, DateFormat dateFormat) {
        this.k = ftm;
        this.m = new CompositeDisposable();
        this.e = ageValidator;
        this.f = scheduler;
        this.g = oji;
        this.j = uun;
        this.h = ohk;
        this.i = kkVar;
        this.r = jtp.a.f();
        this.r.add(1, -10);
        this.l = dateFormat;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public static /* synthetic */ Boolean a(Gender gender) {
                return Boolean.valueOf(gender != null);
            }

            public final void a() {
                super.a();
                if (ohv.this.m != null) {
                    ohv.this.m.bd_();
                }
                ohv.this.g.a();
            }

            public final void c() {
                super.c();
                if (ohv.this.m != null) {
                    ohv.this.m.bd_();
                }
                ohv.this.m = new CompositeDisposable();
                ohv.this.m.a(Observable.a((ObservableSource<? extends T1>) ohv.this.c, (ObservableSource<? extends T2>) ohv.this.d, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ohv$ua0t_iJwy62cPlEC1DfrdxHoK8.INSTANCE).a(ohv.this.f).a((Consumer<? super T>) new $$Lambda$ohv$GxD89EwMfqzHjXScS5529Uiknp8<Object>(ohv.this), (Consumer<? super Throwable>) $$Lambda$ohv$SZAKkcNVSnfbmdALFD390_nLXZ4.INSTANCE));
                CompositeDisposable a2 = ohv.this.m;
                ohv ohv = ohv.this;
                a2.a(ohv.p.b((Consumer<? super T>) new $$Lambda$ohv$k2A90JBWVBYKOHEo0TETn4PzUsk<Object>(ohv)).a(ohv.f).a((Consumer<? super T>) new $$Lambda$ohv$KSEjBnyt3mK1TxBoQnXiZgkhOWc<Object>(ohv), (Consumer<? super Throwable>) $$Lambda$ohv$akDy3kDGWllSKD6_mslSNJtl0Hs.INSTANCE));
                ohv.this.g.a(ohv.this.p.c((Function<? super T, ? extends R>) $$Lambda$ohv$1$PDCoY_R9vxHnuQML7FCIqpq83L4.INSTANCE), InputFieldIdentifier.GENDER, ohv.a);
                oji d = ohv.this.g;
                d.a.a(d.c(ohv.this.b, InputFieldIdentifier.AGE, ohv.a));
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Gender gender) {
        boolean z = gender != null;
        if (z) {
            this.n.b();
        } else {
            this.n.d();
        }
        this.c.onNext(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.n.j();
        } else {
            this.n.k();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Gender gender) {
        this.q = gender;
    }

    public final void a() {
        this.j.a(a, ClickIdentifier.SIGN_UP_BUTTON);
        this.g.b();
        this.n.k();
        this.n.i();
        this.h.b();
    }

    public final void a(int i2, int i3, int i4) {
        this.r = new GregorianCalendar(i2, i3, i4);
        this.b.accept(this.r);
        AgeVerification a2 = this.e.a(this.r);
        if (a2 == AgeVerification.OK) {
            this.n.a(this.l.format(this.r.getTime()));
            this.n.e();
            this.n.a();
            this.d.onNext(Boolean.TRUE);
            return;
        }
        this.n.a((String) null);
        int i5 = AnonymousClass2.a[a2.ordinal()];
        if (i5 == 1) {
            this.j.a(a, ErrorTypeIdentifier.TOO_OLD_AGE, InputFieldIdentifier.AGE);
        } else if (i5 == 2) {
            this.j.a(a, ErrorTypeIdentifier.TOO_YOUNG_AGE, InputFieldIdentifier.AGE);
        } else if (i5 == 3) {
            this.j.a(a, ErrorTypeIdentifier.AGE_GENERIC, InputFieldIdentifier.AGE);
        }
        this.n.c();
        this.n.a(this.k);
        this.d.onNext(Boolean.FALSE);
    }

    public final void a(SignupConfigurationResponse signupConfigurationResponse) {
        this.o = signupConfigurationResponse.canSignupWithAllGenders;
        if (!signupConfigurationResponse.canImplicitlyAcceptTermsAndCondition) {
            this.n.g();
        }
        this.e.a(signupConfigurationResponse.minimumAge);
        if (signupConfigurationResponse.requiresMarketingOptInText) {
            this.n.m();
        }
        this.n.f();
    }

    public final void a(b bVar, Observable<Gender> observable) {
        this.n = bVar;
        this.p = observable;
    }

    public final void a(ohs ohs) {
        this.n.l();
        ohs.U = this.r;
        ohs.T = this;
        ohs.a(this.i, "datepicker");
    }

    public final void b() {
        this.n.a(this.o, this.i);
    }

    public final void c() {
        this.n.j();
        this.n.h();
    }

    public final Calendar d() {
        return this.r;
    }

    public final Gender e() {
        return this.q;
    }
}
