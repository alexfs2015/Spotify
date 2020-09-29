package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ConcertResult extends C$AutoValue_ConcertResult {
    public static final Creator<AutoValue_ConcertResult> CREATOR = new Creator<AutoValue_ConcertResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConcertResult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Concert concert = (Concert) parcel.readParcelable(ConcertResult.class.getClassLoader());
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = false;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            } else {
                bool2 = null;
            }
            AutoValue_ConcertResult autoValue_ConcertResult = new AutoValue_ConcertResult(concert, readString, readString2, bool, bool2);
            return autoValue_ConcertResult;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_ConcertResult(Concert concert, String str, String str2, Boolean bool, Boolean bool2) {
        super(concert, str, str2, bool, bool2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            com.spotify.mobile.android.spotlets.eventshub.model.Concert r0 = r2.getConcert()
            r3.writeParcelable(r0, r4)
            java.lang.String r4 = r2.getClickThroughUrl()
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x0013
            r3.writeInt(r0)
            goto L_0x001d
        L_0x0013:
            r3.writeInt(r1)
            java.lang.String r4 = r2.getClickThroughUrl()
            r3.writeString(r4)
        L_0x001d:
            java.lang.String r4 = r2.getSource()
            if (r4 != 0) goto L_0x0027
            r3.writeInt(r0)
            goto L_0x0031
        L_0x0027:
            r3.writeInt(r1)
            java.lang.String r4 = r2.getSource()
            r3.writeString(r4)
        L_0x0031:
            java.lang.Boolean r4 = r2.getNearUser()
            if (r4 != 0) goto L_0x0039
        L_0x0037:
            r4 = 1
            goto L_0x0048
        L_0x0039:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.getNearUser()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0047
            goto L_0x0037
        L_0x0047:
            r4 = 0
        L_0x0048:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.getDiscovery()
            if (r4 != 0) goto L_0x0052
            goto L_0x0061
        L_0x0052:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.getDiscovery()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            r3.writeInt(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.AutoValue_ConcertResult.writeToParcel(android.os.Parcel, int):void");
    }
}
