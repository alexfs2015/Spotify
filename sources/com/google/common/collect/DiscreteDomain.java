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

        IntegerDomain() {
            super(true, 0);
        }

        private Object readResolve() {
            return a;
        }

        public final /* synthetic */ long a(Comparable comparable, Comparable comparable2) {
            return ((long) ((Integer) comparable2).intValue()) - ((long) ((Integer) comparable).intValue());
        }

        public final /* synthetic */ Comparable a() {
            return Integer.valueOf(Integer.MIN_VALUE);
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
            fcl.a(j, "distance");
            return Integer.valueOf(fev.a(num.longValue() + j));
        }

        public final /* synthetic */ Comparable b() {
            return Integer.valueOf(Integer.MAX_VALUE);
        }

        public final /* synthetic */ Comparable b(Comparable comparable) {
            int intValue = ((Integer) comparable).intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public final String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    private DiscreteDomain(boolean z) {
        this.supportsFastOffset = z;
    }

    /* synthetic */ DiscreteDomain(boolean z, byte b) {
        this(true);
    }

    public abstract long a(C c, C c2);

    public C a() {
        throw new NoSuchElementException();
    }

    public abstract C a(C c);

    /* access modifiers changed from: 0000 */
    public C a(C c, long j) {
        fcl.a(j, "distance");
        for (long j2 = 0; j2 < j; j2++) {
            c = a(c);
        }
        return c;
    }

    public C b() {
        throw new NoSuchElementException();
    }

    public abstract C b(C c);
}
