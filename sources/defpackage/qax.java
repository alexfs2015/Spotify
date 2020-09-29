package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;

/* renamed from: qax reason: default package */
public final class qax implements knw<TriggerEngineModel> {
    private boolean a;

    public final /* synthetic */ void accept(Object obj) {
        this.a = !((TriggerEngineModel) obj).b().isEmpty();
        Logger.b("[ModelObserver] Check has loaded triggers: %s", Boolean.valueOf(this.a));
    }
}
