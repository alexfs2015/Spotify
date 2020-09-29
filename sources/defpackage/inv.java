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

/* renamed from: inv reason: default package */
public final class inv {
    private static final Policy k;
    private final gbs<ioi> a;
    private final hbe b;
    private wuk c = xaj.a();
    private wuk d = xaj.a();
    private uyr[] e;
    private uyr[] f;
    private int g;
    private int h;
    private wuk i = xaj.a();
    private final xac<List<uyr>> j = xac.e();

    /* renamed from: inv$a */
    static class a implements List<uyr> {
        private final uyr[] a;
        private final uyr[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(uyr[] uyrArr, uyr[] uyrArr2, int i, int i2) {
            this.b = uyrArr;
            this.a = uyrArr2;
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
            for (uyr equals : this.a) {
                if (equals.equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final Iterator<uyr> iterator() {
            return new Iterator<uyr>() {
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
            uyr[] uyrArr = new uyr[this.d];
            for (int i = 0; i < this.d; i++) {
                uyrArr[i] = get(i);
            }
            return uyrArr;
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

        public final boolean addAll(Collection<? extends uyr> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends uyr> collection) {
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
        public final uyr get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                uyr[] uyrArr = this.a;
                if (i < uyrArr.length + i2) {
                    return uyrArr[i - i2];
                }
            }
            uyr[] uyrArr2 = this.b;
            if (i < uyrArr2.length) {
                return uyrArr2[i];
            }
            uyr[] uyrArr3 = this.a;
            return uyrArr3[uyrArr3.length - 1];
        }

        public final int indexOf(Object obj) {
            int i = 0;
            while (true) {
                uyr[] uyrArr = this.a;
                if (i >= uyrArr.length) {
                    return -1;
                }
                if (uyrArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final int lastIndexOf(Object obj) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uyr> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uyr> listIterator(int i) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final List<uyr> subList(int i, int i2) {
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

    public inv(gbs<ioi> gbs) {
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
        this.e = (uyr[]) uyy.getItems();
        uyr[] uyrArr = this.f;
        if (uyrArr != null) {
            this.j.onNext(a(this.e, uyrArr, this.g, this.h));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hbe hbe, int i2, uyy uyy) {
        hbe.a = uyy.getUnrangedLength();
        uyr[] uyrArr = this.e;
        if (uyrArr == null) {
            this.f = (uyr[]) uyy.getItems();
            this.g = i2;
            this.h = uyy.getUnrangedLength();
            return;
        }
        this.j.onNext(a(uyrArr, (uyr[]) uyy.getItems(), i2, uyy.getUnrangedLength()));
    }

    public final wud<List<uyr>> a(ListPolicy listPolicy, wud<Integer> wud) {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HeaderPolicy headerPolicy = new HeaderPolicy();
        headerPolicy.setAttributes(ImmutableMap.b("link", Boolean.TRUE));
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListPolicy(listPolicy);
        return this.j.a((wum) new $$Lambda$inv$RL8AOJP3SJCPAggCLcZbVkjF9M(this, new Policy(decorationPolicy), wud)).b((wum) new $$Lambda$inv$MZuY9VeBikcbJP5O80XBN2CeOuo(this));
    }

    private static a a(uyr[] uyrArr, uyr[] uyrArr2, int i2, int i3) {
        return new a(uyrArr, uyrArr2, i2, i3);
    }

    private void a(Policy policy, hbe hbe) {
        int i2 = hbe.b;
        wud a2 = vun.a((ObservableSource<T>) ((ioi) this.a.call()).a(Integer.valueOf(hbe.b), Integer.valueOf(hbe.c)).a(policy), BackpressureStrategy.BUFFER);
        $$Lambda$inv$30yAFgwiZ3RivJXFc6DCeHaVCm8 r1 = new $$Lambda$inv$30yAFgwiZ3RivJXFc6DCeHaVCm8(this, hbe, i2);
        xac<List<uyr>> xac = this.j;
        xac.getClass();
        this.d = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$ZXdrJ5b54EoeYUC4mr9uIrHzk<Throwable>(xac));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Policy policy, wud wud) {
        a();
        wud a2 = vun.a((ObservableSource<T>) ((ioi) this.a.call()).a(k), BackpressureStrategy.BUFFER);
        $$Lambda$inv$JX_FIei9GQcReTqGLMCgtDMTHiM r1 = new $$Lambda$inv$JX_FIei9GQcReTqGLMCgtDMTHiM(this);
        xac<List<uyr>> xac = this.j;
        xac.getClass();
        this.c = a2.a((wun<? super T>) r1, (wun<Throwable>) new $$Lambda$ZXdrJ5b54EoeYUC4mr9uIrHzk<Throwable>(xac));
        a(policy, this.b);
        hbe hbe = this.b;
        hbe.getClass();
        this.i = wud.c((wut<? super T, Boolean>) new $$Lambda$j9MAI7co3gigEhAa3SadqN0U1YI<Object,Boolean>(hbe)).a((wun<? super T>) new $$Lambda$inv$iIs_BT3E9iOSZAQuzF74hUQEHpo<Object>(this, policy), (wun<Throwable>) $$Lambda$inv$dSy_fsw3wz20K2cLwlLrQzwAQOg.INSTANCE);
    }
}
