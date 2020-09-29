package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: fgw reason: default package */
final class fgw {
    final Messenger a;
    final fhy b;

    fgw(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new fhy(iBinder);
            this.a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            throw new RemoteException();
        }
    }
}
