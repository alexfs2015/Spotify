package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rla reason: default package */
public class rla implements fqy {
    private final TextView a;
    private final ImageView b;
    private final View c;

    public rla(View view) {
        this.c = view;
        this.a = (TextView) view.findViewById(16908308);
        this.b = (ImageView) view.findViewById(R.id.image);
    }

    public final void a() {
        this.b.setImageDrawable(null);
    }

    public final void a(SpotifyIconV2 spotifyIconV2) {
        Context context = this.c.getContext();
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, context.getResources().getDimension(R.dimen.sort_and_filter_list_accessory_icon_height));
        spotifyIconDrawable.a(vgl.b(context, R.attr.pasteColorAccessoryGreen));
        this.b.setImageDrawable(spotifyIconDrawable);
    }

    public final void a(String str) {
        this.a.setText(str);
    }

    public View getView() {
        return this.c;
    }
}
