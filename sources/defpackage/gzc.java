package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gzc reason: default package */
public final class gzc {
    static Map<String, String> a(gzq gzq) {
        if (gzq == null) {
            return null;
        }
        a g = ImmutableMap.g();
        for (String str : gzq.keySet()) {
            String string = gzq.string(str);
            if (string != null) {
                g.b(str, string);
            }
        }
        return g.b();
    }

    public static gzq a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        a builder = HubsImmutableComponentBundle.builder();
        for (Entry entry : map.entrySet()) {
            builder = builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.a();
    }
}
