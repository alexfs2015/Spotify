package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ew reason: default package */
public final class ew<T> {
    public final a<ArrayList<T>> a = new b(10);
    public final dv<T, ArrayList<T>> b = new dv<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final ArrayList<T> a() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a(this.b.b(i), this.c, this.d);
        }
        return this.c;
    }

    public final void a(T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public final List b(T t) {
        return (List) this.b.get(t);
    }
}
