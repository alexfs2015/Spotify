package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.canvas.model.CanvasContentType;

/* renamed from: kxz reason: default package */
public final class kxz {
    public static kxy a(PlayerTrack playerTrack) {
        String str = (String) playerTrack.metadata().get("canvas.type");
        if (str == null) {
            return null;
        }
        kxx kxx = new kxx(playerTrack.uri(), (String) playerTrack.metadata().get("canvas.url"), (String) playerTrack.metadata().get("canvas.fileId"), (String) playerTrack.metadata().get("canvas.id"), CanvasContentType.valueOf(str), (String) playerTrack.metadata().get("canvas.artist.name"), (String) playerTrack.metadata().get("canvas.artist.uri"), fbo.c((String) playerTrack.metadata().get("canvas.artist.avatar")));
        return kxx;
    }
}
