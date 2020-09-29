package defpackage;

import android.text.TextUtils;

/* renamed from: ooe reason: default package */
public final class ooe implements ood {
    private String a;

    public final boolean a(String str) {
        if (TextUtils.equals(this.a, str)) {
            return false;
        }
        this.a = str;
        return true;
    }

    public final boolean a(uzb uzb) {
        return TextUtils.equals(this.a, uzb.d());
    }

    public final boolean b(uzb uzb) {
        String str;
        StringBuilder sb = new StringBuilder();
        uzc b = uzb.b();
        if (b != null) {
            str = b.previewId();
        } else {
            uys a2 = uzb.a();
            if (a2 != null) {
                str = a2.g();
            } else {
                str = null;
            }
        }
        sb.append(str);
        sb.append(uzb.d());
        return TextUtils.equals(this.a, sb.toString());
    }
}
