package defpackage;

import android.util.SparseArray;

/* renamed from: gwq reason: default package */
public final class gwq implements gwk {
    private final SparseArray<gwi<?>> a;

    /* renamed from: gwq$a */
    public static class a {
        final SparseArray<gwi<?>> a;

        private a() {
            this(new SparseArray<>());
        }

        /* synthetic */ a(byte b) {
            this();
        }

        private a(SparseArray<gwi<?>> sparseArray) {
            this.a = (SparseArray) fbp.a(sparseArray);
        }

        public final gwq a() {
            return new gwq(this.a, 0);
        }
    }

    private gwq(SparseArray<gwi<?>> sparseArray) {
        this.a = ((SparseArray) fbp.a(sparseArray)).clone();
    }

    /* synthetic */ gwq(SparseArray sparseArray, byte b) {
        this(sparseArray);
    }

    public static a a(SparseArray<gwi<?>> sparseArray) {
        int i = 0;
        a aVar = new a(0);
        fbp.a(sparseArray);
        int size = sparseArray.size();
        while (i < size) {
            int keyAt = sparseArray.keyAt(i);
            gwi gwi = (gwi) sparseArray.valueAt(i);
            if (gwi == null) {
                StringBuilder sb = new StringBuilder("Null binder for id ");
                sb.append(keyAt);
                throw new IllegalArgumentException(sb.toString());
            } else if (keyAt > 0) {
                aVar.a.put(keyAt, gwi);
                i++;
            } else {
                StringBuilder sb2 = new StringBuilder("Illegal id registered: ");
                sb2.append(keyAt);
                sb2.append('=');
                sb2.append(gwi);
                sb2.append(" (only positive IDs are allowed");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return aVar;
    }

    public final gwi<?> getBinder(int i) {
        return (gwi) this.a.get(i);
    }
}
