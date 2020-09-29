package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;

/* renamed from: tmn reason: default package */
final class tmn {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final PlayerState g;

    tmn(PlayerState playerState) {
        this.g = playerState;
        String str = "";
        this.a = (String) jvi.a(playerState.playOrigin().viewUri(), str);
        this.b = playerState.entityUri();
        boolean z = true;
        boolean z2 = !fbo.a((String) jvi.a(jya.a(playerState, Metadata.MFT_INJECTION_SOURCE), str));
        PlayerTrack track = playerState.track();
        if (track == null || !track.metadata().containsKey("is_queued")) {
            z = false;
        }
        this.c = (z2 || z) ? str : this.b;
        this.e = jya.a(playerState, "album_title");
        this.f = jya.a(playerState, "artist_name");
        this.d = (String) jvi.a(playerState.contextMetadata().get("context_description"), str);
    }

    /* access modifiers changed from: 0000 */
    public tmm a(tmr tmr, tmr tmr2) {
        return new tmm(tmr, tmr2, this.b, this.c);
    }

    /* access modifiers changed from: 0000 */
    public tmm a(tmr tmr, tmr tmr2, String str) {
        return new tmm(tmr, tmr2, this.b, str);
    }
}
