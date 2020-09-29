package defpackage;

import android.util.Log;

/* renamed from: elx reason: default package */
final class elx extends elu<Boolean> {
    elx(ema ema, String str, Boolean bool) {
        super(ema, str, bool, 0);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (elh.b.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (elh.c.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
