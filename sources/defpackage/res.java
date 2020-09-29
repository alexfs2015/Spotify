package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: res reason: default package */
public final class res implements guk, gul {
    private final Map<Integer, reu<?>> a;
    private final Map<String, Integer> b;

    res(Map<String, reu<?>> map) {
        HashMap hashMap = new HashMap(map.size());
        a g = ImmutableMap.g();
        for (Entry entry : map.entrySet()) {
            reu reu = (reu) entry.getValue();
            int b2 = reu.b();
            reu reu2 = (reu) hashMap.get(Integer.valueOf(b2));
            if (reu2 == null || reu2.getClass().equals(reu.getClass())) {
                hashMap.put(Integer.valueOf(b2), reu);
                g.b(entry.getKey(), Integer.valueOf(b2));
            } else {
                StringBuilder sb = new StringBuilder("Multiple entries with the same key: ");
                sb.append(b2);
                sb.append(" = ");
                sb.append(reu2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a = ImmutableMap.a((Map<? extends K, ? extends V>) hashMap);
        this.b = g.b();
    }

    public final int resolve(gzt gzt) {
        Integer num = (Integer) this.b.get(gzt.componentId().id());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final gui<?> getBinder(int i) {
        return (gui) this.a.get(Integer.valueOf(i));
    }
}
