package com.moat.analytics.mobile;

import android.os.Handler;
import android.os.Looper;
import com.moat.analytics.mobile.base.functional.a;

class av implements Runnable {
    private static final long b = 90000;
    private final aa a;
    private final String c;
    /* access modifiers changed from: private */
    public final ax d;
    private ar e;

    private av(String str, aa aaVar, ax axVar) {
        this.e = ar.OFF;
        this.a = aaVar;
        this.d = axVar;
        StringBuilder sb = new StringBuilder("https://z.moatads.com/");
        sb.append(str);
        sb.append("/android/");
        sb.append("d6f3023");
        sb.append("/status.json");
        this.c = sb.toString();
    }

    /* synthetic */ av(String str, aa aaVar, ax axVar, at atVar) {
        this(str, aaVar, axVar);
    }

    private void a() {
        long j = 0;
        while (true) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            long j2 = b;
            if (currentTimeMillis < j2) {
                try {
                    Thread.sleep((j2 + 10) - currentTimeMillis);
                } catch (InterruptedException unused) {
                }
            }
            j = System.currentTimeMillis();
            ar b2 = b();
            Handler handler = new Handler(Looper.getMainLooper());
            b2.equals(this.e);
            this.e = b2;
            handler.post(new aw(this, b2));
        }
    }

    private ar b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append("?ts=");
        sb.append(System.currentTimeMillis());
        sb.append("&v=1.7.4");
        a a2 = this.a.a(sb.toString());
        if (!a2.c()) {
            return ar.OFF;
        }
        String trim = ((String) a2.b()).trim();
        String str = "d6f30235ac4e8b6fcea19ae1f45844a3723e6894";
        if (str.equals(trim)) {
            as.d = true;
        }
        return (trim.isEmpty() || str.equals(trim)) ? ar.ON : ar.OFF;
    }

    public void run() {
        try {
            a();
        } catch (Exception e2) {
            this.e = ar.OFF;
            com.moat.analytics.mobile.base.exception.a.a(e2);
        }
    }
}
