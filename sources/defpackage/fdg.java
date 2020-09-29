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

/* renamed from: fdg reason: default package */
public final class fdg {

    /* renamed from: fdg$a */
    public static final class a<K, V> extends i<K, Collection<V>> {
        /* access modifiers changed from: 0000 */
        public final fdf<K, V> a;

        /* renamed from: fdg$a$a reason: collision with other inner class name */
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

        public a(fdf<K, V> fdf) {
            this.a = (fdf) fbp.a(fdf);
        }

        public final Set<Entry<K, Collection<V>>> a() {
            return new C0028a();
        }

        public final void clear() {
            this.a.f();
        }

        public final boolean containsKey(Object obj) {
            return this.a.f(obj);
        }

        public final /* synthetic */ Object get(Object obj) {
            if (containsKey(obj)) {
                return this.a.c(obj);
            }
            return null;
        }

        public final boolean isEmpty() {
            return this.a.l();
        }

        public final Set<K> keySet() {
            return this.a.m();
        }

        public final /* synthetic */ Object remove(Object obj) {
            if (containsKey(obj)) {
                return this.a.d(obj);
            }
            return null;
        }

        public final int size() {
            return this.a.m().size();
        }
    }

    /* renamed from: fdg$b */
    static abstract class b<K, V> extends AbstractCollection<Entry<K, V>> {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public abstract fdf<K, V> a();

        public void clear() {
            a().f();
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

        public int size() {
            return a().e();
        }
    }
}
