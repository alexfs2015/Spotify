package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: rgf reason: default package */
public final class rgf {
    public static Drawable a(Context context, boolean z, boolean z2) {
        if (z) {
            return jwz.b(context, SpotifyIconV2.HEART_ACTIVE, uuu.d(context, R.attr.pasteColorAccessoryGreen));
        }
        if (z2) {
            return jwz.b(context, SpotifyIconV2.BAN_ACTIVE, uuu.d(context, R.attr.pasteColorAccessoryRed));
        }
        return jwz.c(context, SpotifyIconV2.MORE_ANDROID);
    }
}
