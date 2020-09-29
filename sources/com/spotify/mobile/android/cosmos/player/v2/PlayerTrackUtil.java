package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Map;

public final class PlayerTrackUtil {
    private static final String ARTISTS_KEY_FORMAT = "artist_name:%d";

    private static boolean same(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return playerTrack == playerTrack2;
    }

    private PlayerTrackUtil() {
    }

    public static boolean isAd(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isAdInMetadata(playerTrack.metadata());
    }

    public static boolean isAdInMetadata(Map<String, String> map) {
        return Boolean.valueOf((String) map.get("is_advertisement")).booleanValue();
    }

    public static boolean isPodcastAd(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isPodcastAd(playerTrack.metadata());
    }

    public static boolean isPodcastAd(Map<String, String> map) {
        return Boolean.valueOf((String) map.get(Metadata.IS_PODCAST_ADVERTISEMENT)).booleanValue();
    }

    public static boolean isInterruptionFromAds(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isInterruptionFromAds(playerTrack.uri(), playerTrack.metadata());
    }

    public static boolean isInterruptionFromAds(String str, Map<String, String> map) {
        return str != null && InterruptionUtil.isInterruptionUri(str) && hasAdId(map);
    }

    public static boolean hasAdId(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return hasAdId(playerTrack.metadata());
    }

    public static boolean hasAdId(Map<String, String> map) {
        return !fax.a((String) map.get("ad_id"));
    }

    public static String getAdId(PlayerTrack playerTrack) {
        return getAdId(playerTrack.metadata());
    }

    public static String getAdId(Map<String, String> map) {
        return (String) map.get("ad_id");
    }

    public static boolean hasManifestId(Map<String, String> map) {
        return !fax.a((String) map.get("media.manifest_id"));
    }

    public static boolean isVideo(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return "video".equals((String) playerTrack.metadata().get("media.type"));
    }

    public static boolean isExplicit(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return Boolean.parseBoolean((String) playerTrack.metadata().get("is_explicit"));
    }

    public static String getMediaType(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return null;
        }
        return (String) playerTrack.metadata().get("media.type");
    }

    public static String getTitle(PlayerTrack playerTrack) {
        String str = (String) playerTrack.metadata().get("title");
        return str != null ? str : "";
    }

    public static String getArtists(PlayerTrack playerTrack) {
        fay.a(playerTrack);
        ArrayDeque arrayDeque = new ArrayDeque();
        String str = (String) playerTrack.metadata().get("artist_name");
        int i = 1;
        while (str != null) {
            arrayDeque.add(str);
            str = (String) playerTrack.metadata().get(String.format(Locale.getDefault(), ARTISTS_KEY_FORMAT, new Object[]{Integer.valueOf(i)}));
            i++;
        }
        return fau.a(", ").a((Iterable<?>) arrayDeque);
    }

    public static int getArtistsCount(PlayerTrack playerTrack) {
        fay.a(playerTrack);
        String str = (String) playerTrack.metadata().get("artist_name");
        int i = 1;
        while (str != null) {
            str = (String) playerTrack.metadata().get(String.format(Locale.getDefault(), ARTISTS_KEY_FORMAT, new Object[]{Integer.valueOf(i)}));
            i++;
        }
        return i - 1;
    }

    public static boolean isSuggestedTrack(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        String str = (String) playerTrack.metadata().get(Metadata.MFT_INJECTION_SOURCE);
        if (str == null || !str.trim().toLowerCase(Locale.ENGLISH).equals("fallback")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (defpackage.faw.a(r1.metadata().get(r0), r2.metadata().get(r0)) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean areTitlesEqual(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2) {
        /*
            boolean r0 = same(r1, r2)
            if (r0 != 0) goto L_0x0025
            if (r1 == 0) goto L_0x0023
            if (r2 == 0) goto L_0x0023
            java.util.Map r1 = r1.metadata()
            java.lang.String r0 = "title"
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r2 = r2.metadata()
            java.lang.Object r2 = r2.get(r0)
            boolean r1 = defpackage.faw.a(r1, r2)
            if (r1 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            return r1
        L_0x0025:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil.areTitlesEqual(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack):boolean");
    }

    public static boolean areUidsEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return same(playerTrack, playerTrack2) || !(playerTrack == null || playerTrack2 == null || (!canUseUids(playerTrack, playerTrack2) ? !playerTrack.uri().equals(playerTrack2.uri()) : !playerTrack.uid().equals(playerTrack2.uid())));
    }

    public static boolean areUidsOrUrisEqual(PlayerTrack playerTrack, String str, String str2) {
        return playerTrack != null && ((playerTrack.uid() != null && playerTrack.uid().equals(str)) || (playerTrack.uri() != null && playerTrack.uri().equals(str2)));
    }

    public static boolean areTracksEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return areUidsEqual(playerTrack, playerTrack2) && areTitlesEqual(playerTrack, playerTrack2);
    }

    public static boolean areUrisEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return same(playerTrack, playerTrack2) || !(playerTrack == null || playerTrack2 == null || !faw.a(playerTrack.uri(), playerTrack2.uri()));
    }

    private static boolean canUseUids(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return !fax.a(playerTrack.uid()) && !fax.a(playerTrack2.uid());
    }

    public static boolean hasIncompleteMetadata(PlayerTrack playerTrack) {
        return playerTrack != null && playerTrack.metadata().get("title") == null;
    }

    public static boolean hasDuration(PlayerTrack playerTrack) {
        return playerTrack != null && playerTrack.metadata().containsKey("duration");
    }

    public static long getDuration(PlayerTrack playerTrack) {
        String str = playerTrack != null ? (String) playerTrack.metadata().get("duration") : null;
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return Long.parseLong(str);
    }

    public static long getDuration(Map<String, String> map) {
        String str = (String) map.get("duration");
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return Long.parseLong(str);
    }
}
