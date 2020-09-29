package defpackage;

import io.netty.handler.codec.DecoderException;
import java.util.List;

/* renamed from: wcw reason: default package */
public abstract class wcw extends wax {
    public static final a b = new a() {
        public final vyv a(vyw vyw, vyv vyv, vyv vyv2) {
            if (vyv.d() > vyv.b() - vyv2.g() || vyv.z() > 1) {
                vyv = wcw.a(vyw, vyv, vyv2.g());
            }
            vyv.a(vyv2);
            vyv2.B();
            return vyv;
        }
    };
    public static final a c = new a() {
        public final vyv a(vyw vyw, vyv vyv, vyv vyv2) {
            vzb vzb;
            if (vyv.z() > 1) {
                vyv a = wcw.a(vyw, vyv, vyv2.g());
                a.a(vyv2);
                vyv2.B();
                return a;
            }
            if (vyv instanceof vzb) {
                vzb = (vzb) vyv;
            } else {
                vzb = vyw.e(Integer.MAX_VALUE);
                vzb.a(true, vyv);
            }
            vzb.a(true, vyv2);
            return vzb;
        }
    };
    protected a d = b;
    private vyv e;
    private boolean f;
    private boolean g;
    private int h = 16;
    private int i;

    /* renamed from: wcw$a */
    public interface a {
        vyv a(vyw vyw, vyv vyv, vyv vyv2);
    }

    /* access modifiers changed from: protected */
    public abstract void a(wav wav, vyv vyv, List<Object> list);

    /* access modifiers changed from: protected */
    public void c() {
    }

    protected wcw() {
        if (a()) {
            throw new IllegalStateException("@Sharable annotation is not allowed");
        }
    }

    public final void f(wav wav) {
        vyv vyv = this.e;
        if (vyv != null) {
            this.e = null;
            int g2 = vyv.g();
            if (g2 > 0) {
                vyv u = vyv.u(g2);
                vyv.B();
                wav.d(u);
            } else {
                vyv.B();
            }
            this.i = 0;
            wav.j();
        }
        c();
    }

    public final void a(wav wav, Object obj) {
        if (obj instanceof vyv) {
            wcy a2 = wcy.a();
            try {
                vyv vyv = (vyv) obj;
                this.g = this.e == null;
                if (this.g) {
                    this.e = vyv;
                } else {
                    this.e = this.d.a(wav.c(), this.e, vyv);
                }
                c(wav, this.e, a2);
                vyv vyv2 = this.e;
                if (vyv2 == null || vyv2.f()) {
                    int i2 = this.i + 1;
                    this.i = i2;
                    if (i2 >= this.h) {
                        this.i = 0;
                        d();
                    }
                } else {
                    this.i = 0;
                    this.e.B();
                    this.e = null;
                }
                int size = a2.size();
                this.f = !a2.b;
                a(wav, a2, size);
                a2.b();
            } catch (DecoderException e2) {
                throw e2;
            } catch (Throwable th) {
                vyv vyv3 = this.e;
                if (vyv3 == null || vyv3.f()) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    if (i3 >= this.h) {
                        this.i = 0;
                        d();
                    }
                } else {
                    this.i = 0;
                    this.e.B();
                    this.e = null;
                }
                int size2 = a2.size();
                this.f = true ^ a2.b;
                a(wav, a2, size2);
                a2.b();
                throw th;
            }
        } else {
            wav.d(obj);
        }
    }

    private static void a(wav wav, List<Object> list, int i2) {
        if (list instanceof wcy) {
            a(wav, (wcy) list, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            wav.d(list.get(i3));
        }
    }

    public void i(wav wav) {
        this.i = 0;
        d();
        if (this.f) {
            this.f = false;
            if (!wav.a().B().e()) {
                wav.m();
            }
        }
        wav.j();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        vyv vyv = this.e;
        if (vyv != null && !this.g && vyv.z() == 1) {
            this.e.l();
        }
    }

    public void b(wav wav) {
        a(wav, true);
    }

    public void b(wav wav, Object obj) {
        if (obj instanceof wcq) {
            a(wav, false);
        }
        super.b(wav, obj);
    }

    private void a(wav wav, boolean z) {
        wcy a2 = wcy.a();
        try {
            a(wav, (List<Object>) a2);
            try {
                if (this.e != null) {
                    this.e.B();
                    this.e = null;
                }
                int size = a2.size();
                a(wav, a2, size);
                if (size > 0) {
                    wav.j();
                }
                if (z) {
                    wav.h();
                }
            } finally {
                a2.b();
            }
        } catch (DecoderException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new DecoderException((Throwable) e3);
        } catch (Throwable th) {
            a2.b();
            throw th;
        }
    }

    private void a(wav wav, List<Object> list) {
        vyv vyv = this.e;
        if (vyv != null) {
            c(wav, vyv, list);
            b(wav, this.e, list);
            return;
        }
        b(wav, vzw.a, list);
    }

    private void c(wav wav, vyv vyv, List<Object> list) {
        while (vyv.f()) {
            try {
                int size = list.size();
                if (size > 0) {
                    a(wav, list, size);
                    list.clear();
                    if (wav.r()) {
                        break;
                    }
                    size = 0;
                }
                int g2 = vyv.g();
                a(wav, vyv, list);
                if (wav.r()) {
                    break;
                } else if (size == list.size()) {
                    if (g2 == vyv.g()) {
                        return;
                    }
                } else if (g2 == vyv.g()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wjn.a(getClass()));
                    sb.append(".decode() did not read anything but decoded a message.");
                    throw new DecoderException(sb.toString());
                }
            } catch (DecoderException e2) {
                throw e2;
            } catch (Throwable th) {
                throw new DecoderException(th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(wav wav, vyv vyv, List<Object> list) {
        if (vyv.f()) {
            a(wav, vyv, list);
        }
    }

    static vyv a(vyw vyw, vyv vyv, int i2) {
        vyv a2 = vyw.a(vyv.g() + i2);
        a2.a(vyv);
        vyv.B();
        return a2;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        vyv vyv = this.e;
        if (vyv == null) {
            vyv = vzw.a;
        }
        return vyv.g();
    }

    private static void a(wav wav, wcy wcy, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            wav.d(wcy.a[i3]);
        }
    }
}
