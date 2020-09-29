package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: img reason: default package */
public final class img {
    public Runnable a = $$Lambda$img$ilfXLoS2VUBPm9fJ0Yt6lT5UTU.INSTANCE;
    public Runnable b = $$Lambda$img$VkyOVRoyeXItBCt5OjnwUG9whgw.INSTANCE;
    public wuk c = xaj.b();
    public boolean d;
    private final wug e;
    private final hvl f;

    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    public img(hvl hvl, wug wug) {
        this.f = hvl;
        this.e = wug;
    }

    public final void a() {
        this.c = vun.a((wrf<T>) this.f.a).c((wut<? super T, Boolean>) $$Lambda$img$eji2Os5xJ0WaSXyRRVR87ZYsPBk.INSTANCE).f($$Lambda$K6LBDee2P7uQjQt0uNTOG54xquk.INSTANCE).b().a(this.e).a((wun<? super T>) new $$Lambda$img$1_5ctjlkvMifLW4Bbm0xOBpSMk<Object>(this), (wun<Throwable>) $$Lambda$img$JvXZzUkEEmt3xPbygDxcX54J2SA.INSTANCE);
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
}
