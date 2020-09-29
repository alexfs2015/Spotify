package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.squareup.picasso.Picasso;

/* renamed from: uba reason: default package */
public final class uba implements twk {
    private final Context a;
    private final Picasso b;
    private final sgy c;
    private final float d = this.a.getResources().getDimension(R.dimen.show_icon_radius);

    public uba(Context context, Picasso picasso, sgy sgy) {
        this.a = context;
        this.b = picasso;
        this.c = sgy;
    }

    public final void a(Show show, View view, boolean z) {
        fsc fsc = (fsc) fqv.a(view, fsc.class);
        fsc.a(show.a());
        fsc.b(this.c.a(show));
        fsc.a(z);
        fsc.getView().setTag(show);
        Covers b2 = show.b();
        Uri parse = b2 != null ? Uri.parse(b2.getImageUri(Size.NORMAL)) : Uri.EMPTY;
        Drawable a2 = gaa.a(this.a, SpotifyIconV2.PODCASTS);
        if (parse != Uri.EMPTY) {
            this.b.a(parse).a(a2).b(a2).a(vhj.a(fsc.c(), vgt.a(this.d)));
        } else {
            fsc.c().setImageDrawable(a2);
        }
    }
}
