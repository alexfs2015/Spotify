package defpackage;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: akt reason: default package */
public final class akt extends AbstractList<akr> {
    private static AtomicInteger e = new AtomicInteger();
    Handler a;
    List<akr> b;
    final String c;
    List<a> d;
    private int f;

    /* renamed from: akt$a */
    public interface a {
        void a();
    }

    /* renamed from: akt$b */
    public interface b extends a {
    }

    public akt() {
        this.b = new ArrayList();
        this.f = 0;
        this.c = Integer.valueOf(e.incrementAndGet()).toString();
        this.d = new ArrayList();
        this.b = new ArrayList();
    }

    public akt(Collection<akr> collection) {
        this.b = new ArrayList();
        this.f = 0;
        this.c = Integer.valueOf(e.incrementAndGet()).toString();
        this.d = new ArrayList();
        this.b = new ArrayList(collection);
    }

    public akt(akr... akrArr) {
        this.b = new ArrayList();
        this.f = 0;
        this.c = Integer.valueOf(e.incrementAndGet()).toString();
        this.d = new ArrayList();
        this.b = Arrays.asList(akrArr);
    }

    /* renamed from: a */
    public final akr get(int i) {
        return (akr) this.b.get(i);
    }

    public final void a(a aVar) {
        if (!this.d.contains(aVar)) {
            this.d.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean add(akr akr) {
        return this.b.add(akr);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        this.b.add(i, (akr) obj);
    }

    public final void clear() {
        this.b.clear();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return (akr) this.b.remove(i);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return (akr) this.b.set(i, (akr) obj);
    }

    public final int size() {
        return this.b.size();
    }
}
