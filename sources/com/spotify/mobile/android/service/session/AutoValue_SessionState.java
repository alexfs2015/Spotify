package com.spotify.mobile.android.service.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class AutoValue_SessionState extends C$AutoValue_SessionState {
    public static final Creator<AutoValue_SessionState> CREATOR = new Creator<AutoValue_SessionState>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() == 1;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            boolean z4 = parcel.readInt() == 1;
            boolean z5 = parcel.readInt() == 1;
            boolean z6 = parcel.readInt() == 1;
            Parcel parcel2 = parcel;
            Parcelable a = AutoValue_SessionState.PAYMENT_STATE_ADAPTER.a(parcel);
            Parcelable parcelable = a;
            hfz hfz = (hfz) a;
            AutoValue_SessionState autoValue_SessionState = r0;
            boolean z7 = z;
            boolean z8 = z2;
            boolean z9 = z3;
            int i = readInt;
            String str = readString3;
            boolean z10 = z4;
            boolean z11 = z5;
            hfz hfz2 = hfz;
            AutoValue_SessionState autoValue_SessionState2 = new AutoValue_SessionState(readString, readString2, z, z2, z3, readInt, readString3, z4, z5, z6, hfz, parcel.readString());
            return autoValue_SessionState2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_SessionState[i];
        }
    };
    /* access modifiers changed from: private */
    public static final b PAYMENT_STATE_ADAPTER = new b();

    AutoValue_SessionState(String str, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, boolean z5, boolean z6, hfz hfz, String str4) {
        super(str, str2, z, z2, z3, i, str3, z4, z5, z6, hfz, str4);
    }

    public final int describeContents() {
        return 0;
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
        juo.a(parcel, (Parcelable) paymentState(), 0);
        parcel.writeString(productType());
    }
}
