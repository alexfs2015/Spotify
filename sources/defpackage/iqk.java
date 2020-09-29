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

/* renamed from: iqk reason: default package */
public final class iqk {
    private static final Policy k;
    private final gcq<irb> a;
    private final hdx b;
    private xip c = xon.a();
    private xip d = xon.a();
    private vlf[] e;
    private vlf[] f;
    private int g;
    private int h;
    private xip i = xon.a();
    private final xog<List<vlf>> j = xog.e();

    /* renamed from: iqk$a */
    static class a implements List<vlf> {
        private final vlf[] a;
        private final vlf[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(vlf[] vlfArr, vlf[] vlfArr2, int i, int i2) {
            this.b = vlfArr;
            this.a = vlfArr2;
            this.c = i;
            this.d = i2;
        }

        /* renamed from: a */
        public final vlf get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                vlf[] vlfArr = this.a;
                if (i < vlfArr.length + i2) {
                    return vlfArr[i - i2];
                }
            }
            vlf[] vlfArr2 = this.b;
            if (i < vlfArr2.length) {
                return vlfArr2[i];
            }
            vlf[] vlfArr3 = this.a;
            return vlfArr3[vlfArr3.length - 1];
        }

        public final /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends vlf> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(Collection<? extends vlf> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final void clear() {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            for (vlf equals : this.a) {
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
                vlf[] vlfArr = this.a;
                if (i >= vlfArr.length) {
                    return -1;
                }
                if (vlfArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final boolean isEmpty() {
            return this.d == 0;
        }

        public final Iterator<vlf> iterator() {
            return new Iterator<vlf>() {
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

        public final ListIterator<vlf> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<vlf> listIterator(int i) {
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

        public final List<vlf> subList(int i, int i2) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final Object[] toArray() {
            vlf[] vlfArr = new vlf[this.d];
            for (int i = 0; i < this.d; i++) {
                vlfArr[i] = get(i);
            }
            return vlfArr;
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

    public iqk(gcq<irb> gcq) {
        this.a = gcq;
        this.b = new hdx(100, 15);
    }

    private static a a(vlf[] vlfArr, vlf[] vlfArr2, int i2, int i3) {
        return new a(vlfArr, vlfArr2, i2, i3);
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
        xii a2 = wit.a((ObservableSource<T>) ((irb) this.a.call()).a(Integer.valueOf(hdx.b), Integer.valueOf(hdx.c)).a(policy), BackpressureStrategy.BUFFER);
        $$Lambda$iqk$8XxQkMUkxecVyzhwBHtu77uW0U r1 = new $$Lambda$iqk$8XxQkMUkxecVyzhwBHtu77uW0U(this, hdx, i2);
        xog<List<vlf>> xog = this.j;
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
        xii a2 = wit.a((ObservableSource<T>) ((irb) this.a.call()).a(k), BackpressureStrategy.BUFFER);
        $$Lambda$iqk$rFHA_WEHnFr3OHcgtzYM13pPRU r1 = new $$Lambda$iqk$rFHA_WEHnFr3OHcgtzYM13pPRU(this);
        xog<List<vlf>> xog = this.j;
        xog.getClass();
        this.c = a2.a((xis<? super T>) r1, (xis<Throwable>) new $$Lambda$fCdQK9qmsl_tqpl4gAk9JW2_Ng8<Throwable>(xog));
        a(policy, this.b);
        hdx hdx = this.b;
        hdx.getClass();
        this.i = xii.c((xiy<? super T, Boolean>) new $$Lambda$fOLBEKg6JTyPFxrXp1enccZmro4<Object,Boolean>(hdx)).a((xis<? super T>) new $$Lambda$iqk$OoVwhMGpOPwDGZJFLRw8sFtE4xY<Object>(this, policy), (xis<Throwable>) $$Lambda$iqk$vOQy3KdRGksQqoL6fU4FoD5HD_k.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hdx hdx, int i2, iri iri) {
        hdx.a = iri.getUnrangedLength();
        vlf[] vlfArr = this.e;
        if (vlfArr == null) {
            this.f = (vlf[]) iri.getItems();
            this.g = i2;
            this.h = iri.getUnrangedLength();
            return;
        }
        this.j.onNext(a(vlfArr, (vlf[]) iri.getItems(), i2, iri.getUnrangedLength()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(iri iri) {
        this.e = (vlf[]) iri.getItems();
        vlf[] vlfArr = this.f;
        if (vlfArr != null) {
            this.j.onNext(a(this.e, vlfArr, this.g, this.h));
        }
    }

    public final xii<List<vlf>> a(ListPolicy listPolicy, xii<Integer> xii) {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        HeaderPolicy headerPolicy = new HeaderPolicy();
        headerPolicy.setAttributes(ImmutableMap.b("link", Boolean.TRUE));
        decorationPolicy.setHeaderPolicy(headerPolicy);
        decorationPolicy.setListPolicy(listPolicy);
        return this.j.a((xir) new $$Lambda$iqk$nY4fKChSmMBfRVX2wtajDbW62UM(this, new Policy(decorationPolicy), xii)).b((xir) new $$Lambda$iqk$piAtawQOPpt5u4xT8WARBA0fSaw(this));
    }
}
