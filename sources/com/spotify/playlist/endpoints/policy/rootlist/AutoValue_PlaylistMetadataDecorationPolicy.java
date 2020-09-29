package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class AutoValue_PlaylistMetadataDecorationPolicy extends C$AutoValue_PlaylistMetadataDecorationPolicy {
    public static final Creator<AutoValue_PlaylistMetadataDecorationPolicy> CREATOR = new Creator<AutoValue_PlaylistMetadataDecorationPolicy>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_PlaylistMetadataDecorationPolicy[i];
        }

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
            Boolean bool11;
            Boolean bool12;
            Boolean bool13;
            Boolean bool14;
            Boolean bool15;
            Boolean bool16;
            Boolean bool17;
            Boolean bool18;
            Boolean bool19;
            Boolean bool20;
            Boolean bool21;
            Boolean bool22;
            Boolean bool23;
            Boolean bool24;
            Boolean bool25;
            Boolean bool26;
            Boolean bool27;
            Parcel parcel2 = parcel;
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
                bool10 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool10 = null;
            }
            if (parcel.readInt() == 0) {
                bool11 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool11 = null;
            }
            if (parcel.readInt() == 0) {
                bool12 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool12 = null;
            }
            if (parcel.readInt() == 0) {
                bool13 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool13 = null;
            }
            if (parcel.readInt() == 0) {
                bool14 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool14 = null;
            }
            if (parcel.readInt() == 0) {
                bool15 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool15 = null;
            }
            if (parcel.readInt() == 0) {
                bool16 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool16 = null;
            }
            if (parcel.readInt() == 0) {
                bool17 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool17 = null;
            }
            if (parcel.readInt() == 0) {
                bool18 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool18 = null;
            }
            if (parcel.readInt() == 0) {
                bool19 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool19 = null;
            }
            if (parcel.readInt() == 0) {
                bool20 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool20 = null;
            }
            if (parcel.readInt() == 0) {
                bool21 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool21 = null;
            }
            if (parcel.readInt() == 0) {
                bool22 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool22 = null;
            }
            if (parcel.readInt() == 0) {
                bool23 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool23 = null;
            }
            if (parcel.readInt() == 0) {
                bool24 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool24 = null;
            }
            if (parcel.readInt() == 0) {
                bool25 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool25 = null;
            }
            if (parcel.readInt() == 0) {
                bool26 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool26 = null;
            }
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool27 = Boolean.valueOf(z);
            } else {
                bool27 = null;
            }
            AutoValue_PlaylistMetadataDecorationPolicy autoValue_PlaylistMetadataDecorationPolicy = new AutoValue_PlaylistMetadataDecorationPolicy(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, (PlaylistUserDecorationPolicy) parcel2.readParcelable(PlaylistMetadataDecorationPolicy.class.getClassLoader()), (PlaylistUserDecorationPolicy) parcel2.readParcelable(PlaylistMetadataDecorationPolicy.class.getClassLoader()));
            return autoValue_PlaylistMetadataDecorationPolicy;
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_PlaylistMetadataDecorationPolicy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, PlaylistUserDecorationPolicy playlistUserDecorationPolicy, PlaylistUserDecorationPolicy playlistUserDecorationPolicy2) {
        super(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, playlistUserDecorationPolicy, playlistUserDecorationPolicy2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.rowId()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r0 = 1
            goto L_0x0019
        L_0x000a:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.rowId()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0018
            goto L_0x0008
        L_0x0018:
            r0 = 0
        L_0x0019:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.addTime()
            if (r0 != 0) goto L_0x0024
        L_0x0022:
            r0 = 1
            goto L_0x0033
        L_0x0024:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.addTime()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0032
            goto L_0x0022
        L_0x0032:
            r0 = 0
        L_0x0033:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.isOnDemandInFree()
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = 1
            goto L_0x004d
        L_0x003e:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.isOnDemandInFree()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004c
            goto L_0x003c
        L_0x004c:
            r0 = 0
        L_0x004d:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.link()
            if (r0 != 0) goto L_0x0058
        L_0x0056:
            r0 = 1
            goto L_0x0067
        L_0x0058:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.link()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            goto L_0x0056
        L_0x0066:
            r0 = 0
        L_0x0067:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.name()
            if (r0 != 0) goto L_0x0072
        L_0x0070:
            r0 = 1
            goto L_0x0081
        L_0x0072:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.name()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0080
            goto L_0x0070
        L_0x0080:
            r0 = 0
        L_0x0081:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.loadState()
            if (r0 != 0) goto L_0x008c
        L_0x008a:
            r0 = 1
            goto L_0x009b
        L_0x008c:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.loadState()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009a
            goto L_0x008a
        L_0x009a:
            r0 = 0
        L_0x009b:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.loaded()
            if (r0 != 0) goto L_0x00a6
        L_0x00a4:
            r0 = 1
            goto L_0x00b5
        L_0x00a6:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.loaded()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b4
            goto L_0x00a4
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.collaborative()
            if (r0 != 0) goto L_0x00c0
        L_0x00be:
            r0 = 1
            goto L_0x00cf
        L_0x00c0:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.collaborative()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ce
            goto L_0x00be
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.length()
            if (r0 != 0) goto L_0x00da
        L_0x00d8:
            r0 = 1
            goto L_0x00e9
        L_0x00da:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.length()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e8
            goto L_0x00d8
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.lastModification()
            if (r0 != 0) goto L_0x00f4
        L_0x00f2:
            r0 = 1
            goto L_0x0103
        L_0x00f4:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.lastModification()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0102
            goto L_0x00f2
        L_0x0102:
            r0 = 0
        L_0x0103:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.totalLength()
            if (r0 != 0) goto L_0x010e
        L_0x010c:
            r0 = 1
            goto L_0x011d
        L_0x010e:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.totalLength()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011c
            goto L_0x010c
        L_0x011c:
            r0 = 0
        L_0x011d:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.duration()
            if (r0 != 0) goto L_0x0128
        L_0x0126:
            r0 = 1
            goto L_0x0137
        L_0x0128:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.duration()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0136
            goto L_0x0126
        L_0x0136:
            r0 = 0
        L_0x0137:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.description()
            if (r0 != 0) goto L_0x0142
        L_0x0140:
            r0 = 1
            goto L_0x0151
        L_0x0142:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.description()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0150
            goto L_0x0140
        L_0x0150:
            r0 = 0
        L_0x0151:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.picture()
            if (r0 != 0) goto L_0x015c
        L_0x015a:
            r0 = 1
            goto L_0x016b
        L_0x015c:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.picture()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x016a
            goto L_0x015a
        L_0x016a:
            r0 = 0
        L_0x016b:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.playable()
            if (r0 != 0) goto L_0x0176
        L_0x0174:
            r0 = 1
            goto L_0x0185
        L_0x0176:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.playable()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0184
            goto L_0x0174
        L_0x0184:
            r0 = 0
        L_0x0185:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.descriptionFromAnnotate()
            if (r0 != 0) goto L_0x0190
        L_0x018e:
            r0 = 1
            goto L_0x019f
        L_0x0190:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.descriptionFromAnnotate()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x019e
            goto L_0x018e
        L_0x019e:
            r0 = 0
        L_0x019f:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.pictureFromAnnotate()
            if (r0 != 0) goto L_0x01aa
        L_0x01a8:
            r0 = 1
            goto L_0x01b9
        L_0x01aa:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.pictureFromAnnotate()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01b8
            goto L_0x01a8
        L_0x01b8:
            r0 = 0
        L_0x01b9:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.canReportAnnotationAbuse()
            if (r0 != 0) goto L_0x01c4
        L_0x01c2:
            r0 = 1
            goto L_0x01d3
        L_0x01c4:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.canReportAnnotationAbuse()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01d2
            goto L_0x01c2
        L_0x01d2:
            r0 = 0
        L_0x01d3:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.followed()
            if (r0 != 0) goto L_0x01de
        L_0x01dc:
            r0 = 1
            goto L_0x01ed
        L_0x01de:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.followed()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ec
            goto L_0x01dc
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.followers()
            if (r0 != 0) goto L_0x01f8
        L_0x01f6:
            r0 = 1
            goto L_0x0207
        L_0x01f8:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.followers()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0206
            goto L_0x01f6
        L_0x0206:
            r0 = 0
        L_0x0207:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.ownedBySelf()
            if (r0 != 0) goto L_0x0212
        L_0x0210:
            r0 = 1
            goto L_0x0221
        L_0x0212:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.ownedBySelf()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0220
            goto L_0x0210
        L_0x0220:
            r0 = 0
        L_0x0221:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.offline()
            if (r0 != 0) goto L_0x022c
        L_0x022a:
            r0 = 1
            goto L_0x023b
        L_0x022c:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.offline()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x023a
            goto L_0x022a
        L_0x023a:
            r0 = 0
        L_0x023b:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.syncProgress()
            if (r0 != 0) goto L_0x0246
        L_0x0244:
            r0 = 1
            goto L_0x0255
        L_0x0246:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.syncProgress()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0254
            goto L_0x0244
        L_0x0254:
            r0 = 0
        L_0x0255:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.published()
            if (r0 != 0) goto L_0x0260
        L_0x025e:
            r0 = 1
            goto L_0x026f
        L_0x0260:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.published()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x026e
            goto L_0x025e
        L_0x026e:
            r0 = 0
        L_0x026f:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.browsableOffline()
            if (r0 != 0) goto L_0x027a
        L_0x0278:
            r0 = 1
            goto L_0x0289
        L_0x027a:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.browsableOffline()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0288
            goto L_0x0278
        L_0x0288:
            r0 = 0
        L_0x0289:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.formatListType()
            if (r0 != 0) goto L_0x0294
        L_0x0292:
            r0 = 1
            goto L_0x02a3
        L_0x0294:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.formatListType()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a2
            goto L_0x0292
        L_0x02a2:
            r0 = 0
        L_0x02a3:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.formatListAttributes()
            if (r0 != 0) goto L_0x02ad
            goto L_0x02bc
        L_0x02ad:
            r4.writeInt(r2)
            java.lang.Boolean r0 = r3.formatListAttributes()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02bb
            goto L_0x02bc
        L_0x02bb:
            r1 = 0
        L_0x02bc:
            r4.writeInt(r1)
            com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy r0 = r3.owner()
            r4.writeParcelable(r0, r5)
            com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy r0 = r3.madeFor()
            r4.writeParcelable(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.playlist.endpoints.policy.rootlist.AutoValue_PlaylistMetadataDecorationPolicy.writeToParcel(android.os.Parcel, int):void");
    }
}
