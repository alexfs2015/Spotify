package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: rrm reason: default package */
public final class rrm implements rrk {
    private final Map<String, rrj> a = new HashMap(1);

    public final rrj a(String str) {
        fay.a(str);
        if (!this.a.containsKey(str)) {
            this.a.put(str, new rrl());
        }
        return (rrj) this.a.get(str);
    }
}
