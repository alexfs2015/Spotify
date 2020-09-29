package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

/* renamed from: vaw reason: default package */
public final class vaw extends ArrayAdapter<SortOption> {
    int a = -1;
    private final List<SortOption> b;

    public vaw(Context context, List<SortOption> list, int i) {
        super(context, 17367043, list);
        this.a = i;
        this.b = list;
    }

    private View a(SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), spotifyIcon, getContext().getResources().getDimension(R.dimen.filter_list_popup_icon_height));
        spotifyIconDrawable.a(fr.c(getContext(), R.color.cat_grayscale_55));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(spotifyIconDrawable);
        return imageView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        frx frx = (frx) fqv.b(view, frx.class);
        if (frx == null) {
            fqv.b();
            frx = fsk.c(getContext(), viewGroup);
        }
        SortOption sortOption = (SortOption) getItem(i);
        if (this.a != i) {
            frx.a(null);
        } else if (!sortOption.mIsReversible) {
            frx.a(a(SpotifyIcon.CHECK_16));
        } else if (sortOption.b()) {
            frx.a(a(SpotifyIcon.ARROW_UP_32));
        } else {
            frx.a(a(SpotifyIcon.ARROW_DOWN_32));
        }
        frx.a(getContext().getString(sortOption.mResourceId));
        return frx.getView();
    }
}
