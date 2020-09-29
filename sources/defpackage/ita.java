package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: ita reason: default package */
public final class ita {
    public static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, boolean z) {
        return a(context, spotifyIconV2, i, true, false);
    }

    private static View a(Context context, SpotifyIconV2 spotifyIconV2, int i, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        fqv.b();
        fry d = fsk.d(context, null);
        ImageView c = d.c();
        if (spotifyIconV2 != null) {
            c.setImageDrawable(gaa.a(context, spotifyIconV2, 0.66f, true, true, (float) vfj.b(32.0f, context.getResources())));
            c.setScaleType(ScaleType.CENTER_INSIDE);
        } else {
            c.setVisibility(8);
        }
        d.a(context.getString(i));
        ip.a(d.getView(), drawable);
        d.getView().setEnabled(z);
        obtainStyledAttributes.recycle();
        return d.getView();
    }
}
