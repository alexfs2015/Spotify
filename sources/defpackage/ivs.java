package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: ivs reason: default package */
public final class ivs {
    public static Uri a(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return Uri.EMPTY;
        }
        String a = jvs.a(playerTrack, "image_large_url");
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
        String a = jvs.a(playerTrack, "image_xlarge_url");
        Uri parse = !TextUtils.isEmpty(a) ? Uri.parse(a) : Uri.EMPTY;
        if (!Uri.EMPTY.equals(parse)) {
            return parse;
        }
        return a(playerTrack);
    }
}
