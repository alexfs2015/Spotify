package defpackage;

import io.netty.handler.codec.EncoderException;
import java.util.List;

/* renamed from: wdf reason: default package */
public abstract class wdf<I> extends wbd {
    private final wjq b = wjq.a(this, wdf.class, "I");

    /* access modifiers changed from: protected */
    public abstract void a(wav wav, I i, List<Object> list);

    protected wdf() {
    }

    public boolean a(Object obj) {
        return this.b.a(obj);
    }

    public final void a(wav wav, Object obj, wbi wbi) {
        wbi wbi2;
        wbi wbi3;
        wcy wcy = null;
        int i = 0;
        boolean z = true;
        try {
            if (a(obj)) {
                wcy a = wcy.a();
                try {
                    a(wav, (I) obj, (List<Object>) a);
                    whh.a(obj);
                    if (!a.isEmpty()) {
                        wcy = a;
                    } else {
                        a.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append(wjn.a((Object) this));
                        sb.append(" must produce at least one message.");
                        throw new EncoderException(sb.toString());
                    }
                } catch (EncoderException e) {
                    e = e;
                    wcy wcy2 = a;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wcy = a;
                    throw new EncoderException(th);
                }
            } else {
                wav.a(obj, wbi);
            }
            if (wcy != null) {
                int size = wcy.size() - 1;
                if (size == 0) {
                    wav.a(wcy.get(0), wbi);
                } else if (size > 0) {
                    wbi n = wav.n();
                    if (wbi != n) {
                        z = false;
                    }
                    while (i < size) {
                        if (z) {
                            wbi3 = n;
                        } else {
                            wbi3 = wav.k();
                        }
                        wav.a(wcy.a[i], wbi3);
                        i++;
                    }
                    wav.a(wcy.a[size], wbi);
                }
                wcy.b();
            }
        } catch (EncoderException e2) {
            e = e2;
            throw e;
        } catch (Throwable th2) {
            if (wcy != null) {
                int size2 = wcy.size() - 1;
                if (size2 == 0) {
                    wav.a(wcy.get(0), wbi);
                } else if (size2 > 0) {
                    wbi n2 = wav.n();
                    if (wbi != n2) {
                        z = false;
                    }
                    while (i < size2) {
                        if (z) {
                            wbi2 = n2;
                        } else {
                            wbi2 = wav.k();
                        }
                        wav.a(wcy.a[i], wbi2);
                        i++;
                    }
                    wav.a(wcy.a[size2], wbi);
                }
                wcy.b();
            }
            throw th2;
        }
    }
}
