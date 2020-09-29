package defpackage;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fbl reason: default package */
public class fbl {
    final String a;

    /* renamed from: fbl$a */
    public static final class a {
        private final fbl a;
        private final String b;

        private a(fbl fbl, String str) {
            this.a = fbl;
            this.b = (String) fbp.a(str);
        }

        /* synthetic */ a(fbl fbl, String str, byte b2) {
            this(fbl, str);
        }

        private StringBuilder a(StringBuilder sb, Iterator<? extends Entry<?, ?>> it) {
            try {
                fbp.a(sb);
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    sb.append(this.a.a(entry.getKey()));
                    sb.append(this.b);
                    sb.append(this.a.a(entry.getValue()));
                    while (it.hasNext()) {
                        sb.append(this.a.a);
                        Entry entry2 = (Entry) it.next();
                        sb.append(this.a.a(entry2.getKey()));
                        sb.append(this.b);
                        sb.append(this.a.a(entry2.getValue()));
                    }
                }
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public final String a(Map<?, ?> map) {
            return a(new StringBuilder(), map.entrySet().iterator()).toString();
        }
    }

    private fbl(fbl fbl) {
        this.a = fbl.a;
    }

    /* synthetic */ fbl(fbl fbl, byte b) {
        this(fbl);
    }

    private fbl(String str) {
        this.a = (String) fbp.a(str);
    }

    public static fbl a(char c) {
        return new fbl(String.valueOf(c));
    }

    public static fbl a(String str) {
        return new fbl(str);
    }

    public fbl a() {
        return new fbl(this) {
            public final <A extends Appendable> A a(A a, Iterator<?> it) {
                fbp.a(a, (Object) "appendable");
                fbp.a(it, (Object) "parts");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != null) {
                        a.append(fbl.this.a(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a.append(fbl.this.a);
                        a.append(fbl.this.a(next2));
                    }
                }
                return a;
            }

            public final a b(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public <A extends Appendable> A a(A a2, Iterator<?> it) {
        fbp.a(a2);
        if (it.hasNext()) {
            a2.append(a(it.next()));
            while (it.hasNext()) {
                a2.append(this.a);
                a2.append(a(it.next()));
            }
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence a(Object obj) {
        fbp.a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String a(Iterable<?> iterable) {
        return a(iterable.iterator());
    }

    public final String a(final Object obj, final Object obj2, final Object... objArr) {
        fbp.a(objArr);
        return a((Iterable<?>) new AbstractList<Object>() {
            public final Object get(int i) {
                return i != 0 ? i != 1 ? objArr[i - 2] : obj2 : obj;
            }

            public final int size() {
                return objArr.length + 2;
            }
        });
    }

    public final String a(Iterator<?> it) {
        return a(new StringBuilder(), it).toString();
    }

    public final String a(Object[] objArr) {
        return a((Iterable<?>) Arrays.asList(objArr));
    }

    public final StringBuilder a(StringBuilder sb, Iterator<?> it) {
        try {
            a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public a b(String str) {
        return new a(this, str, 0);
    }
}
