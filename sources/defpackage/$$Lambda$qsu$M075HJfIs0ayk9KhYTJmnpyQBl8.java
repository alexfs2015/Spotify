package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qsu$M075HJfIs0ayk9KhYTJmnpyQBl8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qsu$M075HJfIs0ayk9KhYTJmnpyQBl8 implements Consumer {
    private final /* synthetic */ TasteOnboardingItem f$0;

    public /* synthetic */ $$Lambda$qsu$M075HJfIs0ayk9KhYTJmnpyQBl8(TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = tasteOnboardingItem;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Error expanding genre in taste picker grid %s", new Object[]{this.f$0.id()}), new Object[0]);
    }
}
