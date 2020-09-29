package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_ConcertResult extends C$AutoValue_ConcertResult {
    public static final Creator<AutoValue_ConcertResult> CREATOR = new Creator<AutoValue_ConcertResult>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Class<ConcertResult> cls = ConcertResult.class;
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
                    int i = 6 << 1;
                }
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool3 = valueOf;
                bool2 = valueOf;
            } else {
                bool2 = null;
            }
            AutoValue_ConcertResult autoValue_ConcertResult = r0;
            String str = readString;
            String str2 = readString;
            String str3 = readString2;
            String str4 = readString2;
            Boolean bool4 = bool;
            AutoValue_ConcertResult autoValue_ConcertResult2 = new AutoValue_ConcertResult(concert, str2, str4, bool, bool2);
            return autoValue_ConcertResult2;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_ConcertResult[i];
        }
    };

    AutoValue_ConcertResult(Concert concert, String str, String str2, Boolean bool, Boolean bool2) {
        super(concert, str, str2, bool, bool2);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            r2 = 4
            com.spotify.mobile.android.spotlets.eventshub.model.Concert r0 = r3.getConcert()
            r2 = 6
            r4.writeParcelable(r0, r5)
            r2 = 2
            java.lang.String r5 = r3.getClickThroughUrl()
            r0 = 1
            r2 = r0
            r1 = 0
            r2 = 5
            if (r5 != 0) goto L_0x0019
            r2 = 1
            r4.writeInt(r0)
            goto L_0x0025
        L_0x0019:
            r2 = 4
            r4.writeInt(r1)
            java.lang.String r5 = r3.getClickThroughUrl()
            r2 = 1
            r4.writeString(r5)
        L_0x0025:
            java.lang.String r5 = r3.getSource()
            r2 = 1
            if (r5 != 0) goto L_0x0031
            r4.writeInt(r0)
            r2 = 2
            goto L_0x003e
        L_0x0031:
            r2 = 1
            r4.writeInt(r1)
            r2 = 0
            java.lang.String r5 = r3.getSource()
            r2 = 5
            r4.writeString(r5)
        L_0x003e:
            java.lang.Boolean r5 = r3.getNearUser()
            r2 = 3
            if (r5 != 0) goto L_0x0049
        L_0x0045:
            r2 = 6
            r5 = 1
            r2 = 3
            goto L_0x005b
        L_0x0049:
            r2 = 5
            r4.writeInt(r1)
            java.lang.Boolean r5 = r3.getNearUser()
            r2 = 1
            boolean r5 = r5.booleanValue()
            r2 = 7
            if (r5 == 0) goto L_0x005a
            goto L_0x0045
        L_0x005a:
            r5 = 0
        L_0x005b:
            r2 = 3
            r4.writeInt(r5)
            r2 = 7
            java.lang.Boolean r5 = r3.getDiscovery()
            r2 = 1
            if (r5 != 0) goto L_0x0069
            r2 = 1
            goto L_0x007a
        L_0x0069:
            r4.writeInt(r1)
            java.lang.Boolean r5 = r3.getDiscovery()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0078
            r2 = 6
            goto L_0x007a
        L_0x0078:
            r0 = 7
            r0 = 0
        L_0x007a:
            r2 = 2
            r4.writeInt(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.AutoValue_ConcertResult.writeToParcel(android.os.Parcel, int):void");
    }
}
