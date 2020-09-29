package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists.OnePlusArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: fbx reason: default package */
public abstract class fbx<E> implements Iterable<E> {
    private final Optional<Iterable<E>> a;

    protected fbx() {
        this.a = Optional.e();
    }

    fbx(Iterable<E> iterable) {
        fay.a(iterable);
        if (this == iterable) {
            iterable = null;
        }
        this.a = Optional.c(iterable);
    }

    public Iterable<E> a() {
        return (Iterable) this.a.a(this);
    }

    public static <E> fbx<E> a(final Iterable<E> iterable) {
        return iterable instanceof fbx ? (fbx) iterable : new fbx<E>(iterable) {
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <E> fbx<E> a(E[] eArr) {
        return a((Iterable<E>) Arrays.asList(eArr));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object append : a()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(append);
        }
        sb.append(']');
        return sb.toString();
    }

    public final fbx<E> b(E... eArr) {
        return a(a(), (Iterable<? extends T>) Arrays.asList(eArr));
    }

    public final fbx<E> a(faz<? super E> faz) {
        return a(fcl.b(a(), faz));
    }

    public final boolean b(faz<? super E> faz) {
        return fcl.c(a(), faz);
    }

    public final Optional<E> c(faz<? super E> faz) {
        return fcl.f(a(), faz);
    }

    public final <T> fbx<T> a(Function<? super E, T> function) {
        return a(fcl.a(a(), function));
    }

    public final <T> fbx<T> b(Function<? super E, ? extends Iterable<? extends T>> function) {
        final fbx a2 = a(function);
        fay.a(a2);
        return new fbx<T>() {
            public final Iterator<T> iterator() {
                return Iterators.a(Iterators.a(a2.iterator(), (Function<? super F, ? extends T>) new Function<Iterable<? extends T>, Iterator<? extends T>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        return ((Iterable) obj).iterator();
                    }
                }));
            }
        };
    }

    public final E[] a(Class<E> cls) {
        return fcl.a(a(), cls);
    }

    public static <T> fbx<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        final Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            fay.a(iterableArr[i]);
        }
        return new fbx<T>() {
            public final Iterator<T> iterator() {
                return Iterators.a(new fbn<Iterator<? extends T>>(iterableArr.length) {
                    public final /* synthetic */ Object a(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    public static <E> fbx<E> a(E e, E... eArr) {
        return a((Iterable<E>) new OnePlusArrayList<E>(e, eArr));
    }
}
