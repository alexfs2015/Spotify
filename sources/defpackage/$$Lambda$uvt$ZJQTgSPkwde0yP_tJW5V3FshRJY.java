package defpackage;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.c;

/* renamed from: -$$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY implements c {
    public static final /* synthetic */ $$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY INSTANCE = new $$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY();

    private /* synthetic */ $$Lambda$uvt$ZJQTgSPkwde0yP_tJW5V3FshRJY() {
    }

    public final void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc) {
        Logger.e(exc, "Failed to load image with uri: \"%s\".", uri);
    }
}
