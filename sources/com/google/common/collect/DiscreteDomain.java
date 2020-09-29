package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

public abstract class DiscreteDomain<C extends Comparable> {
    final boolean supportsFastOffset;

    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        /* access modifiers changed from: private */
        public static final IntegerDomain a = new IntegerDomain();
        private static final long serialVersionUID = 0;

        public final String toString() {
            return "DiscreteDomain.integers()";
        }

        public final /* synthetic */ long a(Comparable comparable, Comparable comparable2) {
            return ((long) ((Integer) comparable2).intValue()) - ((long) ((Integer) comparable).intValue());
        }

        public final /* synthetic */ Comparable a(Comparable comparable) {
            int intValue = ((Integer) comparable).intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Comparable a(Comparable comparable, long j) {
            Integer num = (Integer) comparable;
            fbu.a(j, "distance");
            long longValue = num.longValue() + j;
            int i = (int) longValue;
            fay.a(((long) i) == longValue, "Out of range: %s", longValue);
            return Integer.valueOf(i);
        }

        public final /* synthetic */ Comparable b(Comparable comparable) {
            int intValue = ((Integer) comparable).intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        IntegerDomain() {
            super(true, 0);
        }

        private Object readResolve() {
            return a;
        }

        public final /* synthetic */ Comparable b() {
            return Integer.valueOf(Integer.MAX_VALUE);
        }

        public final /* synthetic */ Comparable a() {
            return Integer.valueOf(Integer.MIN_VALUE);
        }
    }

    public abstract long a(C c, C c2);

    public abstract C a(C c);

    public abstract C b(C c);

    /* synthetic */ DiscreteDomain(boolean z, byte b) {
        this(true);
    }

    private DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }

    /* access modifiers changed from: 0000 */
    public C a(C c, long j) {
        fbu.a(j, "distance");
        for (long j2 = 0; j2 < j; j2++) {
            c = a(c);
        }
        return c;
    }

    public C a() {
        throw new NoSuchElementException();
    }

    public C b() {
        throw new NoSuchElementException();
    }
}
