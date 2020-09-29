package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: qlg reason: default package */
public final class qlg extends qlh<iqu<TasteOnboardingItem>, TasteOnboardingItem> {
    private final qlo f;
    private final uvf g;
    private final boolean h;

    public qlg(qlo qlo, uvf uvf, boolean z) {
        this.f = qlo;
        this.g = uvf;
        this.h = z;
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) f(i);
        qlo qlo = this.f;
        qlo.b.a((String) fay.a(tasteOnboardingItem.id()), "to-artist-search", i, ImpressionType.ITEM, RenderType.GRID);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fqb.b();
        return new qli(frq.b(viewGroup.getContext(), viewGroup), this.e, this.g, this.h);
    }
}
