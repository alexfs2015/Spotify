package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import com.spotify.signup.api.services.model.SignupConfigurationResponse.CallingCode;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: oce reason: default package */
public final class oce implements c, c<oau>, defpackage.oat.a {
    private final gkl A;
    final ocb a;
    final glw<oas> b;
    defpackage.gmd.a c;
    ScreenIdentifier d;
    final gmb e;
    CompositeDisposable f = new CompositeDisposable();
    PhoneNumberSignupState g = PhoneNumberSignupState.REQUEST_OTP;
    PhoneNumberSignupState h;
    fsp i;
    final gly j = new gly() {
        public final void a() {
            if (oce.this.i != null) {
                oce.this.i.b();
                oce.this.i = null;
            }
            if (oce.this.d != null) {
                oce.this.a.a(oce.this.d);
            }
            gmb gmb = oce.this.e;
            gmb.a(gmb.b.d(gmb.a), gmb.b.e(gmb.a), gmb.b.i(gmb.a), (Runnable) new $$Lambda$oce$1$dJLDrttmGONc5C5CvK0yPFVCroY(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            oce.this.p();
        }
    };
    private final Resources k;
    private final gnj l;
    private final Scheduler m;
    private final Scheduler n;
    private final oaz o;
    private final b p;
    private final oap q;
    private final gme<oas> r;
    private final gmi<oas, oau> s;
    private final oav t;
    private final obx u;
    private final defpackage.gmd.a[] v;
    private final defpackage.qfm.a w;
    private final Observable<SignupConfigurationResponse> x;
    private SignupConfigurationResponse y;
    private final gkg z;

    /* renamed from: oce$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[PhoneNumberSignupState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState[] r0 = com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r1 = com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState.REQUEST_OTP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r1 = com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState.VALIDATE_OTP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r1 = com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState.AGE_GENDER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState r1 = com.spotify.music.features.phonenumbersignup.PhoneNumberSignupState.DISPLAY_NAME     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oce.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: oce$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(oce oce, byte b) {
            this();
        }

        public final void c(Bundle bundle) {
            oce.this.b.a((c) oce.this.j);
            PhoneNumberSignupState phoneNumberSignupState = null;
            if (bundle != null) {
                int i = bundle.getInt("state-ordinal", -1);
                if (i >= 0) {
                    phoneNumberSignupState = PhoneNumberSignupState.e[i];
                }
            }
            if (phoneNumberSignupState != null) {
                oce.this.g = phoneNumberSignupState;
            }
        }

        public final void aP_() {
            if (oce.this.c != null) {
                oce.this.c.b(true);
                oce oce = oce.this;
                oce.c = null;
                oce.h = null;
            }
            oce.this.b.b((c) oce.this.j);
        }

        public final void a(Bundle bundle) {
            bundle.putInt("state-ordinal", oce.this.h == null ? -1 : oce.this.h.ordinal());
        }

        public final void c() {
            oce.this.f.c();
            oce.this.f = new CompositeDisposable();
            oce.this.k();
            if (oce.this.h == null) {
                oce oce = oce.this;
                if (oce.b.b()) {
                    oce.h();
                }
                fay.a(oce.g);
                fay.b(oce.h == null);
                oce.a(oce.g);
                oce.g = null;
            }
        }

        public final void a() {
            oce.this.f.c();
        }
    }

    public final /* synthetic */ void a(String str, Object obj) {
        oau oau = (oau) obj;
        fay.b(this.h == PhoneNumberSignupState.VALIDATE_OTP);
        this.b.c();
        oau.a(new $$Lambda$oce$kjVLGcPLf0MMjR9BZvpZXfnI07Q(this), new $$Lambda$oce$h954x9_8qY_1zlFmARWgS_xyI(this));
    }

    public oce(Resources resources, gnj gnj, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, Scheduler scheduler, Scheduler scheduler2, Observable<SignupConfigurationResponse> observable, ocb ocb, oaz oaz, glw<oas> glw, b bVar, oap oap, gme<oas> gme, gmi<oas, oau> gmi, oav oav, defpackage.qfm.a aVar2, obx obx, gmb gmb, gkg gkg, gkl gkl) {
        this.k = (Resources) fay.a(resources);
        this.l = gnj;
        this.m = (Scheduler) fay.a(scheduler);
        this.n = (Scheduler) fay.a(scheduler2);
        this.x = observable;
        this.a = (ocb) fay.a(ocb);
        this.o = (oaz) fay.a(oaz);
        this.b = (glw) fay.a(glw);
        this.p = (b) fay.a(bVar);
        this.q = (oap) fay.a(oap);
        this.r = (gme) fay.a(gme);
        this.s = (gmi) fay.a(gmi);
        this.t = (oav) fay.a(oav);
        this.u = (obx) fay.a(obx);
        boolean z2 = false;
        this.v = new defpackage.gmd.a[]{this.r, this.s, this.t, this.u};
        this.w = (defpackage.qfm.a) fay.a(aVar2);
        this.e = (gmb) fay.a(gmb);
        this.z = (gkg) fay.a(gkg);
        this.A = (gkl) fay.a(gkl);
        this.r.d = (c) fay.a(this);
        this.s.c = (c) fay.a(this);
        com.spotify.mobile.android.util.ui.Lifecycle.a aVar3 = aVar;
        aVar.a(new a(this, 0));
        rvb rvb = new rvb(this.b);
        if (rvb.a == null) {
            z2 = true;
        }
        fay.b(z2);
        rvb.a = (com.spotify.mobile.android.util.ui.Lifecycle.a) fay.a(aVar);
        rvb.a.a(rvb);
    }

    public final void d() {
        this.p.a((SignupConfigurationResponse) fay.a(this.y));
    }

    public final void c() {
        defpackage.gmd.a[] aVarArr = this.v;
        for (int i2 = 0; i2 < 4; i2++) {
            aVarArr[i2].a((c) this.p);
        }
    }

    public final boolean e() {
        fay.a(this.h);
        int i2 = AnonymousClass2.a[this.h.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 3) {
            return i2 == 4;
        }
        p();
        return true;
    }

    public final void f() {
        fay.b(this.h == PhoneNumberSignupState.AGE_GENDER);
        this.q.c = (Calendar) fay.a((Calendar) fay.a(this.w.d()));
        this.q.d = (Gender) fay.a((Gender) fay.a(this.w.e()));
        fay.b(this.q.a());
        this.p.a(true);
        this.f.a(this.q.c().a(this.n).a((Consumer<? super T>) new $$Lambda$oce$7WlvCN9kjPH_Q4GFcutQkI6c60<Object>(this), (Consumer<? super Throwable>) new $$Lambda$oce$0vmA_zLyXHVCt6ldmXmlqVgwyNQ<Object>(this)));
    }

    public final void g() {
        this.l.f();
    }

    public final void a() {
        fay.b(this.h == PhoneNumberSignupState.REQUEST_OTP);
        h();
        a(PhoneNumberSignupState.VALIDATE_OTP);
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        fay.b(this.b.b());
        String f2 = this.b.f();
        int d2 = this.b.d();
        this.s.a(d2);
        this.s.a(this.k.getQuantityString(R.plurals.otp_description, d2, new Object[]{Integer.valueOf(d2), f2}), this.k.getString(R.string.otp_mismatch));
    }

    public final void a(Throwable th) {
        Logger.e(th, "Phone number sign-up: OTP request error", new Object[0]);
        if (this.o.a(th)) {
            this.b.c();
            fay.b(!this.b.b());
            gmb gmb = this.e;
            gmb.a(gmb.b.b(gmb.a), gmb.b.c(gmb.a), gmb.b.j(gmb.a), (Runnable) new $$Lambda$oce$cBkVy4Mc0oLKGmCkTPf29BN4Jzk(this));
            this.a.q();
        } else if (this.o.c(th)) {
            this.b.c();
            fay.b(!this.b.b());
            gmb gmb2 = this.e;
            gmb2.a((String) null, gmb2.b.h(gmb2.a), gmb2.b.j(gmb2.a), (Runnable) new $$Lambda$oce$jsTwlu2hNS0cuPOA3oIds1cFNqk(this));
            this.a.s();
        } else {
            j();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.oau.a aVar) {
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.q.b = (String) fay.a(bVar.a);
        fay.a(this.y);
        a(PhoneNumberSignupState.AGE_GENDER);
    }

    public final void b(Throwable th) {
        Logger.e(th, "Phone number sign-up: OTP validation error", new Object[0]);
        this.b.c();
        if (this.o.b(th)) {
            fay.b(!this.b.b());
            gmb gmb = this.e;
            gmb.a(gmb.b.f(gmb.a), gmb.b.g(gmb.a), gmb.b.j(gmb.a), (Runnable) new $$Lambda$oce$FikAcedkKOxMhVzcnzd4wKK5UMs(this));
            this.a.r();
            return;
        }
        if (this.o.d(th)) {
            this.a.a((ScreenIdentifier) fay.a(this.d), SpotifyError.UNKNOWN);
        }
        j();
    }

    public final void a(gmh gmh) {
        fay.b(this.h == PhoneNumberSignupState.VALIDATE_OTP);
        fay.b(this.b.b());
        $$Lambda$oce$yd1VSIKQ2SOEWuvmMd5zBBpQPgw r0 = new $$Lambda$oce$yd1VSIKQ2SOEWuvmMd5zBBpQPgw(this);
        $$Lambda$oce$uqYC8RHb7fWorokoixfOgaZ0ao r1 = new $$Lambda$oce$uqYC8RHb7fWorokoixfOgaZ0ao(this);
        $$Lambda$oce$_zx17DK7bI0MdJTVrEutNwJM7zc r2 = new $$Lambda$oce$_zx17DK7bI0MdJTVrEutNwJM7zc(this);
        fay.b(gmh.a.b());
        glw<? extends Parcelable> glw = gmh.a;
        fay.a(glw.c);
        if (TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - glw.c.b) < 30) {
            gmh.b.run();
            gmh.c.j();
            if (r1 != null) {
                r1.run();
            }
            return;
        }
        gmh.a.a((c) new gly(r0, r2) {
            private /* synthetic */ b a;
            private /* synthetic */ a b;

            {
                this.a = r2;
                this.b = r3;
            }

            public final void a(defpackage.glw.a aVar) {
                b();
                gmh.this.c.k();
                b bVar = this.a;
                if (bVar != null) {
                    bVar.onSuccess(aVar);
                }
            }

            public final void a() {
                b();
            }

            public final void a(Throwable th) {
                b();
                gmh.this.c.l();
                a aVar = this.b;
                if (aVar != null) {
                    aVar.onError(th);
                }
            }

            private void b() {
                gmh.this.a.b((c) this);
                gmh.this.b.run();
            }
        });
        gmh.a.g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.glw.a aVar) {
        h();
        this.p.a(uos.a(this.k.getString(R.string.snack_resend_success), 3000).c(R.color.white).b(R.color.black).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        gmb gmb = this.e;
        this.i = gmb.a((String) null, gmb.b.a(gmb.a, 30), gmb.b.j(gmb.a), (Runnable) new $$Lambda$oce$mtoa7hgDo9EONzyp4iddOLjpL_g(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.i = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Throwable th) {
        j();
    }

    public final void b() {
        p();
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.f.a(this.o.a((String) fay.a(str)).a(this.n).a((Consumer<? super T>) new $$Lambda$oce$KSYoW3PY31rLaX1LvELIpZoUXlw<Object>(this), (Consumer<? super Throwable>) new $$Lambda$oce$QIxQ_RrkO8NgtQnXR4OQ7VQd9w<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gnf gnf) {
        gnf.a((gcs<b>) new $$Lambda$oce$BRgbO22n1TurqKNFOk77INZwo<b>(this), (gcs<defpackage.gnf.a>) new $$Lambda$oce$Obc4h2OWeZUlPogBfo8FthFqhzM<defpackage.gnf.a>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(Throwable th) {
        a(SpotifyError.UNKNOWN);
    }

    private void a(boolean z2) {
        this.p.a(false);
        this.a.c((ScreenIdentifier) fay.a(this.d));
        if (z2) {
            a(PhoneNumberSignupState.DISPLAY_NAME);
        } else {
            this.l.d();
        }
    }

    private void a(SpotifyError spotifyError) {
        this.p.a(false);
        j();
        this.a.a((ScreenIdentifier) fay.a(this.d), spotifyError);
    }

    /* access modifiers changed from: private */
    public void c(Throwable th) {
        this.w.c();
        this.p.a(false);
        Logger.e(th, "Phone number signup: failed to create account", new Object[0]);
        j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void p() {
        this.b.c();
        this.q.b();
        a(PhoneNumberSignupState.REQUEST_OTP);
    }

    private void j() {
        fay.b(!this.b.b());
        this.e.a(new $$Lambda$oce$6rKoOvxWgfIilJbPodXCq8z8NM(this));
        this.a.d((ScreenIdentifier) fay.a(this.d));
    }

    private defpackage.gmd.a b(PhoneNumberSignupState phoneNumberSignupState) {
        int i2 = AnonymousClass2.a[phoneNumberSignupState.ordinal()];
        if (i2 == 1) {
            return this.r;
        }
        if (i2 == 2) {
            return this.s;
        }
        if (i2 == 3) {
            return this.t;
        }
        if (i2 == 4) {
            return this.u;
        }
        throw new AssertionError("no presenter for state");
    }

    private static ScreenIdentifier c(PhoneNumberSignupState phoneNumberSignupState) {
        int i2 = AnonymousClass2.a[phoneNumberSignupState.ordinal()];
        if (i2 == 1) {
            return ScreenIdentifier.PHONE_NUMBER_PHONE_NUMBER;
        }
        if (i2 == 2) {
            return ScreenIdentifier.PHONE_NUMBER_OTP;
        }
        if (i2 == 3) {
            return ScreenIdentifier.PHONE_NUMBER_AGE_GENDER;
        }
        if (i2 == 4) {
            return ScreenIdentifier.PHONE_NUMBER_DISPLAY_NAME;
        }
        throw new AssertionError("no presenter for state");
    }

    private String d(PhoneNumberSignupState phoneNumberSignupState) {
        int i2;
        int i3 = AnonymousClass2.a[phoneNumberSignupState.ordinal()];
        if (i3 == 1) {
            i2 = R.string.header_phone_number_signup_initial;
        } else if (i3 == 2) {
            fay.b(this.b.b());
            i2 = R.string.header_phone_number_signup_phone_number;
        } else if (i3 == 3) {
            i2 = R.string.signup_create_account_title;
        } else if (i3 != 4) {
            fay.b(false, "unsupported state");
            return "";
        } else {
            i2 = R.string.header_phone_number_signup_display_name;
        }
        return this.k.getString(i2);
    }

    /* access modifiers changed from: 0000 */
    public void a(PhoneNumberSignupState phoneNumberSignupState) {
        this.p.a(d(phoneNumberSignupState));
        PhoneNumberSignupState phoneNumberSignupState2 = this.h;
        if (phoneNumberSignupState2 != phoneNumberSignupState) {
            boolean z2 = phoneNumberSignupState2 == null || phoneNumberSignupState.ordinal() > this.h.ordinal();
            this.h = phoneNumberSignupState;
            defpackage.gmd.a aVar = this.c;
            if (aVar != null) {
                aVar.b(z2);
                this.c = null;
            }
            this.d = c(phoneNumberSignupState);
            this.c = b(phoneNumberSignupState);
            this.c.a(z2);
            this.a.b((ScreenIdentifier) fay.a(this.d));
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        this.f.a(this.x.a(this.n).a((Consumer<? super T>) new $$Lambda$oce$2U0cj2IM8amqgfTbJ7QpuINe8S0<Object>(this), (Consumer<? super Throwable>) new $$Lambda$oce$e9JygXJI0yWb4ewzesbJPANoCrk<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SignupConfigurationResponse signupConfigurationResponse) {
        List list;
        this.y = signupConfigurationResponse;
        this.w.a(signupConfigurationResponse);
        if (signupConfigurationResponse.allowedCallingCodes != null) {
            gkg gkg = this.z;
            CallingCode[] callingCodeArr = signupConfigurationResponse.allowedCallingCodes;
            if (callingCodeArr == null) {
                list = Collections.emptyList();
            } else {
                List arrayList = new ArrayList(callingCodeArr.length);
                for (CallingCode callingCode : callingCodeArr) {
                    arrayList.add(gkq.a(callingCode.countryCode, callingCode.callingCode));
                }
                list = arrayList;
            }
            gkg.a(list);
        } else {
            this.f.a(this.A.a().b(this.m).a(this.n).a((Consumer<? super T>) new $$Lambda$oce$SX8kqUMmydXML59invyYTLy75Y<Object>(this), (Consumer<? super Throwable>) $$Lambda$oce$DsW2UPyBVS1UgRwiX7REix1pOI.INSTANCE));
        }
        Logger.b("Signup configuration loaded", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Throwable th) {
        Assertion.b("Could not load signup configuration", th);
        boolean z2 = true;
        fay.b(!this.b.b());
        if (this.y != null) {
            z2 = false;
        }
        fay.b(z2);
        this.e.a(new $$Lambda$oce$HQE2FNfYTCXvd23v9j93kckLq4(this));
        this.a.d((ScreenIdentifier) fay.a(this.d));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f.c();
        k();
        p();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.z.a(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.gnf.a aVar) {
        a(SpotifyError.a(aVar.a));
    }
}
