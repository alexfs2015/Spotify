package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bwm reason: default package */
public final class bwm implements Callback {
    public final a a;
    public final ArrayList<b> b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();
    public final ArrayList<c> d = new ArrayList<>();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Handler h;
    public final Object i = new Object();

    /* renamed from: bwm$a */
    public interface a {
        Bundle a();

        boolean g();
    }

    public bwm(Looper looper, a aVar) {
        this.a = aVar;
        this.h = new ege(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(c cVar) {
        bwx.a(cVar);
        synchronized (this.i) {
            if (this.d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.d.add(cVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            b bVar = (b) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.g() && this.b.contains(bVar)) {
                    bVar.a(this.a.a());
                }
            }
            return true;
        }
        int i2 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        new Exception();
        return false;
    }
}
