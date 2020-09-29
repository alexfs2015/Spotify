package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: wrk reason: default package */
public final class wrk {

    /* renamed from: wrk$a */
    static final class a implements Entry<String, String> {
        private final Entry<CharSequence, CharSequence> a;
        private String b;
        private String c;

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

        public final /* synthetic */ Object getKey() {
            if (this.b == null) {
                this.b = ((CharSequence) this.a.getKey()).toString();
            }
            return this.b;
        }

        public final /* synthetic */ Object setValue(Object obj) {
            String str = (String) obj;
            String a2 = getValue();
            this.a.setValue(str);
            return a2;
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    /* renamed from: wrk$b */
    public static final class b implements Iterator<Entry<String, String>> {
        private final Iterator<Entry<CharSequence, CharSequence>> a;

        public b(Iterator<Entry<CharSequence, CharSequence>> it) {
            this.a = it;
        }

        public final boolean hasNext() {
            return this.a.hasNext();
        }

        public final /* synthetic */ Object next() {
            return new a((Entry) this.a.next());
        }

        public final void remove() {
            this.a.remove();
        }
    }

    public static <K, V> List<String> a(wrj<K, V, ?> wrj, K k) {
        final List b2 = wrj.b(k);
        return new AbstractList<String>() {
            public final /* synthetic */ Object get(int i) {
                Object obj = b2.get(i);
                if (obj != null) {
                    return obj.toString();
                }
                return null;
            }

            public final int size() {
                return b2.size();
            }
        };
    }

    public static <K, V> String b(wrj<K, V, ?> wrj, K k) {
        Object a2 = wrj.a(k);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }
}
