package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements fdh<E> {
    private transient ImmutableList<E> a;
    private transient ImmutableSet<defpackage.fdh.a<E>> b;

    final class EntrySet extends IndexedImmutableSet<defpackage.fdh.a<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ Object a(int i) {
            return ImmutableMultiset.this.a(i);
        }

        /* access modifiers changed from: 0000 */
        public final boolean c() {
            return ImmutableMultiset.this.c();
        }

        public final boolean contains(Object obj) {
            if (obj instanceof defpackage.fdh.a) {
                defpackage.fdh.a aVar = (defpackage.fdh.a) obj;
                if (aVar.a() > 0 && ImmutableMultiset.this.a(aVar.b()) == aVar.a()) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        public final int size() {
            return ImmutableMultiset.this.d().size();
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
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
        private fdj<E> a;
        private boolean b;
        private boolean c;

        public a() {
            this(4);
        }

        a(byte b2) {
            this.b = false;
            this.c = false;
            this.a = null;
        }

        a(int i) {
            this.b = false;
            this.c = false;
            this.a = new fdj<>(i);
        }

        /* renamed from: a */
        public a<E> b(E e) {
            return a(e, 1);
        }

        public a<E> a(E e, int i) {
            if (i == 0) {
                return this;
            }
            if (this.b) {
                this.a = new fdj<>(this.a);
                this.c = false;
            }
            this.b = false;
            fbp.a(e);
            fdj<E> fdj = this.a;
            fdj.a(e, i + fdj.b((Object) e));
            return this;
        }

        /* renamed from: b */
        public a<E> a(Iterable<? extends E> iterable) {
            if (iterable instanceof fdh) {
                fdh fdh = (fdh) iterable;
                fdj<E> fdj = fdh instanceof RegularImmutableMultiset ? ((RegularImmutableMultiset) fdh).b : fdh instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) fdh).a : null;
                if (fdj != null) {
                    fdj<E> fdj2 = this.a;
                    fdj2.e(Math.max(fdj2.c, fdj.c));
                    for (int a2 = fdj.a(); a2 >= 0; a2 = fdj.a(a2)) {
                        a(fdj.b(a2), fdj.c(a2));
                    }
                } else {
                    Set S_ = fdh.S_();
                    fdj<E> fdj3 = this.a;
                    fdj3.e(Math.max(fdj3.c, S_.size()));
                    for (defpackage.fdh.a aVar : fdh.S_()) {
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
        public a<E> a(E... eArr) {
            super.a(eArr);
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

    ImmutableMultiset() {
    }

    private ImmutableSet<defpackage.fdh.a<E>> b() {
        return isEmpty() ? ImmutableSet.h() : new EntrySet(this, 0);
    }

    public static <E> ImmutableMultiset<E> p() {
        return RegularImmutableMultiset.a;
    }

    public static <E> a<E> r() {
        return new a<>();
    }

    /* renamed from: R_ */
    public final fdz<E> iterator() {
        final fdz R_ = S_().iterator();
        return new fdz<E>() {
            private int a;
            private E b;

            public final boolean hasNext() {
                return this.a > 0 || R_.hasNext();
            }

            public final E next() {
                if (this.a <= 0) {
                    defpackage.fdh.a aVar = (defpackage.fdh.a) R_.next();
                    this.b = aVar.b();
                    this.a = aVar.a();
                }
                this.a--;
                return this.b;
            }
        };
    }

    @Deprecated
    public final int a(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        fdz R_ = S_().iterator();
        while (R_.hasNext()) {
            defpackage.fdh.a aVar = (defpackage.fdh.a) R_.next();
            Arrays.fill(objArr, i, aVar.a() + i, aVar.b());
            i += aVar.a();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public abstract defpackage.fdh.a<E> a(int i);

    @Deprecated
    public final boolean a(E e, int i, int i2) {
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

    public boolean contains(Object obj) {
        return a(obj) > 0;
    }

    /* renamed from: e */
    public abstract ImmutableSet<E> d();

    public boolean equals(Object obj) {
        return Multisets.a((fdh<?>) this, obj);
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

    public int hashCode() {
        return Sets.a((Set<?>) S_());
    }

    /* renamed from: q */
    public final ImmutableSet<defpackage.fdh.a<E>> S_() {
        ImmutableSet<defpackage.fdh.a<E>> immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<defpackage.fdh.a<E>> b2 = b();
        this.b = b2;
        return b2;
    }

    public String toString() {
        return S_().toString();
    }

    /* access modifiers changed from: 0000 */
    public abstract Object writeReplace();
}
