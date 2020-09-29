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

/* renamed from: ojj reason: default package */
public final class ojj implements c, c<ohn>, defpackage.ohm.a {
    private final glx A;
    final ojf a;
    final gnl<ohl> b;
    defpackage.gns.a c;
    ScreenIdentifier d;
    final gnq e;
    CompositeDisposable f = new CompositeDisposable();
    PhoneNumberSignupState g = PhoneNumberSignupState.REQUEST_OTP;
    PhoneNumberSignupState h;
    ftj i;
    final gnn j = new gnn() {
        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            ojj.this.p();
        }

        public final void a() {
            if (ojj.this.i != null) {
                ojj.this.i.b();
                ojj.this.i = null;
            }
            if (ojj.this.d != null) {
                ojj.this.a.a(ojj.this.d);
            }
            gnq gnq = ojj.this.e;
            gnq.a(gnq.b.d(gnq.a), gnq.b.e(gnq.a), gnq.b.i(gnq.a), (Runnable) new $$Lambda$ojj$1$hXAiP5yDRaSLKVRxVRBkXY_h9GQ(this));
        }
    };
    private final Resources k;
    private final goy l;
    private final Scheduler m;
    private final Scheduler n;
    private final ohy o;
    private final b p;
    private final ohh q;
    private final gnt<ohl> r;
    private final gnx<ohl, ohn> s;
    private final oho t;
    private final oiz u;
    private final defpackage.gns.a[] v;
    private final defpackage.ohr.a w;
    private final Observable<SignupConfigurationResponse> x;
    private SignupConfigurationResponse y;
    private final gls z;

    /* renamed from: ojj$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ojj.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: ojj$a */
    class a extends c {
        private a() {
        }

        /* synthetic */ a(ojj ojj, byte b) {
            this();
        }

        public final void a() {
            ojj.this.f.c();
        }

        public final void a(Bundle bundle) {
            bundle.putInt("state-ordinal", ojj.this.h == null ? -1 : ojj.this.h.ordinal());
        }

        public final void aN_() {
            if (ojj.this.c != null) {
                ojj.this.c.b(true);
                ojj ojj = ojj.this;
                ojj.c = null;
                ojj.h = null;
            }
            ojj.this.b.b((c) ojj.this.j);
        }

        public final void c() {
            ojj.this.f.c();
            ojj.this.f = new CompositeDisposable();
            ojj.this.k();
            if (ojj.this.h == null) {
                ojj ojj = ojj.this;
                if (ojj.b.b()) {
                    ojj.h();
                }
                fbp.a(ojj.g);
                fbp.b(ojj.h == null);
                ojj.a(ojj.g);
                ojj.g = null;
            }
        }

        public final void c(Bundle bundle) {
            ojj.this.b.a((c) ojj.this.j);
            PhoneNumberSignupState phoneNumberSignupState = null;
            if (bundle != null) {
                int i = bundle.getInt("state-ordinal", -1);
                if (i >= 0) {
                    phoneNumberSignupState = PhoneNumberSignupState.e[i];
                }
            }
            if (phoneNumberSignupState != null) {
                ojj.this.g = phoneNumberSignupState;
            }
        }
    }

    public ojj(Resources resources, goy goy, com.spotify.mobile.android.util.ui.Lifecycle.a aVar, Scheduler scheduler, Scheduler scheduler2, Observable<SignupConfigurationResponse> observable, ojf ojf, ohy ohy, gnl<ohl> gnl, b bVar, ohh ohh, gnt<ohl> gnt, gnx<ohl, ohn> gnx, oho oho, defpackage.ohr.a aVar2, oiz oiz, gnq gnq, gls gls, glx glx) {
        this.k = (Resources) fbp.a(resources);
        this.l = goy;
        this.m = (Scheduler) fbp.a(scheduler);
        this.n = (Scheduler) fbp.a(scheduler2);
        this.x = observable;
        this.a = (ojf) fbp.a(ojf);
        this.o = (ohy) fbp.a(ohy);
        this.b = (gnl) fbp.a(gnl);
        this.p = (b) fbp.a(bVar);
        this.q = (ohh) fbp.a(ohh);
        this.r = (gnt) fbp.a(gnt);
        this.s = (gnx) fbp.a(gnx);
        this.t = (oho) fbp.a(oho);
        this.u = (oiz) fbp.a(oiz);
        boolean z2 = false;
        this.v = new defpackage.gns.a[]{this.r, this.s, this.t, this.u};
        this.w = (defpackage.ohr.a) fbp.a(aVar2);
        this.e = (gnq) fbp.a(gnq);
        this.z = (gls) fbp.a(gls);
        this.A = (glx) fbp.a(glx);
        this.r.d = (c) fbp.a(this);
        this.s.c = (c) fbp.a(this);
        com.spotify.mobile.android.util.ui.Lifecycle.a aVar3 = aVar;
        aVar.a(new a(this, 0));
        sel sel = new sel(this.b);
        if (sel.a == null) {
            z2 = true;
        }
        fbp.b(z2);
        sel.a = (com.spotify.mobile.android.util.ui.Lifecycle.a) fbp.a(aVar);
        sel.a.a(sel);
    }

    private void a(SpotifyError spotifyError) {
        this.p.a(false);
        j();
        this.a.a((ScreenIdentifier) fbp.a(this.d), spotifyError);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SignupConfigurationResponse signupConfigurationResponse) {
        List list;
        this.y = signupConfigurationResponse;
        this.w.a(signupConfigurationResponse);
        if (signupConfigurationResponse.allowedCallingCodes != null) {
            gls gls = this.z;
            CallingCode[] callingCodeArr = signupConfigurationResponse.allowedCallingCodes;
            if (callingCodeArr == null) {
                list = Collections.emptyList();
            } else {
                List arrayList = new ArrayList(callingCodeArr.length);
                for (CallingCode callingCode : callingCodeArr) {
                    arrayList.add(gmc.a(callingCode.countryCode, callingCode.callingCode));
                }
                list = arrayList;
            }
            gls.a(list);
        } else {
            this.f.a(this.A.a().b(this.m).a(this.n).a((Consumer<? super T>) new $$Lambda$ojj$KEoro5ybz8sSKMh0AqJHaD2oVI<Object>(this), (Consumer<? super Throwable>) $$Lambda$ojj$i381glyBW0Lqp4jkzk1jbs_6hJA.INSTANCE));
        }
        Logger.b("Signup configuration loaded", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.gnl.a aVar) {
        h();
        this.p.a(uzy.a(this.k.getString(R.string.snack_resend_success), 3000).c(R.color.white).b(R.color.black).a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.gou.a aVar) {
        a(SpotifyError.a(aVar.a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gou gou) {
        gou.a((ged<b>) new $$Lambda$ojj$IoxYjExSvYVbDFxv5uTI_ow0BZo<b>(this), (ged<defpackage.gou.a>) new $$Lambda$ojj$cDXJ1cZfxA8xDoCccHf7ptgyoiA<defpackage.gou.a>(this));
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.f.a(this.o.a((String) fbp.a(str)).a(this.n).a((Consumer<? super T>) new $$Lambda$ojj$TCc_R6dgGuqO1RvRV1OuhZex8PE<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ojj$zDTRxaFOKd7NAWHn_1qBeNsoJZg<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.z.a(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.ohn.a aVar) {
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.q.b = (String) fbp.a(bVar.a);
        fbp.a(this.y);
        a(PhoneNumberSignupState.AGE_GENDER);
    }

    private void a(boolean z2) {
        this.p.a(false);
        this.a.c((ScreenIdentifier) fbp.a(this.d));
        if (z2) {
            a(PhoneNumberSignupState.DISPLAY_NAME);
        } else {
            this.l.d();
        }
    }

    private defpackage.gns.a b(PhoneNumberSignupState phoneNumberSignupState) {
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

    /* access modifiers changed from: private */
    public void c(Throwable th) {
        this.w.c();
        this.p.a(false);
        Logger.e(th, "Phone number signup: failed to create account", new Object[0]);
        j();
    }

    private String d(PhoneNumberSignupState phoneNumberSignupState) {
        int i2;
        int i3 = AnonymousClass2.a[phoneNumberSignupState.ordinal()];
        if (i3 == 1) {
            i2 = R.string.header_phone_number_signup_initial;
        } else if (i3 == 2) {
            fbp.b(this.b.b());
            i2 = R.string.header_phone_number_signup_phone_number;
        } else if (i3 == 3) {
            i2 = R.string.signup_create_account_title;
        } else if (i3 != 4) {
            fbp.b(false, "unsupported state");
            return "";
        } else {
            i2 = R.string.header_phone_number_signup_display_name;
        }
        return this.k.getString(i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Throwable th) {
        Assertion.b("Could not load signup configuration", th);
        boolean z2 = true;
        fbp.b(!this.b.b());
        if (this.y != null) {
            z2 = false;
        }
        fbp.b(z2);
        this.e.a(new $$Lambda$ojj$KIDdj0p7LJk4bXYCAjwz8RWAOMU(this));
        this.a.d((ScreenIdentifier) fbp.a(this.d));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(Throwable th) {
        a(SpotifyError.UNKNOWN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(Throwable th) {
        j();
    }

    private void j() {
        fbp.b(!this.b.b());
        this.e.a(new $$Lambda$ojj$rOCNwTH_nfPI9XxCo2a6uRXes(this));
        this.a.d((ScreenIdentifier) fbp.a(this.d));
    }

    /* access modifiers changed from: private */
    public void k() {
        this.f.a(this.x.a(this.n).a((Consumer<? super T>) new $$Lambda$ojj$fcbg4Vk1zeqo4EAnsZ0ml7VPRM<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ojj$EQlCh0fR6bnKqhtMDR2o9Trbfz0<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f.c();
        k();
        p();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        gnq gnq = this.e;
        this.i = gnq.a((String) null, gnq.b.a(gnq.a, 30), gnq.b.j(gnq.a), (Runnable) new $$Lambda$ojj$COgA3ML6uzci8hCPivkm5Pyw5Zg(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.i = null;
    }

    public final void a() {
        fbp.b(this.h == PhoneNumberSignupState.REQUEST_OTP);
        h();
        a(PhoneNumberSignupState.VALIDATE_OTP);
    }

    /* access modifiers changed from: 0000 */
    public void a(PhoneNumberSignupState phoneNumberSignupState) {
        this.p.a(d(phoneNumberSignupState));
        PhoneNumberSignupState phoneNumberSignupState2 = this.h;
        if (phoneNumberSignupState2 != phoneNumberSignupState) {
            boolean z2 = phoneNumberSignupState2 == null || phoneNumberSignupState.ordinal() > this.h.ordinal();
            this.h = phoneNumberSignupState;
            defpackage.gns.a aVar = this.c;
            if (aVar != null) {
                aVar.b(z2);
                this.c = null;
            }
            this.d = c(phoneNumberSignupState);
            this.c = b(phoneNumberSignupState);
            this.c.a(z2);
            this.a.b((ScreenIdentifier) fbp.a(this.d));
        }
    }

    public final void a(gnw gnw) {
        fbp.b(this.h == PhoneNumberSignupState.VALIDATE_OTP);
        fbp.b(this.b.b());
        $$Lambda$ojj$nIMH7t7s5rLVEg86p07MpVd1PM r0 = new $$Lambda$ojj$nIMH7t7s5rLVEg86p07MpVd1PM(this);
        $$Lambda$ojj$vrk8h14JqCyrUV2d2548Nkx3UJw r1 = new $$Lambda$ojj$vrk8h14JqCyrUV2d2548Nkx3UJw(this);
        $$Lambda$ojj$dSKfJ8EmMuGgRUk3HMgKAHMSuXQ r2 = new $$Lambda$ojj$dSKfJ8EmMuGgRUk3HMgKAHMSuXQ(this);
        fbp.b(gnw.a.b());
        gnl<? extends Parcelable> gnl = gnw.a;
        fbp.a(gnl.c);
        if (TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - gnl.c.b) < 30) {
            gnw.b.run();
            gnw.c.j();
            if (r1 != null) {
                r1.run();
            }
            return;
        }
        gnw.a.a((c) new gnn(r0, r2) {
            private /* synthetic */ b a;
            private /* synthetic */ a b;

            {
                this.a = r2;
                this.b = r3;
            }

            private void b() {
                gnw.this.a.b((c) this);
                gnw.this.b.run();
            }

            public final void a() {
                b();
            }

            public final void a(defpackage.gnl.a aVar) {
                b();
                gnw.this.c.k();
                b bVar = this.a;
                if (bVar != null) {
                    bVar.onSuccess(aVar);
                }
            }

            public final void a(Throwable th) {
                b();
                gnw.this.c.l();
                a aVar = this.b;
                if (aVar != null) {
                    aVar.onError(th);
                }
            }
        });
        gnw.a.g();
    }

    public final /* synthetic */ void a(String str, Object obj) {
        ohn ohn = (ohn) obj;
        fbp.b(this.h == PhoneNumberSignupState.VALIDATE_OTP);
        this.b.c();
        ohn.a(new $$Lambda$ojj$I0rIJSqowv_zPnm48sTqNLpexnI(this), new $$Lambda$ojj$Rc4DqdG7SgAOpnW22o33l3b9vY(this));
    }

    public final void a(Throwable th) {
        Logger.e(th, "Phone number sign-up: OTP request error", new Object[0]);
        if (this.o.a(th)) {
            this.b.c();
            fbp.b(!this.b.b());
            gnq gnq = this.e;
            gnq.a(gnq.b.b(gnq.a), gnq.b.c(gnq.a), gnq.b.j(gnq.a), (Runnable) new $$Lambda$ojj$qW56PvrMEYGw1TqteiBf5BzjoU(this));
            this.a.q();
        } else if (this.o.c(th)) {
            this.b.c();
            fbp.b(!this.b.b());
            gnq gnq2 = this.e;
            gnq2.a((String) null, gnq2.b.h(gnq2.a), gnq2.b.j(gnq2.a), (Runnable) new $$Lambda$ojj$HKluFeIJVAOk1_yT3lT5rzYN7IU(this));
            this.a.s();
        } else {
            j();
        }
    }

    public final void b() {
        p();
    }

    public final void b(Throwable th) {
        Logger.e(th, "Phone number sign-up: OTP validation error", new Object[0]);
        this.b.c();
        if (this.o.b(th)) {
            fbp.b(!this.b.b());
            gnq gnq = this.e;
            gnq.a(gnq.b.f(gnq.a), gnq.b.g(gnq.a), gnq.b.j(gnq.a), (Runnable) new $$Lambda$ojj$d9tkg1ZF0mIxp8uKt4b8Hoj1Xg(this));
            this.a.r();
            return;
        }
        if (this.o.d(th)) {
            this.a.a((ScreenIdentifier) fbp.a(this.d), SpotifyError.UNKNOWN);
        }
        j();
    }

    public final void c() {
        defpackage.gns.a[] aVarArr = this.v;
        for (int i2 = 0; i2 < 4; i2++) {
            aVarArr[i2].a((c) this.p);
        }
    }

    public final void d() {
        this.p.a((SignupConfigurationResponse) fbp.a(this.y));
    }

    public final boolean e() {
        fbp.a(this.h);
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
        fbp.b(this.h == PhoneNumberSignupState.AGE_GENDER);
        this.q.c = (Calendar) fbp.a((Calendar) fbp.a(this.w.d()));
        this.q.d = (Gender) fbp.a((Gender) fbp.a(this.w.e()));
        fbp.b(this.q.a());
        this.p.a(true);
        this.f.a(this.q.c().a(this.n).a((Consumer<? super T>) new $$Lambda$ojj$pgn6nT20KG0OXB0V7iyPoC4B72w<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ojj$5O7kMqE8cd_hcZ5a5omCG2pK_ds<Object>(this)));
    }

    public final void g() {
        this.l.e();
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        fbp.b(this.b.b());
        String f2 = this.b.f();
        int d2 = this.b.d();
        this.s.a(d2);
        this.s.a(this.k.getQuantityString(R.plurals.otp_description, d2, new Object[]{Integer.valueOf(d2), f2}), this.k.getString(R.string.otp_mismatch));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void p() {
        this.b.c();
        this.q.b();
        a(PhoneNumberSignupState.REQUEST_OTP);
    }
}
