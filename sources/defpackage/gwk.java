package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gwk reason: default package */
public interface gwk {

    /* renamed from: gwk$a */
    public static final class a {
        private static final gwk a = $$Lambda$gwk$a$Sq9tCXrzcuIKK6BDfYFSTFs9Qnw.INSTANCE;

        /* renamed from: gwk$a$a reason: collision with other inner class name */
        static final class C0035a implements gwk {
            /* access modifiers changed from: private */
            public final List<gwk> a;

            private C0035a(List<gwk> list) {
                this.a = (List) fbp.a(list);
            }

            /* synthetic */ C0035a(List list, byte b) {
                this(list);
            }

            public final gwi<?> getBinder(int i) {
                for (gwk binder : this.a) {
                    gwi<?> binder2 = binder.getBinder(i);
                    if (binder2 != null) {
                        return binder2;
                    }
                }
                return null;
            }
        }

        /* renamed from: gwk$a$b */
        static class b implements gwk {
            private final gwi<?> a;
            private final int b;

            private b(int i, gwi<?> gwi) {
                this.b = i;
                this.a = (gwi) fbp.a(gwi);
            }

            /* synthetic */ b(int i, gwi gwi, byte b2) {
                this(i, gwi);
            }

            public final gwi<?> getBinder(int i) {
                if (i == this.b) {
                    return this.a;
                }
                return null;
            }
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ gwi a(int i) {
            return null;
        }

        public static gwk a() {
            return a;
        }

        public static gwk a(int i, gwi<?> gwi) {
            return new b(i, gwi, 0);
        }

        public static gwk a(gwk... gwkArr) {
            int length = gwkArr.length;
            if (length == 0) {
                return a;
            }
            if (length == 1) {
                return gwkArr[0];
            }
            ArrayList arrayList = new ArrayList(gwkArr.length);
            for (C0035a aVar : gwkArr) {
                fbp.a(aVar);
                if (aVar instanceof C0035a) {
                    List a2 = aVar.a;
                    arrayList.ensureCapacity((arrayList.size() + a2.size()) - 1);
                    arrayList.addAll(a2);
                } else if (aVar != a) {
                    arrayList.add(aVar);
                }
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? new C0035a(arrayList, 0) : (gwk) arrayList.get(0) : a;
        }
    }

    gwi<?> getBinder(int i);
}
