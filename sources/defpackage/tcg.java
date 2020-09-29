package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;

/* renamed from: tcg reason: default package */
final class tcg {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final PlayerState g;

    tcg(PlayerState playerState) {
        this.g = playerState;
        String str = "";
        this.a = (String) jtc.a(playerState.playOrigin().viewUri(), str);
        this.b = playerState.entityUri();
        boolean z = true;
        boolean z2 = !fax.a((String) jtc.a(jvs.a(playerState, Metadata.MFT_INJECTION_SOURCE), str));
        PlayerTrack track = playerState.track();
        if (track == null || !track.metadata().containsKey("is_queued")) {
            z = false;
        }
        this.c = (z2 || z) ? str : this.b;
        this.e = jvs.a(playerState, "album_title");
        this.f = jvs.a(playerState, "artist_name");
        this.d = (String) jtc.a(playerState.contextMetadata().get("context_description"), str);
    }

    /* access modifiers changed from: 0000 */
    public tcf a(tck tck, tck tck2) {
        return new tcf(tck, tck2, this.b, this.c);
    }

    /* access modifiers changed from: 0000 */
    public tcf a(tck tck, tck tck2, String str) {
        return new tcf(tck, tck2, this.b, str);
    }
}
