package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jbj reason: default package */
public interface jbj {

    /* renamed from: jbj$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Map<Integer, jbi> a(Set<Entry<Integer, jbi>> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            for (Entry entry : set) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
    }
}
