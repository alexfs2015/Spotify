package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;

/* renamed from: lct reason: default package */
public interface lct {

    /* renamed from: lct$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static HeaderPolicy a() {
            String str = "name";
            String str2 = "username";
            ImmutableMap b = ImmutableMap.g().b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b();
            String str3 = "ownedBySelf";
            String str4 = "formatListAttributes";
            String str5 = "formatListType";
            String str6 = "link";
            String str7 = "containsTracks";
            String str8 = "containsEpisodes";
            String str9 = "containsAudioEpisodes";
            String str10 = "isOnDemandInFree";
            return HeaderPolicy.builder().a(ImmutableMap.g().b("offline", Boolean.TRUE).b(str3, Boolean.TRUE).b(str, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b(str7, Boolean.TRUE).b(str8, Boolean.TRUE).b(str9, Boolean.TRUE).b(str10, Boolean.TRUE).b()).b(b).c(ImmutableMap.g().b(str2, Boolean.TRUE).b()).a();
        }

        public static teb a(tch tch, Resources resources, boolean z, tdx tdx, uxc uxc, HeaderPolicy headerPolicy, rxa rxa, boolean z2) {
            teb teb = new teb(tch, resources, z, tdx, uxc, headerPolicy, rxa, z2);
            return teb;
        }

        public static tdx a(fpt fpt) {
            return new tdx(jsl.c(fpt), jsl.b(fpt));
        }
    }
}
