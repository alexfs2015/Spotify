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

/* renamed from: tox reason: default package */
public final class tox implements tks {
    private final Context a;
    private final Picasso b;
    private final rxo c;
    private final float d = this.a.getResources().getDimension(R.dimen.show_icon_radius);

    public tox(Context context, Picasso picasso, rxo rxo) {
        this.a = context;
        this.b = picasso;
        this.c = rxo;
    }

    public final void a(Show show, View view, boolean z) {
        Uri uri;
        fri fri = (fri) fqb.a(view, fri.class);
        fri.a(show.a());
        fri.b(this.c.a(show));
        fri.a(z);
        fri.getView().setTag(show);
        Covers b2 = show.b();
        if (b2 != null) {
            uri = Uri.parse(b2.getImageUri(Size.NORMAL));
        } else {
            uri = Uri.EMPTY;
        }
        Drawable a2 = fzg.a(this.a, SpotifyIconV2.PODCASTS);
        if (uri != Uri.EMPTY) {
            this.b.a(uri).a(a2).b(a2).a(uvt.a(fri.c(), uvc.a(this.d)));
        } else {
            fri.c().setImageDrawable(a2);
        }
    }
}
