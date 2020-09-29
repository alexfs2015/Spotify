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

/* renamed from: rlk reason: default package */
public final class rlk {
    public static View a(Context context) {
        CheckableImageButton b = b(context);
        b.setId(R.id.follow_button);
        return b;
    }

    private static vgr a(Context context, Drawable drawable) {
        vgr vgr = new vgr(drawable, 0.6f);
        vgr.b(fr.b(context, (int) R.color.cat_button_border));
        vgr.a((float) vfj.b(2.0f, context.getResources()));
        return vgr;
    }

    private static CheckableImageButton b(Context context) {
        int b = vfj.b(26.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.ADDFOLLOW_32);
        spotifyIconDrawable.a(vgl.b(context, R.attr.pasteColorAccessory));
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIcon.CHECK_32);
        spotifyIconDrawable2.a(fr.c(context, R.color.white));
        vgr a = a(context, spotifyIconDrawable);
        vgr a2 = a(context, spotifyIconDrawable2);
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
}
