package defpackage;

/* renamed from: pn reason: default package */
public final class pn implements pr {
    private final String a;
    private final Object[] b;

    private pn(String str, Object[] objArr) {
        this.a = str;
        this.b = null;
    }

    public pn(String str) {
        this(str, null);
    }

    public final String b() {
        return this.a;
    }

    public final void a(pq pqVar) {
        Object[] objArr = this.b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    pqVar.a(i);
                } else if (obj instanceof byte[]) {
                    pqVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    pqVar.a(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    pqVar.a(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    pqVar.a(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    pqVar.a(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    pqVar.a(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    pqVar.a(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    pqVar.a(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    pqVar.a(i, ((Boolean) obj).booleanValue() ? 1 : 0);
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
}
