package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: jwz reason: default package */
public final class jwz {
    public static View a(Context context, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconView spotifyIconView = new SpotifyIconView(context);
        spotifyIconView.a(spotifyIconV2);
        spotifyIconView.c(uuu.d(context, R.attr.pasteColorAccessory));
        spotifyIconView.a.a((float) uts.b(24.0f, context.getResources()));
        return spotifyIconView;
    }

    public static ImageButton b(Context context, SpotifyIconV2 spotifyIconV2) {
        return a(context, spotifyIconV2, uuu.d(context, R.attr.pasteColorAccessory));
    }

    public static ImageButton a(Context context) {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context, null, R.attr.pasteButtonStyleBorderlessTransparent);
        stateListAnimatorImageButton.setFocusable(false);
        stateListAnimatorImageButton.setScaleType(ScaleType.CENTER_INSIDE);
        stateListAnimatorImageButton.setPadding(context.getResources().getDimensionPixelSize(R.dimen.quick_action_padding_left), 0, 0, 0);
        stateListAnimatorImageButton.setMinimumWidth(0);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        stateListAnimatorImageButton.setLayoutParams(layoutParams);
        return stateListAnimatorImageButton;
    }

    public static ImageButton a(Context context, SpotifyIconV2 spotifyIconV2, ColorStateList colorStateList) {
        ImageButton a = a(context);
        a.setImageDrawable(b(context, spotifyIconV2, colorStateList));
        return a;
    }

    public static ImageButton a(Context context, Drawable drawable) {
        ImageButton a = a(context);
        a.setImageDrawable(drawable);
        return a;
    }

    public static Drawable c(Context context, SpotifyIconV2 spotifyIconV2) {
        return b(context, spotifyIconV2, uuu.d(context, R.attr.pasteColorAccessory));
    }

    public static Drawable b(Context context, SpotifyIconV2 spotifyIconV2, ColorStateList colorStateList) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) uts.b(24.0f, context.getResources()));
        spotifyIconDrawable.a(colorStateList);
        spotifyIconDrawable.a((float) uts.b(24.0f, context.getResources()));
        return spotifyIconDrawable;
    }
}
