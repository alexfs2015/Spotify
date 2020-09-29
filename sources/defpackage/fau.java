package defpackage;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: fau reason: default package */
public class fau {
    final String a;

    /* renamed from: fau$a */
    public static final class a {
        private final fau a;
        private final String b;

        /* synthetic */ a(fau fau, String str, byte b2) {
            this(fau, str);
        }

        private a(fau fau, String str) {
            this.a = fau;
            this.b = (String) fay.a(str);
        }

        public final String a(Map<?, ?> map) {
            return a(new StringBuilder(), map.entrySet().iterator()).toString();
        }

        private StringBuilder a(StringBuilder sb, Iterator<? extends Entry<?, ?>> it) {
            try {
                fay.a(sb);
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
    }

    /* synthetic */ fau(fau fau, byte b) {
        this(fau);
    }

    public static fau a(String str) {
        return new fau(str);
    }

    public static fau a(char c) {
        return new fau(String.valueOf(c));
    }

    private fau(String str) {
        this.a = (String) fay.a(str);
    }

    private fau(fau fau) {
        this.a = fau.a;
    }

    public <A extends Appendable> A a(A a2, Iterator<?> it) {
        fay.a(a2);
        if (it.hasNext()) {
            a2.append(a(it.next()));
            while (it.hasNext()) {
                a2.append(this.a);
                a2.append(a(it.next()));
            }
        }
        return a2;
    }

    public final StringBuilder a(StringBuilder sb, Iterator<?> it) {
        try {
            a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String a(Iterable<?> iterable) {
        return a(iterable.iterator());
    }

    public final String a(Iterator<?> it) {
        return a(new StringBuilder(), it).toString();
    }

    public final String a(Object[] objArr) {
        return a((Iterable<?>) Arrays.asList(objArr));
    }

    public fau a() {
        return new fau(this) {
            public final <A extends Appendable> A a(A a, Iterator<?> it) {
                fay.a(a, (Object) "appendable");
                fay.a(it, (Object) "parts");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != null) {
                        a.append(fau.this.a(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a.append(fau.this.a);
                        a.append(fau.this.a(next2));
                    }
                }
                return a;
            }

            public final a b(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public a b(String str) {
        return new a(this, str, 0);
    }

    /* access modifiers changed from: 0000 */
    public CharSequence a(Object obj) {
        fay.a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String a(final Object obj, final Object obj2, final Object... objArr) {
        fay.a(objArr);
        return a((Iterable<?>) new AbstractList<Object>() {
            public final int size() {
                return objArr.length + 2;
            }

            public final Object get(int i) {
                if (i == 0) {
                    return obj;
                }
                if (i != 1) {
                    return objArr[i - 2];
                }
                return obj2;
            }
        });
    }
}
