package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

public final class TreeMultiset<E> extends fcj<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient b<a<E>> a;
    /* access modifiers changed from: private */
    public final transient GeneralRange<E> b;
    /* access modifiers changed from: private */
    public final transient a<E> c;

    /* renamed from: com.google.common.collect.TreeMultiset$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.AnonymousClass4.<clinit>():void");
        }
    }

    enum Aggregate {
        SIZE {
            /* access modifiers changed from: 0000 */
            public final int a(a<?> aVar) {
                return aVar.b;
            }

            /* access modifiers changed from: 0000 */
            public final long b(a<?> aVar) {
                if (aVar == null) {
                    return 0;
                }
                return aVar.d;
            }
        },
        DISTINCT {
            /* access modifiers changed from: 0000 */
            public final int a(a<?> aVar) {
                return 1;
            }

            /* access modifiers changed from: 0000 */
            public final long b(a<?> aVar) {
                if (aVar == null) {
                    return 0;
                }
                return (long) aVar.c;
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract int a(a<?> aVar);

        /* access modifiers changed from: 0000 */
        public abstract long b(a<?> aVar);
    }

    static final class a<E> {
        final E a;
        int b;
        int c;
        long d;
        a<E> e;
        a<E> f;
        a<E> g;
        a<E> h;
        private int i;

        a(E e2, int i2) {
            fbp.a(i2 > 0);
            this.a = e2;
            this.b = i2;
            this.d = (long) i2;
            this.c = 1;
            this.i = 1;
            this.e = null;
            this.f = null;
        }

        private a<E> a() {
            int i2 = this.b;
            this.b = 0;
            TreeMultiset.b(this.g, this.h);
            a<E> aVar = this.e;
            if (aVar == null) {
                return this.f;
            }
            a<E> aVar2 = this.f;
            if (aVar2 == null) {
                return aVar;
            }
            if (aVar.i >= aVar2.i) {
                a<E> aVar3 = this.g;
                aVar3.e = aVar.b(aVar3);
                aVar3.f = this.f;
                aVar3.c = this.c - 1;
                aVar3.d = this.d - ((long) i2);
                return aVar3.d();
            }
            a<E> aVar4 = this.h;
            aVar4.f = aVar2.a(aVar4);
            aVar4.e = this.e;
            aVar4.c = this.c - 1;
            aVar4.d = this.d - ((long) i2);
            return aVar4.d();
        }

        private a<E> a(a<E> aVar) {
            a<E> aVar2 = this.e;
            if (aVar2 == null) {
                return this.f;
            }
            this.e = aVar2.a(aVar);
            this.c--;
            this.d -= (long) aVar.b;
            return d();
        }

        private a<E> a(E e2, int i2) {
            this.f = new a<>(e2, i2);
            TreeMultiset.b(this, this.f, this.h);
            this.i = Math.max(2, this.i);
            this.c++;
            this.d += (long) i2;
            return this;
        }

        private a<E> b(a<E> aVar) {
            a<E> aVar2 = this.f;
            if (aVar2 == null) {
                return this.e;
            }
            this.f = aVar2.b(aVar);
            this.c--;
            this.d -= (long) aVar.b;
            return d();
        }

        private a<E> b(E e2, int i2) {
            this.e = new a<>(e2, i2);
            TreeMultiset.b(this.g, this.e, this);
            this.i = Math.max(2, this.i);
            this.c++;
            this.d += (long) i2;
            return this;
        }

        private void b() {
            this.i = Math.max(d(this.e), d(this.f)) + 1;
        }

        private static long c(a<?> aVar) {
            if (aVar == null) {
                return 0;
            }
            return aVar.d;
        }

        private void c() {
            this.c = TreeMultiset.a(this.e) + 1 + TreeMultiset.a(this.f);
            this.d = ((long) this.b) + c(this.e) + c(this.f);
            b();
        }

        private static int d(a<?> aVar) {
            if (aVar == null) {
                return 0;
            }
            return aVar.i;
        }

        private a<E> d() {
            int e2 = e();
            if (e2 == -2) {
                if (this.f.e() > 0) {
                    this.f = this.f.g();
                }
                return f();
            } else if (e2 != 2) {
                b();
                return this;
            } else {
                if (this.e.e() < 0) {
                    this.e = this.e.f();
                }
                return g();
            }
        }

        private int e() {
            return d(this.e) - d(this.f);
        }

        private a<E> f() {
            fbp.b(this.f != null);
            a<E> aVar = this.f;
            this.f = aVar.e;
            aVar.e = this;
            aVar.d = this.d;
            aVar.c = this.c;
            c();
            aVar.b();
            return aVar;
        }

        private a<E> g() {
            fbp.b(this.e != null);
            a<E> aVar = this.e;
            this.e = aVar.f;
            aVar.f = this;
            aVar.d = this.d;
            aVar.c = this.c;
            c();
            aVar.b();
            return aVar;
        }

        public final int a(Comparator<? super E> comparator, E e2) {
            a aVar = this;
            while (true) {
                int compare = comparator.compare(e2, aVar.a);
                if (compare < 0) {
                    aVar = aVar.e;
                    if (aVar == null) {
                        return 0;
                    }
                } else if (compare <= 0) {
                    return aVar.b;
                } else {
                    aVar = aVar.f;
                    if (aVar == null) {
                        return 0;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final a<E> a(Comparator<? super E> comparator, E e2, int i2, int i3, int[] iArr) {
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                a<E> aVar = this.e;
                if (aVar == null) {
                    iArr[0] = 0;
                    return (i2 != 0 || i3 <= 0) ? this : b(e2, i3);
                }
                this.e = aVar.a(comparator, e2, i2, i3, iArr);
                if (iArr[0] == i2) {
                    if (i3 == 0 && iArr[0] != 0) {
                        this.c--;
                    } else if (i3 > 0 && iArr[0] == 0) {
                        this.c++;
                    }
                    this.d += (long) (i3 - iArr[0]);
                }
                return d();
            } else if (compare > 0) {
                a<E> aVar2 = this.f;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    return (i2 != 0 || i3 <= 0) ? this : a(e2, i3);
                }
                this.f = aVar2.a(comparator, e2, i2, i3, iArr);
                if (iArr[0] == i2) {
                    if (i3 == 0 && iArr[0] != 0) {
                        this.c--;
                    } else if (i3 > 0 && iArr[0] == 0) {
                        this.c++;
                    }
                    this.d += (long) (i3 - iArr[0]);
                }
                return d();
            } else {
                int i4 = this.b;
                iArr[0] = i4;
                if (i2 == i4) {
                    if (i3 == 0) {
                        return a();
                    }
                    this.d += (long) (i3 - i4);
                    this.b = i3;
                }
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        public final a<E> a(Comparator<? super E> comparator, E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.a);
            boolean z = true;
            if (compare < 0) {
                a<E> aVar = this.e;
                if (aVar == null) {
                    iArr[0] = 0;
                    return b(e2, i2);
                }
                int i3 = aVar.i;
                this.e = aVar.a(comparator, e2, i2, iArr);
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) i2;
                return this.e.i == i3 ? this : d();
            } else if (compare > 0) {
                a<E> aVar2 = this.f;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    return a(e2, i2);
                }
                int i4 = aVar2.i;
                this.f = aVar2.a(comparator, e2, i2, iArr);
                if (iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) i2;
                return this.f.i == i4 ? this : d();
            } else {
                int i5 = this.b;
                iArr[0] = i5;
                long j = (long) i2;
                if (((long) i5) + j > 2147483647L) {
                    z = false;
                }
                fbp.a(z);
                this.b += i2;
                this.d += j;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        public a<E> b(Comparator<? super E> comparator, E e2) {
            a aVar = this;
            do {
                int compare = comparator.compare(e2, aVar.a);
                if (compare < 0) {
                    a<E> aVar2 = aVar.e;
                    return aVar2 == null ? aVar : (a) fbm.a(aVar2.b(comparator, e2), aVar);
                } else if (compare == 0) {
                    return aVar;
                } else {
                    aVar = aVar.f;
                }
            } while (aVar != null);
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final a<E> b(Comparator<? super E> comparator, E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                a<E> aVar = this.e;
                if (aVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.e = aVar.b(comparator, e2, i2, iArr);
                if (iArr[0] > 0) {
                    if (i2 >= iArr[0]) {
                        this.c--;
                        this.d -= (long) iArr[0];
                    } else {
                        this.d -= (long) i2;
                    }
                }
                return iArr[0] == 0 ? this : d();
            } else if (compare > 0) {
                a<E> aVar2 = this.f;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f = aVar2.b(comparator, e2, i2, iArr);
                if (iArr[0] > 0) {
                    if (i2 >= iArr[0]) {
                        this.c--;
                        this.d -= (long) iArr[0];
                    } else {
                        this.d -= (long) i2;
                    }
                }
                return d();
            } else {
                int i3 = this.b;
                iArr[0] = i3;
                if (i2 >= i3) {
                    return a();
                }
                this.b = i3 - i2;
                this.d -= (long) i2;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        public a<E> c(Comparator<? super E> comparator, E e2) {
            a aVar = this;
            do {
                int compare = comparator.compare(e2, aVar.a);
                if (compare > 0) {
                    a<E> aVar2 = aVar.f;
                    return aVar2 == null ? aVar : (a) fbm.a(aVar2.c(comparator, e2), aVar);
                } else if (compare == 0) {
                    return aVar;
                } else {
                    aVar = aVar.e;
                }
            } while (aVar != null);
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final a<E> c(Comparator<? super E> comparator, E e2, int i2, int[] iArr) {
            int compare = comparator.compare(e2, this.a);
            if (compare < 0) {
                a<E> aVar = this.e;
                if (aVar == null) {
                    iArr[0] = 0;
                    return i2 > 0 ? b(e2, i2) : this;
                }
                this.e = aVar.c(comparator, e2, i2, iArr);
                if (i2 == 0 && iArr[0] != 0) {
                    this.c--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) (i2 - iArr[0]);
                return d();
            } else if (compare > 0) {
                a<E> aVar2 = this.f;
                if (aVar2 == null) {
                    iArr[0] = 0;
                    return i2 > 0 ? a(e2, i2) : this;
                }
                this.f = aVar2.c(comparator, e2, i2, iArr);
                if (i2 == 0 && iArr[0] != 0) {
                    this.c--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.c++;
                }
                this.d += (long) (i2 - iArr[0]);
                return d();
            } else {
                int i3 = this.b;
                iArr[0] = i3;
                if (i2 == 0) {
                    return a();
                }
                this.d += (long) (i2 - i3);
                this.b = i2;
                return this;
            }
        }

        public final String toString() {
            return Multisets.a(this.a, this.b).toString();
        }
    }

    static final class b<T> {
        T a;

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a(T t, T t2) {
            if (this.a == t) {
                this.a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    private TreeMultiset(b<a<E>> bVar, GeneralRange<E> generalRange, a<E> aVar) {
        super(generalRange.comparator);
        this.a = bVar;
        this.b = generalRange;
        this.c = aVar;
    }

    private TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.b = GeneralRange.a(comparator);
        this.c = new a<>(null, 1);
        a<E> aVar = this.c;
        b(aVar, aVar);
        this.a = new b<>(0);
    }

    static int a(a<?> aVar) {
        if (aVar == null) {
            return 0;
        }
        return aVar.c;
    }

    private long a(Aggregate aggregate) {
        a aVar = (a) this.a.a;
        long b2 = aggregate.b(aVar);
        if (this.b.hasLowerBound) {
            b2 -= a(aggregate, aVar);
        }
        return this.b.hasUpperBound ? b2 - b(aggregate, aVar) : b2;
    }

    private long a(Aggregate aggregate, a<E> aVar) {
        long b2;
        long a2;
        while (aVar != null) {
            int compare = comparator().compare(this.b.lowerEndpoint, aVar.a);
            if (compare < 0) {
                aVar = aVar.e;
            } else {
                if (compare == 0) {
                    int i = AnonymousClass4.a[this.b.lowerBoundType.ordinal()];
                    if (i == 1) {
                        b2 = (long) aggregate.a(aVar);
                        a2 = aggregate.b(aVar.e);
                    } else if (i == 2) {
                        return aggregate.b(aVar.e);
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    b2 = aggregate.b(aVar.e) + ((long) aggregate.a(aVar));
                    a2 = a(aggregate, aVar.f);
                }
                return b2 + a2;
            }
        }
        return 0;
    }

    static /* synthetic */ a a(TreeMultiset treeMultiset) {
        a<E> aVar;
        if (((a) treeMultiset.a.a) == null) {
            return null;
        }
        if (treeMultiset.b.hasLowerBound) {
            T t = treeMultiset.b.lowerEndpoint;
            aVar = ((a) treeMultiset.a.a).b(treeMultiset.comparator(), t);
            if (aVar == null) {
                return null;
            }
            if (treeMultiset.b.lowerBoundType == BoundType.OPEN && treeMultiset.comparator().compare(t, aVar.a) == 0) {
                aVar = aVar.h;
            }
        } else {
            aVar = treeMultiset.c.h;
        }
        if (aVar == treeMultiset.c || !treeMultiset.b.c(aVar.a)) {
            return null;
        }
        return aVar;
    }

    static /* synthetic */ defpackage.fdh.a a(TreeMultiset treeMultiset, final a aVar) {
        return new com.google.common.collect.Multisets.a<E>() {
            public final int a() {
                int i = aVar.b;
                return i == 0 ? TreeMultiset.this.a(b()) : i;
            }

            public final E b() {
                return aVar.a;
            }
        };
    }

    private long b(Aggregate aggregate, a<E> aVar) {
        long b2;
        long b3;
        while (aVar != null) {
            int compare = comparator().compare(this.b.upperEndpoint, aVar.a);
            if (compare > 0) {
                aVar = aVar.f;
            } else {
                if (compare == 0) {
                    int i = AnonymousClass4.a[this.b.upperBoundType.ordinal()];
                    if (i == 1) {
                        b2 = (long) aggregate.a(aVar);
                        b3 = aggregate.b(aVar.f);
                    } else if (i == 2) {
                        return aggregate.b(aVar.f);
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    b2 = aggregate.b(aVar.f) + ((long) aggregate.a(aVar));
                    b3 = b(aggregate, aVar.e);
                }
                return b2 + b3;
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static <T> void b(a<T> aVar, a<T> aVar2) {
        aVar.h = aVar2;
        aVar2.g = aVar;
    }

    /* access modifiers changed from: private */
    public static <T> void b(a<T> aVar, a<T> aVar2, a<T> aVar3) {
        b(aVar, aVar2);
        b(aVar2, aVar3);
    }

    static /* synthetic */ a d(TreeMultiset treeMultiset) {
        a<E> aVar;
        if (((a) treeMultiset.a.a) == null) {
            return null;
        }
        if (treeMultiset.b.hasUpperBound) {
            T t = treeMultiset.b.upperEndpoint;
            aVar = ((a) treeMultiset.a.a).c(treeMultiset.comparator(), t);
            if (aVar == null) {
                return null;
            }
            if (treeMultiset.b.upperBoundType == BoundType.OPEN && treeMultiset.comparator().compare(t, aVar.a) == 0) {
                aVar = aVar.g;
            }
        } else {
            aVar = treeMultiset.c.g;
        }
        if (aVar == treeMultiset.c || !treeMultiset.b.c(aVar.a)) {
            return null;
        }
        return aVar;
    }

    public static <E extends Comparable> TreeMultiset<E> n() {
        return new TreeMultiset<>(fdl.b());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Class<TreeMultiset> cls = TreeMultiset.class;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        fdn.a(fcj.class, "comparator").a(this, (Object) comparator);
        fdn.a(cls, "range").a(this, (Object) GeneralRange.a(comparator));
        fdn.a(cls, "rootReference").a(this, (Object) new b(0));
        a aVar = new a(null, 1);
        fdn.a(cls, "header").a(this, (Object) aVar);
        b(aVar, aVar);
        fdn.a((fdh<E>) this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.d().comparator());
        fdn.a((fdh<E>) this, objectOutputStream);
    }

    public final /* bridge */ /* synthetic */ Set S_() {
        return super.S_();
    }

    public final int a(Object obj) {
        try {
            a aVar = (a) this.a.a;
            if (this.b.c(obj)) {
                if (aVar != null) {
                    return aVar.a(comparator(), obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public final int a(E e, int i) {
        fcl.a(i, "occurrences");
        if (i == 0) {
            return a((Object) e);
        }
        fbp.a(this.b.c(e));
        a aVar = (a) this.a.a;
        if (aVar == null) {
            comparator().compare(e, e);
            a aVar2 = new a(e, i);
            a<E> aVar3 = this.c;
            b(aVar3, aVar2, aVar3);
            this.a.a(aVar, aVar2);
            return 0;
        }
        int[] iArr = new int[1];
        this.a.a(aVar, aVar.a(comparator(), e, i, iArr));
        return iArr[0];
    }

    public final /* bridge */ /* synthetic */ fdr a(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.a(obj, boundType, obj2, boundType2);
    }

    public final Iterator<E> a() {
        return Multisets.a(b());
    }

    public final boolean a(E e, int i, int i2) {
        fcl.a(i2, "newCount");
        fcl.a(i, "oldCount");
        fbp.a(this.b.c(e));
        a aVar = (a) this.a.a;
        if (aVar != null) {
            int[] iArr = new int[1];
            this.a.a(aVar, aVar.a(comparator(), e, i, i2, iArr));
            return iArr[0] == i;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                a(e, i2);
            }
            return true;
        }
    }

    public final int b(Object obj, int i) {
        fcl.a(i, "occurrences");
        if (i == 0) {
            return a(obj);
        }
        a aVar = (a) this.a.a;
        int[] iArr = new int[1];
        try {
            if (this.b.c(obj)) {
                if (aVar != null) {
                    this.a.a(aVar, aVar.b(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public final Iterator<defpackage.fdh.a<E>> b() {
        return new Iterator<defpackage.fdh.a<E>>() {
            private a<E> a = TreeMultiset.a(TreeMultiset.this);
            private defpackage.fdh.a<E> b;

            public final boolean hasNext() {
                if (this.a == null) {
                    return false;
                }
                if (!TreeMultiset.this.b.b(this.a.a)) {
                    return true;
                }
                this.a = null;
                return false;
            }

            public final /* synthetic */ Object next() {
                if (hasNext()) {
                    defpackage.fdh.a<E> a2 = TreeMultiset.a(TreeMultiset.this, (a) this.a);
                    this.b = a2;
                    if (this.a.h == TreeMultiset.this.c) {
                        this.a = null;
                    } else {
                        this.a = this.a.h;
                    }
                    return a2;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                fbp.b(this.b != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.c(this.b.b(), 0);
                this.b = null;
            }
        };
    }

    public final int c() {
        return fev.b(a(Aggregate.DISTINCT));
    }

    public final int c(E e, int i) {
        fcl.a(i, "count");
        boolean z = true;
        if (!this.b.c(e)) {
            if (i != 0) {
                z = false;
            }
            fbp.a(z);
            return 0;
        }
        a aVar = (a) this.a.a;
        if (aVar == null) {
            if (i > 0) {
                a(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.a.a(aVar, aVar.c(comparator(), e, i, iArr));
        return iArr[0];
    }

    public final fdr<E> c(E e, BoundType boundType) {
        return new TreeMultiset(this.a, this.b.a(GeneralRange.a(comparator(), e, boundType)), this.c);
    }

    public final void clear() {
        if (this.b.hasLowerBound || this.b.hasUpperBound) {
            Iterators.c(b());
            return;
        }
        a<E> aVar = this.c.h;
        while (true) {
            a<E> aVar2 = this.c;
            if (aVar != aVar2) {
                a<E> aVar3 = aVar.h;
                aVar.b = 0;
                aVar.e = null;
                aVar.f = null;
                aVar.g = null;
                aVar.h = null;
                aVar = aVar3;
            } else {
                b(aVar2, aVar2);
                this.a.a = null;
                return;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final fdr<E> d(E e, BoundType boundType) {
        return new TreeMultiset(this.a, this.b.a(GeneralRange.b(comparator(), e, boundType)), this.c);
    }

    public final /* bridge */ /* synthetic */ NavigableSet g() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ defpackage.fdh.a h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ defpackage.fdh.a i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final Iterator<E> iterator() {
        return Multisets.a((fdh<E>) this);
    }

    public final /* bridge */ /* synthetic */ defpackage.fdh.a j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ defpackage.fdh.a k() {
        return super.k();
    }

    public final Iterator<defpackage.fdh.a<E>> l() {
        return new Iterator<defpackage.fdh.a<E>>() {
            private a<E> a = TreeMultiset.d(TreeMultiset.this);
            private defpackage.fdh.a<E> b = null;

            public final boolean hasNext() {
                if (this.a == null) {
                    return false;
                }
                if (!TreeMultiset.this.b.a(this.a.a)) {
                    return true;
                }
                this.a = null;
                return false;
            }

            public final /* synthetic */ Object next() {
                if (hasNext()) {
                    defpackage.fdh.a<E> a2 = TreeMultiset.a(TreeMultiset.this, (a) this.a);
                    this.b = a2;
                    if (this.a.g == TreeMultiset.this.c) {
                        this.a = null;
                    } else {
                        this.a = this.a.g;
                    }
                    return a2;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                fbp.b(this.b != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.c(this.b.b(), 0);
                this.b = null;
            }
        };
    }

    public final /* bridge */ /* synthetic */ fdr m() {
        return super.m();
    }

    public final int size() {
        return fev.b(a(Aggregate.SIZE));
    }
}
