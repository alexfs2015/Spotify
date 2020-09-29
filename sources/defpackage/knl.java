package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* renamed from: knl reason: default package */
public final class knl {
    public final wlc<c<knw, knt, kns>> a;
    public kju<knw, knt, kns> b;
    public final fnz<Optional<kju<knw, knt, kns>>> c = fnz.a(Optional.e());
    public final CompositeDisposable d = new CompositeDisposable();
    private kkf e;

    public knl(wlc<c<knw, knt, kns>> wlc) {
        this.a = wlc;
    }

    public final void a(kkn<knw> kkn) {
        this.d.a(this.c.a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).a((Consumer<? super T>) new $$Lambda$knl$o74ehAhe5PSl0NoBeEt_RU7MF0<Object>(this, kkn), (Consumer<? super Throwable>) $$Lambda$knl$WOYu5MVtrpNmnuBRxP5DTbXP0WM.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kkn kkn, Optional optional) {
        this.e = ((kju) optional.c()).a(kkn);
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
}
