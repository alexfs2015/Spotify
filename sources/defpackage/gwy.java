package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* renamed from: gwy reason: default package */
public final class gwy {
    public final String a;
    public final hcm b;
    public final Map<String, Object> c;

    private gwy(String str, hcm hcm, Map<String, Object> map) {
        this.a = (String) fbp.a(str);
        this.b = (hcm) fbp.a(hcm);
        this.c = ImmutableMap.a(map);
    }

    public static gwy a(String str, hcm hcm) {
        return new gwy(str, hcm, ImmutableMap.f());
    }

    public static gwy a(String str, hcm hcm, Map<String, Object> map) {
        return new gwy(str, hcm, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwy)) {
            return false;
        }
        gwy gwy = (gwy) obj;
        return fbn.a(this.a, gwy.a) && fbn.a(this.b, gwy.b) && fbn.a(this.c, gwy.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
