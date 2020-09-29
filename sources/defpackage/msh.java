package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: msh reason: default package */
public final class msh extends a<msj> {
    public final List<msl> a = new ArrayList(0);
    public FollowRecsView.a d;
    private final Picasso e;

    public final /* synthetic */ void a(u uVar, int i) {
        ((msj) uVar).a((msl) this.a.get(i), this.e, this.d);
    }

    public msh(Picasso picasso) {
        this.e = picasso;
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new msj((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.follow_recs_artist_card, viewGroup, false));
    }
}
