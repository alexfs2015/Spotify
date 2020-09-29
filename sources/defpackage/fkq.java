package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: fkq reason: default package */
public class fkq implements Closeable, Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    public boolean c;
    protected boolean d;
    private final Writer e;
    private int[] f = new int[32];
    private int g = 0;
    private String h;
    private String i;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            a[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        String[] strArr3 = b;
        strArr3[62] = "\\u003e";
        strArr3[38] = "\\u0026";
        strArr3[61] = "\\u003d";
        strArr3[39] = "\\u0027";
    }

    public fkq(Writer writer) {
        a(6);
        this.h = ":";
        this.d = true;
        if (writer != null) {
            this.e = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private fkq a(int i2, int i3, String str) {
        int f2 = f();
        if (f2 != i3 && f2 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.i == null) {
            this.g--;
            this.e.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.i);
            throw new IllegalStateException(sb.toString());
        }
    }

    private fkq a(int i2, String str) {
        i();
        a(i2);
        this.e.write(str);
        return this;
    }

    private void a(int i2) {
        int i3 = this.g;
        int[] iArr = this.f;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f = iArr2;
        }
        int[] iArr3 = this.f;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr3[i4] = i2;
    }

    private void b(int i2) {
        this.f[this.g - 1] = i2;
    }

    private void c(String str) {
        String str2;
        String[] strArr = a;
        String str3 = "\"";
        this.e.write(str3);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.e.write(str, i2, i3 - i2);
            }
            this.e.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.e.write(str, i2, length - i2);
        }
        this.e.write(str3);
    }

    private int f() {
        int i2 = this.g;
        if (i2 != 0) {
            return this.f[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void g() {
        if (this.i != null) {
            h();
            c(this.i);
            this.i = null;
        }
    }

    private void h() {
        int f2 = f();
        if (f2 == 5) {
            this.e.write(44);
        } else if (f2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        b(4);
    }

    private void i() {
        int f2 = f();
        if (f2 == 1) {
            b(2);
        } else if (f2 == 2) {
            this.e.append(',');
        } else if (f2 != 4) {
            if (f2 != 6) {
                if (f2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.c) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
        } else {
            this.e.append(this.h);
            b(5);
        }
    }

    public fkq a() {
        g();
        return a(1, "[");
    }

    public fkq a(long j) {
        g();
        i();
        this.e.write(Long.toString(j));
        return this;
    }

    public fkq a(Boolean bool) {
        if (bool == null) {
            return e();
        }
        g();
        i();
        this.e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public fkq a(Number number) {
        if (number == null) {
            return e();
        }
        g();
        String obj = number.toString();
        if (this.c || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            i();
            this.e.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }

    public fkq a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.i != null) {
            throw new IllegalStateException();
        } else if (this.g != 0) {
            this.i = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public fkq a(boolean z) {
        g();
        i();
        this.e.write(z ? "true" : "false");
        return this;
    }

    public fkq b() {
        return a(1, 2, "]");
    }

    public fkq b(String str) {
        if (str == null) {
            return e();
        }
        g();
        i();
        c(str);
        return this;
    }

    public fkq c() {
        g();
        return a(3, "{");
    }

    public void close() {
        this.e.close();
        int i2 = this.g;
        if (i2 > 1 || (i2 == 1 && this.f[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.g = 0;
    }

    public fkq d() {
        return a(3, 5, "}");
    }

    public fkq e() {
        if (this.i != null) {
            if (this.d) {
                g();
            } else {
                this.i = null;
                return this;
            }
        }
        i();
        this.e.write("null");
        return this;
    }

    public void flush() {
        if (this.g != 0) {
            this.e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
