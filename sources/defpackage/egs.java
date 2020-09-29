package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: egs reason: default package */
public class egs implements IInterface {
    protected final IBinder a;
    private final String b;

    protected egs(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
