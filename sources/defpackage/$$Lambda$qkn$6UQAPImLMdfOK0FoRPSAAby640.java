package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qkn$6UQAPImLMdfOK0FoRPS-AAby640 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qkn$6UQAPImLMdfOK0FoRPSAAby640 implements Consumer {
    private final /* synthetic */ TasteOnboardingItem f$0;

    public /* synthetic */ $$Lambda$qkn$6UQAPImLMdfOK0FoRPSAAby640(TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = tasteOnboardingItem;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Error expanding item in taste picker shelf %s", new Object[]{this.f$0.id()}), new Object[0]);
    }
}
