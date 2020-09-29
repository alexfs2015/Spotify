package defpackage;

import android.text.TextUtils;

/* renamed from: bro reason: default package */
final class bro extends eho {
    private final /* synthetic */ String a;
    private final /* synthetic */ String e;

    bro(bsh bsh, String str, String str2) {
        this.a = str;
        this.e = str2;
        super(bsh);
    }

    public final void a(ehb ehb) {
        long incrementAndGet;
        try {
            String str = this.a;
            String str2 = this.e;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("The message payload cannot be null or empty");
            } else if (str2.length() <= 524288) {
                ehl.a(str);
                incrementAndGet = ehb.l.incrementAndGet();
                ehb.m.put(Long.valueOf(incrementAndGet), this);
                ehn ehn = (ehn) ehb.q();
                if (ehb.t()) {
                    ehn.a(str, str2, incrementAndGet);
                } else {
                    ehb.a(incrementAndGet, 2016);
                }
            } else {
                ehb.a.c("Message send failed. Message exceeds maximum size", new Object[0]);
                throw new IllegalArgumentException("Message exceeds maximum size");
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
            h();
        } catch (Throwable th) {
            ehb.m.remove(Long.valueOf(incrementAndGet));
            throw th;
        }
    }

    public final /* synthetic */ void a(b bVar) {
        a((ehb) bVar);
    }
}
