package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;

/* renamed from: mmb reason: default package */
public final class mmb {
    public static final CompletableObserver a = new CompletableObserver() {
        public final void onComplete() {
        }

        public final void onSubscribe(Disposable disposable) {
        }

        public final void onError(Throwable th) {
            Logger.e("Failed to subscribe to completable", new Object[0]);
        }
    };
    private final rqd b;
    private final jug c;

    mmb(rqd rqd, jug jug) {
        this.b = (rqd) fay.a(rqd);
        this.c = (jug) fay.a(jug);
    }

    public Completable a() {
        return this.c.n.c((Function<? super T, ? extends R>) $$Lambda$JgZXXEDHApOeLEYYu0DU2rsyeM.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$mmb$U2q72n12eIcaDfpBSS4W_IVLpCs.INSTANCE).a(0).e(new $$Lambda$mmb$vdwu2OkPeW6FNLaR8AswX0_UZNA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Integer num) {
        return Completable.a((Action) new $$Lambda$mmb$4YATHNgY1a7kfdMMT87LdfyyI(this, num));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Integer num) {
        if (num.intValue() != -1) {
            rqd rqd = this.b;
            String str = "stream_quality";
            int intValue = num.intValue();
            if (((b) rqd.c.get(str)) != null) {
                rqd.d.a().a(rqd.b, intValue).b();
            } else {
                Assertion.b(String.format("Key %s does not map to a PrefsKey", new Object[]{str}));
            }
        }
        this.c.a(jug.f, Integer.valueOf(1));
    }

    public Completable b() {
        return Completable.a((Action) new $$Lambda$mmb$5jjF94F6cYynLDMSJqNUn1qVZCc(this));
    }

    /* access modifiers changed from: private */
    public void c() {
        int i;
        rqd rqd = this.b;
        String str = "stream_quality";
        b bVar = (b) rqd.c.get(str);
        if (bVar == null) {
            Assertion.b(String.format("Key %s does not map to a PrefsKey", new Object[]{str}));
            i = -1;
        } else {
            i = rqd.d.a(bVar, -1);
        }
        if (i != -1) {
            this.c.a(jug.f, Integer.valueOf(i));
        }
    }
}
