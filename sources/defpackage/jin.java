package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.storylines.model.StorylinesCardImageModel;
import com.spotify.mobile.android.storylines.ui.StorylinesCardView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jin reason: default package */
public final class jin extends a<jim> {
    public final List<StorylinesCardImageModel> a = new ArrayList(0);
    public StorylinesCardView.a d;
    public jil e;
    private final Picasso f;

    public final /* synthetic */ void a(u uVar, int i) {
        StorylinesCardView storylinesCardView = ((jim) uVar).a;
        StorylinesCardImageModel storylinesCardImageModel = (StorylinesCardImageModel) this.a.get(i);
        Picasso picasso = this.f;
        StorylinesCardView.a aVar = this.d;
        jil jil = this.e;
        storylinesCardView.b = aVar;
        jil a2 = jil.e().d(storylinesCardImageModel.getImageId()).a();
        storylinesCardView.b.a(a2);
        picasso.a(storylinesCardImageModel.getUri()).a((Object) Integer.valueOf(R.id.storylines_card_loaded_with_picasso)).a(storylinesCardView.a, (vrt) new vrt(a2) {
            private /* synthetic */ jil a;

            {
                this.a = r2;
            }

            public final void a() {
                StorylinesCardView.this.b.b(this.a);
            }

            public final void b() {
                StorylinesCardView.this.b.c(this.a);
            }
        });
    }

    public jin(Picasso picasso) {
        this.f = picasso;
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new jim(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storylines_card, viewGroup, false));
    }
}
