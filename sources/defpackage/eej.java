package defpackage;

import android.os.RemoteException;

@cey
/* renamed from: eej reason: default package */
public class eej {
    public static eee a(String str) {
        try {
            return new eek((cvc) Class.forName(str, false, eej.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
