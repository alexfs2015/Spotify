package defpackage;

import android.util.JsonReader;
import java.util.List;

/* renamed from: abc reason: default package */
public final class abc {
    private static <T> List<acl<T>> a(JsonReader jsonReader, float f, xo xoVar, ace<T> ace) {
        return abo.a(jsonReader, xoVar, f, ace);
    }

    static <T> List<acl<T>> a(JsonReader jsonReader, xo xoVar, ace<T> ace) {
        return abo.a(jsonReader, xoVar, 1.0f, ace);
    }

    public static zs a(JsonReader jsonReader, xo xoVar, boolean z) {
        return new zs(a(jsonReader, z ? ack.a() : 1.0f, xoVar, abh.a));
    }

    static zt a(JsonReader jsonReader, xo xoVar, int i) {
        return new zt(a(jsonReader, xoVar, (ace<T>) new abi<T>(i)));
    }

    static zu a(JsonReader jsonReader, xo xoVar) {
        return new zu(a(jsonReader, xoVar, (ace<T>) abl.a));
    }

    static zw b(JsonReader jsonReader, xo xoVar) {
        return new zw(a(jsonReader, ack.a(), xoVar, abu.a));
    }

    static zy c(JsonReader jsonReader, xo xoVar) {
        return new zy(a(jsonReader, ack.a(), xoVar, abz.a));
    }

    static zr d(JsonReader jsonReader, xo xoVar) {
        return new zr(a(jsonReader, xoVar, (ace<T>) abe.a));
    }
}
