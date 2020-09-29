package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_FolderMetadataDecorationPolicy extends C$AutoValue_FolderMetadataDecorationPolicy {
    public static final Creator<AutoValue_FolderMetadataDecorationPolicy> CREATOR = new Creator<AutoValue_FolderMetadataDecorationPolicy>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            Boolean bool8;
            Boolean bool9;
            Boolean bool10;
            boolean z = false;
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
                bool3 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool3 = null;
            }
            if (parcel.readInt() == 0) {
                bool4 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool4 = null;
            }
            if (parcel.readInt() == 0) {
                bool5 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool5 = null;
            }
            if (parcel.readInt() == 0) {
                bool6 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool6 = null;
            }
            if (parcel.readInt() == 0) {
                bool7 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool7 = null;
            }
            if (parcel.readInt() == 0) {
                bool8 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool8 = null;
            }
            if (parcel.readInt() == 0) {
                bool9 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool9 = null;
            }
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool10 = Boolean.valueOf(z);
            } else {
                bool10 = null;
            }
            AutoValue_FolderMetadataDecorationPolicy autoValue_FolderMetadataDecorationPolicy = new AutoValue_FolderMetadataDecorationPolicy(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10);
            return autoValue_FolderMetadataDecorationPolicy;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_FolderMetadataDecorationPolicy[i];
        }
    };

    AutoValue_FolderMetadataDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        super(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.lang.Boolean r4 = r2.rowId()
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x000a
        L_0x0008:
            r4 = 1
            goto L_0x0019
        L_0x000a:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.rowId()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0018
            goto L_0x0008
        L_0x0018:
            r4 = 0
        L_0x0019:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.addTime()
            if (r4 != 0) goto L_0x0024
        L_0x0022:
            r4 = 1
            goto L_0x0033
        L_0x0024:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.addTime()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0032
            goto L_0x0022
        L_0x0032:
            r4 = 0
        L_0x0033:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.id()
            if (r4 != 0) goto L_0x003e
        L_0x003c:
            r4 = 1
            goto L_0x004d
        L_0x003e:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.id()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x004c
            goto L_0x003c
        L_0x004c:
            r4 = 0
        L_0x004d:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.link()
            if (r4 != 0) goto L_0x0058
        L_0x0056:
            r4 = 1
            goto L_0x0067
        L_0x0058:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.link()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0066
            goto L_0x0056
        L_0x0066:
            r4 = 0
        L_0x0067:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.name()
            if (r4 != 0) goto L_0x0072
        L_0x0070:
            r4 = 1
            goto L_0x0081
        L_0x0072:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.name()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0080
            goto L_0x0070
        L_0x0080:
            r4 = 0
        L_0x0081:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.folders()
            if (r4 != 0) goto L_0x008c
        L_0x008a:
            r4 = 1
            goto L_0x009b
        L_0x008c:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.folders()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x009a
            goto L_0x008a
        L_0x009a:
            r4 = 0
        L_0x009b:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.playlists()
            if (r4 != 0) goto L_0x00a6
        L_0x00a4:
            r4 = 1
            goto L_0x00b5
        L_0x00a6:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.playlists()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00b4
            goto L_0x00a4
        L_0x00b4:
            r4 = 0
        L_0x00b5:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.recursiveFolders()
            if (r4 != 0) goto L_0x00c0
        L_0x00be:
            r4 = 1
            goto L_0x00cf
        L_0x00c0:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.recursiveFolders()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00ce
            goto L_0x00be
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.recursivePlaylists()
            if (r4 != 0) goto L_0x00da
        L_0x00d8:
            r4 = 1
            goto L_0x00e9
        L_0x00da:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.recursivePlaylists()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00e8
            goto L_0x00d8
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            r3.writeInt(r4)
            java.lang.Boolean r4 = r2.rows()
            if (r4 != 0) goto L_0x00f3
            goto L_0x0102
        L_0x00f3:
            r3.writeInt(r1)
            java.lang.Boolean r4 = r2.rows()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            r3.writeInt(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.playlist.endpoints.policy.rootlist.AutoValue_FolderMetadataDecorationPolicy.writeToParcel(android.os.Parcel, int):void");
    }
}
