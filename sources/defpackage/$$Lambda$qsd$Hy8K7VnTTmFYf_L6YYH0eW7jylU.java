package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qsd$Hy8K7VnTTmFYf_L6YYH0eW7jylU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qsd$Hy8K7VnTTmFYf_L6YYH0eW7jylU implements Function {
    private final /* synthetic */ qsd f$0;
    private final /* synthetic */ TasteOnboardingItem f$1;

    public /* synthetic */ $$Lambda$qsd$Hy8K7VnTTmFYf_L6YYH0eW7jylU(qsd qsd, TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = qsd;
        this.f$1 = tasteOnboardingItem;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (RelatedArtistsResponse) obj);
    }
}
