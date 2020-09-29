package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: wya reason: default package */
final class wya<U, M> extends AtomicReferenceFieldUpdater<U, M> {
    private final long a;
    private final Unsafe b;

    wya(Unsafe unsafe, Class<? super U> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (Modifier.isVolatile(declaredField.getModifiers())) {
            this.b = unsafe;
            this.a = unsafe.objectFieldOffset(declaredField);
            return;
        }
        throw new IllegalArgumentException("Must be volatile");
    }

    public final boolean compareAndSet(U u, M m, M m2) {
        return this.b.compareAndSwapObject(u, this.a, m, m2);
    }

    public final M get(U u) {
        return this.b.getObjectVolatile(u, this.a);
    }

    public final void lazySet(U u, M m) {
        this.b.putOrderedObject(u, this.a, m);
    }

    public final void set(U u, M m) {
        this.b.putObjectVolatile(u, this.a, m);
    }

    public final boolean weakCompareAndSet(U u, M m, M m2) {
        return this.b.compareAndSwapObject(u, this.a, m, m2);
    }
}
