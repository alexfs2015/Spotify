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

/* renamed from: iqi reason: default package */
public final class iqi {
    private static final Policy k;
    private final gcq<iqv> a;
    private final hdx b;
    private xip c = xon.a();
    private xip d = xon.a();
    private vku[] e;
    private vku[] f;
    private int g;
    private int h;
    private xip i = xon.a();
    private final xog<List<vku>> j = xog.e();

    /* renamed from: iqi$a */
    static class a implements List<vku> {
        private final vku[] a;
        private final vku[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(vku[] vkuArr, vku[] vkuArr2, int i, int i2) {
            this.b = vkuArr;
            this.a = vkuArr2;
            this.c = i;
            this.d = i2;
        }

        /* renamed from: a */
        public final vku get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                vku[] vkuArr = this.a;
                if (i < vkuArr.length + i2) {
                    return vkuArr[i - i2];
                }
            }
            vku[] vkuArr2 = this.b;
            if (i < vkuArr2.length) {
                return vkuArr2[i];
            }
            vku[] vkuArr3 = this.a;
            return vkuArr3[vkuArr3.length - 1];
        }

        public final /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends vku> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(Collection<? extends vku> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final void clear() {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            for (vku equals : this.a) {
                if (equals.equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final int indexOf(Object obj) {
            int i = 0;
            while (true) {
                vku[] vkuArr = this.a;
                if (i >= vkuArr.length) {
                    return -1;
                }
                if (vkuArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final boolean isEmpty() {
            return this.d == 0;
        }

        public final Iterator<vku> iterator() {
            return new Iterator<vku>() {
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

        public final int lastIndexOf(Object obj) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<vku> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<vku> listIterator(int i) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final int size() {
            return this.d;
        }

        public final List<vku> subList(int i, int i2) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final Object[] toArray() {
            vku[] vkuArr = new vku[this.d];
            for (int i = 0; i < this.d; i++) {
                vkuArr[i] = get(i);
            }
            return vkuArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException("Not implemented yet");
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

    public iqi(gcq<iqv> gcq) {
        this.a = gcq;
        this.b = new hdx(100, 15);
    }

    private static a a(vku[] vkuArr, vku[] vkuArr2, int i2, int i3) {
        return new a(vkuArr, vkuArr2, i2, i3);
    }

    /* access modifiers changed from: private */
    public void a() {
        hhf.a(this.i);
        this.e = null;
        hhf.a(this.c);
        hhf.a(this.d);
    }

    private void a(Policy policy, hdx hdx) {
        int i2 = hdx.b;
        xii a2 = wit.a((ObservableSource<T>) ((iqv) this.a.call()).a(Integer.valueOf(hdx.b), Integer.valueOf(hdx.c)).a(policy), BackpressureStrategy.BUFFER);
        $$Lambda$iqi$cWmPIgQJoWMjKIBungt6JgicXg r1 = new $$Lambda$iqi$cWmPIgQJoWMjKIBungt6JgicXg(this, hdx, i2);
        xog<List<vku>> xog = this.j;
        xog.getClass();
        this.d = a2.a((xis<? super T>) r1, (xis<Throwable>) new $$Lambda$fCdQK9qmsl_tqpl4gAk9JW2_Ng8<Throwable>(xog));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Policy policy, Integer num) {
        this.b.b(num.intValue());
        hhf.a(this.d);
        a(policy, this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Policy policy, xii xii) {
        a();
        xii a2 = wit.a((ObservableSource<T>) ((iqv) this.a.call()).a(k), BackpressureStrategy.BUFFER);
        $$Lambda$iqi$wgDsiUIYh3v678uyrDsM7WDh6JY r1 = new $$Lambda$iqi$wgDsiUIYh3v678uyrDsM7WDh6JY(this);
        xog<List<vku>> xog = this.j;
        xog.getClass();
        this.c = a2.a((xis<? super T>) r1, (xis<Throwable>) new $$Lambda$fCdQK9qmsl_tqpl4gAk9JW2_Ng8<Throwable>(xog));
        a(policy, this.b);
        hdx hdx = this.b;
        hdx.getClass();
        this.i = xii.c((xiy<? super T, Boolean>) new $$Lambda$fOLBEKg6JTyPFxrXp1enccZmro4<Object,Boolean>(hdx)).a((xis<? super T>) new $$Lambda$iqi$fjs0fuPN9z8zIrML09a33DX504<Object>(this, policy), (xis<Throwable>) $$Lambda$iqi$ukrKDWyHJ_J9Xmb8s0Y5aQP6F24.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hdx hdx, int i2, vlb vlb) {
        hdx.a = vlb.getUnrangedLength();
        vku[] vkuArr = this.e;
        if (vkuArr == null) {
            this.f = (vku[]) vlb.getItems();
            this.g = i2;
            this.h = vlb.getUnrangedLength();
            return;
        }
        this.j.onNext(a(vkuArr, (vku[]) vlb.getItems(), i2, vlb.getUnrangedLength()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlb vlb) {
        this.e = (vku[]) vlb.getItems();
        vku[] vkuArr = this.f;
        if (vkuArr != null) {
            this.j.onNext(a(this.e, vkuArr, this.g, this.h));
        }
    }

    public final xii<List<vku>> a(ListPolicy listPolicy, xii<Integer> xii) {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HeaderPolicy headerPolicy = new HeaderPolicy();
        headerPolicy.setAttributes(ImmutableMap.b("link", Boolean.TRUE));
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListPolicy(listPolicy);
        return this.j.a((xir) new $$Lambda$iqi$S29dfPttToiHVxX3CjeKmOrhkk(this, new Policy(decorationPolicy), xii)).b((xir) new $$Lambda$iqi$DiZq7XoCa54WC0ks3ye3BAS85g(this));
    }
}
