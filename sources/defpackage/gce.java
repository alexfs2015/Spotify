package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.lang.Enum;
import java.util.Locale;
import java.util.Map;

/* renamed from: gce reason: default package */
public final class gce<T extends Enum<T>> {
    private static final gcr<Enum<?>, String> b = $$Lambda$zWSvZoqqDI23uyaYx_RkyVVz4.INSTANCE;
    public final Class<T> a;
    private final Map<String, T> c;
    private final boolean d;

    private gce(Class<T> cls, gcr<? super T, String> gcr, boolean z) {
        this.a = (Class) fbp.a(cls);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.c = Maps.a(enumArr.length);
        for (Enum enumR : enumArr) {
            this.c.put(((String) gcr.apply(enumR)).toUpperCase(Locale.US), enumR);
        }
        this.d = z;
    }

    private gce(Class<T> cls, boolean z) {
        this(cls, b, true);
    }

    public static <T extends Enum<T>> gce<T> a(Class<T> cls) {
        return a(cls, b);
    }

    public static <T extends Enum<T>> gce<T> a(Class<T> cls, gcr<? super T, String> gcr) {
        return new gce<>(cls, gcr, false);
    }

    public static <T extends Enum<T>> gce<T> b(Class<T> cls) {
        return new gce<>(cls, true);
    }

    public final Optional<T> a(String str) {
        return str != null ? b(str) : Optional.e();
    }

    public final Optional<T> b(String str) {
        Enum c2 = c(str);
        return c2 != null ? Optional.b(c2) : Optional.e();
    }

    public T c(String str) {
        if (this.d) {
            str = str.replace('-', '_');
        }
        return (Enum) this.c.get(((String) fbp.a(str)).toUpperCase(Locale.US));
    }
}
