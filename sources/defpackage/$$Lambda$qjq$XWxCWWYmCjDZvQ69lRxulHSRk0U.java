package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qjq$XWxCWWYmCjDZvQ69lRxulHSRk0U reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qjq$XWxCWWYmCjDZvQ69lRxulHSRk0U implements Function {
    private final /* synthetic */ qjq f$0;
    private final /* synthetic */ TasteOnboardingItem f$1;

    public /* synthetic */ $$Lambda$qjq$XWxCWWYmCjDZvQ69lRxulHSRk0U(qjq qjq, TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = qjq;
        this.f$1 = tasteOnboardingItem;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (ArtistPickerResponse) obj);
    }
}
