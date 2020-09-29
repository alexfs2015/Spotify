package rx.exceptions;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        final Object value;

        static final class a {
            static final Set<Class<?>> a;

            static {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                a = hashSet;
            }
        }

        public OnNextValue(Object obj) {
            String str;
            StringBuilder sb = new StringBuilder("OnError while emitting onNext value: ");
            if (obj == null) {
                str = "null";
            } else if (a.a.contains(obj.getClass())) {
                str = obj.toString();
            } else if (obj instanceof String) {
                str = (String) obj;
            } else if (obj instanceof Enum) {
                str = ((Enum) obj).name();
            } else {
                xoa.a().b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.getClass().getName());
                sb2.append(".class");
                str = sb2.toString();
            }
            sb.append(str);
            super(sb.toString());
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.value = obj;
        }
    }

    public static Throwable a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable c = xiq.c(th);
        if ((c instanceof OnNextValue) && ((OnNextValue) c).value == obj) {
            return th;
        }
        xiq.a(th, (Throwable) new OnNextValue(obj));
        return th;
    }
}
