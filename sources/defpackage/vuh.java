package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: vuh reason: default package */
public final class vuh<T> implements vua<Set<T>> {
    private final List<wlc<T>> a;
    private final List<wlc<Collection<T>>> b;

    /* renamed from: vuh$a */
    public static final class a<T> {
        public static final /* synthetic */ boolean b = (!vuh.class.desiredAssertionStatus());
        public final List<wlc<Collection<T>>> a;
        private final List<wlc<T>> c;

        /* synthetic */ a(int i, int i2, byte b2) {
            this(i, i2);
        }

        private a(int i, int i2) {
            this.c = vtx.a(i);
            this.a = vtx.a(i2);
        }

        public final a<T> a(wlc<? extends T> wlc) {
            if (b || wlc != null) {
                this.c.add(wlc);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        public final vuh<T> a() {
            String str = "Codegen error?  Duplicates in the provider list";
            if (!b && vtx.a(this.c)) {
                throw new AssertionError(str);
            } else if (b || !vtx.a(this.a)) {
                return new vuh<>(this.c, this.a, 0);
            } else {
                throw new AssertionError(str);
            }
        }
    }

    /* synthetic */ vuh(List list, List list2, byte b2) {
        this(list, list2);
    }

    static {
        vub.a(Collections.emptySet());
    }

    public static <T> a<T> a(int i, int i2) {
        return new a<>(i, i2, 0);
    }

    private vuh(List<wlc<T>> list, List<wlc<Collection<T>>> list2) {
        this.a = list;
        this.b = list2;
    }

    public final /* synthetic */ Object get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((wlc) this.b.get(i2)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(vtx.c(i));
        int size3 = this.a.size();
        for (int i3 = 0; i3 < size3; i3++) {
            hashSet.add(vuf.a(((wlc) this.a.get(i3)).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object a2 : (Collection) arrayList.get(i4)) {
                hashSet.add(vuf.a(a2));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
