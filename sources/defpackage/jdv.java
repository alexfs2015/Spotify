package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jdv reason: default package */
public interface jdv {

    /* renamed from: jdv$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Map<Integer, jdu> a(Set<Entry<Integer, jdu>> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            for (Entry entry : set) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
    }
}
