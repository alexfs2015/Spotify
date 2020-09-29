package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.playlist.formatlisttype.FormatListType;

/* renamed from: tld reason: default package */
public final class tld implements fbq<PlayerState> {
    private final tvn a;

    public tld(tvn tvn) {
        this.a = tvn;
    }

    /* renamed from: a */
    public final boolean apply(PlayerState playerState) {
        FormatListType a2 = this.a.a((String) playerState.contextMetadata().get(Metadata.FORMAT_LIST_TYPE));
        return a2 == FormatListType.P2S || a2 == FormatListType.EDITORIAL;
    }
}
