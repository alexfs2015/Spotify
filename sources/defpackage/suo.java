package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: suo reason: default package */
public final class suo implements c<hcs, hcs> {
    private final suc a;

    suo(suc suc) {
        this.a = suc;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm a(hcm hcm) {
        return hcm != null ? hcm.toBuilder().a(a(hcm, hcm.children())).a() : hcm;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm a(hcm hcm, hcm hcm2) {
        if (!"glue:shuffleButton".equals(((hcm) fbp.a(hcm2)).componentId().id())) {
            return hcm2;
        }
        a a2 = hcm2.toBuilder().a("lowFrictionSearch:shuffleButton", HubsComponentCategory.ROW.name());
        Map events = hcm2.events();
        a g = ImmutableMap.g();
        for (Entry entry : events.entrySet()) {
            String str = "click";
            if (str.equals(entry.getKey())) {
                g.b(str, ((hci) fbp.a((hci) events.get(str))).toBuilder().a("lowFrictionSearch:playFromShuffleButton").a());
            } else {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "uri";
        return a2.a((Map<String, ? extends hci>) g.b()).a(HubsImmutableComponentBundle.builder().a(str2, hcm.metadata().string(str2)).a()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(hcs hcs, Boolean bool) {
        if (!bool.booleanValue()) {
            return hcs;
        }
        a builder = hcs.toBuilder();
        hcm header = hcs.header();
        a a2 = builder.a(header == null ? null : header.toBuilder().a(a(header, header.children())).a());
        List body = hcs.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fcp.a((Iterable<E>) body).a((Function<? super E, T>) $$Lambda$suo$O_NhE09BgVBicuniCSZnNeyJjgw.INSTANCE).a());
        }
        return a2.a(body).a();
    }

    private static List<? extends hcm> a(hcm hcm, List<? extends hcm> list) {
        return ImmutableList.a(fcp.a((Iterable<E>) list).a((Function<? super E, T>) new $$Lambda$suo$Y342t8ZpN86mBiV4H_405EM2fc8<Object,T>(hcm)).a());
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a((xii) obj, (xii<? extends T2>) ScalarSynchronousObservable.d(Boolean.valueOf(this.a.c())), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$suo$zuyvgyjcYIjMP6eY06WANa3IpQ4.INSTANCE);
    }
}
