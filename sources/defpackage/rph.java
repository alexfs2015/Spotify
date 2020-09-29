package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: rph reason: default package */
public final class rph {
    public static Drawable a(Context context, boolean z, boolean z2) {
        return z ? jyz.b(context, SpotifyIconV2.HEART_ACTIVE, vgl.d(context, R.attr.pasteColorAccessoryGreen)) : z2 ? jyz.b(context, SpotifyIconV2.BAN_ACTIVE, vgl.d(context, R.attr.pasteColorAccessoryRed)) : jyz.c(context, SpotifyIconV2.MORE_ANDROID);
    }
}
