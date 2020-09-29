package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bpe reason: default package */
public final class bpe extends egt implements bpc {
    bpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    public final int a() {
        Parcel a = a(3, e());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final bwd a(bnl bnl, int i) {
        Parcel e = e();
        ehi.a(e, (Parcelable) bnl);
        e.writeInt(i);
        Parcel a = a(1, e);
        bwd bwd = (bwd) ehi.a(a, bwd.CREATOR);
        a.recycle();
        return bwd;
    }

    public final car b() {
        Parcel a = a(2, e());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final bwd a(bnl bnl, boi boi) {
        Parcel e = e();
        ehi.a(e, (Parcelable) bnl);
        ehi.a(e, (Parcelable) boi);
        Parcel a = a(4, e);
        bwd bwd = (bwd) ehi.a(a, bwd.CREATOR);
        a.recycle();
        return bwd;
    }
}
