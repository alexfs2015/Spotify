package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;

public abstract class Cut<C extends Comparable> implements Serializable, Comparable<Cut<C>> {
    private static final long serialVersionUID = 0;
    final C endpoint;

    /* renamed from: com.google.common.collect.Cut$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[BoundType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Cut.AnonymousClass1.<clinit>():void");
        }
    }

    static final class AboveAll extends Cut<Comparable<?>> {
        /* access modifiers changed from: private */
        public static final AboveAll a = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super(null);
        }

        private Object readResolve() {
            return a;
        }

        /* renamed from: a */
        public final int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        /* access modifiers changed from: 0000 */
        public final BoundType a() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        public final Cut<Comparable<?>> a(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        public final Comparable<?> a(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final void a(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Comparable<?> comparable) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final BoundType b() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        public final Cut<Comparable<?>> b(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        public final Comparable<?> b(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.b();
        }

        /* access modifiers changed from: 0000 */
        public final void b(StringBuilder sb) {
            sb.append("+∞)");
        }

        /* access modifiers changed from: 0000 */
        public final Comparable<?> c() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "+∞";
        }
    }

    static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        AboveValue(C c) {
            super((Comparable) fbp.a(c));
        }

        /* access modifiers changed from: 0000 */
        public final BoundType a() {
            return BoundType.OPEN;
        }

        /* access modifiers changed from: 0000 */
        public final Cut<C> a(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass1.a[boundType.ordinal()];
            if (i == 1) {
                Comparable a = discreteDomain.a(this.endpoint);
                return a == null ? BelowAll.a : b(a);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        public final C a(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.a(this.endpoint);
        }

        /* access modifiers changed from: 0000 */
        public final void a(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(C c) {
            return Range.c(this.endpoint, c) < 0;
        }

        /* access modifiers changed from: 0000 */
        public final BoundType b() {
            return BoundType.CLOSED;
        }

        /* access modifiers changed from: 0000 */
        public final Cut<C> b(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass1.a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                Comparable a = discreteDomain.a(this.endpoint);
                return a == null ? AboveAll.a : b(a);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final C b(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        /* access modifiers changed from: 0000 */
        public final void b(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public final int hashCode() {
            return this.endpoint.hashCode() ^ -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("/");
            sb.append(this.endpoint);
            sb.append("\\");
            return sb.toString();
        }
    }

    static final class BelowAll extends Cut<Comparable<?>> {
        /* access modifiers changed from: private */
        public static final BelowAll a = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super(null);
        }

        private Object readResolve() {
            return a;
        }

        /* renamed from: a */
        public final int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        /* access modifiers changed from: 0000 */
        public final BoundType a() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        public final Cut<Comparable<?>> a(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        public final Comparable<?> a(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.a();
        }

        /* access modifiers changed from: 0000 */
        public final void a(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Comparable<?> comparable) {
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final BoundType b() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        public final Cut<Comparable<?>> b(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        public final Comparable<?> b(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final void b(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final Comparable<?> c() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "-∞";
        }
    }

    static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        BelowValue(C c) {
            super((Comparable) fbp.a(c));
        }

        /* access modifiers changed from: 0000 */
        public final BoundType a() {
            return BoundType.CLOSED;
        }

        /* access modifiers changed from: 0000 */
        public final Cut<C> a(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass1.a[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                Comparable b = discreteDomain.b(this.endpoint);
                return b == null ? BelowAll.a : new AboveValue(b);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final C a(DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        /* access modifiers changed from: 0000 */
        public final void a(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(C c) {
            return Range.c(this.endpoint, c) <= 0;
        }

        /* access modifiers changed from: 0000 */
        public final BoundType b() {
            return BoundType.OPEN;
        }

        /* access modifiers changed from: 0000 */
        public final Cut<C> b(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = AnonymousClass1.a[boundType.ordinal()];
            if (i == 1) {
                Comparable b = discreteDomain.b(this.endpoint);
                return b == null ? AboveAll.a : new AboveValue(b);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        public final C b(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.b(this.endpoint);
        }

        /* access modifiers changed from: 0000 */
        public final void b(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return Cut.super.compareTo((Cut) obj);
        }

        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\\");
            sb.append(this.endpoint);
            sb.append("/");
            return sb.toString();
        }
    }

    Cut(C c) {
        this.endpoint = c;
    }

    static <C extends Comparable> Cut<C> b(C c) {
        return new BelowValue(c);
    }

    static <C extends Comparable> Cut<C> c(C c) {
        return new AboveValue(c);
    }

    static <C extends Comparable> Cut<C> d() {
        return BelowAll.a;
    }

    static <C extends Comparable> Cut<C> e() {
        return AboveAll.a;
    }

    /* renamed from: a */
    public int compareTo(Cut<C> cut) {
        if (cut == BelowAll.a) {
            return 1;
        }
        if (cut == AboveAll.a) {
            return -1;
        }
        int c = Range.c(this.endpoint, cut.endpoint);
        return c != 0 ? c : fet.a(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public abstract BoundType a();

    /* access modifiers changed from: 0000 */
    public abstract Cut<C> a(BoundType boundType, DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: 0000 */
    public abstract C a(DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: 0000 */
    public abstract void a(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    public abstract boolean a(C c);

    public abstract BoundType b();

    /* access modifiers changed from: 0000 */
    public abstract Cut<C> b(BoundType boundType, DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: 0000 */
    public abstract C b(DiscreteDomain<C> discreteDomain);

    /* access modifiers changed from: 0000 */
    public abstract void b(StringBuilder sb);

    public C c() {
        return this.endpoint;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
