package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bdg reason: default package */
public final class bdg {
    private final Map<String, Object> a = new HashMap();
    private final List<String> b = new ArrayList();

    public final bdg a(String str) {
        this.b.add(str);
        this.a.remove(str);
        return this;
    }

    public final bdg a(String str, long j) {
        return a(str, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    public bdg a(String str, Object obj) {
        this.a.put(bdl.a(str), bdl.a(obj));
        this.b.remove(str);
        return this;
    }

    public final List<String> a() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }

    public final Map<String, Object> b() {
        HashMap hashMap = new HashMap(this.a);
        for (Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}