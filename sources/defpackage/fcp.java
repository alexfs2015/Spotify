package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: fcp reason: default package */
public abstract class fcp<E> implements Iterable<E> {
    private final Optional<Iterable<E>> a;

    protected fcp() {
        this.a = Optional.e();
    }

    fcp(Iterable<E> iterable) {
        fbp.a(iterable);
        if (this == iterable) {
            iterable = null;
        }
        this.a = Optional.c(iterable);
    }

    public static <E> fcp<E> a(final Iterable<E> iterable) {
        return iterable instanceof fcp ? (fcp) iterable : new fcp<E>(iterable) {
            public final Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <T> fcp<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return a((Iterable<? extends T>[]) new Iterable[]{iterable, iterable2});
    }

    public static <T> fcp<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return a((Iterable<? extends T>[]) new Iterable[]{iterable, iterable2, iterable3});
    }

    private static <T> fcp<T> a(final Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> a2 : iterableArr) {
            fbp.a(a2);
        }
        return new fcp<T>() {
            public final Iterator<T> iterator() {
                return Iterators.a(new fce<Iterator<? extends T>>(iterableArr.length) {
                    public final /* synthetic */ Object a(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    public static <E> fcp<E> a(E[] eArr) {
        return a((Iterable<E>) Arrays.asList(eArr));
    }

    public final <T> fcp<T> a(Function<? super E, T> function) {
        return a(fdd.a(a(), function));
    }

    public final fcp<E> a(fbq<? super E> fbq) {
        return a(fdd.b(a(), fbq));
    }

    public Iterable<E> a() {
        return (Iterable) this.a.a(this);
    }

    public final E[] a(Class<E> cls) {
        return fdd.a(a(), cls);
    }

    public final <T> fcp<T> b(Function<? super E, ? extends Iterable<? extends T>> function) {
        final fcp a2 = a(function);
        fbp.a(a2);
        return new fcp<T>() {
            public final Iterator<T> iterator() {
                return Iterators.a(Iterators.a(a2.iterator(), (Function<? super F, ? extends T>) new Function<Iterable<? extends T>, Iterator<? extends T>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        return ((Iterable) obj).iterator();
                    }
                }));
            }
        };
    }

    public final fcp<E> b(E... eArr) {
        return a(a(), Arrays.asList(eArr));
    }

    public final boolean b(fbq<? super E> fbq) {
        return fdd.c(a(), fbq);
    }

    public final Optional<E> c(fbq<? super E> fbq) {
        return fdd.f(a(), fbq);
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
}
