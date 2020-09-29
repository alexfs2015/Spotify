package defpackage;

import io.netty.handler.codec.DecoderException;
import java.util.List;

/* renamed from: wrc reason: default package */
public abstract class wrc extends wpd {
    public static final a b = new a() {
        public final wnb a(wnc wnc, wnb wnb, wnb wnb2) {
            if (wnb.d() > wnb.b() - wnb2.g() || wnb.z() > 1) {
                wnb = wrc.a(wnc, wnb, wnb2.g());
            }
            wnb.a(wnb2);
            wnb2.B();
            return wnb;
        }
    };
    public static final a c = new a() {
        public final wnb a(wnc wnc, wnb wnb, wnb wnb2) {
            wnh wnh;
            if (wnb.z() > 1) {
                wnb a = wrc.a(wnc, wnb, wnb2.g());
                a.a(wnb2);
                wnb2.B();
                return a;
            }
            if (wnb instanceof wnh) {
                wnh = (wnh) wnb;
            } else {
                wnh = wnc.e(Integer.MAX_VALUE);
                wnh.a(true, wnb);
            }
            wnh.a(true, wnb2);
            return wnh;
        }
    };
    protected a d = b;
    private wnb e;
    private boolean f;
    private boolean g;
    private int h = 16;
    private int i;

    /* renamed from: wrc$a */
    public interface a {
        wnb a(wnc wnc, wnb wnb, wnb wnb2);
    }

    protected wrc() {
        if (a()) {
            throw new IllegalStateException("@Sharable annotation is not allowed");
        }
    }

    static wnb a(wnc wnc, wnb wnb, int i2) {
        wnb a2 = wnc.a(wnb.g() + i2);
        a2.a(wnb);
        wnb.B();
        return a2;
    }

    private void a(wpb wpb, List<Object> list) {
        wnb wnb = this.e;
        if (wnb != null) {
            c(wpb, wnb, list);
            b(wpb, this.e, list);
            return;
        }
        b(wpb, woc.a, list);
    }

    private static void a(wpb wpb, List<Object> list, int i2) {
        if (list instanceof wre) {
            a(wpb, (wre) list, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            wpb.d(list.get(i3));
        }
    }

    private static void a(wpb wpb, wre wre, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            wpb.d(wre.a[i3]);
        }
    }

    private void a(wpb wpb, boolean z) {
        wre a2 = wre.a();
        try {
            a(wpb, (List<Object>) a2);
            try {
                if (this.e != null) {
                    this.e.B();
                    this.e = null;
                }
                int size = a2.size();
                a(wpb, a2, size);
                if (size > 0) {
                    wpb.j();
                }
                if (z) {
                    wpb.h();
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

    private void c(wpb wpb, wnb wnb, List<Object> list) {
        while (wnb.f()) {
            try {
                int size = list.size();
                if (size > 0) {
                    a(wpb, list, size);
                    list.clear();
                    if (wpb.r()) {
                        break;
                    }
                    size = 0;
                }
                int g2 = wnb.g();
                a(wpb, wnb, list);
                if (wpb.r()) {
                    break;
                } else if (size == list.size()) {
                    if (g2 == wnb.g()) {
                        return;
                    }
                } else if (g2 == wnb.g()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wxt.a(getClass()));
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

    public final void a(wpb wpb, Object obj) {
        if (obj instanceof wnb) {
            wre a2 = wre.a();
            try {
                wnb wnb = (wnb) obj;
                this.g = this.e == null;
                if (this.g) {
                    this.e = wnb;
                } else {
                    this.e = this.d.a(wpb.c(), this.e, wnb);
                }
                c(wpb, this.e, a2);
                wnb wnb2 = this.e;
                if (wnb2 == null || wnb2.f()) {
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
                a(wpb, a2, size);
                a2.b();
            } catch (DecoderException e2) {
                throw e2;
            } catch (Throwable th) {
                wnb wnb3 = this.e;
                if (wnb3 == null || wnb3.f()) {
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
                a(wpb, a2, size2);
                a2.b();
                throw th;
            }
        } else {
            wpb.d(obj);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(wpb wpb, wnb wnb, List<Object> list);

    /* access modifiers changed from: protected */
    public final int b() {
        wnb wnb = this.e;
        if (wnb == null) {
            wnb = woc.a;
        }
        return wnb.g();
    }

    public void b(wpb wpb) {
        a(wpb, true);
    }

    public void b(wpb wpb, Object obj) {
        if (obj instanceof wqw) {
            a(wpb, false);
        }
        super.b(wpb, obj);
    }

    /* access modifiers changed from: protected */
    public void b(wpb wpb, wnb wnb, List<Object> list) {
        if (wnb.f()) {
            a(wpb, wnb, list);
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public final void d() {
        wnb wnb = this.e;
        if (wnb != null && !this.g && wnb.z() == 1) {
            this.e.l();
        }
    }

    public final void f(wpb wpb) {
        wnb wnb = this.e;
        if (wnb != null) {
            this.e = null;
            int g2 = wnb.g();
            if (g2 > 0) {
                wnb u = wnb.u(g2);
                wnb.B();
                wpb.d(u);
            } else {
                wnb.B();
            }
            this.i = 0;
            wpb.j();
        }
        c();
    }

    public void i(wpb wpb) {
        this.i = 0;
        d();
        if (this.f) {
            this.f = false;
            if (!wpb.a().B().e()) {
                wpb.m();
            }
        }
        wpb.j();
    }
}
