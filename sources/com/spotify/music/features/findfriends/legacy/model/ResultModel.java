package com.spotify.music.features.findfriends.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultModel implements Parcelable, JacksonModel {
    public static final Creator<ResultModel> CREATOR = new Creator<ResultModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ResultModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ResultModel(parcel);
        }
    };
    @JsonProperty("image")
    private final String mImage;
    @JsonProperty("isFollowing")
    private boolean mIsFollowing;
    @JsonProperty("subtitleUri")
    private final String mSubtitleUri;
    @JsonProperty("title")
    private final String mTitle;
    @JsonProperty("uri")
    private final String mUri;

    public int describeContents() {
        return 0;
    }

    public ResultModel(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("image") String str3, @JsonProperty("subtitleUri") String str4, @JsonProperty("following") boolean z) {
        this.mUri = str;
        this.mTitle = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.mImage = str3;
        this.mSubtitleUri = str4;
        this.mIsFollowing = z;
    }

    public String getUri() {
        String str = this.mSubtitleUri;
        return str == null ? this.mUri : str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getImage() {
        return this.mImage;
    }

    public boolean isFollowing() {
        return this.mIsFollowing;
    }

    public void toggleFollowing() {
        this.mIsFollowing = !this.mIsFollowing;
    }

    public ResultModel(Parcel parcel) {
        this.mUri = parcel.readString();
        this.mTitle = parcel.readString();
        this.mImage = parcel.readString();
        this.mSubtitleUri = parcel.readString();
        this.mIsFollowing = jse.a(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUri);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mImage);
        parcel.writeString(this.mSubtitleUri);
        jse.a(parcel, this.mIsFollowing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultModel)) {
            return false;
        }
        ResultModel resultModel = (ResultModel) obj;
        return this.mIsFollowing == resultModel.mIsFollowing && this.mImage.equals(resultModel.mImage) && this.mTitle.equals(resultModel.mTitle) && this.mUri.equals(resultModel.mUri);
    }

    public int hashCode() {
        return (((((this.mUri.hashCode() * 31) + this.mTitle.hashCode()) * 31) + this.mImage.hashCode()) * 31) + (this.mIsFollowing ? 1 : 0);
    }

    public String toString() {
        return this.mTitle;
    }
}
