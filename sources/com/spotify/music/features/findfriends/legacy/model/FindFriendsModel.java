package com.spotify.music.features.findfriends.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FindFriendsModel implements Parcelable, JacksonModel {
    public static final Creator<FindFriendsModel> CREATOR = new Creator<FindFriendsModel>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FindFriendsModel(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FindFriendsModel[i];
        }
    };
    private static final fbq<ResultModel> PREDICATE = new fbq<ResultModel>() {
        public final /* synthetic */ boolean apply(Object obj) {
            ResultModel resultModel = (ResultModel) obj;
            return resultModel == null || fbo.a(resultModel.getUri());
        }
    };
    @JsonProperty("results")
    private final List<ResultModel> mResults;

    public FindFriendsModel(Parcel parcel) {
        this.mResults = parcel.createTypedArrayList(ResultModel.CREATOR);
    }

    public FindFriendsModel(@JsonProperty("results") ResultModel[] resultModelArr) {
        this.mResults = resultModelArr == null ? new ArrayList() : new ArrayList(Arrays.asList(resultModelArr));
        fdd.a((Iterable<T>) this.mResults, PREDICATE);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindFriendsModel)) {
            return false;
        }
        return this.mResults.equals(((FindFriendsModel) obj).mResults);
    }

    public List<ResultModel> getResults() {
        return this.mResults;
    }

    public int hashCode() {
        return this.mResults.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mResults);
    }
}
