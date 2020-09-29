package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import io.reactivex.Single;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: jxt reason: default package */
public final class jxt {
    private static final wlx a = wlx.e("https://storage.googleapis.com");

    /* renamed from: jxt$a */
    interface a {
        @wti(a = "evn/{id}")
        Single<jxs> a(@wtv(a = "id") String str);
    }

    public static Single<PlayerContext> a(String str, jxs jxs, ghm ghm) {
        return ((a) ghm.a(a.class, a)).a(str).c(jxs).f(new $$Lambda$jxt$hztiVBiyeg4DU3zEoVYZwuQ90E(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PlayerContext a(String str, jxs jxs) {
        String str2 = str;
        jxs jxs2 = jxs;
        String replace = jxs2.b.replace("{eventid}", str2).replace("{format}", "");
        String str3 = jxs2.a;
        StringBuilder sb = new StringBuilder("[{\"url\": \"");
        sb.append(replace);
        sb.append("\",\"mimeType\": \"video/mp4\",\"bitrate\": 216000}]");
        ImmutableMap a2 = ImmutableMap.a("title", str3, "media.type", "video", Metadata.IS_BACKGROUNDABLE, "true", Metadata.MEDIA_LIVE, "true", Metadata.MEDIA_MANIFEST, sb.toString());
        StringBuilder sb2 = new StringBuilder("spotify:live:");
        sb2.append(str2);
        PlayerTrack create = PlayerTrack.create(sb2.toString(), a2);
        StringBuilder sb3 = new StringBuilder("spotify:playlist:");
        sb3.append(str2);
        String sb4 = sb3.toString();
        PlayerTrack[] playerTrackArr = {create};
        HashSet hashSet = r1;
        HashSet hashSet2 = r1;
        HashSet hashSet3 = r1;
        HashSet hashSet4 = r1;
        HashSet hashSet5 = r1;
        HashSet hashSet6 = new HashSet(Collections.singletonList("live"));
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(hashSet, hashSet5, hashSet2, hashSet3, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), hashSet4, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        return PlayerContext.create(sb4, playerTrackArr, playerRestrictions, Collections.emptyMap());
    }
}
