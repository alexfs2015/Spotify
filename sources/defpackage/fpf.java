package defpackage;

import android.content.pm.PackageInfo;

/* renamed from: fpf reason: default package */
public final class fpf {
    public PackageInfo a = null;

    public final boolean a(int i) {
        try {
            if (210200007 <= this.a.versionCode) {
                return true;
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
