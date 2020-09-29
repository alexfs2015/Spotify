package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvitationCodeModel implements Parcelable, JacksonModel {
    public static final Creator<InvitationCodeModel> CREATOR = new Creator<InvitationCodeModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new InvitationCodeModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new InvitationCodeModel[i];
        }
    };
    private final String mClaimedByDisplayName;
    private final String mClaimedByUri;
    private final Date mClaimedDate;
    private final String mCode;

    private InvitationCodeModel(Parcel parcel) {
        this.mCode = parcel.readString();
        long readLong = parcel.readLong();
        this.mClaimedDate = readLong > 0 ? new Date(readLong) : null;
        this.mClaimedByDisplayName = parcel.readString();
        this.mClaimedByUri = parcel.readString();
    }

    public InvitationCodeModel(@JsonProperty("code") String str, @JsonProperty("claimed_date") Date date, @JsonProperty("claimed_by_display_name") String str2, @JsonProperty("claimed_by_uri") String str3) {
        this.mCode = str;
        this.mClaimedDate = date;
        this.mClaimedByDisplayName = str2;
        this.mClaimedByUri = str3;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r6.mClaimedDate == null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 5
            r0 = 1
            if (r5 != r6) goto L_0x0006
            r4 = 0
            return r0
        L_0x0006:
            r4 = 6
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.user.InvitationCodeModel
            r4 = 3
            r2 = 0
            r4 = 7
            if (r1 != 0) goto L_0x000f
            return r2
        L_0x000f:
            r4 = 3
            com.spotify.mobile.android.spotlets.user.InvitationCodeModel r6 = (com.spotify.mobile.android.spotlets.user.InvitationCodeModel) r6
            r4 = 7
            java.lang.String r1 = r5.mClaimedByDisplayName
            r4 = 0
            java.lang.String r3 = r6.mClaimedByDisplayName
            r4 = 0
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            r4 = 6
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = r5.mClaimedByUri
            java.lang.String r3 = r6.mClaimedByUri
            r4 = 7
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            r4 = 6
            if (r1 == 0) goto L_0x0050
            r4 = 0
            java.util.Date r1 = r5.mClaimedDate
            if (r1 == 0) goto L_0x003c
            java.util.Date r3 = r6.mClaimedDate
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 == 0) goto L_0x0050
            r4 = 4
            goto L_0x0041
        L_0x003c:
            r4 = 3
            java.util.Date r1 = r6.mClaimedDate
            if (r1 != 0) goto L_0x0050
        L_0x0041:
            r4 = 4
            java.lang.String r1 = r5.mCode
            r4 = 7
            java.lang.String r6 = r6.mCode
            r4 = 2
            boolean r6 = android.text.TextUtils.equals(r1, r6)
            r4 = 5
            if (r6 == 0) goto L_0x0050
            return r0
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.user.InvitationCodeModel.equals(java.lang.Object):boolean");
    }

    @JsonProperty("claimed_by_display_name")
    public String getClaimedByDisplayName() {
        return this.mClaimedByDisplayName;
    }

    @JsonProperty("claimed_by_uri")
    public String getClaimedByUri() {
        return this.mClaimedByUri;
    }

    @JsonProperty("claimed_date")
    public Date getClaimedDate() {
        return this.mClaimedDate;
    }

    @JsonProperty("code")
    public String getCode() {
        return this.mCode;
    }

    public int hashCode() {
        String str = this.mCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Date date = this.mClaimedDate;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        String str2 = this.mClaimedByDisplayName;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mClaimedByUri;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @JsonIgnore
    public boolean isClaimed() {
        if (this.mClaimedDate == null) {
            return false;
        }
        int i = 4 << 1;
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCode);
        Date date = this.mClaimedDate;
        parcel.writeLong(date != null ? date.getTime() : 0);
        parcel.writeString(this.mClaimedByDisplayName);
        parcel.writeString(this.mClaimedByUri);
    }
}
