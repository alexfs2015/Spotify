package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends sf {
    public final se a(List<se> list) {
        a aVar = new a();
        HashMap hashMap = new HashMap();
        for (se seVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(seVar.b));
        }
        aVar.a((Map<String, Object>) hashMap);
        return aVar.a();
    }
}
