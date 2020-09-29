package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: kqc reason: default package */
final class kqc extends kpy {
    private final String a;
    private final String b;
    private final Drawable c;
    private final String d;

    kqc(String str, String str2, Drawable drawable, String str3) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            if (drawable != null) {
                this.c = drawable;
                if (str3 != null) {
                    this.d = str3;
                    return;
                }
                throw new NullPointerException("Null bundleKey");
            }
            throw new NullPointerException("Null icon");
        }
        throw new NullPointerException("Null title");
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final Drawable c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kpy) {
            kpy kpy = (kpy) obj;
            if (this.a.equals(kpy.a())) {
                String str = this.b;
                if (str != null ? str.equals(kpy.b()) : kpy.b() == null) {
                    return this.c.equals(kpy.c()) && this.d.equals(kpy.d());
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveSessionBannerViewModel{title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", bundleKey=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
