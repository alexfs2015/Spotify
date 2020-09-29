package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ihu reason: default package */
public final class ihu {
    private final ihx a;
    private final CompositeDisposable b = new CompositeDisposable();

    /* renamed from: ihu$a */
    public interface a<T> {
        void a(Throwable th);

        void a(xgo<T> xgo);
    }

    public ihu(ihx ihx) {
        this.a = ihx;
    }

    public final void a(a<Sponsorships> aVar) {
        Logger.b("Ads Sponsorship data requested", new Object[0]);
        CompositeDisposable compositeDisposable = this.b;
        Single a2 = this.a.a();
        aVar.getClass();
        $$Lambda$kVYtx8msel2Ba99sJctguR6cXfU r2 = new $$Lambda$kVYtx8msel2Ba99sJctguR6cXfU(aVar);
        aVar.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$waN9CPQGPNHjCt43Ta783eWZYs<Object>(aVar)));
    }

    public final void a(String str, a<SponsorshipAdData> aVar) {
        if (!str.isEmpty()) {
            CompositeDisposable compositeDisposable = this.b;
            Single a2 = this.a.a(str);
            aVar.getClass();
            $$Lambda$kVYtx8msel2Ba99sJctguR6cXfU r1 = new $$Lambda$kVYtx8msel2Ba99sJctguR6cXfU(aVar);
            aVar.getClass();
            compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$waN9CPQGPNHjCt43Ta783eWZYs<Object>(aVar)));
        }
    }
}
