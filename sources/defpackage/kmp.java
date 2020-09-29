package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: kmp reason: default package */
abstract class kmp {
    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public abstract String b();

    /* access modifiers changed from: 0000 */
    public abstract Drawable c();

    /* access modifiers changed from: 0000 */
    public abstract String d();

    kmp() {
    }

    static kmp a(String str, String str2, Drawable drawable, String str3) {
        return new kmt(str, str2, drawable, str3);
    }
}
