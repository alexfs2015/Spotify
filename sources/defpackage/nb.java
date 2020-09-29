package defpackage;

import android.os.Messenger;

/* renamed from: nb reason: default package */
abstract class nb {
    public static boolean a(Messenger messenger) {
        if (messenger != null) {
            try {
                if (messenger.getBinder() != null) {
                    return true;
                }
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }
}
