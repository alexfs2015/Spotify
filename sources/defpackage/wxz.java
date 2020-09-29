package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: wxz reason: default package */
final class wxz<T> extends AtomicLongFieldUpdater<T> {
    private final long a;
    private final Unsafe b;

    wxz(Unsafe unsafe, Class<? super T> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (Modifier.isVolatile(declaredField.getModifiers())) {
            this.b = unsafe;
            this.a = unsafe.objectFieldOffset(declaredField);
            return;
        }
        throw new IllegalArgumentException("Must be volatile");
    }

    public final boolean compareAndSet(T t, long j, long j2) {
        return this.b.compareAndSwapLong(t, this.a, j, j2);
    }

    public final long get(T t) {
        return this.b.getLongVolatile(t, this.a);
    }

    public final void lazySet(T t, long j) {
        this.b.putOrderedLong(t, this.a, j);
    }

    public final void set(T t, long j) {
        this.b.putLongVolatile(t, this.a, j);
    }

    public final boolean weakCompareAndSet(T t, long j, long j2) {
        return this.b.compareAndSwapLong(t, this.a, j, j2);
    }
}
