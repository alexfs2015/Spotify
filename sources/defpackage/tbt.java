package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.music.R;

/* renamed from: tbt reason: default package */
final class tbt {
    private static final ImmutableMap<Integer, Integer> a = ImmutableMap.g().b(Integer.valueOf(50), Integer.valueOf(R.string.player_overlay_speed_05x)).b(Integer.valueOf(80), Integer.valueOf(R.string.player_overlay_speed_08x)).b(Integer.valueOf(100), Integer.valueOf(R.string.player_overlay_speed_10x)).b(Integer.valueOf(120), Integer.valueOf(R.string.player_overlay_speed_12x)).b(Integer.valueOf(PlaybackSpeed.PLAYBACK_SPEED_150), Integer.valueOf(R.string.player_overlay_speed_15x)).b(Integer.valueOf(200), Integer.valueOf(R.string.player_overlay_speed_20x)).b(Integer.valueOf(300), Integer.valueOf(R.string.player_overlay_speed_30x)).b();

    static Integer a(Integer num) {
        return (Integer) a.get(num);
    }
}
