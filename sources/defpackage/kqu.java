package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: kqu reason: default package */
public final class kqu {
    public final wzi<c<krf, krc, krb>> a;
    public knd<krf, krc, krb> b;
    public final fot<Optional<knd<krf, krc, krb>>> c = fot.a(Optional.e());
    public final CompositeDisposable d = new CompositeDisposable();
    private kno e;

    public kqu(wzi<c<krf, krc, krb>> wzi) {
        this.a = wzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(knw knw, Optional optional) {
        this.e = ((knd) optional.c()).a(knw);
        Logger.b("[VoiceAd] Mobius loop registered", new Object[0]);
    }

    public final void a() {
        if (this.e != null) {
            Logger.b("[VoiceAd] Mobius loop unregistered", new Object[0]);
            this.e.dispose();
            this.e = null;
            this.d.c();
        }
    }

    public final void a(knw<krf> knw) {
        this.d.a(this.c.a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).a((Consumer<? super T>) new $$Lambda$kqu$8hJPulhw8INm289aCmMF10_n3f4<Object>(this, knw), (Consumer<? super Throwable>) $$Lambda$kqu$TENZOcL8dvaZGAr3fBn4OA50KSw.INSTANCE));
    }
}
