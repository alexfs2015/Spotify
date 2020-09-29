package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: dfn reason: default package */
public final class dfn extends AbstractList<String> implements ddk, RandomAccess {
    /* access modifiers changed from: private */
    public final ddk a;

    public dfn(ddk ddk) {
        this.a = ddk;
    }

    public final void a(zzbah zzbah) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.a.b(i);
    }

    public final List<?> d() {
        return this.a.d();
    }

    public final ddk e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new dfp(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new dfo(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
