package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleasesWithTotalCount implements Parcelable, JacksonModel {
    public static final Creator<ReleasesWithTotalCount> CREATOR = new Creator<ReleasesWithTotalCount>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ReleasesWithTotalCount[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ReleasesWithTotalCount(parcel);
        }
    };
    public final List<Release> releases;
    public final int totalCount;

    public int describeContents() {
        return 0;
    }

    @JsonCreator
    public ReleasesWithTotalCount(@JsonProperty("releases") List<Release> list, @JsonProperty("total_count") int i) {
        this.releases = gbp.a(list);
        this.totalCount = i;
    }

    public boolean hasAllReleases() {
        return this.releases.size() == this.totalCount;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.releases);
        parcel.writeInt(this.totalCount);
    }

    private ReleasesWithTotalCount(Parcel parcel) {
        this.releases = parcel.createTypedArrayList(Release.CREATOR);
        this.totalCount = parcel.readInt();
    }
}
