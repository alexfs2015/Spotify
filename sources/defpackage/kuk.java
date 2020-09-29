package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.autoplay.RadioSeedBundle;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.functions.Function;

/* renamed from: kuk reason: default package */
final class kuk implements Function<PlayerState, RadioSeedBundle> {
    kuk() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        String contextUri = playerState.contextUri();
        if (!ViewUris.bh.b(contextUri) && !ViewUris.bg.b(contextUri)) {
            return (ViewUris.af.b(contextUri) || ViewUris.bb.b(contextUri)) ? RadioSeedBundle.create(((PlayerTrack) fbp.a(playerState.track())).uri(), (String) fbp.a(playerState.playbackId()), playerState.playOrigin()) : RadioSeedBundle.create(contextUri, (String) fbp.a(playerState.playbackId()), playerState.playOrigin());
        }
        int indexOf = contextUri.indexOf(":collection:") + 12;
        StringBuilder sb = new StringBuilder("spotify:");
        sb.append(contextUri.substring(indexOf));
        return RadioSeedBundle.create(sb.toString(), (String) fbp.a(playerState.playbackId()), playerState.playOrigin());
    }
}
