package defpackage;

import android.net.Uri;

/* renamed from: jto reason: default package */
public final class jto implements jtm {
    public static final jto a = new jto();

    private jto() {
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
