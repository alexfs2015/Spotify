package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.lang.Enum;
import java.util.Locale;
import java.util.Map;

/* renamed from: gbg reason: default package */
public final class gbg<T extends Enum<T>> {
    private static final gbt<Enum<?>, String> b = $$Lambda$UkkktpT4XyUmsas9mFE5zWOyxo.INSTANCE;
    public final Class<T> a;
    private final Map<String, T> c;
    private final boolean d;

    private gbg(Class<T> cls, boolean z) {
        this(cls, b, true);
    }

    private gbg(Class<T> cls, gbt<? super T, String> gbt, boolean z) {
        this.a = (Class) fay.a(cls);
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.c = Maps.a(enumArr.length);
        for (Enum enumR : enumArr) {
            this.c.put(((String) gbt.apply(enumR)).toUpperCase(Locale.US), enumR);
        }
        this.d = z;
    }

    public static <T extends Enum<T>> gbg<T> a(Class<T> cls) {
        return a(cls, b);
    }

    public static <T extends Enum<T>> gbg<T> a(Class<T> cls, gbt<? super T, String> gbt) {
        return new gbg<>(cls, gbt, false);
    }

    public static <T extends Enum<T>> gbg<T> b(Class<T> cls) {
        return new gbg<>(cls, true);
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
        return (Enum) this.c.get(((String) fay.a(str)).toUpperCase(Locale.US));
    }
}
