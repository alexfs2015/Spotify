package defpackage;

import android.text.TextUtils;

/* renamed from: eht reason: default package */
public class eht {
    protected final ein b;
    public final String c;
    public eiq d;

    protected eht(String str, String str2, String str3) {
        eic.a(str);
        this.c = str;
        this.b = new ein(str2, 0);
        String str4 = null;
        if (!TextUtils.isEmpty(null)) {
            ein ein = this.b;
            if (!TextUtils.isEmpty(null)) {
                str4 = String.format("[%s] ", new Object[]{null});
            }
            ein.a = str4;
        }
    }

    public void a() {
    }

    public void a(long j, int i) {
    }

    public void a(String str) {
    }

    /* access modifiers changed from: protected */
    public final void a(String str, long j) {
        Object[] objArr = {str, null};
        this.d.a(this.c, str, j);
    }

    /* access modifiers changed from: protected */
    public final long b() {
        return this.d.a();
    }
}
