package defpackage;

import com.google.common.base.Optional;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vmf reason: default package */
public final class vmf {
    public final Map<String, String> a = new LinkedHashMap();

    public final vmf a(String str, Optional<Integer> optional) {
        if (optional.b()) {
            this.a.put(str, String.valueOf(optional.c()));
        }
        return this;
    }
}
