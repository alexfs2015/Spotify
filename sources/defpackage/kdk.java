package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: kdk reason: default package */
public final class kdk {
    public final List<kai> a;
    private final String b;

    public kdk(String str, List<kai> list) {
        if (list.isEmpty() || !TextUtils.isEmpty(str)) {
            this.b = str;
            this.a = list;
            return;
        }
        throw new IllegalArgumentException("URL template cannot be null if list of subtitles is non-empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdk)) {
            return false;
        }
        kdk kdk = (kdk) obj;
        String str = this.b;
        if (str == null ? kdk.b == null : str.equals(kdk.b)) {
            return this.a.equals(kdk.a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return ((str != null ? str.hashCode() : 0) * 31) + this.a.hashCode();
    }
}
