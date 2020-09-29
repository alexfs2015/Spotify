package defpackage;

import android.util.Log;

/* renamed from: elw reason: default package */
final class elw extends elu<Integer> {
    elw(ema ema, String str, Integer num) {
        super(ema, str, num, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24 + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
