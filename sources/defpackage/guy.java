package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* renamed from: guy reason: default package */
public final class guy {
    public final String a;
    public final gzt b;
    public final Map<String, Object> c;

    public static guy a(String str, gzt gzt) {
        return new guy(str, gzt, ImmutableMap.f());
    }

    public static guy a(String str, gzt gzt, Map<String, Object> map) {
        return new guy(str, gzt, map);
    }

    private guy(String str, gzt gzt, Map<String, Object> map) {
        this.a = (String) fay.a(str);
        this.b = (gzt) fay.a(gzt);
        this.c = ImmutableMap.a(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guy)) {
            return false;
        }
        guy guy = (guy) obj;
        return faw.a(this.a, guy.a) && faw.a(this.b, guy.b) && faw.a(this.c, guy.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
