package defpackage;

import android.text.TextUtils;

/* renamed from: ehc reason: default package */
public class ehc {
    protected final ehw b;
    public final String c;
    public ehz d;

    protected ehc(String str, String str2, String str3) {
        ehl.a(str);
        this.c = str;
        this.b = new ehw(str2, 0);
        String str4 = null;
        if (!TextUtils.isEmpty(null)) {
            ehw ehw = this.b;
            if (!TextUtils.isEmpty(null)) {
                str4 = String.format("[%s] ", new Object[]{null});
            }
            ehw.a = str4;
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
