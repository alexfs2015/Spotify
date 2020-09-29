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

/* renamed from: hdy reason: default package */
public final class hdy {
    private static final Policy l;
    private final hdx a;
    private final SerialDisposable b = new SerialDisposable();
    private final SerialDisposable c = new SerialDisposable();
    private final SerialDisposable d = new SerialDisposable();
    private vle[] e;
    private vle[] f;
    private int g;
    private int h;
    private final BehaviorSubject<List<vle>> i = BehaviorSubject.a();
    private final String j;
    private final vje k;

    /* renamed from: hdy$a */
    static class a implements List<vle> {
        private final vle[] a;
        private final vle[] b;
        private final int c;
        /* access modifiers changed from: private */
        public final int d;

        public a(vle[] vleArr, vle[] vleArr2, int i, int i2) {
            this.b = vleArr;
            this.a = vleArr2;
            this.c = i;
            this.d = i2;
        }

        /* renamed from: a */
        public final vle get(int i) {
            int i2 = this.c;
            if (i >= i2) {
                vle[] vleArr = this.a;
                if (i < vleArr.length + i2) {
                    return vleArr[i - i2];
                }
            }
            vle[] vleArr2 = this.b;
            return i < vleArr2.length ? hdy.a(vleArr2[i]) : hdy.a((vle) null);
        }

        public final /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(int i, Collection<? extends vle> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean addAll(Collection<? extends vle> collection) {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final void clear() {
            throw new UnsupportedOperationException("The list is immutable");
        }

        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            for (vle equals : this.a) {
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
                vle[] vleArr = this.a;
                if (i >= vleArr.length) {
                    return -1;
                }
                if (vleArr[i].equals(obj)) {
                    return this.c + i;
                }
                i++;
            }
        }

        public final boolean isEmpty() {
            return this.d == 0;
        }

        public final Iterator<vle> iterator() {
            return new Iterator<vle>() {
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

        public final ListIterator<vle> listIterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final ListIterator<vle> listIterator(int i) {
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

        public final List<vle> subList(int i, int i2) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public final Object[] toArray() {
            vle[] vleArr = new vle[this.d];
            for (int i = 0; i < this.d; i++) {
                vleArr[i] = get(i);
            }
            return vleArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    static {
        HeaderPolicy a2 = HeaderPolicy.builder().a(ImmutableMap.f()).b(ImmutableMap.f()).c(ImmutableMap.f()).a();
        String str = "name";
        ImmutableMap b2 = ImmutableMap.b(str, Boolean.TRUE);
        String str2 = "rowId";
        l = Policy.builder().a(DecorationPolicy.builder().a(ListPolicy.builder().a(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b()).b(ImmutableMap.f()).c(b2).d(b2).a()).a(a2).a()).a();
    }

    public hdy(vje vje, String str) {
        this.j = str;
        this.k = vje;
        this.a = new hdx(100, 15);
    }

    private static a a(vle[] vleArr, vle[] vleArr2, int i2, int i3) {
        return new a(vleArr, vleArr2, i2, i3);
    }

    static /* synthetic */ vle a(final vle vle) {
        return new vle() {
            public final vkv a() {
                return null;
            }

            public final vlf b() {
                return null;
            }

            public final ImmutableMap<String, String> c() {
                vle vle = vle;
                return vle != null ? vle.c() : ImmutableMap.f();
            }

            public final String d() {
                StringBuilder sb = new StringBuilder();
                vle vle = vle;
                sb.append(vle != null ? vle.d() : "");
                sb.append("_placeholder_");
                sb.append(hashCode());
                return sb.toString();
            }

            public final String getHeader() {
                vle vle = vle;
                if (vle != null) {
                    return vle.getHeader();
                }
                return null;
            }

            public final String getImageUri() {
                vle vle = vle;
                return vle != null ? vle.getImageUri() : "";
            }

            public final String getImageUri(Size size) {
                vle vle = vle;
                return vle != null ? vle.getImageUri(size) : "";
            }

            public final String getTargetUri() {
                vle vle = vle;
                return vle != null ? vle.getTargetUri() : "";
            }

            public final String getTitle() {
                vle vle = vle;
                return vle != null ? vle.getTitle() : "";
            }

            public final String getUri() {
                vle vle = vle;
                return vle != null ? vle.getUri() : "";
            }

            public final boolean isHeader() {
                vle vle = vle;
                return vle != null && vle.isHeader();
            }
        };
    }

    /* access modifiers changed from: private */
    public void a() {
        this.d.a(Disposables.b());
        this.e = null;
        this.b.a(Disposables.b());
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hdx hdx, int i2, vld vld) {
        hdx.a = vld.getUnrangedLength();
        vle[] vleArr = this.e;
        if (vleArr == null) {
            this.f = (vle[]) vld.getItems();
            this.g = i2;
            this.h = vld.getUnrangedLength();
            return;
        }
        this.i.onNext(a(vleArr, (vle[]) vld.getItems(), i2, vld.getUnrangedLength()));
    }

    private void a(defpackage.vje.a aVar, hdx hdx) {
        defpackage.vje.a a2 = aVar.o().i(vkg.a(hdx.b, hdx.c)).a();
        int i2 = hdx.b;
        SerialDisposable serialDisposable = this.c;
        Observable b2 = this.k.b(this.j, a2);
        $$Lambda$hdy$qEdqekZHoM27MVDMqIBCcigYqig r2 = new $$Lambda$hdy$qEdqekZHoM27MVDMqIBCcigYqig(this, hdx, i2);
        BehaviorSubject<List<vle>> behaviorSubject = this.i;
        behaviorSubject.getClass();
        serialDisposable.a(b2.a((Consumer<? super T>) r2, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.vje.a aVar, Observable observable, Disposable disposable) {
        a();
        defpackage.vje.a a2 = aVar.o().a(Optional.b(l)).a();
        SerialDisposable serialDisposable = this.b;
        Single a3 = this.k.a(this.j, a2);
        $$Lambda$hdy$GgMCMC_VVR8mvKvTmPYODuEVvvk r1 = new $$Lambda$hdy$GgMCMC_VVR8mvKvTmPYODuEVvvk(this);
        BehaviorSubject<List<vle>> behaviorSubject = this.i;
        behaviorSubject.getClass();
        serialDisposable.a(a3.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject)));
        a(aVar, this.a);
        SerialDisposable serialDisposable2 = this.d;
        hdx hdx = this.a;
        hdx.getClass();
        serialDisposable2.a(observable.a((Predicate<? super T>) new $$Lambda$xmtHMIL5OLv2leHNLTwRBRpolk<Object>(hdx)).a((Consumer<? super T>) new $$Lambda$hdy$1ecFwrCgrTwK7J3RXO6yFJHrlDY<Object>(this, aVar), (Consumer<? super Throwable>) $$Lambda$hdy$QjDf1Y3EyoASqyJDpJQ_Hfhef7E.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.vje.a aVar, Integer num) {
        this.a.b(num.intValue());
        b();
        a(aVar, this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vld vld) {
        this.e = (vle[]) vld.getItems();
        vle[] vleArr = this.f;
        if (vleArr != null) {
            this.i.onNext(a(this.e, vleArr, this.g, this.h));
        }
    }

    private void b() {
        this.f = null;
        this.c.a(Disposables.b());
    }

    public final Observable<List<vle>> a(defpackage.vje.a aVar, Observable<Integer> observable) {
        return this.i.c((Consumer<? super Disposable>) new $$Lambda$hdy$wqEjrnULpbtZmiPVRTNr6Dc3l20<Object>(this, aVar, observable)).a((Action) new $$Lambda$hdy$74L7INVPkn1NbIAT_vkQzjJQe9o(this));
    }
}
