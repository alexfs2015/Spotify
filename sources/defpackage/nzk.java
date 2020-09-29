package defpackage;

import android.content.Intent;
import com.comscore.streaming.ContentType;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError.ErrorType;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper.State;
import com.spotify.music.features.partneraccountlinking.clientprovider.PartnerAccountLinkingRequest;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: nzk reason: default package */
public final class nzk implements a, a {
    private final nzo a;
    private final nze b;
    private final jry c;
    private final b d;
    private final PartnerAccountLinkingSessionHelper e;
    private final nzi f;
    private final hec g;
    private final xab<PartnerAccountLinkingRequest> h = xab.e();
    private wuk i = xaj.b();

    /* renamed from: nzk$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper$State[] r0 = com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper$State r1 = com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper.State.LOGGED_IN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper$State r1 = com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper.State.NOT_LOGGED_IN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper$State r1 = com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper.State.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nzk.AnonymousClass1.<clinit>():void");
        }
    }

    public nzk(nzo nzo, nze nze, jry jry, b bVar, PartnerAccountLinkingSessionHelper partnerAccountLinkingSessionHelper, nzi nzi, hec hec) {
        this.a = nzo;
        this.a.a((a) this);
        this.b = nze;
        this.c = jry;
        this.d = bVar;
        this.g = hec;
        this.e = partnerAccountLinkingSessionHelper;
        this.f = nzi;
    }

    public final void a() {
        if (!this.a.b()) {
            a(ErrorType.ERROR_NO_PARTNER_ACCOUNT_APP, (String) null);
        } else if (!this.c.a()) {
            a(ErrorType.ERROR_CAN_NOT_CONNECT, (String) null);
        } else {
            wud d2 = this.e.a().k($$Lambda$nzk$GWSfhM_IVFK42Bnwd4kRUBeoDs.INSTANCE).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$nzk$uH6bGRljEuQRa1ZyGKtrV1ueN_Q<Object,Object>(this)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$nzk$ysz4zVlqH05USKSqCm88QGBDHPs<Object,Object>(this));
            nze nze = this.b;
            nze.getClass();
            this.i = d2.e((wut<? super T, ? extends wuh<? extends R>>) new $$Lambda$pcMgLM6m4SLsaEmlBC5iyscANnY<Object,Object>(nze)).a((wun<? super T>) new $$Lambda$nzk$dXHAymYwcvFU4kgRhk68tz4qwE<Object>(this), (wun<Throwable>) new $$Lambda$nzk$hrYH1w0F9OA79RcFwY1tXrzUFhk<Throwable>(this));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(State state) {
        return Boolean.valueOf(state == State.LOGGED_IN);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(ErrorType.ERROR_INTERNAL, th.getMessage());
    }

    /* access modifiers changed from: private */
    public wud<Boolean> a(State state) {
        int i2 = AnonymousClass1.a[state.ordinal()];
        if (i2 == 1) {
            return vun.a((wrf<T>) this.g.a(nzg.a)).c().d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$nzk$ICsIOcKMLqspqOylB5r89FI3F1c.INSTANCE);
        }
        if (i2 == 2) {
            this.d.g_(ContentType.SHORT_FORM_ON_DEMAND);
            return EmptyObservableHolder.a();
        } else if (i2 != 3) {
            return EmptyObservableHolder.a();
        } else {
            return wud.a((Throwable) new Exception("Error getting session state"));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(RolloutFlag rolloutFlag) {
        if (RolloutFlag.ENABLED == rolloutFlag) {
            return ScalarSynchronousObservable.d(Boolean.TRUE);
        }
        return wud.a((Throwable) new RuntimeException("Flag not enabled"));
    }

    public final void a(int i2, int i3, Intent intent) {
        if (i3 != -1) {
            if (i2 == 111) {
                a(ErrorType.ERROR_SPOTIFY_LOGIN, (String) null);
            } else if (this.a.a(i2)) {
                a(ErrorType.ERROR_CLIENT_LOGIN, (String) null);
            }
        } else if (this.a.a(i2)) {
            this.a.a(i2, intent);
        }
    }

    public final void b() {
        hej.a(this.i);
    }

    public final void c() {
        a(ErrorType.ERROR_USER_CANCELLED, (String) null);
    }

    public final void a(Intent intent, int i2) {
        this.d.a(i2, intent);
    }

    public final void a(PartnerAccountLinkingRequest partnerAccountLinkingRequest) {
        this.h.onNext(partnerAccountLinkingRequest);
        this.h.onCompleted();
    }

    public final void a(String str) {
        a(ErrorType.ERROR_CLIENT_LOGIN, str);
    }

    private void a(ErrorType errorType, String str) {
        this.f.a("Samsung", errorType, str);
        this.d.a(PartnerAccountLinkingError.a(errorType, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.f.a("Samsung", true, null, null);
        this.d.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(Boolean bool) {
        this.a.a();
        return this.h;
    }
}
