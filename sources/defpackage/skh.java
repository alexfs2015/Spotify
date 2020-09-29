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

/* renamed from: skh reason: default package */
public final class skh implements c<gzz, gzz> {
    private final sjv a;

    public final /* synthetic */ Object call(Object obj) {
        return wud.a((wud) obj, (wud<? extends T2>) ScalarSynchronousObservable.d(Boolean.valueOf(this.a.c())), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$skh$HvgmtdkopMhtrPMsNzQ1XMR6U8.INSTANCE);
    }

    skh(sjv sjv) {
        this.a = sjv;
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
            body = ImmutableList.a(fbx.a((Iterable<E>) body).a((Function<? super E, T>) $$Lambda$skh$jem49wXGKbE9VBpsLGu_ybIgBI.INSTANCE).a());
        }
        return a2.a(body).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(gzt gzt) {
        return gzt != null ? gzt.toBuilder().a(a(gzt, gzt.children())).a() : gzt;
    }

    private static List<? extends gzt> a(gzt gzt, List<? extends gzt> list) {
        return ImmutableList.a(fbx.a((Iterable<E>) list).a((Function<? super E, T>) new $$Lambda$skh$E0RswvA6TfdyrmXW24CS4a__tPY<Object,T>(gzt)).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt a(gzt gzt, gzt gzt2) {
        if (!"glue:shuffleButton".equals(((gzt) fay.a(gzt2)).componentId().id())) {
            return gzt2;
        }
        a a2 = gzt2.toBuilder().a("lowFrictionSearch:shuffleButton", HubsComponentCategory.ROW.name());
        Map events = gzt2.events();
        a g = ImmutableMap.g();
        for (Entry entry : events.entrySet()) {
            String str = "click";
            if (str.equals(entry.getKey())) {
                g.b(str, ((gzp) fay.a((gzp) events.get(str))).toBuilder().a("lowFrictionSearch:playFromShuffleButton").a());
            } else {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "uri";
        return a2.a((Map<String, ? extends gzp>) g.b()).a(HubsImmutableComponentBundle.builder().a(str2, gzt.metadata().string(str2)).a()).a();
    }
}
