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

/* renamed from: buw reason: default package */
public final class buw implements bvk, bwj {
    final Lock a;
    final Condition b;
    final Context c;
    final bsp d;
    final buy e;
    final Map<c<?>, f> f;
    final Map<c<?>, ConnectionResult> g = new HashMap();
    final bwy h;
    final Map<bst<?>, Boolean> i;
    final a<? extends ext, exd> j;
    volatile buv k;
    int l;
    final bun m;
    final bvl n;
    private ConnectionResult o = null;

    public buw(Context context, bun bun, Lock lock, Looper looper, bsp bsp, Map<c<?>, f> map, bwy bwy, Map<bst<?>, Boolean> map2, a<? extends ext, exd> aVar, ArrayList<bwi> arrayList, bvl bvl) {
        this.c = context;
        this.a = lock;
        this.d = bsp;
        this.f = map;
        this.h = bwy;
        this.i = map2;
        this.j = aVar;
        this.m = bun;
        this.n = bvl;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((bwi) obj).b = this;
        }
        this.e = new buy(this, looper);
        this.b = lock.newCondition();
        this.k = new bum(this);
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t) {
        t.g();
        return this.k.a(t);
    }

    public final void a() {
        this.k.c();
    }

    public final void a(int i2) {
        this.a.lock();
        try {
            this.k.a(i2);
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

    /* access modifiers changed from: 0000 */
    public final void a(bux bux) {
        this.e.sendMessage(this.e.obtainMessage(1, bux));
    }

    /* access modifiers changed from: 0000 */
    public final void a(ConnectionResult connectionResult) {
        this.a.lock();
        try {
            this.o = connectionResult;
            this.k = new bum(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void a(ConnectionResult connectionResult, bst<?> bst, boolean z) {
        this.a.lock();
        try {
            this.k.a(connectionResult, bst, z);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.k);
        for (bst bst : this.i.keySet()) {
            printWriter.append(str).append(bst.b).println(":");
            ((f) this.f.get(bst.b())).a(concat, printWriter);
        }
    }

    public final boolean a(btq btq) {
        return false;
    }

    public final <A extends b, T extends a<? extends btc, A>> T b(T t) {
        t.g();
        return this.k.b(t);
    }

    public final ConnectionResult b() {
        a();
        while (this.k instanceof bub) {
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
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
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
            this.k = new bty(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final boolean e() {
        return this.k instanceof bty;
    }

    public final void f() {
    }
}
