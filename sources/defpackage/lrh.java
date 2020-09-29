package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.Lists;
import defpackage.lrh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: lrh reason: default package */
abstract class lrh<T extends lrh<T>> implements Parcelable {
    List<lqv> a;
    final Set<String> b;
    private final boolean c;
    private int d;

    public int describeContents() {
        return 0;
    }

    protected lrh(List<lqv> list) {
        this.a = Collections.synchronizedList(Lists.a());
        this.c = true;
        this.b = new HashSet();
        a(list);
    }

    protected lrh(Parcel parcel) {
        this.a = Collections.synchronizedList(Lists.a());
        ArrayList a2 = Lists.a();
        parcel.readTypedList(a2, lqv.i);
        this.a = Collections.synchronizedList(a2);
        this.b = jse.b(parcel);
        this.c = jse.a(parcel);
        this.d = parcel.readInt();
    }

    /* access modifiers changed from: 0000 */
    public final List<lqv> a() {
        return this.a.subList(0, this.d);
    }

    private void a(List<lqv> list) {
        this.a = Collections.synchronizedList(list);
        this.d = Math.max(this.d, 100);
        this.d = Math.min(this.d, this.a.size());
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.d < this.a.size();
    }

    /* access modifiers changed from: 0000 */
    public final T c() {
        fay.a(this.c, (Object) "Card is not initialized.");
        this.d = Math.min(this.a.size(), this.d + 10);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final T a(lqv lqv, List<lqv> list) {
        fay.a(this.c, (Object) "Card is not initialized.");
        fay.a(lqv);
        String a2 = lqv.a();
        ArrayList a3 = Lists.a((Iterable<? extends E>) this.a);
        int i = 0;
        while (true) {
            if (i >= a3.size()) {
                i = -1;
                break;
            } else if (((lqv) a3.get(i)).a().equals(a2)) {
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
        a((List<lqv>) a3);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final T a(lqv lqv) {
        fay.a(this.c, (Object) "Card is not initialized.");
        ArrayList a2 = Lists.a((Iterable<? extends E>) this.a);
        int size = a2.size() - this.d;
        ArrayList a3 = Lists.a();
        if (size > 0) {
            int min = Math.min(size, 3);
            int i = this.d;
            a3.addAll(a2.subList(i, i + min));
            ArrayList a4 = Lists.a((Iterable<? extends E>) a2.subList(0, this.d));
            a4.addAll(a2.subList(this.d + min, a2.size()));
            a((List<lqv>) a4);
        }
        return a(lqv, a3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        jse.a(parcel, this.b);
        jse.a(parcel, this.c);
        parcel.writeInt(this.d);
    }

    /* access modifiers changed from: 0000 */
    public final T a(Set<String> set) {
        ArrayList a2 = Lists.a((Iterable<? extends E>) this.a);
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            String a3 = ((lqv) it.next()).a();
            if (set.contains(a3) && !this.b.contains(a3)) {
                it.remove();
            }
        }
        a((List<lqv>) a2);
        return this;
    }
}
