package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: rnu reason: default package */
public final class rnu implements gwk, gwl {
    private final Map<Integer, rnw<?>> a;
    private final Map<String, Integer> b;

    rnu(Map<String, rnw<?>> map) {
        HashMap hashMap = new HashMap(map.size());
        a g = ImmutableMap.g();
        for (Entry entry : map.entrySet()) {
            rnw rnw = (rnw) entry.getValue();
            int b2 = rnw.b();
            rnw rnw2 = (rnw) hashMap.get(Integer.valueOf(b2));
            if (rnw2 == null || rnw2.getClass().equals(rnw.getClass())) {
                hashMap.put(Integer.valueOf(b2), rnw);
                g.b(entry.getKey(), Integer.valueOf(b2));
            } else {
                StringBuilder sb = new StringBuilder("Multiple entries with the same key: ");
                sb.append(b2);
                sb.append(" = ");
                sb.append(rnw2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a = ImmutableMap.a((Map<? extends K, ? extends V>) hashMap);
        this.b = g.b();
    }

    public final gwi<?> getBinder(int i) {
        return (gwi) this.a.get(Integer.valueOf(i));
    }

    public final int resolve(hcm hcm) {
        Integer num = (Integer) this.b.get(hcm.componentId().id());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
