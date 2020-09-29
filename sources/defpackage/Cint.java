package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.HeaderPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: int reason: invalid class name and default package */
public final class Cint {
    private static final Policy k;
    private final gbs<ioc> a;
    private final hbe b;
    private wuk c = xaj.a();
    private wuk d = xaj.a();
    private uyq[] e;
    private uyq[] f;
    private int g;
    private int h;
    private wuk i = xaj.a();
    private final xac<List<uyq>> j = xac.e();

    /* renamed from: int$a */
    static class a implements List<uyq> {
        private final uyq[] a;
        private final uyq[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(uyq[] uyqArr, uyq[] uyqArr2, int i, int i2) {
            this.b = uyqArr;
            this.a = uyqArr2;
            this.c = i;
            this.d = i2;
        }

        public final int size() {
            return this.d;
        }

        public final boolean isEmpty() {
            return this.d == 0;
        }

        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            for (uyq equals : this.a) {
                if (equals.equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final Iterator<uyq> iterator() {
            return new Iterator<uyq>() {
                private int a;

                public final boolean hasNext() {
                    return this.a < a.this.d;
                }

                public final /* synthetic */ Object next() {
                    if (hasNext()) {
                        a aVar = a.this;
                        int i = this.a;
                        this.a = i + 1;
                        return aVar.get(i);
                    }
                    throw new NoSuchElementException();
                }
            };
        }

        public final Object[] toArray() {
            uyq[] uyqArr = new uyq[this.d];
            for (int i = 0; i < this.d; i++) {
                uyqArr[i] = get(i);
            }
            return uyqArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean containsAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final boolean addAll(Collection<? extends uyq> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends uyq> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final void clear() {
            throw new UnsupportedOperationException("The list is immutable");
        }

        /* renamed from: a */
        public final uyq get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                uyq[] uyqArr = this.a;
                if (i < uyqArr.length + i2) {
                    return uyqArr[i - i2];
                }
            }
            uyq[] uyqArr2 = this.b;
            if (i < uyqArr2.length) {
                return uyqArr2[i];
            }
            uyq[] uyqArr3 = this.a;
            return uyqArr3[uyqArr3.length - 1];
        }

        public final int indexOf(Object obj) {
            int i = 0;
            while (true) {
                uyq[] uyqArr = this.a;
                if (i >= uyqArr.length) {
                    return -1;
                }
                if (uyqArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final int lastIndexOf(Object obj) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uyq> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uyq> listIterator(int i) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final List<uyq> subList(int i, int i2) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }
    }

    static {
        ListPolicy listPolicy = new ListPolicy();
        String str = "name";
        String str2 = "rowId";
        listPolicy.setListAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b());
        Map singletonMap = Collections.singletonMap(str, Boolean.TRUE);
        listPolicy.setArtistAttributes(singletonMap);
        listPolicy.setArtistsAttributes(singletonMap);
        listPolicy.setAlbumAttributes(Collections.emptyMap());
        listPolicy.setShowAttributes(singletonMap);
        HeaderPolicy headerPolicy = new HeaderPolicy();
        headerPolicy.setAttributes(Collections.emptyMap());
        headerPolicy.setOwnerAttributes(Collections.emptyMap());
        headerPolicy.setMadeForAttributes(Collections.emptyMap());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListPolicy(listPolicy);
        k = new Policy(decorationPolicy);
    }

    public Cint(gbs<ioc> gbs) {
        this.a = gbs;
        this.b = new hbe(100, 15);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Policy policy, Integer num) {
        this.b.b(num.intValue());
        hej.a(this.d);
        a(policy, this.b);
    }

    /* access modifiers changed from: private */
    public void a() {
        hej.a(this.i);
        this.e = null;
        hej.a(this.c);
        hej.a(this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyy uyy) {
        this.e = (uyq[]) uyy.getItems();
        uyq[] uyqArr = this.f;
        if (uyqArr != null) {
            this.j.onNext(a(this.e, uyqArr, this.g, this.h));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hbe hbe, int i2, uyy uyy) {
        hbe.a = uyy.getUnrangedLength();
        uyq[] uyqArr = this.e;
        if (uyqArr == null) {
            this.f = (uyq[]) uyy.getItems();
            this.g = i2;
            this.h = uyy.getUnrangedLength();
            return;
        }
        this.j.onNext(a(uyqArr, (uyq[]) uyy.getItems(), i2, uyy.getUnrangedLength()));
    }

    public final wud<List<uyq>> a(ListPolicy listPolicy, wud<Integer> wud) {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HeaderPolicy headerPolicy = new HeaderPolicy();
        headerPolicy.setAttributes(ImmutableMap.b("link", Boolean.TRUE));
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListPolicy(listPolicy);
        return this.j.a((wum) new $$Lambda$int$dguJJzOdyrVjy2E1YCrABRvomls(this, new Policy(decorationPolicy), wud)).b((wum) new $$Lambda$int$v0TrORxhHB1cU9ohqa1bpToOKQ(this));
    }

    private static a a(uyq[] uyqArr, uyq[] uyqArr2, int i2, int i3) {
        return new a(uyqArr, uyqArr2, i2, i3);
    }

    private void a(Policy policy, hbe hbe) {
        int i2 = hbe.b;
        wud a2 = vun.a((ObservableSource<T>) ((ioc) this.a.call()).a(Integer.valueOf(hbe.b), Integer.valueOf(hbe.c)).a(policy), BackpressureStrategy.BUFFER);
        $$Lambda$int$GbjtAQwNi6yPLymYvxf3TKt15c r1 = new $$Lambda$int$GbjtAQwNi6yPLymYvxf3TKt15c(this, hbe, i2);
        xac<List<uyq>> xac = this.j;
        xac.getClass();
        this.d = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$ZXdrJ5b54EoeYUC4mr9uIrHzk<Throwable>(xac));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Policy policy, wud wud) {
        a();
        wud a2 = vun.a((ObservableSource<T>) ((ioc) this.a.call()).a(k), BackpressureStrategy.BUFFER);
        $$Lambda$int$mvpZ8TUOCxqeRHbiLVe0v7kq8Y4 r1 = new $$Lambda$int$mvpZ8TUOCxqeRHbiLVe0v7kq8Y4(this);
        xac<List<uyq>> xac = this.j;
        xac.getClass();
        this.c = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$ZXdrJ5b54EoeYUC4mr9uIrHzk<Throwable>(xac));
        a(policy, this.b);
        hbe hbe = this.b;
        hbe.getClass();
        this.i = wud.c((wut<? super T, Boolean>) new $$Lambda$j9MAI7co3gigEhAa3SadqN0U1YI<Object,Boolean>(hbe)).a((wun<? super T>) new $$Lambda$int$bFnZrKz2OvcBJ73HuC0BfxHrTg<Object>(this, policy), (wun<Throwable>) $$Lambda$int$DWk6ChDz8XERfRfNrfVgThevo.INSTANCE);
    }
}
