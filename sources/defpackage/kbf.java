package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Sets;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.exo.model.Profile;
import com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: kbf reason: default package */
public final class kbf implements a<kbe> {
    private static final Set<String> b = Sets.a((E[]) new String[]{"video/mp2t", "audio/mp2t"});
    private final kbn a;
    private final ObjectMapper c;
    private final HashMap<Integer, asc> d = new HashMap<>();

    public kbf(rnf rnf, kbn kbn) {
        this.a = kbn;
        this.c = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    private static List<kav> a(SpotifyJsonManifest spotifyJsonManifest, a aVar) {
        ArrayList arrayList;
        jyi jyi;
        SpotifyJsonManifest spotifyJsonManifest2 = spotifyJsonManifest;
        a aVar2 = aVar;
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        if (spotifyJsonManifest2.subtitleLanguageCodes == null || spotifyJsonManifest2.subtitleLanguageCodes.length == 0 || spotifyJsonManifest2.subtitleBaseUrls == null || spotifyJsonManifest2.subtitleBaseUrls.length == 0 || TextUtils.isEmpty(spotifyJsonManifest2.subtitleTemplate)) {
            aVar2.a(null, Collections.emptyList());
            return arrayList2;
        }
        List asList = Arrays.asList(spotifyJsonManifest2.subtitleBaseUrls);
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        while (i2 < spotifyJsonManifest2.subtitleLanguageCodes.length) {
            String str = spotifyJsonManifest2.subtitleLanguageCodes[i2];
            String[] split = str.split("-x-");
            if (split.length == i) {
                jyi = new jyi(str, false);
            } else {
                jyi = new jyi(split[0], "cc".equals(split[i]));
            }
            arrayList3.add(jyi);
            aqe a2 = aqe.a(jyi.a(), "text/vtt", "", 0, 0, jyi.a(), (asc) null, 0);
            String replace = spotifyJsonManifest2.subtitleTemplate.replace("{{language_code}}", jyi.a());
            kav kav = r6;
            ArrayList arrayList4 = arrayList3;
            int i3 = i2;
            kav kav2 = new kav((long) i2, a2, 3, asList, replace, replace, spotifyJsonManifest2.contents[0].endTimeMs / 1000, spotifyJsonManifest2.contents[0].endTimeMs);
            arrayList2.add(kav);
            i2 = i3 + 1;
            arrayList3 = arrayList4;
            i = 1;
        }
        ArrayList arrayList5 = arrayList3;
        if (!arrayList5.isEmpty()) {
            arrayList = arrayList5;
            arrayList.add(0, jyi.a);
        } else {
            arrayList = arrayList5;
        }
        aVar2.a(spotifyJsonManifest2.subtitleTemplate, arrayList);
        return arrayList2;
    }

    public static boolean a(String str) {
        return bdg.c(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    private static String a(String str, String str2) {
        if (bdg.a(str)) {
            return bdg.e(str2);
        }
        if (bdg.b(str)) {
            return bdg.d(str2);
        }
        if (a(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if ("stpp".equals(str2)) {
                return "application/ttml+xml";
            }
            if ("wvtt".equals(str2)) {
                return "application/x-mp4-vtt";
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public final /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        SpotifyJsonManifest spotifyJsonManifest;
        SpotifyJsonManifest spotifyJsonManifest2;
        a aVar;
        ArrayList arrayList;
        int i;
        Profile[] profileArr;
        int i2;
        ArrayList arrayList2;
        aqe aqe;
        SpotifyJsonManifest spotifyJsonManifest3 = (SpotifyJsonManifest) this.c.readValue(inputStream, SpotifyJsonManifest.class);
        a aVar2 = new a();
        if (!(spotifyJsonManifest3.contents[0].encryptionInfos == null || spotifyJsonManifest3.contents[0].encryptionInfos.length == 0)) {
            aVar2.d = true;
            for (int i3 = 0; i3 < spotifyJsonManifest3.contents[0].encryptionInfos.length; i3++) {
                if ("widevine".equals(spotifyJsonManifest3.contents[0].encryptionInfos[i3].keySystem)) {
                    this.d.put(Integer.valueOf(i3), new asc("cenc", new a(DrmUtil.a, "video/mp4", Base64.decode(spotifyJsonManifest3.contents[0].encryptionInfos[i3].encryptionData, 0))));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        List asList = Arrays.asList(spotifyJsonManifest3.baseUrls);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Profile[] profileArr2 = spotifyJsonManifest3.contents[0].profiles;
        int length = profileArr2.length;
        int i4 = 0;
        while (i4 < length) {
            Profile profile = profileArr2[i4];
            if (b.contains(profile.mimeType) || ((profile.videoCodec == null && profile.audioCodec == null) || (profile.encryptionIndex != null && !this.d.containsKey(profile.encryptionIndex)))) {
                spotifyJsonManifest2 = spotifyJsonManifest3;
                aVar = aVar2;
                profileArr = profileArr2;
                i = length;
                arrayList = arrayList3;
            } else {
                if (profile.videoCodec != null) {
                    String a2 = a(profile.mimeType, profile.videoCodec);
                    aqe = aqe.a(String.valueOf(profile.id), profile.mimeType, a2, profile.videoCodec, profile.videoBitrate, profile.videoWidth, profile.videoHeight, -1.0f, null, 0);
                    arrayList2 = arrayList5;
                    i2 = 2;
                } else {
                    String a3 = a(profile.mimeType, profile.audioCodec);
                    aqe = aqe.a(String.valueOf(profile.id), profile.mimeType, a3, profile.audioCodec, profile.audioBitrate, -1, -1, null, 0, (String) null);
                    arrayList2 = arrayList4;
                    i2 = 1;
                }
                if (profile.encryptionIndex != null) {
                    aqe = aqe.a((asc) this.d.get(profile.encryptionIndex));
                }
                aqe aqe2 = aqe;
                String str = "{{file_type}}";
                String replace = spotifyJsonManifest3.initializationTemplate.replace(str, profile.fileType);
                String replace2 = spotifyJsonManifest3.segmentTemplate.replace(str, profile.fileType);
                long j = profile.id;
                profileArr = profileArr2;
                i = length;
                arrayList = arrayList3;
                aVar = aVar2;
                spotifyJsonManifest2 = spotifyJsonManifest3;
                kav kav = new kav(j, aqe2, i2, asList, replace, replace2, spotifyJsonManifest3.contents[0].segmentLength, spotifyJsonManifest3.contents[0].endTimeMs - spotifyJsonManifest3.contents[0].startTimeMs);
                arrayList2.add(kav);
            }
            i4++;
            profileArr2 = profileArr;
            length = i;
            arrayList3 = arrayList;
            aVar2 = aVar;
            spotifyJsonManifest3 = spotifyJsonManifest2;
        }
        SpotifyJsonManifest spotifyJsonManifest4 = spotifyJsonManifest3;
        a aVar3 = aVar2;
        ArrayList arrayList6 = arrayList3;
        arrayList6.add(new kaw(2, arrayList5));
        arrayList6.add(new kaw(1, arrayList4));
        a aVar4 = aVar3;
        if (this.a.c()) {
            spotifyJsonManifest = spotifyJsonManifest4;
            List a4 = a(spotifyJsonManifest, aVar4);
            if (!a4.isEmpty()) {
                arrayList6.add(new kaw(3, a4));
            }
        } else {
            spotifyJsonManifest = spotifyJsonManifest4;
        }
        kao kao = new kao(spotifyJsonManifest.contents[0].segmentLength, spotifyJsonManifest.contents[0].startTimeMs, spotifyJsonManifest.contents[0].endTimeMs, arrayList6);
        aVar4.a.add(kao);
        if (!(spotifyJsonManifest.spritemapBaseUrls == null || spotifyJsonManifest.spritemapBaseUrls.length == 0 || spotifyJsonManifest.spriteMaps == null || spotifyJsonManifest.spriteMaps.length == 0 || TextUtils.isEmpty(spotifyJsonManifest.spritemapTemplate))) {
            String str2 = spotifyJsonManifest.spritemapBaseUrls[0];
            String str3 = spotifyJsonManifest.spritemapTemplate;
            int i5 = spotifyJsonManifest.spriteMaps[0].id;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3.replace("{{spritemap_id}}", String.valueOf(i5)));
            aVar4.b = new kca(sb.toString(), spotifyJsonManifest.spriteMaps[0].cellWidth, spotifyJsonManifest.spriteMaps[0].cellHeight);
        }
        kbe kbe = new kbe(aVar4.a, aVar4.b, aVar4.c, aVar4.d, 0);
        return kbe;
    }
}
