package defpackage;

import android.media.session.MediaSessionManager.RemoteUserInfo;

/* renamed from: mi reason: default package */
final class mi extends mh {

    /* renamed from: mi$a */
    static final class a extends a {
        private RemoteUserInfo a;

        a(String str, int i, int i2) {
            super(str, i, i2);
            this.a = new RemoteUserInfo(str, i, i2);
        }

        a(RemoteUserInfo remoteUserInfo) {
            super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
            this.a = remoteUserInfo;
        }
    }
}
