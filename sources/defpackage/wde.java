package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wde reason: default package */
public final class wde {

    /* renamed from: wde$a */
    static final class a implements Entry<String, String> {
        private final Entry<CharSequence, CharSequence> a;
        private String b;
        private String c;

        public final /* synthetic */ Object setValue(Object obj) {
            String str = (String) obj;
            String a2 = getValue();
            this.a.setValue(str);
            return a2;
        }

        a(Entry<CharSequence, CharSequence> entry) {
            this.a = entry;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String getValue() {
            if (this.c == null && this.a.getValue() != null) {
                this.c = ((CharSequence) this.a.getValue()).toString();
            }
            return this.c;
        }

        public final String toString() {
            return this.a.toString();
        }

        public final /* synthetic */ Object getKey() {
            if (this.b == null) {
                this.b = ((CharSequence) this.a.getKey()).toString();
            }
            return this.b;
        }
    }

    /* renamed from: wde$b */
    public static final class b implements Iterator<Entry<String, String>> {
        private final Iterator<Entry<CharSequence, CharSequence>> a;

        public b(Iterator<Entry<CharSequence, CharSequence>> it) {
            this.a = it;
        }

        public final boolean hasNext() {
            return this.a.hasNext();
        }

        public final void remove() {
            this.a.remove();
        }

        public final /* synthetic */ Object next() {
            return new a((Entry) this.a.next());
        }
    }

    public static <K, V> List<String> a(wdd<K, V, ?> wdd, K k) {
        final List b2 = wdd.b(k);
        return new AbstractList<String>() {
            public final int size() {
                return b2.size();
            }

            public final /* synthetic */ Object get(int i) {
                Object obj = b2.get(i);
                if (obj != null) {
                    return obj.toString();
                }
                return null;
            }
        };
    }

    public static <K, V> String b(wdd<K, V, ?> wdd, K k) {
        Object a2 = wdd.a(k);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }
}
