package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;

public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements faz<C>, Serializable {
    private static final Range<Comparable> a = new Range<>(Cut.d(), Cut.e());
    private static final long serialVersionUID = 0;
    public final Cut<C> lowerBound;
    public final Cut<C> upperBound;

    /* renamed from: com.google.common.collect.Range$1 reason: invalid class name */
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
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.AnonymousClass1.<clinit>():void");
        }
    }

    static <C extends Comparable<?>> Range<C> a(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> a(C c, C c2) {
        return a(Cut.b(c), Cut.c(c2));
    }

    public static <C extends Comparable<?>> Range<C> b(C c, C c2) {
        return a(Cut.b(c), Cut.b(c2));
    }

    public static <C extends Comparable<?>> Range<C> a(C c, BoundType boundType, C c2, BoundType boundType2) {
        fay.a(boundType);
        fay.a(boundType2);
        return a(boundType == BoundType.OPEN ? Cut.c(c) : Cut.b(c), boundType2 == BoundType.OPEN ? Cut.b(c2) : Cut.c(c2));
    }

    public static <C extends Comparable<?>> Range<C> a(C c) {
        return a(Cut.d(), Cut.c(c));
    }

    public static <C extends Comparable<?>> Range<C> a(C c, BoundType boundType) {
        int i = AnonymousClass1.a[boundType.ordinal()];
        if (i == 1) {
            return a(Cut.d(), Cut.b(c));
        }
        if (i == 2) {
            return a(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> b(C c) {
        return a(Cut.b(c), Cut.e());
    }

    public static <C extends Comparable<?>> Range<C> b(C c, BoundType boundType) {
        int i = AnonymousClass1.a[boundType.ordinal()];
        if (i == 1) {
            return a(Cut.c(c), Cut.e());
        }
        if (i == 2) {
            return b(c);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> a() {
        return a;
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
        this.lowerBound = (Cut) fay.a(cut);
        this.upperBound = (Cut) fay.a(cut2);
        if (cut.compareTo(cut2) > 0 || cut == Cut.e() || cut2 == Cut.d()) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            sb.append(b(cut, cut2));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean b() {
        return this.lowerBound != Cut.d();
    }

    public final boolean c() {
        return this.upperBound != Cut.e();
    }

    public final boolean d() {
        return this.lowerBound.equals(this.upperBound);
    }

    /* renamed from: c */
    public final boolean apply(C c) {
        fay.a(c);
        return this.lowerBound.a(c) && !this.upperBound.a(c);
    }

    public final Range<C> a(Range<C> range) {
        int a2 = this.lowerBound.compareTo(range.lowerBound);
        int a3 = this.upperBound.compareTo(range.upperBound);
        if (a2 >= 0 && a3 <= 0) {
            return this;
        }
        if (a2 <= 0 && a3 >= 0) {
            return range;
        }
        return a(a2 >= 0 ? this.lowerBound : range.lowerBound, a3 <= 0 ? this.upperBound : range.upperBound);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public final String toString() {
        return b(this.lowerBound, this.upperBound);
    }

    private static String b(Cut<?> cut, Cut<?> cut2) {
        StringBuilder sb = new StringBuilder(16);
        cut.a(sb);
        sb.append("..");
        cut2.b(sb);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final Object readResolve() {
        return equals(a) ? a : this;
    }

    static int c(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
