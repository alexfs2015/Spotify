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

/* renamed from: ksn reason: default package */
public final class ksn implements twk {
    private final Context a;
    private final sgy b;
    private final float c = this.a.getResources().getDimension(R.dimen.show_icon_radius);
    private final Picasso d;
    private final String e;
    private final String f;
    private final Drawable g;

    public ksn(Context context, Picasso picasso, sgy sgy) {
        this.a = context;
        this.d = picasso;
        this.b = sgy;
        this.e = context.getString(R.string.create_podcast_title);
        this.f = context.getString(R.string.create_podcast_subtitle);
        this.g = krs.a(context);
    }

    public final void a(Show show, View view, boolean z) {
        fsc fsc = (fsc) fqv.a(view, fsc.class);
        if (show instanceof ksp) {
            fsc.a(this.e);
            fsc.b(this.f);
            fsc.a(false);
            fsc.c().setImageDrawable(this.g);
        } else {
            fsc.a(show.a());
            fsc.b(this.b.a(show));
            fsc.a(z);
            Covers b2 = show.b();
            this.d.a(b2 != null ? Uri.parse(b2.getImageUri(Size.NORMAL)) : Uri.EMPTY).a(gaa.a(this.a, SpotifyIconV2.PODCASTS)).a(vhj.a(fsc.c(), vgt.a(this.c)));
        }
        fsc.getView().setTag(show);
    }
}
