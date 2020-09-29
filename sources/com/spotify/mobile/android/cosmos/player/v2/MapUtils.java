package com.spotify.mobile.android.cosmos.player.v2;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

final class MapUtils {
    private MapUtils() {
    }

    public static <K, V> boolean areMapsEqual(Map<K, V> map, Map<K, V> map2) {
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null) {
            return false;
        }
        if (map2 == null) {
            return false;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            if (!fbn.a(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> int hashOfMap(Map<K, V> map) {
        if (map == null) {
            return 0;
        }
        int i = 0;
        for (Entry entry : map.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }
}
