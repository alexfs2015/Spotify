package defpackage;

import android.os.Messenger;

/* renamed from: ng reason: default package */
abstract class ng {
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
