package defpackage;

import android.net.Uri;

/* renamed from: jrd reason: default package */
public final class jrd implements jrb {
    public static final jrd a = new jrd();

    private jrd() {
    }

    public final boolean a(String str) {
        return !str.isEmpty();
    }

    public final boolean b(String str) {
        String decode = Uri.decode(str);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= decode.length()) {
                return true;
            }
            char charAt = decode.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
