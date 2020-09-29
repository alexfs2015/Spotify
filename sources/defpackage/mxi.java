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

/* renamed from: mxi reason: default package */
public final class mxi extends a<mxk> {
    public final List<mxm> a = new ArrayList(0);
    public FollowRecsView.a d;
    private final Picasso e;

    public mxi(Picasso picasso) {
        this.e = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new mxk((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.follow_recs_artist_card, viewGroup, false));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((mxk) uVar).a((mxm) this.a.get(i), this.e, this.d);
    }

    public final int b() {
        return this.a.size();
    }
}
