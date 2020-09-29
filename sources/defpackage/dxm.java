package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: dxm reason: default package */
public final class dxm extends djx implements dxl {
    dxm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final ParcelFileDescriptor a(dxh dxh) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) dxh);
        Parcel a = a(1, K_);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) djz.a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }
}
