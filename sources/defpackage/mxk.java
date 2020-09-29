package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.features.followfeed.views.FollowRecsView.a;
import com.squareup.picasso.Picasso;

/* renamed from: mxk reason: default package */
public final class mxk extends u {
    private final ViewGroup a;
    private final ImageView b = ((ImageView) ip.d((View) this.a, (int) R.id.artist_avatar));
    private final TextView c = ((TextView) ip.d((View) this.a, (int) R.id.artist_name));
    private final Button d = ((Button) ip.d((View) this.a, (int) R.id.follow_button));

    public mxk(ViewGroup viewGroup) {
        super(viewGroup);
        this.a = viewGroup;
    }

    public final void a(mxm mxm, Picasso picasso, a aVar) {
        picasso.a(mxm.c()).b((int) R.drawable.cat_placeholder_artist).a((int) R.drawable.cat_placeholder_artist).a(vhj.a(this.b));
        this.c.setText(mxm.b());
        this.a.setOnClickListener(new $$Lambda$mxk$wiKFE3xWBtad4LkLbwtF4VVkDZI(aVar, mxm));
        this.d.setOnClickListener(new $$Lambda$mxk$XiW_EWQThECsBhrI7yzesGGtOY(aVar, mxm));
    }
}
