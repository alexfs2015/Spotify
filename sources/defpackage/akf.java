package defpackage;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: akf reason: default package */
public final class akf extends AbstractList<akd> {
    private static AtomicInteger e = new AtomicInteger();
    Handler a;
    List<akd> b;
    final String c;
    List<a> d;
    private int f;

    /* renamed from: akf$a */
    public interface a {
        void a();
    }

    /* renamed from: akf$b */
    public interface b extends a {
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        this.b.add(i, (akd) obj);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return (akd) this.b.set(i, (akd) obj);
    }

    public akf() {
        this.b = new ArrayList();
        this.f = 0;
        this.c = Integer.valueOf(e.incrementAndGet()).toString();
        this.d = new ArrayList();
        this.b = new ArrayList();
    }

    public akf(Collection<akd> collection) {
        this.b = new ArrayList();
        this.f = 0;
        this.c = Integer.valueOf(e.incrementAndGet()).toString();
        this.d = new ArrayList();
        this.b = new ArrayList(collection);
    }

    public akf(akd... akdArr) {
        this.b = new ArrayList();
        this.f = 0;
        this.c = Integer.valueOf(e.incrementAndGet()).toString();
        this.d = new ArrayList();
        this.b = Arrays.asList(akdArr);
    }

    public final void a(a aVar) {
        if (!this.d.contains(aVar)) {
            this.d.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean add(akd akd) {
        return this.b.add(akd);
    }

    public final void clear() {
        this.b.clear();
    }

    /* renamed from: a */
    public final akd get(int i) {
        return (akd) this.b.get(i);
    }

    public final int size() {
        return this.b.size();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return (akd) this.b.remove(i);
    }
}
