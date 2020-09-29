package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qkl$uPceMP9_PxrD3GdPtSSPmgwdOyg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qkl$uPceMP9_PxrD3GdPtSSPmgwdOyg implements Consumer {
    private final /* synthetic */ TasteOnboardingItem f$0;

    public /* synthetic */ $$Lambda$qkl$uPceMP9_PxrD3GdPtSSPmgwdOyg(TasteOnboardingItem tasteOnboardingItem) {
        this.f$0 = tasteOnboardingItem;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Error expanding genre in taste picker grid %s", new Object[]{this.f$0.id()}), new Object[0]);
    }
}
