package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.autoplay.RadioSeedBundle;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.functions.Function;

/* renamed from: krb reason: default package */
final class krb implements Function<PlayerState, RadioSeedBundle> {
    public final /* synthetic */ Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        String contextUri = playerState.contextUri();
        if (ViewUris.bi.b(contextUri) || ViewUris.bh.b(contextUri)) {
            int indexOf = contextUri.indexOf(":collection:") + 12;
            StringBuilder sb = new StringBuilder("spotify:");
            sb.append(contextUri.substring(indexOf));
            return RadioSeedBundle.create(sb.toString(), (String) fay.a(playerState.playbackId()), playerState.playOrigin());
        } else if (ViewUris.ag.b(contextUri) || ViewUris.bc.b(contextUri)) {
            return RadioSeedBundle.create(((PlayerTrack) fay.a(playerState.track())).uri(), (String) fay.a(playerState.playbackId()), playerState.playOrigin());
        } else {
            return RadioSeedBundle.create(contextUri, (String) fay.a(playerState.playbackId()), playerState.playOrigin());
        }
    }

    krb() {
    }
}
