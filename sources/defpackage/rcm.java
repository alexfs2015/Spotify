package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.CheckableImageButton;

/* renamed from: rcm reason: default package */
public final class rcm {
    public static View a(Context context) {
        CheckableImageButton b = b(context);
        b.setId(R.id.follow_button);
        return b;
    }

    private static CheckableImageButton b(Context context) {
        int b = uts.b(26.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.ADDFOLLOW_32);
        spotifyIconDrawable.a(uuu.b(context, R.attr.pasteColorAccessory));
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIcon.CHECK_32);
        spotifyIconDrawable2.a(fr.c(context, R.color.white));
        uva a = a(context, spotifyIconDrawable);
        uva a2 = a(context, spotifyIconDrawable2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, a);
        stateListDrawable.addState(new int[]{16842912}, a2);
        CheckableImageButton checkableImageButton = new CheckableImageButton(context);
        checkableImageButton.setLayoutParams(new LayoutParams(b, b));
        checkableImageButton.setImageDrawable(stateListDrawable);
        checkableImageButton.setScaleType(ScaleType.CENTER_INSIDE);
        checkableImageButton.setBackgroundResource(0);
        checkableImageButton.setPadding(0, 0, 0, 0);
        checkableImageButton.setFocusable(false);
        return checkableImageButton;
    }

    private static uva a(Context context, Drawable drawable) {
        uva uva = new uva(drawable, 0.6f);
        uva.b(fr.b(context, (int) R.color.cat_button_border));
        uva.a((float) uts.b(2.0f, context.getResources()));
        return uva;
    }
}
