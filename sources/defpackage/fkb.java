package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fkb reason: default package */
public final class fkb extends fkq {
    private static final Writer e = new Writer() {
        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final fjf f = new fjf("closed");
    public final List<fjb> a = new ArrayList();
    public fjb b = fjc.a;
    private String g;

    public fkb() {
        super(e);
    }

    private void a(fjb fjb) {
        if (this.g != null) {
            if (!(fjb instanceof fjc) || this.d) {
                ((fjd) f()).a(this.g, fjb);
            }
            this.g = null;
        } else if (this.a.isEmpty()) {
            this.b = fjb;
        } else {
            fjb f2 = f();
            if (f2 instanceof fiz) {
                ((fiz) f2).a(fjb);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private fjb f() {
        List<fjb> list = this.a;
        return (fjb) list.get(list.size() - 1);
    }

    public final fkq a() {
        fiz fiz = new fiz();
        a((fjb) fiz);
        this.a.add(fiz);
        return this;
    }

    public final fkq a(long j) {
        a((fjb) new fjf((Number) Long.valueOf(j)));
        return this;
    }

    public final fkq a(Boolean bool) {
        if (bool == null) {
            return e();
        }
        a((fjb) new fjf(bool));
        return this;
    }

    public final fkq a(Number number) {
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
        a((fjb) new fjf(number));
        return this;
    }

    public final fkq a(String str) {
        if (this.a.isEmpty() || this.g != null) {
            throw new IllegalStateException();
        } else if (f() instanceof fjd) {
            this.g = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final fkq a(boolean z) {
        a((fjb) new fjf(Boolean.valueOf(z)));
        return this;
    }

    public final fkq b() {
        if (this.a.isEmpty() || this.g != null) {
            throw new IllegalStateException();
        } else if (f() instanceof fiz) {
            List<fjb> list = this.a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final fkq b(String str) {
        if (str == null) {
            return e();
        }
        a((fjb) new fjf(str));
        return this;
    }

    public final fkq c() {
        fjd fjd = new fjd();
        a((fjb) fjd);
        this.a.add(fjd);
        return this;
    }

    public final void close() {
        if (this.a.isEmpty()) {
            this.a.add(f);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final fkq d() {
        if (this.a.isEmpty() || this.g != null) {
            throw new IllegalStateException();
        } else if (f() instanceof fjd) {
            List<fjb> list = this.a;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final fkq e() {
        a((fjb) fjc.a);
        return this;
    }

    public final void flush() {
    }
}
