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

/* renamed from: mqu reason: default package */
public final class mqu {
    public static final CompletableObserver a = new CompletableObserver() {
        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            Logger.e("Failed to subscribe to completable", new Object[0]);
        }

        public final void onSubscribe(Disposable disposable) {
        }
    };
    private final rzo b;
    private final jwo c;

    mqu(rzo rzo, jwo jwo) {
        this.b = (rzo) fbp.a(rzo);
        this.c = (jwo) fbp.a(jwo);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(Integer num) {
        return Completable.a((Action) new $$Lambda$mqu$aX8_1ba7zw7WCNnv2Cq8CA0ZI_o(this, num));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Integer num) {
        if (num.intValue() != -1) {
            rzo rzo = this.b;
            String str = "stream_quality";
            int intValue = num.intValue();
            if (((b) rzo.c.get(str)) != null) {
                rzo.d.a().a(rzo.b, intValue).b();
            } else {
                Assertion.b(String.format("Key %s does not map to a PrefsKey", new Object[]{str}));
            }
        }
        this.c.a(jwo.f, Integer.valueOf(1));
    }

    /* access modifiers changed from: private */
    public void c() {
        int i;
        rzo rzo = this.b;
        String str = "stream_quality";
        b bVar = (b) rzo.c.get(str);
        if (bVar == null) {
            Assertion.b(String.format("Key %s does not map to a PrefsKey", new Object[]{str}));
            i = -1;
        } else {
            i = rzo.d.a(bVar, -1);
        }
        if (i != -1) {
            this.c.a(jwo.f, Integer.valueOf(i));
        }
    }

    public Completable a() {
        return this.c.n.c((Function<? super T, ? extends R>) $$Lambda$JgZXXEDHApOeLEYYu0DU2rsyeM.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$mqu$IFEUGaymOkr588dCuSfhMdl4Qs.INSTANCE).a(0).e(new $$Lambda$mqu$nVymi7tGNZ8_Sm0E8wXsLKQlK8(this));
    }

    public Completable b() {
        return Completable.a((Action) new $$Lambda$mqu$RcExF9V9fOv_JsK0FmcYFvEZg(this));
    }
}
