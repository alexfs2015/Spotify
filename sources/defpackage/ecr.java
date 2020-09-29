package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ecr reason: default package */
public final class ecr extends djx implements ecp {
    ecr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final ecs a(String str) {
        ecs ecs;
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ecs = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ecs = queryLocalInterface instanceof ecs ? (ecs) queryLocalInterface : new ecu(readStrongBinder);
        }
        a.recycle();
        return ecs;
    }

    public final boolean b(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(2, K_);
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final eee c(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(3, K_);
        eee a2 = eef.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
