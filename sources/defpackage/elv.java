package defpackage;

import android.util.Log;

/* renamed from: elv reason: default package */
final class elv extends elu<Long> {
    elv(ema ema, String str, Long l) {
        super(ema, str, l, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
