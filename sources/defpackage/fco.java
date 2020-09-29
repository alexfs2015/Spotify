package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps.c;
import com.google.common.collect.Maps.i;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: fco reason: default package */
public final class fco {

    /* renamed from: fco$a */
    public static final class a<K, V> extends i<K, Collection<V>> {
        /* access modifiers changed from: 0000 */
        public final fcn<K, V> a;

        /* renamed from: fco$a$a reason: collision with other inner class name */
        class C0028a extends c<K, Collection<V>> {
            C0028a() {
            }

            public final Map<K, Collection<V>> a() {
                return a.this;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return Maps.a(a.this.a.m(), (Function<? super K, V>) new Function<K, Collection<V>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        return a.this.a.c(obj);
                    }
                });
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                a aVar = a.this;
                aVar.a.m().remove(entry.getKey());
                return true;
            }
        }

        public a(fcn<K, V> fcn) {
            this.a = (fcn) fay.a(fcn);
        }

        public final int size() {
            return this.a.m().size();
        }

        public final Set<Entry<K, Collection<V>>> a() {
            return new C0028a();
        }

        public final Set<K> keySet() {
            return this.a.m();
        }

        public final boolean isEmpty() {
            return this.a.l();
        }

        public final boolean containsKey(Object obj) {
            return this.a.f(obj);
        }

        public final void clear() {
            this.a.f();
        }

        public final /* synthetic */ Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.a.d(obj);
            }
            return null;
        }

        public final /* synthetic */ Object get(Object obj) {
            if (containsKey(obj)) {
                return this.a.c(obj);
            }
            return null;
        }
    }

    /* renamed from: fco$b */
    static abstract class b<K, V> extends AbstractCollection<Entry<K, V>> {
        /* access modifiers changed from: 0000 */
        public abstract fcn<K, V> a();

        b() {
        }

        public int size() {
            return a().e();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return a().b(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return a().c(entry.getKey(), entry.getValue());
        }

        public void clear() {
            a().f();
        }
    }
}
