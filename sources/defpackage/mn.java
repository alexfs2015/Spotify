package defpackage;

import android.media.session.MediaSessionManager.RemoteUserInfo;

/* renamed from: mn reason: default package */
final class mn extends mm {

    /* renamed from: mn$a */
    static final class a extends a {
        private RemoteUserInfo a;

        a(RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.a = remoteUserInfo;
        }

        a(String str, int i, int i2) {
            super(str, i, i2);
            this.a = new RemoteUserInfo(str, i, i2);
        }
    }
}
