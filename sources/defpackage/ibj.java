package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

/* renamed from: ibj reason: default package */
public final class ibj {
    public final hzu a;
    public final SlotApi b;
    public final CompositeDisposable c = new CompositeDisposable();

    /* renamed from: ibj$a */
    public static class a extends DisposableObserver<Response> {
        private final String a;

        private a(String str) {
            this.a = str;
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }

        public final void onComplete() {
            Logger.b("Ads Connect - Request %s completed", this.a);
        }

        public final void onError(Throwable th) {
            Logger.b("Ads Connect - Request %s errored %s", th.getMessage(), this.a);
        }

        public final /* synthetic */ void onNext(Object obj) {
            Logger.b("Ads Connect - request %s succeeded", this.a);
        }
    }

    /* renamed from: ibj$b */
    public class b implements CompletableObserver {
        private final String a;
        private Disposable b;

        public b(String str) {
            this.a = str;
        }

        public final void onComplete() {
            Logger.b("Ads Connect - request %s succeeded", this.a);
        }

        public final void onError(Throwable th) {
            Logger.b("Ads Connect - Request %s errored %s", this.a, th.getMessage());
            ibj.this.c.b(this.b);
        }

        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            ibj.this.c.a(this.b);
        }
    }

    public ibj(SlotApi slotApi, hzu hzu) {
        this.b = slotApi;
        this.a = hzu;
    }
}
