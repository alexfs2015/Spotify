package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: fcl reason: default package */
public final class fcl {
    public static <T> boolean a(Iterable<T> iterable, faz<? super T> faz) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return Iterators.a(iterable.iterator(), faz);
        }
        return a((List) iterable, (faz) fay.a(faz));
    }

    private static <T> boolean a(List<T> list, faz<? super T> faz) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!faz.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        a(list, faz, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        a(list, faz, i2, i);
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

    private static <T> void a(List<T> list, faz<? super T> faz, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (faz.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static <T> T[] a(Iterable<? extends T> iterable, Class<T> cls) {
        return a(iterable, (T[]) fcq.a(cls, 0));
    }

    private static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return a(iterable).toArray(tArr);
    }

    public static <E> Collection<E> a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return Lists.a(iterable.iterator());
    }

    public static <T> Iterable<T> b(final Iterable<T> iterable, final faz<? super T> faz) {
        fay.a(iterable);
        fay.a(faz);
        return new fbx<T>() {
            public final Iterator<T> iterator() {
                return Iterators.b(iterable.iterator(), faz);
            }
        };
    }

    public static <T> boolean c(Iterable<T> iterable, faz<? super T> faz) {
        return Iterators.c(iterable.iterator(), faz);
    }

    public static <T> boolean d(Iterable<T> iterable, faz<? super T> faz) {
        fay.a(faz);
        for (T apply : iterable) {
            if (!faz.apply(apply)) {
                return false;
            }
        }
        return true;
    }

    public static <T> T e(Iterable<T> iterable, faz<? super T> faz) {
        return Iterators.d(iterable.iterator(), faz);
    }

    public static <T> T a(Iterable<? extends T> iterable, faz<? super T> faz, T t) {
        Iterator it = iterable.iterator();
        fay.a(it);
        fay.a(faz);
        while (it.hasNext()) {
            T next = it.next();
            if (faz.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static <T> Optional<T> f(Iterable<T> iterable, faz<? super T> faz) {
        return Iterators.e(iterable.iterator(), faz);
    }

    public static <F, T> Iterable<T> a(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        fay.a(iterable);
        fay.a(function);
        return new fbx<T>() {
            public final Iterator<T> iterator() {
                return Iterators.a(iterable.iterator(), function);
            }
        };
    }

    public static <T> T a(Iterable<? extends T> iterable, T t) {
        return Iterators.b(iterable.iterator(), null);
    }
}
