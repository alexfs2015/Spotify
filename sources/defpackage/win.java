package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: win reason: default package */
public final class win<T> implements wig<Set<T>> {
    private final List<wzi<T>> a;
    private final List<wzi<Collection<T>>> b;

    /* renamed from: win$a */
    public static final class a<T> {
        public static final /* synthetic */ boolean b = (!win.class.desiredAssertionStatus());
        public final List<wzi<Collection<T>>> a;
        private final List<wzi<T>> c;

        private a(int i, int i2) {
            this.c = wid.a(i);
            this.a = wid.a(i2);
        }

        /* synthetic */ a(int i, int i2, byte b2) {
            this(i, i2);
        }

        public final a<T> a(wzi<? extends T> wzi) {
            if (b || wzi != null) {
                this.c.add(wzi);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        public final win<T> a() {
            String str = "Codegen error?  Duplicates in the provider list";
            if (!b && wid.a(this.c)) {
                throw new AssertionError(str);
            } else if (b || !wid.a(this.a)) {
                return new win<>(this.c, this.a, 0);
            } else {
                throw new AssertionError(str);
            }
        }
    }

    static {
        wih.a(Collections.emptySet());
    }

    private win(List<wzi<T>> list, List<wzi<Collection<T>>> list2) {
        this.a = list;
        this.b = list2;
    }

    /* synthetic */ win(List list, List list2, byte b2) {
        this(list, list2);
    }

    public static <T> a<T> a(int i, int i2) {
        return new a<>(i, i2, 0);
    }

    public final /* synthetic */ Object get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((wzi) this.b.get(i2)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(wid.c(i));
        int size3 = this.a.size();
        for (int i3 = 0; i3 < size3; i3++) {
            hashSet.add(wil.a(((wzi) this.a.get(i3)).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object a2 : (Collection) arrayList.get(i4)) {
                hashSet.add(wil.a(a2));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
