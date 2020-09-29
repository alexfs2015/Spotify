package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import java.util.List;

/* renamed from: qqu reason: default package */
public final class qqu extends qql implements gkw {
    private final qqx g;
    private final qrg h;
    private final qqs i;

    public qqu(qqx qqx, qrg qrg, qqs qqs) {
        this.g = qqx;
        this.h = qrg;
        this.i = qqs;
        a(true);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        qqx qqx = this.g;
        a<TasteOnboardingItem> aVar = this.e;
        PickerViewType a = a();
        qqs qqs = this.i;
        ShelfView shelfView = (ShelfView) qqx.a.inflate(R.layout.viewholder_shelf_view, viewGroup, false);
        qqo qqo = new qqo(qqx.b, qqx.c);
        qqo.f = a;
        qqw qqw = new qqw(shelfView, aVar, qqo, qqx.d, qqs);
        return qqw;
    }

    public final void a(List<TasteOnboardingItem> list) {
        super.a(list);
        if (list != null) {
            qqs qqs = this.i;
            int size = list.size();
            if (qqs.a == null) {
                qqs.a = new int[size];
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g(int i2) {
        this.h.a(((TasteOnboardingItem) f(i2)).id(), "to-artist-picker", i2, ImpressionType.ITEM, RenderType.CAROUSEL);
    }
}
