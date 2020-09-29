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

/* renamed from: tjb reason: default package */
public final class tjb implements c<gzz, gzz> {
    private final tis a;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, (wud<? extends T2>) ScalarSynchronousObservable.d(Boolean.valueOf(this.a.a())), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$tjb$NAxseUXeooHOkPcjn3kix5g9hU.INSTANCE);
    }

    tjb(tis tis) {
        this.a = tis;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzz a(gzz gzz, Boolean bool) {
        gzt gzt;
        if (!bool.booleanValue()) {
            return gzz;
        }
        a builder = gzz.toBuilder();
        gzt header = gzz.header();
        if (header == null) {
            gzt = null;
        } else {
            gzt = header.toBuilder().a(a(header, header.children())).a();
        }
        a a2 = builder.a(gzt);
        List body = gzz.body();
        if (!body.isEmpty()) {
            body = ImmutableList.a(fbx.a((Iterable<E>) body).a((Function<? super E, T>) $$Lambda$tjb$EccHA5RJgMBs9utvr00wmXcso7E.INSTANCE).a());
        }
        return a2.a(body).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(gzt gzt) {
        return gzt != null ? gzt.toBuilder().a(a(gzt, gzt.children())).a() : gzt;
    }

    private static List<? extends gzt> a(gzt gzt, List<? extends gzt> list) {
        return ImmutableList.a(fbx.a((Iterable<E>) list).a((Function<? super E, T>) new $$Lambda$tjb$MgDFZB8T_CaO0JPT_AR5_xMce0<Object,T>(gzt)).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(gzt gzt, gzt gzt2) {
        if (!"glue:shuffleButton".equals(((gzt) fay.a(gzt2)).componentId().id())) {
            return gzt2;
        }
        a a2 = gzt2.toBuilder().a("onDemandSharingPlayback:shuffleButton", HubsComponentCategory.ROW.name());
        Map events = gzt2.events();
        a g = ImmutableMap.g();
        for (Entry entry : events.entrySet()) {
            String str = "click";
            if (str.equals(entry.getKey())) {
                g.b(str, ((gzp) fay.a((gzp) events.get(str))).toBuilder().a("onDemandSharingPlayback:playFromShuffleButton").a());
            } else {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "uri";
        return a2.a((Map<String, ? extends gzp>) g.b()).a(HubsImmutableComponentBundle.builder().a(str2, gzt.metadata().string(str2)).a()).a();
    }
}
