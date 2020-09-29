package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import com.spotify.music.features.quicksilver.utils.QuicksilverPlaybackService;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: pzn reason: default package */
public final class pzn {
    final SerialDisposable a = new SerialDisposable();
    private final Context b;
    private final a<TriggerEngineModel, qab, qaa> c;
    private final hgy d;
    private final qax e;
    private knd<TriggerEngineModel, qab, qaa> f;

    public pzn(Context context, hgy hgy, qax qax, a<TriggerEngineModel, qab, qaa> aVar) {
        this.b = context;
        this.d = hgy;
        this.e = qax;
        this.c = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            Logger.b("Starting TriggerEngine logic", new Object[0]);
            if (this.f == null) {
                this.f = this.c.a(TriggerEngineModel.a);
                this.f.a((knw<M>) this.e);
            }
            return;
        }
        b();
    }

    public final void a() {
        Logger.b("TriggerEngine started", new Object[0]);
        this.a.a(this.d.a(qbb.h).a((Consumer<? super T>) new $$Lambda$pzn$TLuFqMhmMbORST8dJcfV6EOuti0<Object>(this), (Consumer<? super Throwable>) $$Lambda$pzn$9GPJXrHUkVkTPThulqEsp_USGOk.INSTANCE));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Logger.b("Stopping TriggerEngine logic", new Object[0]);
        knd<TriggerEngineModel, qab, qaa> knd = this.f;
        if (knd != null) {
            knd.dispose();
            this.f = null;
        }
        QuicksilverPlaybackService.a(this.b);
    }
}
