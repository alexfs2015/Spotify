package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bxm reason: default package */
public final class bxm {

    /* renamed from: bxm$a */
    public static final class a {
        private final List<String> a;
        private final Object b;

        private a(Object obj) {
            this.b = bxo.a(obj);
            this.a = new ArrayList();
        }

        /* synthetic */ a(Object obj, byte b2) {
            this(obj);
        }

        public final a a(String str, Object obj) {
            List<String> list = this.a;
            String str2 = (String) bxo.a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj, 0);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
