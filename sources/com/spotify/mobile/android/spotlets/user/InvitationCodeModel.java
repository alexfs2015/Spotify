package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InvitationCodeModel implements Parcelable, JacksonModel {
    public static final Creator<InvitationCodeModel> CREATOR = new Creator<InvitationCodeModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new InvitationCodeModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new InvitationCodeModel(parcel);
        }
    };
    private final String mClaimedByDisplayName;
    private final String mClaimedByUri;
    private final Date mClaimedDate;
    private final String mCode;

    public int describeContents() {
        return 0;
    }

    public InvitationCodeModel(@JsonProperty("code") String str, @JsonProperty("claimed_date") Date date, @JsonProperty("claimed_by_display_name") String str2, @JsonProperty("claimed_by_uri") String str3) {
        this.mCode = str;
        this.mClaimedDate = date;
        this.mClaimedByDisplayName = str2;
        this.mClaimedByUri = str3;
    }

    @JsonProperty("code")
    public String getCode() {
        return this.mCode;
    }

    @JsonProperty("claimed_date")
    public Date getClaimedDate() {
        return this.mClaimedDate;
    }

    @JsonIgnore
    public boolean isClaimed() {
        return this.mClaimedDate != null;
    }

    @JsonProperty("claimed_by_display_name")
    public String getClaimedByDisplayName() {
        return this.mClaimedByDisplayName;
    }

    @JsonProperty("claimed_by_uri")
    public String getClaimedByUri() {
        return this.mClaimedByUri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvitationCodeModel)) {
            return false;
        }
        InvitationCodeModel invitationCodeModel = (InvitationCodeModel) obj;
        if (TextUtils.equals(this.mClaimedByDisplayName, invitationCodeModel.mClaimedByDisplayName) && TextUtils.equals(this.mClaimedByUri, invitationCodeModel.mClaimedByUri)) {
            Date date = this.mClaimedDate;
            if (date == null ? invitationCodeModel.mClaimedDate == null : date.equals(invitationCodeModel.mClaimedDate)) {
                if (TextUtils.equals(this.mCode, invitationCodeModel.mCode)) {
                    return true;
                }
            }
        }
        return false;
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

    private InvitationCodeModel(Parcel parcel) {
        this.mCode = parcel.readString();
        long readLong = parcel.readLong();
        this.mClaimedDate = readLong > 0 ? new Date(readLong) : null;
        this.mClaimedByDisplayName = parcel.readString();
        this.mClaimedByUri = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCode);
        Date date = this.mClaimedDate;
        parcel.writeLong(date != null ? date.getTime() : 0);
        parcel.writeString(this.mClaimedByDisplayName);
        parcel.writeString(this.mClaimedByUri);
    }
}
