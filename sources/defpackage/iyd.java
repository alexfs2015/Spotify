package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: iyd reason: default package */
public final class iyd {
    public static Uri a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return Uri.EMPTY;
        }
        String a = jya.a(playerTrack, "image_large_url");
        Uri parse = !TextUtils.isEmpty(a) ? Uri.parse(a) : Uri.EMPTY;
        if (!Uri.EMPTY.equals(parse)) {
            return parse;
        }
        String str = (String) playerTrack.metadata().get("image_url");
        return !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY;
    }

    public static Uri b(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return Uri.EMPTY;
        }
        String a = jya.a(playerTrack, "image_xlarge_url");
        Uri parse = !TextUtils.isEmpty(a) ? Uri.parse(a) : Uri.EMPTY;
        return !Uri.EMPTY.equals(parse) ? parse : a(playerTrack);
    }
}
