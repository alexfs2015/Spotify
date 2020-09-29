package defpackage;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: mg reason: default package */
public final class mg {
    static final boolean a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: mg$a */
    public static final class a {
        private b a;

        public a(String str, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.a = new a(str, i, i2);
            } else {
                this.a = new a(str, i, i2);
            }
        }

        public a(RemoteUserInfo remoteUserInfo) {
            this.a = new a(remoteUserInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: mg$b */
    interface b {
    }

    static {
        new Object();
    }
}
