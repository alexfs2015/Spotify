package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends st {
    public final ss a(List<ss> list) {
        a aVar = new a();
        HashMap hashMap = new HashMap();
        for (ss ssVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(ssVar.b));
        }
        aVar.a((Map<String, Object>) hashMap);
        return aVar.a();
    }
}
