package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ifh reason: default package */
public final class ifh {
    private final ifk a;
    private final CompositeDisposable b = new CompositeDisposable();

    /* renamed from: ifh$a */
    public interface a<T> {
        void a(Throwable th);

        void a(wsj<T> wsj);
    }

    public ifh(ifk ifk) {
        this.a = ifk;
    }

    public final void a(String str, a<SponsorshipAdData> aVar) {
        if (!str.isEmpty()) {
            CompositeDisposable compositeDisposable = this.b;
            Single a2 = this.a.a(str);
            aVar.getClass();
            $$Lambda$gKt6ivEBONTwWW47sN1y5EG5MA r1 = new $$Lambda$gKt6ivEBONTwWW47sN1y5EG5MA(aVar);
            aVar.getClass();
            compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$dWK0V3XSrG3sMnmdTxyBiyEssx4<Object>(aVar)));
        }
    }

    public final void a(a<Sponsorships> aVar) {
        Logger.b("Ads Sponsorship data requested", new Object[0]);
        CompositeDisposable compositeDisposable = this.b;
        Single a2 = this.a.a();
        aVar.getClass();
        $$Lambda$gKt6ivEBONTwWW47sN1y5EG5MA r2 = new $$Lambda$gKt6ivEBONTwWW47sN1y5EG5MA(aVar);
        aVar.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$dWK0V3XSrG3sMnmdTxyBiyEssx4<Object>(aVar)));
    }
}
