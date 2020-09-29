package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.Lists;
import defpackage.lvg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: lvg reason: default package */
abstract class lvg<T extends lvg<T>> implements Parcelable {
    List<luu> a;
    final Set<String> b;
    private final boolean c;
    private int d;

    protected lvg(Parcel parcel) {
        this.a = Collections.synchronizedList(Lists.a());
        ArrayList a2 = Lists.a();
        parcel.readTypedList(a2, luu.i);
        this.a = Collections.synchronizedList(a2);
        this.b = juo.b(parcel);
        this.c = juo.a(parcel);
        this.d = parcel.readInt();
    }

    protected lvg(List<luu> list) {
        this.a = Collections.synchronizedList(Lists.a());
        this.c = true;
        this.b = new HashSet();
        a(list);
    }

    private void a(List<luu> list) {
        this.a = Collections.synchronizedList(list);
        this.d = Math.max(this.d, 100);
        this.d = Math.min(this.d, this.a.size());
    }

    /* access modifiers changed from: 0000 */
    public final List<luu> a() {
        return this.a.subList(0, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final T a(Set<String> set) {
        ArrayList a2 = Lists.a((Iterable<? extends E>) this.a);
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String a3 = ((luu) it.next()).a();
            if (set.contains(a3) && !this.b.contains(a3)) {
                it.remove();
            }
        }
        a((List<luu>) a2);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final T a(luu luu) {
        fbp.a(this.c, (Object) "Card is not initialized.");
        ArrayList a2 = Lists.a((Iterable<? extends E>) this.a);
        int size = a2.size() - this.d;
        ArrayList a3 = Lists.a();
        if (size > 0) {
            int min = Math.min(size, 3);
            int i = this.d;
            a3.addAll(a2.subList(i, i + min));
            ArrayList a4 = Lists.a((Iterable<? extends E>) a2.subList(0, this.d));
            a4.addAll(a2.subList(this.d + min, a2.size()));
            a((List<luu>) a4);
        }
        return a(luu, a3);
    }

    /* access modifiers changed from: 0000 */
    public final T a(luu luu, List<luu> list) {
        fbp.a(this.c, (Object) "Card is not initialized.");
        fbp.a(luu);
        String a2 = luu.a();
        ArrayList a3 = Lists.a((Iterable<? extends E>) this.a);
        int i = 0;
        while (true) {
            if (i >= a3.size()) {
                i = -1;
                break;
            } else if (((luu) a3.get(i)).a().equals(a2)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return this;
        }
        a3.remove(i);
        if (!list.isEmpty()) {
            a3.addAll(i, list);
        }
        a((List<luu>) a3);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.d < this.a.size();
    }

    /* access modifiers changed from: 0000 */
    public final T c() {
        fbp.a(this.c, (Object) "Card is not initialized.");
        this.d = Math.min(this.a.size(), this.d + 10);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        juo.a(parcel, this.b);
        juo.a(parcel, this.c);
        parcel.writeInt(this.d);
    }
}
