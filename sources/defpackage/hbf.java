package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: hbf reason: default package */
public final class hbf {
    private static final Policy l;
    private final hbe a;
    private final SerialDisposable b = new SerialDisposable();
    private final SerialDisposable c = new SerialDisposable();
    private final SerialDisposable d = new SerialDisposable();
    private uzb[] e;
    private uzb[] f;
    private int g;
    private int h;
    private final BehaviorSubject<List<uzb>> i = BehaviorSubject.a();
    private final String j;
    private final uxc k;

    /* renamed from: hbf$a */
    static class a implements List<uzb> {
        private final uzb[] a;
        private final uzb[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(uzb[] uzbArr, uzb[] uzbArr2, int i, int i2) {
            this.b = uzbArr;
            this.a = uzbArr2;
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
            for (uzb equals : this.a) {
                if (equals.equals(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final Iterator<uzb> iterator() {
            return new Iterator<uzb>() {
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
            uzb[] uzbArr = new uzb[this.d];
            for (int i = 0; i < this.d; i++) {
                uzbArr[i] = get(i);
            }
            return uzbArr;
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

        public final boolean addAll(Collection<? extends uzb> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends uzb> collection) {
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
        public final uzb get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                uzb[] uzbArr = this.a;
                if (i < uzbArr.length + i2) {
                    return uzbArr[i - i2];
                }
            }
            uzb[] uzbArr2 = this.b;
            if (i < uzbArr2.length) {
                return hbf.a(uzbArr2[i]);
            }
            return hbf.a((uzb) null);
        }

        public final int indexOf(Object obj) {
            int i = 0;
            while (true) {
                uzb[] uzbArr = this.a;
                if (i >= uzbArr.length) {
                    return -1;
                }
                if (uzbArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final int lastIndexOf(Object obj) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uzb> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<uzb> listIterator(int i) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final List<uzb> subList(int i, int i2) {
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
        HeaderPolicy a2 = HeaderPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).a();
        String str = "name";
        ImmutableMap b2 = ImmutableMap.b(str, Boolean.TRUE);
        String str2 = "rowId";
        l = Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b()).b(ImmutableMap.f()).c(b2).d(b2).a()).a(a2).a()).a();
    }

    public hbf(uxc uxc, String str) {
        this.j = str;
        this.k = uxc;
        this.a = new hbe(100, 15);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.uxc.a aVar, Integer num) {
        this.a.b(num.intValue());
        b();
        a(aVar, this.a);
    }

    /* access modifiers changed from: private */
    public void a() {
        this.d.a(Disposables.b());
        this.e = null;
        this.b.a(Disposables.b());
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uza uza) {
        this.e = (uzb[]) uza.getItems();
        uzb[] uzbArr = this.f;
        if (uzbArr != null) {
            this.i.onNext(a(this.e, uzbArr, this.g, this.h));
        }
    }

    private void a(defpackage.uxc.a aVar, hbe hbe) {
        defpackage.uxc.a a2 = aVar.o().i(uyd.a(hbe.b, hbe.c)).a();
        int i2 = hbe.b;
        SerialDisposable serialDisposable = this.c;
        Observable b2 = this.k.b(this.j, a2);
        $$Lambda$hbf$MB3jtS_YaO23UkkSGHFRTwXC44 r2 = new $$Lambda$hbf$MB3jtS_YaO23UkkSGHFRTwXC44(this, hbe, i2);
        BehaviorSubject<List<uzb>> behaviorSubject = this.i;
        behaviorSubject.getClass();
        serialDisposable.a(b2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hbe hbe, int i2, uza uza) {
        hbe.a = uza.getUnrangedLength();
        uzb[] uzbArr = this.e;
        if (uzbArr == null) {
            this.f = (uzb[]) uza.getItems();
            this.g = i2;
            this.h = uza.getUnrangedLength();
            return;
        }
        this.i.onNext(a(uzbArr, (uzb[]) uza.getItems(), i2, uza.getUnrangedLength()));
    }

    private void b() {
        this.f = null;
        this.c.a(Disposables.b());
    }

    public final Observable<List<uzb>> a(defpackage.uxc.a aVar, Observable<Integer> observable) {
        return this.i.c((Consumer<? super Disposable>) new $$Lambda$hbf$G9kovPHENRc1BinJsa_FsIGJqU<Object>(this, aVar, observable)).a((Action) new $$Lambda$hbf$efxsCsZerb_FVPGfn9gjKgTJCJk(this));
    }

    private static a a(uzb[] uzbArr, uzb[] uzbArr2, int i2, int i3) {
        return new a(uzbArr, uzbArr2, i2, i3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.uxc.a aVar, Observable observable, Disposable disposable) {
        a();
        defpackage.uxc.a a2 = aVar.o().a(Optional.b(l)).a();
        SerialDisposable serialDisposable = this.b;
        Single a3 = this.k.a(this.j, a2);
        $$Lambda$hbf$O0dlRq0qEwcty1b4Fga9u8Nuiuc r1 = new $$Lambda$hbf$O0dlRq0qEwcty1b4Fga9u8Nuiuc(this);
        BehaviorSubject<List<uzb>> behaviorSubject = this.i;
        behaviorSubject.getClass();
        serialDisposable.a(a3.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject)));
        a(aVar, this.a);
        SerialDisposable serialDisposable2 = this.d;
        hbe hbe = this.a;
        hbe.getClass();
        serialDisposable2.a(observable.a((Predicate<? super T>) new $$Lambda$S79CDp070yJqox0E1THfvhaFAQ<Object>(hbe)).a((Consumer<? super T>) new $$Lambda$hbf$F6PbHsHBg31vpvqqzw9ET2TNMXA<Object>(this, aVar), (Consumer<? super Throwable>) $$Lambda$hbf$gezJ12SiNlYTxiJo46B6CjXMOL4.INSTANCE));
    }

    static /* synthetic */ uzb a(final uzb uzb) {
        return new uzb() {
            public final uys a() {
                return null;
            }

            public final uzc b() {
                return null;
            }

            public final ImmutableMap<String, String> c() {
                uzb uzb = uzb;
                return uzb != null ? uzb.c() : ImmutableMap.f();
            }

            public final String d() {
                StringBuilder sb = new StringBuilder();
                uzb uzb = uzb;
                sb.append(uzb != null ? uzb.d() : "");
                sb.append("_placeholder_");
                sb.append(hashCode());
                return sb.toString();
            }

            public final boolean isHeader() {
                uzb uzb = uzb;
                return uzb != null && uzb.isHeader();
            }

            public final String getHeader() {
                uzb uzb = uzb;
                if (uzb != null) {
                    return uzb.getHeader();
                }
                return null;
            }

            public final String getUri() {
                uzb uzb = uzb;
                return uzb != null ? uzb.getUri() : "";
            }

            public final String getTitle() {
                uzb uzb = uzb;
                return uzb != null ? uzb.getTitle() : "";
            }

            public final String getTargetUri() {
                uzb uzb = uzb;
                return uzb != null ? uzb.getTargetUri() : "";
            }

            public final String getImageUri() {
                uzb uzb = uzb;
                return uzb != null ? uzb.getImageUri() : "";
            }

            public final String getImageUri(Size size) {
                uzb uzb = uzb;
                return uzb != null ? uzb.getImageUri(size) : "";
            }
        };
    }
}
