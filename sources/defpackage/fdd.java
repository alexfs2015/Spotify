package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: fdd reason: default package */
public final class fdd {
    public static <F, T> Iterable<T> a(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        fbp.a(iterable);
        fbp.a(function);
        return new fcp<T>() {
            public final Iterator<T> iterator() {
                return Iterators.a(iterable.iterator(), function);
            }
        };
    }

    public static <T> T a(Iterable<? extends T> iterable, fbq<? super T> fbq, T t) {
        Iterator it = iterable.iterator();
        fbp.a(it);
        fbp.a(fbq);
        while (it.hasNext()) {
            T next = it.next();
            if (fbq.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static <T> T a(Iterable<? extends T> iterable, T t) {
        return Iterators.b(iterable.iterator(), null);
    }

    public static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.a(iterable.iterator());
    }

    private static <T> void a(List<T> list, fbq<? super T> fbq, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (fbq.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static <T> boolean a(Iterable<T> iterable, fbq<? super T> fbq) {
        return (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) ? Iterators.a(iterable.iterator(), fbq) : a((List) iterable, (fbq) fbp.a(fbq));
    }

    private static <T> boolean a(List<T> list, fbq<? super T> fbq) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!fbq.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        a(list, fbq, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        a(list, fbq, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static <T> T[] a(Iterable<? extends T> iterable, Class<T> cls) {
        return a(iterable, (T[]) fdi.a(cls, 0));
    }

    private static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return a(iterable).toArray(tArr);
    }

    public static <T> Iterable<T> b(final Iterable<T> iterable, final fbq<? super T> fbq) {
        fbp.a(iterable);
        fbp.a(fbq);
        return new fcp<T>() {
            public final Iterator<T> iterator() {
                return Iterators.b(iterable.iterator(), fbq);
            }
        };
    }

    public static <T> boolean c(Iterable<T> iterable, fbq<? super T> fbq) {
        return Iterators.c(iterable.iterator(), fbq);
    }

    public static <T> boolean d(Iterable<T> iterable, fbq<? super T> fbq) {
        fbp.a(fbq);
        for (T apply : iterable) {
            if (!fbq.apply(apply)) {
                return false;
            }
        }
        return true;
    }

    public static <T> T e(Iterable<T> iterable, fbq<? super T> fbq) {
        return Iterators.d(iterable.iterator(), fbq);
    }

    public static <T> Optional<T> f(Iterable<T> iterable, fbq<? super T> fbq) {
        return Iterators.e(iterable.iterator(), fbq);
    }
}
