package defpackage;

import com.google.common.collect.ImmutableBiMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.music.R;

/* renamed from: ucm reason: default package */
public final class ucm {
    private static final ImmutableBiMap<Integer, Integer> a;
    private static final ImmutableBiMap<Integer, Integer> b;

    static {
        ImmutableBiMap<Integer, Integer> a2 = ImmutableBiMap.b().b(Integer.valueOf(50), Integer.valueOf(R.id.menu_item_speed_control_50)).b(Integer.valueOf(80), Integer.valueOf(R.id.menu_item_speed_control_80)).b(Integer.valueOf(100), Integer.valueOf(R.id.menu_item_speed_control_100)).b(Integer.valueOf(120), Integer.valueOf(R.id.menu_item_speed_control_120)).b(Integer.valueOf(PlaybackSpeed.PLAYBACK_SPEED_150), Integer.valueOf(R.id.menu_item_speed_control_150)).b(Integer.valueOf(200), Integer.valueOf(R.id.menu_item_speed_control_200)).b(Integer.valueOf(300), Integer.valueOf(R.id.menu_item_speed_control_300)).b();
        a = a2;
        b = a2.inverse();
    }

    static Integer a(int i) {
        return (Integer) b.get(Integer.valueOf(i));
    }

    static Integer a(Integer num) {
        return (Integer) a.get(num);
    }
}
