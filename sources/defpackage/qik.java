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

/* renamed from: qik reason: default package */
public final class qik extends qib implements gjl {
    private final qin g;
    private final qix h;
    private final qii i;

    public qik(qin qin, qix qix, qii qii) {
        this.g = qin;
        this.h = qix;
        this.i = qii;
        a(true);
    }

    public final void a(List<TasteOnboardingItem> list) {
        super.a(list);
        if (list != null) {
            qii qii = this.i;
            int size = list.size();
            if (qii.a == null) {
                qii.a = new int[size];
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g(int i2) {
        this.h.a(((TasteOnboardingItem) f(i2)).id(), "to-artist-picker", i2, ImpressionType.ITEM, RenderType.CAROUSEL);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i2) {
        qin qin = this.g;
        a<TasteOnboardingItem> aVar = this.e;
        PickerViewType a = a();
        qii qii = this.i;
        ShelfView shelfView = (ShelfView) qin.a.inflate(R.layout.viewholder_shelf_view, viewGroup, false);
        qie qie = new qie(qin.b, qin.c);
        qie.f = a;
        qim qim = new qim(shelfView, aVar, qie, qin.d, qii);
        return qim;
    }
}
