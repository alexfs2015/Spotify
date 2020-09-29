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

/* renamed from: msj reason: default package */
public final class msj extends u {
    private final ViewGroup a;
    private final ImageView b = ((ImageView) ip.c((View) this.a, (int) R.id.artist_avatar));
    private final TextView c = ((TextView) ip.c((View) this.a, (int) R.id.artist_name));
    private final Button d = ((Button) ip.c((View) this.a, (int) R.id.follow_button));

    public msj(ViewGroup viewGroup) {
        super(viewGroup);
        this.a = viewGroup;
    }

    public final void a(msl msl, Picasso picasso, a aVar) {
        picasso.a(msl.c()).b((int) R.drawable.cat_placeholder_artist).a((int) R.drawable.cat_placeholder_artist).a(uvt.a(this.b));
        this.c.setText(msl.b());
        this.a.setOnClickListener(new $$Lambda$msj$YHBZIRH47ES3KaPZyOLYPO0nEo(aVar, msl));
        this.d.setOnClickListener(new $$Lambda$msj$yeynCBQ1qfq__FpNHm1ZYgczBs(aVar, msl));
    }
}
