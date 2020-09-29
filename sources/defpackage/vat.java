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

/* renamed from: vat reason: default package */
public final class vat extends ArrayAdapter<vau> {
    public vat(Context context, List<vau> list) {
        super(context, 17367043, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        frx frx = (frx) fqv.b(view, frx.class);
        if (frx == null) {
            fqv.b();
            frx = fsk.c(getContext(), viewGroup);
        }
        vau vau = (vau) getItem(i);
        if (vau.a) {
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.CHECK, (float) getContext().getResources().getDimensionPixelSize(R.dimen.filter_list_popup_icon_height));
            spotifyIconDrawable.a(fr.c(getContext(), R.color.cat_grayscale_55));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(spotifyIconDrawable);
            frx.a(imageView);
        } else {
            frx.a(null);
        }
        frx.a(getContext().getString(vau.b));
        return frx.getView();
    }
}
