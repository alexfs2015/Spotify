package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.rendertype.PickerViewType;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ArtistView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: qqo reason: default package */
public final class qqo extends qql implements gkv {
    private final qqq g;
    private final qrg h;

    public qqo(qqq qqq, qrg qrg) {
        this.g = qqq;
        this.h = qrg;
        a(true);
    }

    public final int a(int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) f(i);
        return (tasteOnboardingItem.isArtist() || tasteOnboardingItem.isPodcast()) ? 1 : 2;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        qqq qqq = this.g;
        a<TasteOnboardingItem> aVar = this.e;
        PickerViewType a = a();
        if (i == 1) {
            ArtistView artistView = (ArtistView) qqq.a.inflate(R.layout.viewholder_artist_view, viewGroup, false);
            int i2 = AnonymousClass1.a[a.ordinal()];
            if (i2 == 1) {
                artistView.setLayoutParams(new LayoutParams(-1, -2));
                et etVar = new et();
                etVar.a((ConstraintLayout) artistView);
                int id = artistView.b.getId();
                etVar.a(id, "w,1:1");
                etVar.a(id, 6, R.id.artist_view, 6);
                etVar.a(id, 7, R.id.artist_view, 7);
                etVar.a(id, 3, R.id.artist_view, 3);
                int id2 = artistView.d.getId();
                int id3 = artistView.b.getId();
                etVar.a(id2, 6, R.id.artist_view, 6);
                etVar.a(id2, 7, R.id.artist_view, 7);
                etVar.a(id2, 3, id3, 4);
                etVar.b(artistView);
            } else if (i2 == 2) {
                artistView.setLayoutParams(new LayoutParams(-2, -1));
                et etVar2 = new et();
                etVar2.a((ConstraintLayout) artistView);
                int id4 = artistView.b.getId();
                etVar2.a(id4, "h,1:1");
                etVar2.a(id4, 4, R.id.artist_name, 3);
                etVar2.a(id4, 3, R.id.artist_view, 3);
                int id5 = artistView.d.getId();
                int id6 = artistView.b.getId();
                int id7 = artistView.b.getId();
                etVar2.a(id5, 6, id6, 6);
                etVar2.a(id5, 7, id7, 7);
                etVar2.a(id5, 4, R.id.artist_view, 4);
                etVar2.b(artistView);
            } else {
                StringBuilder sb = new StringBuilder("Unsupported picker view type: ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
            return new qqm(artistView, aVar, qqq.b);
        } else if (i == 2) {
            return new qqn(R.layout.free_tier_artist_picker_genre_view_sthlm_blk, viewGroup, aVar);
        } else {
            StringBuilder sb2 = new StringBuilder("Unsupported view type: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final String c(int i) {
        return ((TasteOnboardingItem) f(i)).id();
    }

    /* access modifiers changed from: 0000 */
    public final void g(int i) {
        this.h.a(((TasteOnboardingItem) f(i)).id(), "to-artist-picker", i, ImpressionType.ITEM, RenderType.GRID);
    }
}