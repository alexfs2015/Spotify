package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import com.spotify.music.features.quicksilver.utils.QuicksilverPlaybackService;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: pqr reason: default package */
public final class pqr {
    final SerialDisposable a = new SerialDisposable();
    private final Context b;
    private final a<TriggerEngineModel, prf, pre> c;
    private final hec d;
    private final psb e;
    private kju<TriggerEngineModel, prf, pre> f;

    public pqr(Context context, hec hec, psb psb, a<TriggerEngineModel, prf, pre> aVar) {
        this.b = context;
        this.d = hec;
        this.e = psb;
        this.c = aVar;
    }

    public final void a() {
        Logger.b("TriggerEngine started", new Object[0]);
        this.a.a(this.d.a(psf.h).a((Consumer<? super T>) new $$Lambda$pqr$tt9Z7lXTBKicVA5mXc5GP94oIEk<Object>(this), (Consumer<? super Throwable>) $$Lambda$pqr$EmhFosUD4n5N_PmkSqSqLiZUJU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            Logger.b("Starting TriggerEngine logic", new Object[0]);
            if (this.f == null) {
                this.f = this.c.a(TriggerEngineModel.a);
                this.f.a((kkn<M>) this.e);
            }
            return;
        }
        b();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Logger.b("Stopping TriggerEngine logic", new Object[0]);
        kju<TriggerEngineModel, prf, pre> kju = this.f;
        if (kju != null) {
            kju.dispose();
            this.f = null;
        }
        QuicksilverPlaybackService.a(this.b);
    }
}
