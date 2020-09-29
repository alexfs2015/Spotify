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

/* renamed from: odb reason: default package */
final class odb extends a<odc> implements gkw {
    final List<sbg> a = new ArrayList();
    private final Picasso d;

    public odb(Picasso picasso) {
        this.d = picasso;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new odc(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feed_story, viewGroup, false), this.d);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        odc odc = (odc) uVar;
        sbg sbg = (sbg) this.a.get(i);
        odc.g.setText(sbg.c());
        odc.b.setText(((sbc) sbg.h().get(0)).b());
        odc.h.setText(odc.a(sbg.e()));
        odc.c.setText(sbg.g().b());
        odc.d.setText(sbg.g().f());
        odc.k.setText(sbg.b());
        odc.a.a(sbg.g().c()).a(odc.f);
        odc.a.a(((sbc) sbg.h().get(0)).c()).a(vhj.a(odc.e));
        ImageView imageView = odc.i;
        Context context = odc.j;
        ColorStateList b = fr.b(context, (int) R.color.btn_play_pause_dark);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.PLAY, (float) vfj.b(10.0f, context.getResources()));
        spotifyIconDrawable.a(b);
        imageView.setImageDrawable(odc.a(context, spotifyIconDrawable));
        odc.i.setContentDescription(odc.j.getString(R.string.content_description_play_button));
    }

    public final int b() {
        return this.a.size();
    }
}
