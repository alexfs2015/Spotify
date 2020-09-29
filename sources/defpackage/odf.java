package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import java.util.Map;

/* renamed from: odf reason: default package */
public final class odf {
    static final ImmutableList<NowPlayingMode> a = ImmutableList.a(NowPlayingMode.DRIVING, NowPlayingMode.AUDIO_ADS, NowPlayingMode.VIDEO_ADS, NowPlayingMode.VIDEO_SHOW, NowPlayingMode.PODCAST, NowPlayingMode.FREE_TIER, NowPlayingMode.FEEDBACK, NowPlayingMode.DEFAULT);
    final Map<NowPlayingMode, tml> b;

    public odf(Map<NowPlayingMode, tml> map) {
        this.b = map;
    }
}
