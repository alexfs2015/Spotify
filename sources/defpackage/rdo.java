package defpackage;

import android.content.res.Resources;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: rdo reason: default package */
public final class rdo implements c<gzz, gzz> {
    private final hec a;
    private final Resources b;
    private final rdm c;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, vun.a((wrf<T>) this.a.a()), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$rdo$rNXTkDccj4le2NDyfNCNuGFxvgw<Object,Object,Object>(this));
    }

    rdo(hec hec, Resources resources, rdm rdm) {
        this.a = (hec) fay.a(hec);
        this.b = resources;
        this.c = rdm;
    }

    private gzz a(gzz gzz, gzp gzp) {
        if (gzz == null) {
            return gzz;
        }
        a builder = gzz.toBuilder();
        List body = gzz.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fbx.a((Iterable<E>) body).a((Function<? super E, T>) new $$Lambda$rdo$66F_VUpHRVzGeWcXACCq1V1joHs<Object,T>(this, gzp)).a());
        }
        return builder.a(body).a();
    }

    private gzz b(gzz gzz, gzp gzp) {
        if (gzz == null) {
            return gzz;
        }
        a builder = gzz.toBuilder();
        List body = gzz.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fbx.a((Iterable<E>) body).a((Function<? super E, T>) new $$Lambda$rdo$QA57bXf3JYNcubzjrf1SW45F8rE<Object,T>(this, gzp)).a());
        }
        return builder.a(body).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt c(gzp gzp, gzt gzt) {
        if (!"track-entity-view-header".equals(gzt.id())) {
            return gzt;
        }
        ArrayList arrayList = new ArrayList(gzt.children());
        arrayList.add(hae.builder().a("glue:textRow", "row").a(haf.builder().a(this.b.getString(R.string.free_tier_track_how_can_i_play_this_song_cta)).a()).a("track-entity-view-body_howToPlayButton").a("click", gzp).b("ui:group", "track-entity-view-body-subtext").b("ui:index_in_block", Integer.valueOf(0)).b("ui:source", "play-on-premium").a());
        return gzt.toBuilder().a((List<? extends gzt>) arrayList).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt b(gzp gzp, gzt gzt) {
        if (!"track-entity-view-header".equals(gzt.id())) {
            return gzt;
        }
        a builder = gzt.toBuilder();
        List children = gzt.children();
        if (!children.isEmpty()) {
            children = ImmutableList.a(fbx.a((Iterable<E>) children).a((Function<? super E, T>) new $$Lambda$rdo$9UYTj2kOabK5BS0xIJI0Frpv_c<Object,T>(this, gzp)).a());
        }
        return builder.a(children).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt a(gzp gzp, gzt gzt) {
        if (!"track-entity-view-header_addToPlaylistButton".equals(gzt.id())) {
            return gzt;
        }
        a a2 = gzt.toBuilder().a("track-entity-view-header_playOnPremiumButton").a(haf.builder().a(this.b.getString(R.string.free_tier_track_play_on_premium_cta)).a());
        Map events = gzt.events();
        a g = ImmutableMap.g();
        String str = "click";
        g.b(str, gzp);
        for (Entry entry : events.entrySet()) {
            if (!str.equals(entry.getKey())) {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        return a2.a((Map<String, ? extends gzp>) g.b()).b("ui:group", "track-entity-view-header-play-on-premium").b("ui:index_in_block", Integer.valueOf(1)).b("ui:source", "play-on-premium").a();
    }

    private static gzp a() {
        return gvz.a(ViewUris.aR.toString());
    }

    private static gzp b() {
        return haa.builder().a("inAppPayment").a("uri", "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=track_page&utm_campaign=premium").a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz, fpt fpt) {
        String str = (String) fpt.a(rdl.a);
        String str2 = (String) fpt.a(rdl.b);
        if (!str.equals(str2) && "".equals(str2)) {
            str2 = str;
        }
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 1975765641:
                if (str2.equals("pop_variant_1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1975765642:
                if (str2.equals("pop_variant_2")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1975765643:
                if (str2.equals("pop_variant_3")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1975765644:
                if (str2.equals("pop_variant_4")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return a(gzz, a());
        }
        if (c2 == 1) {
            return a(gzz, b());
        }
        if (c2 == 2) {
            return b(gzz, a());
        }
        if (c2 != 3) {
            return gzz;
        }
        return b(gzz, b());
    }
}
