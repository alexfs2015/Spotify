package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.Set;

/* renamed from: gzq reason: default package */
public interface gzq {

    /* renamed from: gzq$a */
    public static abstract class a {
        public abstract a a(String str, double d);

        public abstract a a(String str, float f);

        public abstract a a(String str, int i);

        public abstract a a(String str, long j);

        public abstract a a(String str, Parcelable parcelable);

        public abstract a a(String str, gzq gzq);

        public abstract a a(String str, Serializable serializable);

        public abstract a a(String str, String str2);

        public abstract a a(String str, boolean z);

        public abstract a a(String str, double[] dArr);

        public abstract a a(String str, int[] iArr);

        public abstract a a(String str, long[] jArr);

        public abstract a a(String str, gzq[] gzqArr);

        public abstract a a(String str, String[] strArr);

        public abstract a a(String str, boolean[] zArr);

        public abstract gzq a();

        public final a a(String str, a aVar) {
            return a(str, aVar.a());
        }

        public a a(gzq gzq) {
            a aVar = this;
            for (String str : gzq.keySet()) {
                Object obj = gzq.get(str);
                if (obj instanceof Serializable) {
                    aVar = aVar.a(str, (Serializable) obj);
                } else if (obj instanceof Parcelable) {
                    aVar = aVar.a(str, (Parcelable) obj);
                } else if (obj != null) {
                    StringBuilder sb = new StringBuilder("Invalid type ");
                    sb.append(obj.getClass());
                    throw new AssertionError(sb.toString());
                }
            }
            return aVar;
        }
    }

    Boolean boolValue(String str);

    boolean boolValue(String str, boolean z);

    gzq bundle(String str);

    gzq[] bundleArray(String str);

    byte[] byteArray(String str);

    float floatValue(String str, float f);

    Object get(String str);

    int intValue(String str, int i);

    Integer intValue(String str);

    Set<String> keySet();

    long longValue(String str, long j);

    Long longValue(String str);

    String string(String str);

    String string(String str, String str2);

    String[] stringArray(String str);

    a toBuilder();
}
