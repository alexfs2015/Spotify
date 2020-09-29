package defpackage;

import android.text.TextUtils;

/* renamed from: ovk reason: default package */
public final class ovk implements ovj {
    private String a;

    public final boolean a(String str) {
        if (TextUtils.equals(this.a, str)) {
            return false;
        }
        this.a = str;
        return true;
    }

    public final boolean a(vle vle) {
        return TextUtils.equals(this.a, vle.d());
    }

    public final boolean b(vle vle) {
        String str;
        StringBuilder sb = new StringBuilder();
        vlf b = vle.b();
        if (b != null) {
            str = b.previewId();
        } else {
            vkv a2 = vle.a();
            str = a2 != null ? a2.g() : null;
        }
        sb.append(str);
        sb.append(vle.d());
        return TextUtils.equals(this.a, sb.toString());
    }
}
