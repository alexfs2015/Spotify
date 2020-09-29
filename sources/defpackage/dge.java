package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: dge reason: default package */
public final class dge extends AbstractList<String> implements deb, RandomAccess {
    /* access modifiers changed from: private */
    public final deb a;

    public dge(deb deb) {
        this.a = deb;
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

    public final deb e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new dgg(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new dgf(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
