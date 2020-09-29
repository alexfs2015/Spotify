package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: wxy reason: default package */
final class wxy<T> extends AtomicIntegerFieldUpdater<T> {
    private final long a;
    private final Unsafe b;

    wxy(Unsafe unsafe, Class<? super T> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (Modifier.isVolatile(declaredField.getModifiers())) {
            this.b = unsafe;
            this.a = unsafe.objectFieldOffset(declaredField);
            return;
        }
        throw new IllegalArgumentException("Must be volatile");
    }

    public final boolean compareAndSet(T t, int i, int i2) {
        return this.b.compareAndSwapInt(t, this.a, i, i2);
    }

    public final int get(T t) {
        return this.b.getIntVolatile(t, this.a);
    }

    public final void lazySet(T t, int i) {
        this.b.putOrderedInt(t, this.a, i);
    }

    public final void set(T t, int i) {
        this.b.putIntVolatile(t, this.a, i);
    }

    public final boolean weakCompareAndSet(T t, int i, int i2) {
        return this.b.compareAndSwapInt(t, this.a, i, i2);
    }
}
