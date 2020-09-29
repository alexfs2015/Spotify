package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Map;

public final class PlayerTrackUtil {
    private static final String ARTISTS_KEY_FORMAT = "artist_name:%d";

    private PlayerTrackUtil() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (defpackage.fbn.a(r2.metadata().get(r0), r3.metadata().get(r0)) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean areTitlesEqual(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r3) {
        /*
            boolean r0 = same(r2, r3)
            r1 = 7
            if (r0 != 0) goto L_0x0032
            r1 = 6
            if (r2 == 0) goto L_0x002f
            r1 = 7
            if (r3 == 0) goto L_0x002f
            r1 = 4
            java.util.Map r2 = r2.metadata()
            r1 = 0
            java.lang.String r0 = "tiset"
            java.lang.String r0 = "title"
            r1 = 6
            java.lang.Object r2 = r2.get(r0)
            r1 = 2
            java.util.Map r3 = r3.metadata()
            r1 = 1
            java.lang.Object r3 = r3.get(r0)
            r1 = 7
            boolean r2 = defpackage.fbn.a(r2, r3)
            r1 = 7
            if (r2 == 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r2 = 0
            r1 = 1
            return r2
        L_0x0032:
            r1 = 7
            r2 = 1
            r1 = 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil.areTitlesEqual(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack):boolean");
    }

    public static boolean areTracksEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return areUidsEqual(playerTrack, playerTrack2) && areTitlesEqual(playerTrack, playerTrack2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r2.uid().equals(r3.uid()) != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean areUidsEqual(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r2, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r3) {
        /*
            r1 = 4
            boolean r0 = same(r2, r3)
            r1 = 0
            if (r0 != 0) goto L_0x003e
            r1 = 6
            if (r2 == 0) goto L_0x003b
            r1 = 6
            if (r3 == 0) goto L_0x003b
            r1 = 0
            boolean r0 = canUseUids(r2, r3)
            r1 = 7
            if (r0 == 0) goto L_0x0027
            java.lang.String r2 = r2.uid()
            java.lang.String r3 = r3.uid()
            r1 = 5
            boolean r2 = r2.equals(r3)
            r1 = 6
            if (r2 == 0) goto L_0x003b
            goto L_0x003e
        L_0x0027:
            r1 = 1
            java.lang.String r2 = r2.uri()
            r1 = 3
            java.lang.String r3 = r3.uri()
            r1 = 6
            boolean r2 = r2.equals(r3)
            r1 = 1
            if (r2 == 0) goto L_0x003b
            r1 = 4
            goto L_0x003e
        L_0x003b:
            r1 = 4
            r2 = 0
            return r2
        L_0x003e:
            r1 = 5
            r2 = 1
            r1 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil.areUidsEqual(com.spotify.mobile.android.cosmos.player.v2.PlayerTrack, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack):boolean");
    }

    public static boolean areUidsOrUrisEqual(PlayerTrack playerTrack, String str, String str2) {
        return playerTrack != null && ((playerTrack.uid() != null && playerTrack.uid().equals(str)) || (playerTrack.uri() != null && playerTrack.uri().equals(str2)));
    }

    public static boolean areUrisEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        if (!same(playerTrack, playerTrack2)) {
            if (playerTrack == null || playerTrack2 == null || !fbn.a(playerTrack.uri(), playerTrack2.uri())) {
                return false;
            }
        }
        return true;
    }

    private static boolean canUseUids(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return !fbo.a(playerTrack.uid()) && !fbo.a(playerTrack2.uid());
    }

    public static String getAdId(PlayerTrack playerTrack) {
        return getAdId(playerTrack.metadata());
    }

    public static String getAdId(Map<String, String> map) {
        return (String) map.get("ad_id");
    }

    public static String getArtists(PlayerTrack playerTrack) {
        fbp.a(playerTrack);
        ArrayDeque arrayDeque = new ArrayDeque();
        String str = (String) playerTrack.metadata().get("artist_name");
        int i = 1;
        while (str != null) {
            arrayDeque.add(str);
            str = (String) playerTrack.metadata().get(String.format(Locale.getDefault(), ARTISTS_KEY_FORMAT, new Object[]{Integer.valueOf(i)}));
            i++;
        }
        String str2 = ", ";
        return fbl.a(", ").a((Iterable<?>) arrayDeque);
    }

    public static int getArtistsCount(PlayerTrack playerTrack) {
        fbp.a(playerTrack);
        String str = "n_rmttaisae";
        String str2 = (String) playerTrack.metadata().get("artist_name");
        int i = 1;
        while (str2 != null) {
            String str3 = "imatoseat:_%dr";
            str2 = (String) playerTrack.metadata().get(String.format(Locale.getDefault(), ARTISTS_KEY_FORMAT, new Object[]{Integer.valueOf(i)}));
            i++;
        }
        return i - 1;
    }

    public static long getDuration(PlayerTrack playerTrack) {
        String str;
        if (playerTrack != null) {
            String str2 = "itndobra";
            str = (String) playerTrack.metadata().get("duration");
        } else {
            str = null;
        }
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return Long.parseLong(str);
    }

    public static long getDuration(Map<String, String> map) {
        String str = "raodunbt";
        String str2 = (String) map.get("duration");
        if (str2 == null || str2.isEmpty()) {
            return -1;
        }
        return Long.parseLong(str2);
    }

    public static String getMediaType(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return null;
        }
        return (String) playerTrack.metadata().get("media.type");
    }

    public static String getTitle(PlayerTrack playerTrack) {
        String str = "tttie";
        String str2 = (String) playerTrack.metadata().get("title");
        if (str2 != null) {
            return str2;
        }
        String str3 = "";
        return "";
    }

    public static boolean hasAdId(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return hasAdId(playerTrack.metadata());
    }

    public static boolean hasAdId(Map<String, String> map) {
        String str = "adipd";
        return !fbo.a((String) map.get("ad_id"));
    }

    public static boolean hasDuration(PlayerTrack playerTrack) {
        return playerTrack != null && playerTrack.metadata().containsKey("duration");
    }

    public static boolean hasIncompleteMetadata(PlayerTrack playerTrack) {
        if (playerTrack != null) {
            String str = "ttelt";
            if (playerTrack.metadata().get("title") == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasManifestId(Map<String, String> map) {
        String str = "disndsamim.ee_ifa";
        return !fbo.a((String) map.get("media.manifest_id"));
    }

    public static boolean isAd(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isAdInMetadata(playerTrack.metadata());
    }

    public static boolean isAdInMetadata(Map<String, String> map) {
        String str = "es_mrvtieniadsmt";
        return Boolean.valueOf((String) map.get("is_advertisement")).booleanValue();
    }

    public static boolean isExplicit(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return Boolean.parseBoolean((String) playerTrack.metadata().get("is_explicit"));
    }

    public static boolean isInterruptionFromAds(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isInterruptionFromAds(playerTrack.uri(), playerTrack.metadata());
    }

    public static boolean isInterruptionFromAds(String str, Map<String, String> map) {
        if (str == null) {
            return false;
        }
        return InterruptionUtil.isInterruptionUri(str) && hasAdId(map);
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

    public static boolean isSuggestedTrack(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        String str = "erf_ounicmneict.tojs";
        String str2 = (String) playerTrack.metadata().get(Metadata.MFT_INJECTION_SOURCE);
        if (str2 != null) {
            String str3 = "kaclbbfa";
            if (str2.trim().toLowerCase(Locale.ENGLISH).equals("fallback")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVideo(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        String str = "eept.abidy";
        String str2 = "detiv";
        return "video".equals((String) playerTrack.metadata().get("media.type"));
    }

    private static boolean same(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return playerTrack == playerTrack2;
    }
}
