package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: txz reason: default package */
public final class txz implements c<gzz, gzz> {
    private final txu a;

    public final /* synthetic */ Object call(Object obj) {
        wud wud = (wud) obj;
        if (!this.a.a()) {
            return wud;
        }
        return wud.f($$Lambda$txz$vzpXoJIT4QVmPCHG6rr970o9o8.INSTANCE);
    }

    public txz(txu txu) {
        this.a = txu;
    }

    private static List<? extends gzt> a(List<? extends gzt> list) {
        return ImmutableList.a(fbx.a((Iterable<E>) list).a((Function<? super E, T>) $$Lambda$txz$rJ7gP0ZSon6hkV1QlVn58xZ_A9A.INSTANCE).a());
    }

    /* access modifiers changed from: private */
    public static gzt a(gzt gzt) {
        gzp gzp;
        if ("glue:shuffleButton".equals(gzt.componentId().id())) {
            a a2 = gzt.toBuilder().a("spc:shuffleButton", gzt.componentId().category());
            Map events = gzt.events();
            HashMap hashMap = new HashMap(events.size());
            for (Entry entry : events.entrySet()) {
                Object key = entry.getKey();
                if ("click".equals(entry.getKey())) {
                    if ("playFromContext".equals(((gzp) entry.getValue()).name())) {
                        gzp = ((gzp) entry.getValue()).toBuilder().a("playPauseFromContext").a();
                        hashMap.put(key, gzp);
                    }
                }
                gzp = (gzp) entry.getValue();
                hashMap.put(key, gzp);
            }
            return a2.a((Map<String, ? extends gzp>) hashMap).a();
        }
        if (!gzt.children().isEmpty()) {
            gzt = gzt.toBuilder().a(a(gzt.children())).a();
        }
        return gzt;
    }
}
