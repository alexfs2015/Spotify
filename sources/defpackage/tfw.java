package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.glue.gradients.GlueGradients;
import com.spotify.android.glue.gradients.GlueGradients.Style;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: tfw reason: default package */
public final class tfw extends sa {
    public Picasso a;
    public List<tfv> b;

    public final int a(Object obj) {
        return -2;
    }

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final Object a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.driving_voice_result_carousel_item, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.driving_voice_result_carousel_item_coverart);
        String c = ((tfv) this.b.get(i)).c();
        if (jst.a(((tfv) this.b.get(i)).d()).b == LinkType.COLLECTION_TRACKS) {
            Context context = imageView.getContext();
            imageView.setImageDrawable(new LayerDrawable(new Drawable[]{GlueGradients.a(context, Style.AQUATIC, false), new uvd(new SpotifyIconDrawable(context, SpotifyIconV2.HEART_ACTIVE, (float) tek.a(context, (int) R.dimen.driving_default_scalable_icon_size)), tek.b(context, R.dimen.driving_your_library_heart_icon_scale))}));
        } else if (this.a != null && !c.isEmpty()) {
            this.a.a(c).a((int) R.drawable.bg_placeholder_album).a(imageView);
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int b() {
        List<tfv> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
