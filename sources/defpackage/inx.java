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

/* renamed from: inx reason: default package */
public final class inx {
    private static final Policy k;
    private final gbs<ioo> a;
    private final hbe b;
    private wuk c = xaj.a();
    private wuk d = xaj.a();
    private uzc[] e;
    private uzc[] f;
    private int g;
    private int h;
    private wuk i = xaj.a();
    private final xac<List<uzc>> j = xac.e();

    /* renamed from: inx$a */
    static class a implements List<uzc> {
        private final uzc[] a;
        private final uzc[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(uzc[] uzcArr, uzc[] uzcArr2, int i, int i2) {
            this.b = uzcArr;
            this.a = uzcArr2;
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
            for (uzc equals : this.a) {
                if (equals.equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final Iterator<uzc> iterator() {
            return new Iterator<uzc>() {
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
            uzc[] uzcArr = new uzc[this.d];
            for (int i = 0; i < this.d; i++) {
                uzcArr[i] = get(i);
            }
            return uzcArr;
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

        public final boolean addAll(Collection<? extends uzc> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends uzc> collection) {
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
        public final uzc get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                uzc[] uzcArr = this.a;
                if (i < uzcArr.length + i2) {
                    return uzcArr[i - i2];
                }
            }
            uzc[] uzcArr2 = this.b;
            if (i < uzcArr2.length) {
                return uzcArr2[i];
            }
            uzc[] uzcArr3 = this.a;
            return uzcArr3[uzcArr3.length - 1];
        }

        public final int indexOf(Object obj) {
            int i = 0;
            while (true) {
                uzc[] uzcArr = this.a;
                if (i >= uzcArr.length) {
                    return -1;
                }
                if (uzcArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final int lastIndexOf(Object obj) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uzc> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uzc> listIterator(int i) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final List<uzc> subList(int i, int i2) {
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

    public inx(gbs<ioo> gbs) {
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
    public /* synthetic */ void a(iov iov) {
        this.e = (uzc[]) iov.getItems();
        uzc[] uzcArr = this.f;
        if (uzcArr != null) {
            this.j.onNext(a(this.e, uzcArr, this.g, this.h));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hbe hbe, int i2, iov iov) {
        hbe.a = iov.getUnrangedLength();
        uzc[] uzcArr = this.e;
        if (uzcArr == null) {
            this.f = (uzc[]) iov.getItems();
            this.g = i2;
            this.h = iov.getUnrangedLength();
            return;
        }
        this.j.onNext(a(uzcArr, (uzc[]) iov.getItems(), i2, iov.getUnrangedLength()));
    }

    public final wud<List<uzc>> a(ListPolicy listPolicy, wud<Integer> wud) {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HeaderPolicy headerPolicy = new HeaderPolicy();
        headerPolicy.setAttributes(ImmutableMap.b("link", Boolean.TRUE));
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListPolicy(listPolicy);
        return this.j.a((wum) new $$Lambda$inx$NQJBuuIdcUKU8vrXmF4J8FAoC14(this, new Policy(decorationPolicy), wud)).b((wum) new $$Lambda$inx$72EpEaBCVSKMsj4W8hneylVZLOI(this));
    }

    private static a a(uzc[] uzcArr, uzc[] uzcArr2, int i2, int i3) {
        return new a(uzcArr, uzcArr2, i2, i3);
    }

    private void a(Policy policy, hbe hbe) {
        int i2 = hbe.b;
        wud a2 = vun.a((ObservableSource<T>) ((ioo) this.a.call()).a(Integer.valueOf(hbe.b), Integer.valueOf(hbe.c)).a(policy), BackpressureStrategy.BUFFER);
        $$Lambda$inx$Od0Dhcr0L3y8PRYvIrD2oI2SPg r1 = new $$Lambda$inx$Od0Dhcr0L3y8PRYvIrD2oI2SPg(this, hbe, i2);
        xac<List<uzc>> xac = this.j;
        xac.getClass();
        this.d = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$ZXdrJ5b54EoeYUC4mr9uIrHzk<Throwable>(xac));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Policy policy, wud wud) {
        a();
        wud a2 = vun.a((ObservableSource<T>) ((ioo) this.a.call()).a(k), BackpressureStrategy.BUFFER);
        $$Lambda$inx$BIzof30IM8W5h4x8kvStdJ4DQY r1 = new $$Lambda$inx$BIzof30IM8W5h4x8kvStdJ4DQY(this);
        xac<List<uzc>> xac = this.j;
        xac.getClass();
        this.c = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$ZXdrJ5b54EoeYUC4mr9uIrHzk<Throwable>(xac));
        a(policy, this.b);
        hbe hbe = this.b;
        hbe.getClass();
        this.i = wud.c((wut<? super T, Boolean>) new $$Lambda$j9MAI7co3gigEhAa3SadqN0U1YI<Object,Boolean>(hbe)).a((wun<? super T>) new $$Lambda$inx$NeU7M3q4BFBtXfDVIcT7GuWo<Object>(this, policy), (wun<Throwable>) $$Lambda$inx$S6LQK2lOWl0R1comL536K0pg3_Y.INSTANCE);
    }
}
