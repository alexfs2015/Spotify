package defpackage;

import android.util.SparseArray;

/* renamed from: guq reason: default package */
public final class guq implements guk {
    private final SparseArray<gui<?>> a;

    /* renamed from: guq$a */
    public static class a {
        final SparseArray<gui<?>> a;

        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
            this(new SparseArray<>());
        }

        private a(SparseArray<gui<?>> sparseArray) {
            this.a = (SparseArray) fay.a(sparseArray);
        }

        public final guq a() {
            return new guq(this.a, 0);
        }
    }

    /* synthetic */ guq(SparseArray sparseArray, byte b) {
        this(sparseArray);
    }

    private guq(SparseArray<gui<?>> sparseArray) {
        this.a = ((SparseArray) fay.a(sparseArray)).clone();
    }

    public final gui<?> getBinder(int i) {
        return (gui) this.a.get(i);
    }

    public static a a(SparseArray<gui<?>> sparseArray) {
        int i = 0;
        a aVar = new a(0);
        fay.a(sparseArray);
        int size = sparseArray.size();
        while (i < size) {
            int keyAt = sparseArray.keyAt(i);
            gui gui = (gui) sparseArray.valueAt(i);
            if (gui == null) {
                StringBuilder sb = new StringBuilder("Null binder for id ");
                sb.append(keyAt);
                throw new IllegalArgumentException(sb.toString());
            } else if (keyAt > 0) {
                aVar.a.put(keyAt, gui);
                i++;
            } else {
                StringBuilder sb2 = new StringBuilder("Illegal id registered: ");
                sb2.append(keyAt);
                sb2.append('=');
                sb2.append(gui);
                sb2.append(" (only positive IDs are allowed");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return aVar;
    }
}
