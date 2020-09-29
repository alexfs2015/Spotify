package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: uku reason: default package */
public final class uku implements c<hcs, hcs> {
    private final ukp a;

    public uku(ukp ukp) {
        this.a = ukp;
    }

    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        hci hci;
        if ("glue:shuffleButton".equals(hcm.componentId().id())) {
            a a2 = hcm.toBuilder().a("spc:shuffleButton", hcm.componentId().category());
            Map events = hcm.events();
            HashMap hashMap = new HashMap(events.size());
            for (Entry entry : events.entrySet()) {
                Object key = entry.getKey();
                if ("click".equals(entry.getKey())) {
                    if ("playFromContext".equals(((hci) entry.getValue()).name())) {
                        hci = ((hci) entry.getValue()).toBuilder().a("playPauseFromContext").a();
                        hashMap.put(key, hci);
                    }
                }
                hci = (hci) entry.getValue();
                hashMap.put(key, hci);
            }
            return a2.a((Map<String, ? extends hci>) hashMap).a();
        }
        if (!hcm.children().isEmpty()) {
            hcm = hcm.toBuilder().a(a(hcm.children())).a();
        }
        return hcm;
    }

    private static List<? extends hcm> a(List<? extends hcm> list) {
        return ImmutableList.a(fcp.a((Iterable<E>) list).a((Function<? super E, T>) $$Lambda$uku$WlXKimbUAAlueqd9bE1HliaHg2o.INSTANCE).a());
    }

    public final /* synthetic */ Object call(Object obj) {
        xii xii = (xii) obj;
        return !this.a.a() ? xii : xii.e((xiy<? super T, ? extends R>) $$Lambda$uku$lsSeenB9Ay8pect2zZ8Sty1Hgc4.INSTANCE);
    }
}
