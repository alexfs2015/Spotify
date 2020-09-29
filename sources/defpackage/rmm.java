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

/* renamed from: rmm reason: default package */
public final class rmm implements c<hcs, hcs> {
    private final hgy a;
    private final Resources b;
    private final rmk c;

    rmm(hgy hgy, Resources resources, rmk rmk) {
        this.a = (hgy) fbp.a(hgy);
        this.b = resources;
        this.c = rmk;
    }

    private static hci a() {
        return gya.a(ViewUris.aQ.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm a(hci hci, hcm hcm) {
        if (!"track-entity-view-header_addToPlaylistButton".equals(hcm.id())) {
            return hcm;
        }
        a a2 = hcm.toBuilder().a("track-entity-view-header_playOnPremiumButton").a(hcy.builder().a(this.b.getString(R.string.free_tier_track_play_on_premium_cta)).a());
        Map events = hcm.events();
        a g = ImmutableMap.g();
        String str = "click";
        g.b(str, hci);
        for (Entry entry : events.entrySet()) {
            if (!str.equals(entry.getKey())) {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        return a2.a((Map<String, ? extends hci>) g.b()).b("ui:group", "track-entity-view-header-play-on-premium").b("ui:index_in_block", Integer.valueOf(1)).b("ui:source", "play-on-premium").a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(hcs hcs, fqn fqn) {
        String str = (String) fqn.a(rmj.a);
        String str2 = (String) fqn.a(rmj.b);
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
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? hcs : b(hcs, b()) : b(hcs, a()) : a(hcs, b()) : a(hcs, a());
    }

    private hcs a(hcs hcs, hci hci) {
        if (hcs == null) {
            return hcs;
        }
        a builder = hcs.toBuilder();
        List body = hcs.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fcp.a((Iterable<E>) body).a((Function<? super E, T>) new $$Lambda$rmm$PLvKp1SK6VXlkunGn5zsVJOBaA<Object,T>(this, hci)).a());
        }
        return builder.a(body).a();
    }

    private static hci b() {
        return hct.builder().a("inAppPayment").a("uri", "https://www.spotify.com/redirect/generic?redirect_key=android_premium&utm_source=spotify&utm_medium=track_page&utm_campaign=premium").a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm b(hci hci, hcm hcm) {
        if (!"track-entity-view-header".equals(hcm.id())) {
            return hcm;
        }
        a builder = hcm.toBuilder();
        List children = hcm.children();
        if (!children.isEmpty()) {
            children = ImmutableList.a(fcp.a((Iterable<E>) children).a((Function<? super E, T>) new $$Lambda$rmm$VCE9C4awzGUQnFGEKPvbya52jVs<Object,T>(this, hci)).a());
        }
        return builder.a(children).a();
    }

    private hcs b(hcs hcs, hci hci) {
        if (hcs == null) {
            return hcs;
        }
        a builder = hcs.toBuilder();
        List body = hcs.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fcp.a((Iterable<E>) body).a((Function<? super E, T>) new $$Lambda$rmm$VICEylIFEE5v5gOQHOnuRKkXHlc<Object,T>(this, hci)).a());
        }
        return builder.a(body).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm c(hci hci, hcm hcm) {
        if (!"track-entity-view-header".equals(hcm.id())) {
            return hcm;
        }
        ArrayList arrayList = new ArrayList(hcm.children());
        arrayList.add(hcx.builder().a("glue:textRow", "row").a(hcy.builder().a(this.b.getString(R.string.free_tier_track_how_can_i_play_this_song_cta)).a()).a("track-entity-view-body_howToPlayButton").a("click", hci).b("ui:group", "track-entity-view-body-subtext").b("ui:index_in_block", Integer.valueOf(0)).b("ui:source", "play-on-premium").a());
        return hcm.toBuilder().a((List<? extends hcm>) arrayList).a();
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xii) obj, wit.a((xfk<T>) this.a.a()), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$rmm$7Ea0FvUJahR9AT64VXnh4KRskHI<Object,Object,Object>(this));
    }
}
