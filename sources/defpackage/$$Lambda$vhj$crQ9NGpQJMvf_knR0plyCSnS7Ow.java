package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.c;

/* renamed from: -$$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow implements c {
    public static final /* synthetic */ $$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow INSTANCE = new $$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow();

    private /* synthetic */ $$Lambda$vhj$crQ9NGpQJMvf_knR0plyCSnS7Ow() {
    }

    public final void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc) {
        Logger.e(exc, "Failed to load image with uri: \"%s\".", uri);
    }
}
