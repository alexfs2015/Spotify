package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: -$$Lambda$qru$NUEYgSVaZm5FRjJ6HlMWpSvX4AI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qru$NUEYgSVaZm5FRjJ6HlMWpSvX4AI implements Consumer {
    private final /* synthetic */ qru f$0;
    private final /* synthetic */ TasteOnboardingItem f$1;

    public /* synthetic */ $$Lambda$qru$NUEYgSVaZm5FRjJ6HlMWpSvX4AI(qru qru, TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = qru;
        this.f$1 = tasteOnboardingItem;
    }

    public final void accept(Object obj) {
        this.f$0.b(this.f$1, (List) obj);
    }
}
