package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: egn reason: default package */
public class egn implements IInterface {
    private final IBinder a;
    private final String b;

    protected egn(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }
}
