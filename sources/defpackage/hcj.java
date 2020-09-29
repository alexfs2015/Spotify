package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.Set;

/* renamed from: hcj reason: default package */
public interface hcj {

    /* renamed from: hcj$a */
    public static abstract class a {
        public a a(hcj hcj) {
            a aVar = this;
            for (String str : hcj.keySet()) {
                Object obj = hcj.get(str);
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

        public abstract a a(String str, double d);

        public abstract a a(String str, float f);

        public abstract a a(String str, int i);

        public abstract a a(String str, long j);

        public abstract a a(String str, Parcelable parcelable);

        public final a a(String str, a aVar) {
            return a(str, aVar.a());
        }

        public abstract a a(String str, hcj hcj);

        public abstract a a(String str, Serializable serializable);

        public abstract a a(String str, String str2);

        public abstract a a(String str, boolean z);

        public abstract a a(String str, double[] dArr);

        public abstract a a(String str, int[] iArr);

        public abstract a a(String str, long[] jArr);

        public abstract a a(String str, hcj[] hcjArr);

        public abstract a a(String str, String[] strArr);

        public abstract a a(String str, boolean[] zArr);

        public abstract hcj a();
    }

    Boolean boolValue(String str);

    boolean boolValue(String str, boolean z);

    hcj bundle(String str);

    hcj[] bundleArray(String str);

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
