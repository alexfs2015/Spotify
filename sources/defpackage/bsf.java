package defpackage;

import android.text.TextUtils;

/* renamed from: bsf reason: default package */
final class bsf extends eif {
    private final /* synthetic */ String a;
    private final /* synthetic */ String e;

    bsf(bsy bsy, String str, String str2) {
        this.a = str;
        this.e = str2;
        super(bsy);
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehs) bVar);
    }

    public final void a(ehs ehs) {
        long incrementAndGet;
        try {
            String str = this.a;
            String str2 = this.e;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("The message payload cannot be null or empty");
            } else if (str2.length() <= 524288) {
                eic.a(str);
                incrementAndGet = ehs.l.incrementAndGet();
                ehs.m.put(Long.valueOf(incrementAndGet), this);
                eie eie = (eie) ehs.q();
                if (ehs.t()) {
                    eie.a(str, str2, incrementAndGet);
                } else {
                    ehs.a(incrementAndGet, 2016);
                }
            } else {
                ehs.a.c("Message send failed. Message exceeds maximum size", new Object[0]);
                throw new IllegalArgumentException("Message exceeds maximum size");
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
            h();
        } catch (Throwable th) {
            ehs.m.remove(Long.valueOf(incrementAndGet));
            throw th;
        }
    }
}
