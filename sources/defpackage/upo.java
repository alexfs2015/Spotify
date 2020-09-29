package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

/* renamed from: upo reason: default package */
public final class upo extends ArrayAdapter<upp> {
    public upo(Context context, List<upp> list) {
        super(context, 17367043, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        frd frd = (frd) fqb.b(view, frd.class);
        if (frd == null) {
            fqb.b();
            frd = frq.c(getContext(), viewGroup);
        }
        upp upp = (upp) getItem(i);
        if (upp.a) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.CHECK, (float) getContext().getResources().getDimensionPixelSize(R.dimen.filter_list_popup_icon_height));
            spotifyIconDrawable.a(fr.c(getContext(), R.color.cat_grayscale_55));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(spotifyIconDrawable);
            frd.a(imageView);
        } else {
            frd.a(null);
        }
        frd.a(getContext().getString(upp.b));
        return frd.getView();
    }
}
