package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hbv reason: default package */
public final class hbv {
    public static hcj a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        a builder = HubsImmutableComponentBundle.builder();
        for (Entry entry : map.entrySet()) {
            builder = builder.a((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.a();
    }

    static Map<String, String> a(hcj hcj) {
        if (hcj == null) {
            return null;
        }
        a g = ImmutableMap.g();
        for (String str : hcj.keySet()) {
            String string = hcj.string(str);
            if (string != null) {
                g.b(str, string);
            }
        }
        return g.b();
    }
}
