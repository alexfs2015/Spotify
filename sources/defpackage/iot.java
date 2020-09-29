package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: iot reason: default package */
public final class iot {
    public Runnable a = $$Lambda$iot$f4Y0vAcvl9ze3S1u_ZA5ZD4kOPE.INSTANCE;
    public Runnable b = $$Lambda$iot$9xZ7kR4MPVzx90dmHoj2i8XBp4.INSTANCE;
    public xip c = xon.b();
    public boolean d;
    private final xil e;
    private final hxx f;

    public iot(hxx hxx, xil xil) {
        this.f = hxx;
        this.e = xil;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SessionState sessionState) {
        return Boolean.valueOf(!sessionState.loggingIn() && !sessionState.loggingOut());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.d = bool.booleanValue();
        if (this.d) {
            this.a.run();
        } else {
            this.b.run();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public final void a() {
        this.c = wit.a((xfk<T>) this.f.a).c((xiy<? super T, Boolean>) $$Lambda$iot$3hM2Sg1SpulpUFC3dJm89fT996s.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$TqnEXuCpi0iJVFC5FQQtiiwXxE.INSTANCE).b().a(this.e).a((xis<? super T>) new $$Lambda$iot$AbpKOcqDN_s1ppTK5nfmpKBnnk<Object>(this), (xis<Throwable>) $$Lambda$iot$SJ_VHY4FJx3CmC3bHSdoYNm0.INSTANCE);
    }
}
