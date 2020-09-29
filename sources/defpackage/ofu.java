package defpackage;

import com.comscore.streaming.ContentType;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError.ErrorType;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingSessionHelper.State;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: ofu reason: default package */
public final class ofu implements a {
    private final ofx a;
    private final jui b;
    private final b c;
    private final PartnerAccountLinkingSessionHelper d;
    private final ofs e;
    private final hgy f;
    private final SerialDisposable g = new SerialDisposable();

    /* renamed from: ofu$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ofu.AnonymousClass1.<clinit>():void");
        }
    }

    public ofu(ofx ofx, jui jui, b bVar, PartnerAccountLinkingSessionHelper partnerAccountLinkingSessionHelper, ofs ofs, hgy hgy) {
        this.a = ofx;
        this.b = jui;
        this.c = bVar;
        this.f = hgy;
        this.d = partnerAccountLinkingSessionHelper;
        this.e = ofs;
    }

    /* access modifiers changed from: private */
    public Observable<Boolean> a(State state) {
        int i = AnonymousClass1.a[state.ordinal()];
        if (i == 1) {
            return this.f.a(ofq.a).j().c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$ofu$SLdrThNLNjDOKJBkEOvVq2e47zE.INSTANCE, false);
        }
        if (i != 2) {
            return i != 3 ? Observable.c() : Observable.a((Throwable) new RuntimeException("Error getting session state"));
        }
        this.c.g_(ContentType.SHORT_FORM_ON_DEMAND);
        return Observable.c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(RolloutFlag rolloutFlag) {
        return RolloutFlag.ENABLED == rolloutFlag ? Observable.b(Boolean.TRUE) : Observable.a((Throwable) new RuntimeException("Flag not enabled"));
    }

    private void a(ErrorType errorType, String str) {
        this.e.a("Samsung", errorType, str);
        this.c.a(PartnerAccountLinkingError.a(errorType, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.e.a("Samsung", true, null, null);
        this.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(ErrorType.ERROR_INTERNAL, th.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(Boolean bool) {
        return this.a.d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(State state) {
        return state == State.LOGGED_IN;
    }

    public final void a() {
        if (!this.a.a()) {
            a(ErrorType.ERROR_NO_PARTNER_ACCOUNT_APP, (String) null);
        } else if (!this.b.a()) {
            a(ErrorType.ERROR_CAN_NOT_CONNECT, (String) null);
        } else {
            this.g.a(this.d.a().b((Predicate<? super T>) $$Lambda$ofu$qoIJG_g4ukDkn2sg2VSq93QZxqo.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ofu$0td8L408k9zQXPI3P8DucnZK2_M<Object,Object>(this), false).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$ofu$83OJV3dm6jcrWpsopjM_07apDgM<Object,Object>(this), false).a((Consumer<? super T>) new $$Lambda$ofu$8G1NkYBg9R9z3d717DiEAyNqhZU<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ofu$hddGDMCxQa8wUbpEpN5mn37eSXU<Object>(this)));
        }
    }

    public final void a(int i, int i2) {
        if (i == 111 && i2 != -1) {
            a(ErrorType.ERROR_SPOTIFY_LOGIN, (String) null);
        }
    }

    public final void b() {
        this.g.bd_();
    }

    public final void c() {
        a(ErrorType.ERROR_USER_CANCELLED, (String) null);
    }
}
