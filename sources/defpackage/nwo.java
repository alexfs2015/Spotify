package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nwo reason: default package */
final class nwo extends a<nwp> implements gjl {
    final List<rrz> a = new ArrayList();
    private final Picasso d;

    public final /* synthetic */ void a(u uVar, int i) {
        nwp nwp = (nwp) uVar;
        rrz rrz = (rrz) this.a.get(i);
        nwp.g.setText(rrz.c());
        nwp.b.setText(((rrv) rrz.h().get(0)).b());
        nwp.h.setText(nwp.a(rrz.e()));
        nwp.c.setText(rrz.g().b());
        nwp.d.setText(rrz.g().f());
        nwp.k.setText(rrz.b());
        nwp.a.a(rrz.g().c()).a(nwp.f);
        nwp.a.a(((rrv) rrz.h().get(0)).c()).a(uvt.a(nwp.e));
        ImageView imageView = nwp.i;
        Context context = nwp.j;
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, (float) uts.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        imageView.setImageDrawable(nwp.a(context, spotifyIconDrawable));
        nwp.i.setContentDescription(nwp.j.getString(R.string.content_description_play_button));
    }

    public nwo(Picasso picasso) {
        this.d = picasso;
    }

    public final int b() {
        return this.a.size();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new nwp(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feed_story, viewGroup, false), this.d);
    }
}
