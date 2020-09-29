package defpackage;

import io.netty.handler.codec.EncoderException;
import java.util.List;

/* renamed from: wrl reason: default package */
public abstract class wrl<I> extends wpj {
    private final wxw b = wxw.a(this, wrl.class, "I");

    protected wrl() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(wpb wpb, I i, List<Object> list);

    public final void a(wpb wpb, Object obj, wpo wpo) {
        wre wre = null;
        int i = 0;
        boolean z = true;
        try {
            if (a(obj)) {
                wre a = wre.a();
                try {
                    a(wpb, (I) obj, (List<Object>) a);
                    wvn.a(obj);
                    if (!a.isEmpty()) {
                        wre = a;
                    } else {
                        a.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append(wxt.a((Object) this));
                        sb.append(" must produce at least one message.");
                        throw new EncoderException(sb.toString());
                    }
                } catch (EncoderException e) {
                    e = e;
                    wre wre2 = a;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wre = a;
                    throw new EncoderException(th);
                }
            } else {
                wpb.a(obj, wpo);
            }
            if (wre != null) {
                int size = wre.size() - 1;
                if (size == 0) {
                    wpb.a(wre.get(0), wpo);
                } else if (size > 0) {
                    wpo n = wpb.n();
                    if (wpo != n) {
                        z = false;
                    }
                    while (i < size) {
                        wpb.a(wre.a[i], z ? n : wpb.k());
                        i++;
                    }
                    wpb.a(wre.a[size], wpo);
                }
                wre.b();
            }
        } catch (EncoderException e2) {
            e = e2;
            throw e;
        } catch (Throwable th2) {
            if (wre != null) {
                int size2 = wre.size() - 1;
                if (size2 == 0) {
                    wpb.a(wre.get(0), wpo);
                } else if (size2 > 0) {
                    wpo n2 = wpb.n();
                    if (wpo != n2) {
                        z = false;
                    }
                    while (i < size2) {
                        wpb.a(wre.a[i], z ? n2 : wpb.k());
                        i++;
                    }
                    wpb.a(wre.a[size2], wpo);
                }
                wre.b();
            }
            throw th2;
        }
    }

    public boolean a(Object obj) {
        return this.b.a(obj);
    }
}
