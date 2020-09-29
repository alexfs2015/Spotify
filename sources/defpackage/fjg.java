package defpackage;

import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: fjg reason: default package */
public final class fjg extends fjv {
    private static final Object c = new Object();
    private Object[] d;
    private int e;
    private String[] f;
    private int[] g;

    static {
        new Reader() {
            public final int read(char[] cArr, int i, int i2) {
                throw new AssertionError();
            }

            public final void close() {
                throw new AssertionError();
            }
        };
    }

    public final void a() {
        a(JsonToken.BEGIN_ARRAY);
        a((Object) ((fif) g()).iterator());
        this.g[this.e - 1] = 0;
    }

    public final void b() {
        a(JsonToken.END_ARRAY);
        s();
        s();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void c() {
        a(JsonToken.BEGIN_OBJECT);
        a((Object) ((fij) g()).a.entrySet().iterator());
    }

    public final void d() {
        a(JsonToken.END_OBJECT);
        s();
        s();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final boolean e() {
        JsonToken f2 = f();
        return (f2 == JsonToken.END_OBJECT || f2 == JsonToken.END_ARRAY) ? false : true;
    }

    public final JsonToken f() {
        while (this.e != 0) {
            Object g2 = g();
            if (g2 instanceof Iterator) {
                boolean z = this.d[this.e - 2] instanceof fij;
                Iterator it = (Iterator) g2;
                if (!it.hasNext()) {
                    return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                }
                if (z) {
                    return JsonToken.NAME;
                }
                a(it.next());
            } else if (g2 instanceof fij) {
                return JsonToken.BEGIN_OBJECT;
            } else {
                if (g2 instanceof fif) {
                    return JsonToken.BEGIN_ARRAY;
                }
                if (g2 instanceof fil) {
                    fil fil = (fil) g2;
                    if (fil.a instanceof String) {
                        return JsonToken.STRING;
                    }
                    if (fil.a instanceof Boolean) {
                        return JsonToken.BOOLEAN;
                    }
                    if (fil.a instanceof Number) {
                        return JsonToken.NUMBER;
                    }
                    throw new AssertionError();
                } else if (g2 instanceof fii) {
                    return JsonToken.NULL;
                } else {
                    if (g2 == c) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return JsonToken.END_DOCUMENT;
    }

    public Object g() {
        return this.d[this.e - 1];
    }

    private Object s() {
        Object[] objArr = this.d;
        int i = this.e - 1;
        this.e = i;
        Object obj = objArr[i];
        objArr[this.e] = null;
        return obj;
    }

    public void a(JsonToken jsonToken) {
        if (f() != jsonToken) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(f());
            sb.append(t());
            throw new IllegalStateException(sb.toString());
        }
    }

    public final String h() {
        a(JsonToken.NAME);
        Entry entry = (Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.f[this.e - 1] = str;
        a(entry.getValue());
        return str;
    }

    public final String i() {
        JsonToken f2 = f();
        if (f2 == JsonToken.STRING || f2 == JsonToken.NUMBER) {
            String b = ((fil) s()).b();
            int i = this.e;
            if (i > 0) {
                int[] iArr = this.g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return b;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.STRING);
        sb.append(" but was ");
        sb.append(f2);
        sb.append(t());
        throw new IllegalStateException(sb.toString());
    }

    public final boolean j() {
        a(JsonToken.BOOLEAN);
        boolean f2 = ((fil) s()).f();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f2;
    }

    public final void k() {
        a(JsonToken.NULL);
        s();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final double l() {
        JsonToken f2 = f();
        if (f2 == JsonToken.NUMBER || f2 == JsonToken.STRING) {
            double c2 = ((fil) g()).c();
            if (this.a || (!Double.isNaN(c2) && !Double.isInfinite(c2))) {
                s();
                int i = this.e;
                if (i > 0) {
                    int[] iArr = this.g;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return c2;
            }
            StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
            sb.append(c2);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(JsonToken.NUMBER);
        sb2.append(" but was ");
        sb2.append(f2);
        sb2.append(t());
        throw new IllegalStateException(sb2.toString());
    }

    public final long m() {
        JsonToken f2 = f();
        if (f2 == JsonToken.NUMBER || f2 == JsonToken.STRING) {
            long d2 = ((fil) g()).d();
            s();
            int i = this.e;
            if (i > 0) {
                int[] iArr = this.g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return d2;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.NUMBER);
        sb.append(" but was ");
        sb.append(f2);
        sb.append(t());
        throw new IllegalStateException(sb.toString());
    }

    public final int n() {
        JsonToken f2 = f();
        if (f2 == JsonToken.NUMBER || f2 == JsonToken.STRING) {
            int e2 = ((fil) g()).e();
            s();
            int i = this.e;
            if (i > 0) {
                int[] iArr = this.g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e2;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.NUMBER);
        sb.append(" but was ");
        sb.append(f2);
        sb.append(t());
        throw new IllegalStateException(sb.toString());
    }

    public final void close() {
        this.d = new Object[]{c};
        this.e = 1;
    }

    public final void o() {
        String str = "null";
        if (f() == JsonToken.NAME) {
            h();
            this.f[this.e - 2] = str;
        } else {
            s();
            int i = this.e;
            if (i > 0) {
                this.f[i - 1] = str;
            }
        }
        int i2 = this.e;
        if (i2 > 0) {
            int[] iArr = this.g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(Object obj) {
        int i = this.e;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i << 1)];
            int[] iArr = new int[(i << 1)];
            String[] strArr = new String[(i << 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.g, 0, iArr, 0, this.e);
            System.arraycopy(this.f, 0, strArr, 0, this.e);
            this.d = objArr2;
            this.g = iArr;
            this.f = strArr;
        }
        Object[] objArr3 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        objArr3[i2] = obj;
    }

    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] instanceof fif) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.g[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof fij) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private String t() {
        StringBuilder sb = new StringBuilder(" at path ");
        sb.append(p());
        return sb.toString();
    }
}
