package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.canvas.model.CanvasContentType;

/* renamed from: kuq reason: default package */
public final class kuq {
    public static kup a(PlayerTrack playerTrack) {
        String str = (String) playerTrack.metadata().get("canvas.type");
        if (str == null) {
            return null;
        }
        kuo kuo = new kuo(playerTrack.uri(), (String) playerTrack.metadata().get("canvas.url"), (String) playerTrack.metadata().get("canvas.fileId"), (String) playerTrack.metadata().get("canvas.id"), CanvasContentType.valueOf(str), (String) playerTrack.metadata().get("canvas.artist.name"), (String) playerTrack.metadata().get("canvas.artist.uri"), fax.c((String) playerTrack.metadata().get("canvas.artist.avatar")));
        return kuo;
    }
}
