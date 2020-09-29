package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.state.ContentTypeChangeListener;
import com.spotify.mobile.android.state.ContentTypeChangeListener.ContentType;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: jgv reason: default package */
public final class jgv implements PlayerStateObserver {
    private ContentType a = ContentType.DEFAULT;
    private final ContentTypeChangeListener b;

    jgv(ContentTypeChangeListener contentTypeChangeListener) {
        this.b = contentTypeChangeListener;
    }

    public final void onPlayerStateReceived(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        Optional b2 = track != null ? Optional.b(track.uri()) : Optional.e();
        if (b2.b()) {
            ContentType contentType = jst.a((String) b2.c()).b == LinkType.SHOW_EPISODE ? ContentType.SPEECH : ContentType.DEFAULT;
            if (this.a != contentType) {
                this.a = contentType;
                this.b.a(this.a);
            }
        }
    }
}
