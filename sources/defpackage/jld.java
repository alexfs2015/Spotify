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

/* renamed from: jld reason: default package */
public final class jld extends a<jlc> {
    public final List<StorylinesCardImageModel> a = new ArrayList(0);
    public StorylinesCardView.a d;
    public jlb e;
    private final Picasso f;

    public jld(Picasso picasso) {
        this.f = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new jlc(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storylines_card, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        StorylinesCardView storylinesCardView = ((jlc) uVar).a;
        StorylinesCardImageModel storylinesCardImageModel = (StorylinesCardImageModel) this.a.get(i);
        Picasso picasso = this.f;
        StorylinesCardView.a aVar = this.d;
        jlb jlb = this.e;
        storylinesCardView.b = aVar;
        jlb a2 = jlb.e().d(storylinesCardImageModel.getImageId()).a();
        storylinesCardView.b.a(a2);
        picasso.a(storylinesCardImageModel.getUri()).a((Object) Integer.valueOf(R.id.storylines_card_loaded_with_picasso)).a(storylinesCardView.a, (wfz) new wfz(a2) {
            private /* synthetic */ jlb a;

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

    public final int b() {
        return this.a.size();
    }
}
