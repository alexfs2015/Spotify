package defpackage;

import com.spotify.android.flags.Overridable;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: fps reason: default package */
public abstract class fps<T extends Serializable> {
    private static final Map<String, fps<?>> g = new HashMap(64);
    private static final Set<Integer> h = Collections.synchronizedSet(new HashSet());
    public final String a;
    final Integer b;
    public final Overridable c;
    public final fpz d;
    public final Class<T> e;
    public final String f;

    public abstract boolean a(T t);

    public abstract T b(String str);

    public static fps<?> c(String str) {
        fps<?> fps = (fps) g.get(str);
        if (fps != null) {
            return fps;
        }
        StringBuilder sb = new StringBuilder("Flag ");
        sb.append(str);
        sb.append(" does not exist");
        throw new IllegalStateException(sb.toString());
    }

    public fps(Class<T> cls, String str, fpz fpz, Overridable overridable, String str2) {
        if (!g.containsKey(str)) {
            g.put(str, this);
            this.b = Integer.valueOf(a(str));
            if (h.add(this.b)) {
                fay.a(cls);
                this.e = cls;
                this.d = fpz;
                this.a = str;
                this.c = overridable;
                this.f = str2;
                return;
            }
            StringBuilder sb = new StringBuilder("There can be only one feature flag instance with the same hashcode identifier ");
            sb.append(str);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("There can be only one feature flag instance with identifier ");
        sb2.append(str);
        throw new AssertionError(sb2.toString());
    }

    private static int a(String str) {
        int length = str.length();
        if (length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }
}
