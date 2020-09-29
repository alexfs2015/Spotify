package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: buf reason: default package */
public final class buf implements but, bvs {
    final Lock a;
    final Condition b;
    final Context c;
    final bry d;
    final buh e;
    final Map<c<?>, f> f;
    final Map<c<?>, ConnectionResult> g = new HashMap();
    final bwh h;
    final Map<bsc<?>, Boolean> i;
    final a<? extends exc, ewm> j;
    volatile bue k;
    int l;
    final btw m;
    final buu n;
    private ConnectionResult o = null;

    public buf(Context context, btw btw, Lock lock, Looper looper, bry bry, Map<c<?>, f> map, bwh bwh, Map<bsc<?>, Boolean> map2, a<? extends exc, ewm> aVar, ArrayList<bvr> arrayList, buu buu) {
        this.c = context;
        this.a = lock;
        this.d = bry;
        this.f = map;
        this.h = bwh;
        this.i = map2;
        this.j = aVar;
        this.m = btw;
        this.n = buu;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((bvr) obj).b = this;
        }
        this.e = new buh(this, looper);
        this.b = lock.newCondition();
        this.k = new btv(this);
    }

    public final boolean a(bsz bsz) {
        return false;
    }

    public final void f() {
    }

    public final <A extends b, R extends bsl, T extends a<R, A>> T a(T t) {
        t.g();
        return this.k.a(t);
    }

    public final <A extends b, T extends a<? extends bsl, A>> T b(T t) {
        t.g();
        return this.k.b(t);
    }

    public final void a() {
        this.k.c();
    }

    public final ConnectionResult b() {
        a();
        while (this.k instanceof btk) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (e()) {
            return ConnectionResult.a;
        }
        ConnectionResult connectionResult = this.o;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    public final void c() {
        if (this.k.b()) {
            this.g.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.a.lock();
        try {
            this.m.l();
            this.k = new bth(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.k = new btv(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final boolean e() {
        return this.k instanceof bth;
    }

    public final void a(ConnectionResult connectionResult, bsc<?> bsc, boolean z) {
        this.a.lock();
        try {
            this.k.a(connectionResult, bsc, z);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.lock();
        try {
            this.k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(int i2) {
        this.a.lock();
        try {
            this.k.a(i2);
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(bug bug) {
        this.e.sendMessage(this.e.obtainMessage(1, bug));
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.k);
        for (bsc bsc : this.i.keySet()) {
            printWriter.append(str).append(bsc.b).println(":");
            ((f) this.f.get(bsc.b())).a(concat, printWriter);
        }
    }
}
