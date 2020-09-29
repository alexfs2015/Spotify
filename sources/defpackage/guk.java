package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: guk reason: default package */
public interface guk {

    /* renamed from: guk$a */
    public static final class a {
        private static final guk a = $$Lambda$guk$a$HyO4FKV6OXp0J1RKoktVB5dCTDY.INSTANCE;

        /* renamed from: guk$a$a reason: collision with other inner class name */
        static final class C0034a implements guk {
            /* access modifiers changed from: private */
            public final List<guk> a;

            /* synthetic */ C0034a(List list, byte b) {
                this(list);
            }

            private C0034a(List<guk> list) {
                this.a = (List) fay.a(list);
            }

            public final gui<?> getBinder(int i) {
                for (guk binder : this.a) {
                    gui<?> binder2 = binder.getBinder(i);
                    if (binder2 != null) {
                        return binder2;
                    }
                }
                return null;
            }
        }

        /* renamed from: guk$a$b */
        static class b implements guk {
            private final gui<?> a;
            private final int b;

            /* synthetic */ b(int i, gui gui, byte b2) {
                this(i, gui);
            }

            private b(int i, gui<?> gui) {
                this.b = i;
                this.a = (gui) fay.a(gui);
            }

            public final gui<?> getBinder(int i) {
                if (i == this.b) {
                    return this.a;
                }
                return null;
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ gui a(int i) {
            return null;
        }

        public static guk a(guk... gukArr) {
            int length = gukArr.length;
            if (length == 0) {
                return a;
            }
            if (length == 1) {
                return gukArr[0];
            }
            ArrayList arrayList = new ArrayList(gukArr.length);
            for (C0034a aVar : gukArr) {
                fay.a(aVar);
                if (aVar instanceof C0034a) {
                    List a2 = aVar.a;
                    arrayList.ensureCapacity((arrayList.size() + a2.size()) - 1);
                    arrayList.addAll(a2);
                } else if (aVar != a) {
                    arrayList.add(aVar);
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return a;
            }
            if (size != 1) {
                return new C0034a(arrayList, 0);
            }
            return (guk) arrayList.get(0);
        }

        public static guk a(int i, gui<?> gui) {
            return new b(i, gui, 0);
        }

        public static guk a() {
            return a;
        }
    }

    gui<?> getBinder(int i);
}
