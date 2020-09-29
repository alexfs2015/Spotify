package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;

/* renamed from: uao reason: default package */
public final class uao {
    private static final ImmutableMap<Integer, Long> a = ImmutableMap.g().b(Integer.valueOf(R.id.menu_item_sleep_timer_5_mins), Long.valueOf(300000)).b(Integer.valueOf(R.id.menu_item_sleep_timer_10_mins), Long.valueOf(600000)).b(Integer.valueOf(R.id.menu_item_sleep_timer_15_mins), Long.valueOf(900000)).b(Integer.valueOf(R.id.menu_item_sleep_timer_30_mins), Long.valueOf(1800000)).b(Integer.valueOf(R.id.menu_item_sleep_timer_45_mins), Long.valueOf(2700000)).b(Integer.valueOf(R.id.menu_item_sleep_timer_1_hour), Long.valueOf(3600000)).b();

    public static long a(int i) {
        if (a.containsKey(Integer.valueOf(i))) {
            return ((Long) a.get(Integer.valueOf(i))).longValue();
        }
        return -1;
    }
}
