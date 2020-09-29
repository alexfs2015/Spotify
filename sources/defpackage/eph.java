package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: eph reason: default package */
public final class eph extends AbstractList<String> implements eni, RandomAccess {
    /* access modifiers changed from: private */
    public final eni a;

    public eph(eni eni) {
        this.a = eni;
    }

    public final eni e() {
        return this;
    }

    public final Object b(int i) {
        return this.a.b(i);
    }

    public final int size() {
        return this.a.size();
    }

    public final void a(zzun zzun) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new epi(this, i);
    }

    public final Iterator<String> iterator() {
        return new epj(this);
    }

    public final List<?> d() {
        return this.a.d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
