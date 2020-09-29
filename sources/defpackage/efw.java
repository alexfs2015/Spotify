package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: efw reason: default package */
public class efw implements IInterface {
    private final IBinder a;
    private final String b;

    protected efw(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }
}
