package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.BinderWrapper;

/* renamed from: byi reason: default package */
public final class byi implements Creator<BinderWrapper> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, 0);
    }
}
