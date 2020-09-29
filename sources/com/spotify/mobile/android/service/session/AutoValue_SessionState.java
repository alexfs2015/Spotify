package com.spotify.mobile.android.service.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class AutoValue_SessionState extends C$AutoValue_SessionState {
    public static final Creator<AutoValue_SessionState> CREATOR = new Creator<AutoValue_SessionState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_SessionState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AutoValue_SessionState autoValue_SessionState = new AutoValue_SessionState(parcel.readString(), parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt(), parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (hdd) AutoValue_SessionState.PAYMENT_STATE_ADAPTER.a(parcel), parcel.readString());
            return autoValue_SessionState;
        }
    };
    /* access modifiers changed from: private */
    public static final b PAYMENT_STATE_ADAPTER = new b();

    public final int describeContents() {
        return 0;
    }

    AutoValue_SessionState(String str, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, boolean z5, boolean z6, hdd hdd, String str4) {
        super(str, str2, z, z2, z3, i, str3, z4, z5, z6, hdd, str4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(currentUser());
        parcel.writeString(currentUserName());
        parcel.writeInt(loggedIn() ? 1 : 0);
        parcel.writeInt(loggingIn() ? 1 : 0);
        parcel.writeInt(loggingOut() ? 1 : 0);
        parcel.writeInt(currentAccountType());
        parcel.writeString(countryCode());
        parcel.writeInt(connected() ? 1 : 0);
        parcel.writeInt(canConnect() ? 1 : 0);
        parcel.writeInt(canStream() ? 1 : 0);
        jse.a(parcel, (Parcelable) paymentState(), 0);
        parcel.writeString(productType());
    }
}
