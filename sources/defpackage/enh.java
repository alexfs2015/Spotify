package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: enh reason: default package */
public final class enh extends elq<String> implements eni, RandomAccess {
    private final List<Object> b;

    public enh() {
        this(10);
    }

    public enh(int i) {
        this(new ArrayList<>(i));
    }

    private enh(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    public final int size() {
        return this.b.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof eni) {
            collection = ((eni) collection).d();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        c();
        this.b.clear();
        this.modCount++;
    }

    public final void a(zzun zzun) {
        c();
        this.b.add(zzun);
        this.modCount++;
    }

    public final Object b(int i) {
        return this.b.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzun) {
            return ((zzun) obj).b();
        }
        return emy.b((byte[]) obj);
    }

    public final List<?> d() {
        return Collections.unmodifiableList(this.b);
    }

    public final eni e() {
        return a() ? new eph(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        c();
        return a(this.b.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.b.remove(i);
        this.modCount++;
        return a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        c();
        this.b.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ enc a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new enh(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzun) {
            zzun zzun = (zzun) obj;
            String b2 = zzun.b();
            if (zzun.c()) {
                this.b.set(i, b2);
            }
            return b2;
        }
        byte[] bArr = (byte[]) obj;
        String b3 = emy.b(bArr);
        if (emy.a(bArr)) {
            this.b.set(i, b3);
        }
        return b3;
    }

    static {
        new enh().a = false;
    }
}
