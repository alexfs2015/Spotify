package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: qtp reason: default package */
public final class qtp extends qtq<ith<TasteOnboardingItem>, TasteOnboardingItem> {
    private final qtx f;
    private final vgw g;

    public qtp(qtx qtx, vgw vgw) {
        this.f = qtx;
        this.g = vgw;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fqv.b();
        return new qtr(fsk.b(viewGroup.getContext(), viewGroup), this.e, this.g);
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) f(i);
        qtx qtx = this.f;
        qtx.b.a((String) fbp.a(tasteOnboardingItem.id()), "to-artist-search", i, ImpressionType.ITEM, RenderType.GRID);
    }
}
