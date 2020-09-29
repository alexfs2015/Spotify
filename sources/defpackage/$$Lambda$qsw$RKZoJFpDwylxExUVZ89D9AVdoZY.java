package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qsw$RKZoJFpDwylxExUVZ89D9AVdoZY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qsw$RKZoJFpDwylxExUVZ89D9AVdoZY implements Consumer {
    private final /* synthetic */ TasteOnboardingItem f$0;

    public /* synthetic */ $$Lambda$qsw$RKZoJFpDwylxExUVZ89D9AVdoZY(TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = tasteOnboardingItem;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Error expanding item in taste picker shelf %s", new Object[]{this.f$0.id()}), new Object[0]);
    }
}
