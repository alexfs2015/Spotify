package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new byi();
    private IBinder a;

    public BinderWrapper() {
        this.a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public BinderWrapper(IBinder iBinder) {
        this.a = null;
        this.a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.a = null;
        this.a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel, byte b) {
        this(parcel);
    }
}
