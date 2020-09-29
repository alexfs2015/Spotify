package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fjh reason: default package */
public final class fjh extends fjw {
    private static final Writer e = new Writer() {
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void close() {
            throw new AssertionError();
        }
    };
    private static final fil f = new fil("closed");
    public final List<fih> a = new ArrayList();
    public fih b = fii.a;
    private String g;

    public final void flush() {
    }

    public fjh() {
        super(e);
    }

    private fih f() {
        List<fih> list = this.a;
        return (fih) list.get(list.size() - 1);
    }

    private void a(fih fih) {
        if (this.g != null) {
            if (!(fih instanceof fii) || this.d) {
                ((fij) f()).a(this.g, fih);
            }
            this.g = null;
        } else if (this.a.isEmpty()) {
            this.b = fih;
        } else {
            fih f2 = f();
            if (f2 instanceof fif) {
                ((fif) f2).a(fih);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final fjw a() {
        fif fif = new fif();
        a((fih) fif);
        this.a.add(fif);
        return this;
    }

    public final fjw b() {
        if (this.a.isEmpty() || this.g != null) {
            throw new IllegalStateException();
        } else if (f() instanceof fif) {
            List<fih> list = this.a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final fjw c() {
        fij fij = new fij();
        a((fih) fij);
        this.a.add(fij);
        return this;
    }

    public final fjw d() {
        if (this.a.isEmpty() || this.g != null) {
            throw new IllegalStateException();
        } else if (f() instanceof fij) {
            List<fih> list = this.a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final fjw a(String str) {
        if (this.a.isEmpty() || this.g != null) {
            throw new IllegalStateException();
        } else if (f() instanceof fij) {
            this.g = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final fjw b(String str) {
        if (str == null) {
            return e();
        }
        a((fih) new fil(str));
        return this;
    }

    public final fjw e() {
        a((fih) fii.a);
        return this;
    }

    public final fjw a(boolean z) {
        a((fih) new fil(Boolean.valueOf(z)));
        return this;
    }

    public final fjw a(Boolean bool) {
        if (bool == null) {
            return e();
        }
        a((fih) new fil(bool));
        return this;
    }

    public final fjw a(long j) {
        a((fih) new fil((Number) Long.valueOf(j)));
        return this;
    }

    public final fjw a(Number number) {
        if (number == null) {
            return e();
        }
        if (!this.c) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        a((fih) new fil(number));
        return this;
    }

    public final void close() {
        if (this.a.isEmpty()) {
            this.a.add(f);
            return;
        }
        throw new IOException("Incomplete document");
    }
}
