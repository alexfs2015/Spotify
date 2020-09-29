package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qju$rp3NScZ7FybQI6wieRs0s6h9Ntk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qju$rp3NScZ7FybQI6wieRs0s6h9Ntk implements Function {
    private final /* synthetic */ qju f$0;
    private final /* synthetic */ TasteOnboardingItem f$1;

    public /* synthetic */ $$Lambda$qju$rp3NScZ7FybQI6wieRs0s6h9Ntk(qju qju, TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = qju;
        this.f$1 = tasteOnboardingItem;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (RelatedArtistsResponse) obj);
    }
}
