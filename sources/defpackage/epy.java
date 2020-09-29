package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: epy reason: default package */
public final class epy extends AbstractList<String> implements enz, RandomAccess {
    /* access modifiers changed from: private */
    public final enz a;

    public epy(enz enz) {
        this.a = enz;
    }

    public final void a(zzun zzun) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.a.b(i);
    }

    public final List<?> d() {
        return this.a.d();
    }

    public final enz e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new eqa(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new epz(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
