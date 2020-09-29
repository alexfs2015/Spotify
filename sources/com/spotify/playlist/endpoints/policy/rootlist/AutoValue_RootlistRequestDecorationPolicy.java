package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_RootlistRequestDecorationPolicy extends C$AutoValue_RootlistRequestDecorationPolicy {
    public static final Creator<AutoValue_RootlistRequestDecorationPolicy> CREATOR = new Creator<AutoValue_RootlistRequestDecorationPolicy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_RootlistRequestDecorationPolicy[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
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
            return new AutoValue_RootlistRequestDecorationPolicy(bool, bool2, bool3);
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_RootlistRequestDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3) {
        super(bool, bool2, bool3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.lang.Boolean r4 = r2.unfilteredLength()
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x000a
        L_0x0008:
            r4 = 1
            goto L_0x0019
        L_0x000a:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.unfilteredLength()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0018
            goto L_0x0008
        L_0x0018:
            r4 = 0
        L_0x0019:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.unrangedLength()
            if (r4 != 0) goto L_0x0024
        L_0x0022:
            r4 = 1
            goto L_0x0033
        L_0x0024:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.unrangedLength()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0032
            goto L_0x0022
        L_0x0032:
            r4 = 0
        L_0x0033:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.isLoadingContents()
            if (r4 != 0) goto L_0x003d
            goto L_0x004c
        L_0x003d:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.isLoadingContents()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r3.writeInt(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.playlist.endpoints.policy.rootlist.AutoValue_RootlistRequestDecorationPolicy.writeToParcel(android.os.Parcel, int):void");
    }
}
