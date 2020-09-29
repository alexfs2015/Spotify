package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: pfh reason: default package */
public final class pfh implements pfg {
    private final InteractionLogger a;
    private final String b;

    public pfh(InteractionLogger interactionLogger, String str) {
        this.a = interactionLogger;
        this.b = str;
    }

    public final void a(Context context, ImageView imageView, Uri uri) {
        this.a.a(this.b, "cover-art", -1, InteractionType.HIT, "cover-art-clicked");
        CoverImageActivity.b(context, imageView, uri);
    }
}
