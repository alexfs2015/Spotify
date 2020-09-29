package defpackage;

import android.os.RemoteException;

@cfp
/* renamed from: efa reason: default package */
public class efa {
    public static eev a(String str) {
        try {
            return new efb((cvt) Class.forName(str, false, efa.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
