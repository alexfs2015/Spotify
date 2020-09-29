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

/* renamed from: kpe reason: default package */
public final class kpe implements tks {
    private final Context a;
    private final rxo b;
    private final float c = this.a.getResources().getDimension(R.dimen.show_icon_radius);
    private final Picasso d;
    private final String e;
    private final String f;
    private final Drawable g;

    public kpe(Context context, Picasso picasso, rxo rxo) {
        this.a = context;
        this.d = picasso;
        this.b = rxo;
        this.e = context.getString(R.string.create_podcast_title);
        this.f = context.getString(R.string.create_podcast_subtitle);
        this.g = koj.a(context);
    }

    public final void a(Show show, View view, boolean z) {
        Uri uri;
        fri fri = (fri) fqb.a(view, fri.class);
        if (show instanceof kpg) {
            fri.a(this.e);
            fri.b(this.f);
            fri.a(false);
            fri.c().setImageDrawable(this.g);
        } else {
            fri.a(show.a());
            fri.b(this.b.a(show));
            fri.a(z);
            Covers b2 = show.b();
            if (b2 != null) {
                uri = Uri.parse(b2.getImageUri(Size.NORMAL));
            } else {
                uri = Uri.EMPTY;
            }
            this.d.a(uri).a(fzg.a(this.a, SpotifyIconV2.PODCASTS)).a(uvt.a(fri.c(), uvc.a(this.c)));
        }
        fri.getView().setTag(show);
    }
}
