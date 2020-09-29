package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: kbk reason: default package */
public final class kbk {
    public final List<jyi> a;
    private final String b;

    public kbk(String str, List<jyi> list) {
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
        if (!(obj instanceof kbk)) {
            return false;
        }
        kbk kbk = (kbk) obj;
        String str = this.b;
        if (str == null ? kbk.b == null : str.equals(kbk.b)) {
            return this.a.equals(kbk.a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return ((str != null ? str.hashCode() : 0) * 31) + this.a.hashCode();
    }
}
