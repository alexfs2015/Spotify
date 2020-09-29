package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* renamed from: fil reason: default package */
public final class fil extends fih {
    private static final Class<?>[] b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object a;

    public fil(Boolean bool) {
        a((Object) bool);
    }

    public fil(Number number) {
        a((Object) number);
    }

    public fil(String str) {
        a((Object) str);
    }

    private void a(Object obj) {
        if (obj instanceof Character) {
            this.a = String.valueOf(((Character) obj).charValue());
            return;
        }
        fit.a((obj instanceof Number) || b(obj));
        this.a = obj;
    }

    public final Number a() {
        Object obj = this.a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        Class<?>[] clsArr = b;
        for (int i = 0; i < 16; i++) {
            if (clsArr[i].isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = a().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fil fil = (fil) obj;
        if (this.a == null) {
            return fil.a == null;
        }
        if (a(this) && a(fil)) {
            return a().longValue() == fil.a().longValue();
        }
        if (!(this.a instanceof Number) || !(fil.a instanceof Number)) {
            return this.a.equals(fil.a);
        }
        double doubleValue = a().doubleValue();
        double doubleValue2 = fil.a().doubleValue();
        return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
    }

    private static boolean a(fil fil) {
        Object obj = fil.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    public final String b() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return a().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public final double c() {
        return this.a instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    public final long d() {
        return this.a instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    public final int e() {
        return this.a instanceof Number ? a().intValue() : Integer.parseInt(b());
    }
}
