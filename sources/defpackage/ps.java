package defpackage;

/* renamed from: ps reason: default package */
public final class ps implements pw {
    private final String a;
    private final Object[] b;

    public ps(String str) {
        this(str, null);
    }

    private ps(String str, Object[] objArr) {
        this.a = str;
        this.b = null;
    }

    public final void a(pv pvVar) {
        Object[] objArr = this.b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    pvVar.a(i);
                } else if (obj instanceof byte[]) {
                    pvVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    pvVar.a(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    pvVar.a(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    pvVar.a(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    pvVar.a(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    pvVar.a(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    pvVar.a(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    pvVar.a(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    pvVar.a(i, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot bind ");
                    sb.append(obj);
                    sb.append(" at index ");
                    sb.append(i);
                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public final String b() {
        return this.a;
    }
}
