package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: efs reason: default package */
public class efs extends Binder implements IInterface {
    protected efs(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return a(i, parcel, parcel2);
    }
}
