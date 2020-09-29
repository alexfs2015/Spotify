package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

final class GeneralRange<T> implements Serializable {
    final Comparator<? super T> comparator;
    final boolean hasLowerBound;
    final boolean hasUpperBound;
    final BoundType lowerBoundType;
    final T lowerEndpoint;
    final BoundType upperBoundType;
    final T upperEndpoint;

    static <T> GeneralRange<T> a(Comparator<? super T> comparator2) {
        GeneralRange generalRange = new GeneralRange(comparator2, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
        return generalRange;
    }

    static <T> GeneralRange<T> a(Comparator<? super T> comparator2, T t, BoundType boundType) {
        GeneralRange generalRange = new GeneralRange(comparator2, true, t, boundType, false, null, BoundType.OPEN);
        return generalRange;
    }

    static <T> GeneralRange<T> b(Comparator<? super T> comparator2, T t, BoundType boundType) {
        GeneralRange generalRange = new GeneralRange(comparator2, false, null, BoundType.OPEN, true, t, boundType);
        return generalRange;
    }

    private GeneralRange(Comparator<? super T> comparator2, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        this.comparator = (Comparator) fay.a(comparator2);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) fay.a(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) fay.a(boundType2);
        if (z) {
            comparator2.compare(t, t);
        }
        if (z2) {
            comparator2.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator2.compare(t, t2);
            boolean z3 = true;
            fay.a(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                boolean z4 = boundType != BoundType.OPEN;
                if (boundType2 == BoundType.OPEN) {
                    z3 = false;
                }
                fay.a(z4 | z3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean c(T t) {
        return !a(t) && !b(t);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r11.upperBoundType != com.google.common.collect.BoundType.OPEN) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r11.lowerBoundType != com.google.common.collect.BoundType.OPEN) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.GeneralRange<T> a(com.google.common.collect.GeneralRange<T> r11) {
        /*
            r10 = this;
            defpackage.fay.a(r11)
            java.util.Comparator<? super T> r0 = r10.comparator
            java.util.Comparator<? super T> r1 = r11.comparator
            boolean r0 = r0.equals(r1)
            defpackage.fay.a(r0)
            boolean r0 = r10.hasLowerBound
            T r1 = r10.lowerEndpoint
            com.google.common.collect.BoundType r2 = r10.lowerBoundType
            if (r0 != 0) goto L_0x0019
            boolean r0 = r11.hasLowerBound
            goto L_0x002f
        L_0x0019:
            boolean r3 = r11.hasLowerBound
            if (r3 == 0) goto L_0x0033
            java.util.Comparator<? super T> r3 = r10.comparator
            T r4 = r11.lowerEndpoint
            int r3 = r3.compare(r1, r4)
            if (r3 < 0) goto L_0x002f
            if (r3 != 0) goto L_0x0033
            com.google.common.collect.BoundType r3 = r11.lowerBoundType
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L_0x0033
        L_0x002f:
            T r1 = r11.lowerEndpoint
            com.google.common.collect.BoundType r2 = r11.lowerBoundType
        L_0x0033:
            r4 = r0
            boolean r0 = r10.hasUpperBound
            T r3 = r10.upperEndpoint
            com.google.common.collect.BoundType r5 = r10.upperBoundType
            if (r0 != 0) goto L_0x003f
            boolean r0 = r11.hasUpperBound
            goto L_0x0055
        L_0x003f:
            boolean r6 = r11.hasUpperBound
            if (r6 == 0) goto L_0x0059
            java.util.Comparator<? super T> r6 = r10.comparator
            T r7 = r11.upperEndpoint
            int r6 = r6.compare(r3, r7)
            if (r6 > 0) goto L_0x0055
            if (r6 != 0) goto L_0x0059
            com.google.common.collect.BoundType r6 = r11.upperBoundType
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            if (r6 != r7) goto L_0x0059
        L_0x0055:
            T r3 = r11.upperEndpoint
            com.google.common.collect.BoundType r5 = r11.upperBoundType
        L_0x0059:
            r7 = r0
            r8 = r3
            if (r4 == 0) goto L_0x0079
            if (r7 == 0) goto L_0x0079
            java.util.Comparator<? super T> r11 = r10.comparator
            int r11 = r11.compare(r1, r8)
            if (r11 > 0) goto L_0x0071
            if (r11 != 0) goto L_0x0079
            com.google.common.collect.BoundType r11 = com.google.common.collect.BoundType.OPEN
            if (r2 != r11) goto L_0x0079
            com.google.common.collect.BoundType r11 = com.google.common.collect.BoundType.OPEN
            if (r5 != r11) goto L_0x0079
        L_0x0071:
            com.google.common.collect.BoundType r11 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r6 = r11
            r9 = r0
            r5 = r8
            goto L_0x007c
        L_0x0079:
            r6 = r2
            r9 = r5
            r5 = r1
        L_0x007c:
            com.google.common.collect.GeneralRange r11 = new com.google.common.collect.GeneralRange
            java.util.Comparator<? super T> r3 = r10.comparator
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.GeneralRange.a(com.google.common.collect.GeneralRange):com.google.common.collect.GeneralRange");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && this.lowerBoundType.equals(generalRange.lowerBoundType) && this.upperBoundType.equals(generalRange.upperBoundType) && faw.a(this.lowerEndpoint, generalRange.lowerEndpoint) && faw.a(this.upperEndpoint, generalRange.upperEndpoint)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.comparator, this.lowerEndpoint, this.lowerBoundType, this.upperEndpoint, this.upperBoundType});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comparator);
        sb.append(":");
        sb.append(this.lowerBoundType == BoundType.CLOSED ? '[' : '(');
        sb.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb.append(',');
        sb.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb.append(this.upperBoundType == BoundType.CLOSED ? ']' : ')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(T t) {
        if (!this.hasLowerBound) {
            return false;
        }
        int compare = this.comparator.compare(t, this.lowerEndpoint);
        boolean z = true;
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (this.lowerBoundType != BoundType.OPEN) {
            z = false;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(T t) {
        if (!this.hasUpperBound) {
            return false;
        }
        int compare = this.comparator.compare(t, this.upperEndpoint);
        boolean z = true;
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (this.upperBoundType != BoundType.OPEN) {
            z = false;
        }
        return (z3 & z) | z2;
    }
}
