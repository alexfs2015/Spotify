package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_PlayerOptionsOverrides extends C$AutoValue_PlayerOptionsOverrides {
    public static final Creator<AutoValue_PlayerOptionsOverrides> CREATOR = new Creator<AutoValue_PlayerOptionsOverrides>() {
        public final AutoValue_PlayerOptionsOverrides createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            boolean z = false;
            Boolean bool3 = null;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                bool2 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool2 = null;
            }
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool3 = Boolean.valueOf(z);
            }
            return new AutoValue_PlayerOptionsOverrides(bool, bool2, bool3);
        }

        public final AutoValue_PlayerOptionsOverrides[] newArray(int i) {
            return new AutoValue_PlayerOptionsOverrides[i];
        }
    };

    AutoValue_PlayerOptionsOverrides(Boolean bool, Boolean bool2, Boolean bool3) {
        super(bool, bool2, bool3);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.Boolean r5 = r3.shufflingContext()
            r2 = 5
            r0 = 1
            r2 = 3
            r1 = 0
            if (r5 != 0) goto L_0x000d
        L_0x000a:
            r5 = 1
            r2 = 5
            goto L_0x001f
        L_0x000d:
            r2 = 4
            r4.writeInt(r1)
            java.lang.Boolean r5 = r3.shufflingContext()
            r2 = 0
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x001e
            r2 = 4
            goto L_0x000a
        L_0x001e:
            r5 = 0
        L_0x001f:
            r4.writeInt(r5)
            r2 = 7
            java.lang.Boolean r5 = r3.repeatingContext()
            r2 = 6
            if (r5 != 0) goto L_0x002c
        L_0x002a:
            r5 = 1
            goto L_0x0040
        L_0x002c:
            r2 = 6
            r4.writeInt(r1)
            java.lang.Boolean r5 = r3.repeatingContext()
            r2 = 7
            boolean r5 = r5.booleanValue()
            r2 = 3
            if (r5 == 0) goto L_0x003e
            r2 = 2
            goto L_0x002a
        L_0x003e:
            r2 = 5
            r5 = 0
        L_0x0040:
            r2 = 6
            r4.writeInt(r5)
            r2 = 2
            java.lang.Boolean r5 = r3.repeatingTrack()
            r2 = 3
            if (r5 != 0) goto L_0x004e
            r2 = 5
            goto L_0x0062
        L_0x004e:
            r2 = 4
            r4.writeInt(r1)
            r2 = 1
            java.lang.Boolean r5 = r3.repeatingTrack()
            r2 = 0
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0062
        L_0x0060:
            r0 = 6
            r0 = 0
        L_0x0062:
            r2 = 5
            r4.writeInt(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.AutoValue_PlayerOptionsOverrides.writeToParcel(android.os.Parcel, int):void");
    }
}
