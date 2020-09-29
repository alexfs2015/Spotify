package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: dyd reason: default package */
public final class dyd extends dko implements dyc {
    dyd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final ParcelFileDescriptor a(dxy dxy) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) dxy);
        Parcel a = a(1, K_);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dkq.a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }
}
