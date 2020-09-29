package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements fcp<E> {
    private transient ImmutableList<E> a;
    private transient ImmutableSet<defpackage.fcp.a<E>> b;

    final class EntrySet extends IndexedImmutableSet<defpackage.fcp.a<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return ImmutableMultiset.this.c();
        }

        public final int size() {
            return ImmutableMultiset.this.d().size();
        }

        public final boolean contains(Object obj) {
            if (obj instanceof defpackage.fcp.a) {
                defpackage.fcp.a aVar = (defpackage.fcp.a) obj;
                if (aVar.a() > 0 && ImmutableMultiset.this.a(aVar.b()) == aVar.a()) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ Object a(int i) {
            return ImmutableMultiset.this.a(i);
        }
    }

    static class EntrySetSerializedForm<E> implements Serializable {
        final ImmutableMultiset<E> multiset;

        EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.multiset.S_();
        }
    }

    public static class a<E> extends b<E> {
        private fcr<E> a;
        private boolean b;
        private boolean c;

        public a() {
            this(4);
        }

        a(int i) {
            this.b = false;
            this.c = false;
            this.a = new fcr<>(i);
        }

        a(byte b2) {
            this.b = false;
            this.c = false;
            this.a = null;
        }

        /* renamed from: a */
        public a<E> b(E e) {
            return a(e, 1);
        }

        /* renamed from: b */
        public a<E> a(E... eArr) {
            super.a(eArr);
            return this;
        }

        public a<E> a(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.b) {
                this.a = new fcr<>(this.a);
                this.c = false;
            }
            this.b = false;
            fay.a(e);
            fcr<E> fcr = this.a;
            fcr.a(e, i + fcr.b((Object) e));
            return this;
        }

        /* renamed from: b */
        public a<E> a(Iterable<? extends E> iterable) {
            if (iterable instanceof fcp) {
                fcp fcp = (fcp) iterable;
                fcr<E> fcr = fcp instanceof RegularImmutableMultiset ? ((RegularImmutableMultiset) fcp).b : fcp instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) fcp).a : null;
                if (fcr != null) {
                    fcr<E> fcr2 = this.a;
                    fcr2.e(Math.max(fcr2.c, fcr.c));
                    for (int a2 = fcr.a(); a2 >= 0; a2 = fcr.a(a2)) {
                        a(fcr.b(a2), fcr.c(a2));
                    }
                } else {
                    Set S_ = fcp.S_();
                    fcr<E> fcr3 = this.a;
                    fcr3.e(Math.max(fcr3.c, S_.size()));
                    for (defpackage.fcp.a aVar : fcp.S_()) {
                        a(aVar.b(), aVar.a());
                    }
                }
            } else {
                super.a(iterable);
            }
            return this;
        }

        /* renamed from: b */
        public a<E> a(Iterator<? extends E> it) {
            super.a(it);
            return this;
        }

        /* renamed from: b */
        public ImmutableMultiset<E> a() {
            if (this.a.c == 0) {
                return ImmutableMultiset.p();
            }
            this.b = true;
            return new RegularImmutableMultiset(this.a);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.fcp.a<E> a(int i);

    /* renamed from: e */
    public abstract ImmutableSet<E> d();

    /* access modifiers changed from: 0000 */
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> p() {
        return RegularImmutableMultiset.a;
    }

    ImmutableMultiset() {
    }

    /* renamed from: R_ */
    public final fdh<E> iterator() {
        final fdh R_ = S_().iterator();
        return new fdh<E>() {
            private int a;
            private E b;

            public final boolean hasNext() {
                return this.a > 0 || R_.hasNext();
            }

            public final E next() {
                if (this.a <= 0) {
                    defpackage.fcp.a aVar = (defpackage.fcp.a) R_.next();
                    this.b = aVar.b();
                    this.a = aVar.a();
                }
                this.a--;
                return this.b;
            }
        };
    }

    public final ImmutableList<E> f() {
        ImmutableList<E> immutableList = this.a;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> f = super.f();
        this.a = f;
        return f;
    }

    public boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Deprecated
    public final int a(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final int b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final int c(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean a(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        fdh R_ = S_().iterator();
        while (R_.hasNext()) {
            defpackage.fcp.a aVar = (defpackage.fcp.a) R_.next();
            Arrays.fill(objArr, i, aVar.a() + i, aVar.b());
            i += aVar.a();
        }
        return i;
    }

    public boolean equals(Object obj) {
        return Multisets.a((fcp<?>) this, obj);
    }

    public int hashCode() {
        return Sets.a((Set<?>) S_());
    }

    public String toString() {
        return S_().toString();
    }

    /* renamed from: q */
    public final ImmutableSet<defpackage.fcp.a<E>> S_() {
        ImmutableSet<defpackage.fcp.a<E>> immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<defpackage.fcp.a<E>> b2 = b();
        this.b = b2;
        return b2;
    }

    private ImmutableSet<defpackage.fcp.a<E>> b() {
        return isEmpty() ? ImmutableSet.h() : new EntrySet(this, 0);
    }

    public static <E> a<E> r() {
        return new a<>();
    }
}
