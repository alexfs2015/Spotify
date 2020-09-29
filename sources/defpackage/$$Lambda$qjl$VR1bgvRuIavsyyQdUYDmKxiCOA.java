package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: -$$Lambda$qjl$VR1bgvRuIavsyyQdUYDmKxiCO-A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qjl$VR1bgvRuIavsyyQdUYDmKxiCOA implements Consumer {
    private final /* synthetic */ qjl f$0;
    private final /* synthetic */ TasteOnboardingItem f$1;

    public /* synthetic */ $$Lambda$qjl$VR1bgvRuIavsyyQdUYDmKxiCOA(qjl qjl, TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = qjl;
        this.f$1 = tasteOnboardingItem;
    }

    public final void accept(Object obj) {
        this.f$0.b(this.f$1, (List) obj);
    }
}
