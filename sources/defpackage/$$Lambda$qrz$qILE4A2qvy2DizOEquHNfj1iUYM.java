package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qrz$qILE4A2qvy2DizOEquHNfj1iUYM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qrz$qILE4A2qvy2DizOEquHNfj1iUYM implements Function {
    private final /* synthetic */ qrz f$0;
    private final /* synthetic */ TasteOnboardingItem f$1;

    public /* synthetic */ $$Lambda$qrz$qILE4A2qvy2DizOEquHNfj1iUYM(qrz qrz, TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = qrz;
        this.f$1 = tasteOnboardingItem;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (ArtistPickerResponse) obj);
    }
}
