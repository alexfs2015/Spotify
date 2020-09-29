package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqr reason: default package */
public final class dqr extends dko implements dqp {
    dqr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final dqm a() {
        dqm dqm;
        Parcel a = a(1, K_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            dqm = queryLocalInterface instanceof dqm ? (dqm) queryLocalInterface : new dqo(readStrongBinder);
        }
        a.recycle();
        return dqm;
    }

    public final void a(bfv bfv) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) bfv);
        b(9, K_);
    }

    public final void a(dqj dqj) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dqj);
        b(2, K_);
    }

    public final void a(drj drj) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) drj);
        b(7, K_);
    }

    public final void a(dvg dvg) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dvg);
        b(6, K_);
    }

    public final void a(dwr dwr) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwr);
        b(3, K_);
    }

    public final void a(dwu dwu) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwu);
        b(4, K_);
    }

    public final void a(dxe dxe, dpt dpt) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dxe);
        dkq.a(K_, (Parcelable) dpt);
        b(8, K_);
    }

    public final void a(dxg dxg) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dxg);
        b(10, K_);
    }

    public final void a(String str, dxb dxb, dwy dwy) {
        Parcel K_ = K_();
        K_.writeString(str);
        dkq.a(K_, (IInterface) dxb);
        dkq.a(K_, (IInterface) dwy);
        b(5, K_);
    }
}
