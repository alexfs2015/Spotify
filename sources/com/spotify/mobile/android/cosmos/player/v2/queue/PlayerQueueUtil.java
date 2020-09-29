package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PlayerQueueUtil {
    private static final Pattern DELIMITER_PATTERN = Pattern.compile("spotify:delimiter|spotify:meta:.*", 2);
    private static final String FORCE_REMOVE_REASONS = "force_remove_reasons";
    private static final String QUEUE = "queue";
    static final String SPOTIFY_DELIMITER_V1 = "spotify:delimiter";
    private static final String SPOTIFY_METADATA_MARKER = "spotify:meta:.*";
    static final String SPOTIFY_META_DELIMITER = "spotify:meta:delimiter";

    public PlayerQueue removeNextTracks(PlayerQueue playerQueue, Collection<PlayerTrack> collection) {
        PlayerTrack[] nextTracks;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PlayerTrack playerTrack : playerQueue.nextTracks()) {
            linkedHashMap.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack), playerTrack);
        }
        for (PlayerTrack globallyUniqueUid : collection) {
            linkedHashMap.remove(PlayTrackQueueUtils.getGloballyUniqueUid(globallyUniqueUid));
        }
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) linkedHashMap.values().toArray(new PlayerTrack[0]), playerQueue.prevTracks());
    }

    public PlayerQueue addNextTracks(PlayerQueue playerQueue, Collection<PlayerTrack> collection) {
        PlayerTrack[] nextTracks = playerQueue.nextTracks();
        ArrayList arrayList = new ArrayList();
        ArrayList<PlayerTrack> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        for (PlayerTrack playerTrack : nextTracks) {
            if (Boolean.valueOf((String) playerTrack.metadata().get("is_queued")).booleanValue()) {
                arrayList.add(playerTrack);
            } else {
                if (collection.contains(playerTrack)) {
                    arrayList2.add(playerTrack);
                    collection.remove(playerTrack);
                }
                arrayList3.add(playerTrack);
            }
        }
        for (PlayerTrack playerTrack2 : collection) {
            if (!isDelimiter(playerTrack2)) {
                arrayList2.add(playerTrack2);
            }
        }
        for (PlayerTrack queuedExplicitly : arrayList2) {
            arrayList.add(queuedExplicitly(queuedExplicitly, true));
        }
        arrayList.addAll(arrayList3);
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]), playerQueue.prevTracks());
    }

    public PlayerQueue moveTracks(PlayerQueue playerQueue, int i, int i2, boolean z) {
        int queuePosition = toQueuePosition(playerQueue, i);
        int queuePosition2 = toQueuePosition(playerQueue, i2);
        ArrayList arrayList = new ArrayList(Arrays.asList(playerQueue.nextTracks()));
        PlayerTrack playerTrack = (PlayerTrack) arrayList.remove(queuePosition);
        if (isQueued(playerTrack) && !z) {
            PlayerTrack playerTrack2 = new PlayerTrack(playerTrack.uri(), playerTrack.uid(), (String) playerTrack.metadata().get("album_uri"), (String) playerTrack.metadata().get("artist_uri"), null, playerTrack.metadata());
            playerTrack = playerTrack2;
        }
        arrayList.add(queuePosition2, queuedExplicitly(playerTrack, z));
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]), playerQueue.prevTracks());
    }

    public int toQueuePosition(PlayerQueue playerQueue, int i) {
        if (playerQueue.track() != null) {
            i -= 2;
        }
        PlayerTrack[] nextTracks = playerQueue.nextTracks();
        if (nextTracks.length > 0) {
            int i2 = 0;
            if (i <= 0) {
                return 0;
            }
            boolean z = false;
            boolean z2 = false;
            while (i2 < i && i2 < nextTracks.length) {
                if (isDelimiter(nextTracks[i2])) {
                    i++;
                }
                boolean isQueued = isQueued(nextTracks[i2]);
                if (!z && isQueued) {
                    i--;
                    z = true;
                } else if (!z2 && !isQueued) {
                    i--;
                    z2 = true;
                }
                i2++;
            }
        }
        return i;
    }

    public static boolean isQueued(PlayerTrack playerTrack) {
        return Boolean.valueOf((String) playerTrack.metadata().get("is_queued")).booleanValue();
    }

    public static boolean isDelimiter(PlayerTrack playerTrack) {
        return DELIMITER_PATTERN.matcher(playerTrack.uri()).matches();
    }

    public static boolean isExplicitlyQueued(PlayerTrack playerTrack) {
        return QUEUE.equalsIgnoreCase(playerTrack.provider());
    }

    public static boolean isForceRemoved(PlayerTrack playerTrack) {
        return playerTrack.metadata().containsKey(FORCE_REMOVE_REASONS);
    }

    public PlayerTrack queuedExplicitly(PlayerTrack playerTrack, boolean z) {
        String str;
        if (z == isQueued(playerTrack)) {
            return playerTrack;
        }
        String str2 = (String) playerTrack.metadata().get("album_uri");
        String str3 = (String) playerTrack.metadata().get("artist_uri");
        HashMap hashMap = new HashMap(playerTrack.metadata());
        String uid = playerTrack.uid();
        String str4 = "is_queued";
        if (z) {
            hashMap.put(str4, Boolean.toString(true));
            str = "";
        } else {
            hashMap.remove(str4);
            str = uid;
        }
        return PlayerTrack.create(playerTrack.uri(), str, str2, str3, playerTrack.provider(), ImmutableMap.a((Map<? extends K, ? extends V>) hashMap));
    }
}
