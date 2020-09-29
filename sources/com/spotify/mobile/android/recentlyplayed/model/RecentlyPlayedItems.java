package com.spotify.mobile.android.recentlyplayed.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPlayedItems implements Parcelable, JacksonModel, vlb<RecentlyPlayedItem> {
    public static final Creator<RecentlyPlayedItems> CREATOR = new Creator<RecentlyPlayedItems>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RecentlyPlayedItems(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecentlyPlayedItems[i];
        }
    };
    public List<RecentlyPlayedItem> items;
    public int length;
    public boolean loaded;

    public RecentlyPlayedItems(@JsonProperty("length") int i, @JsonProperty("loaded") boolean z, @JsonProperty("items") List<RecentlyPlayedItem> list) {
        this.length = i;
        this.loaded = z;
        if (list == null) {
            list = new ArrayList<>(0);
        }
        this.items = list;
    }

    private RecentlyPlayedItems(Parcel parcel) {
        this.length = parcel.readInt();
        this.loaded = juo.a(parcel);
        this.items = Lists.a();
        parcel.readTypedList(this.items, RecentlyPlayedItem.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyPlayedItems)) {
            return false;
        }
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj;
        if (this.length != recentlyPlayedItems.length) {
            return false;
        }
        if (this.loaded != recentlyPlayedItems.loaded) {
            return false;
        }
        return this.items.equals(recentlyPlayedItems.items);
    }

    public RecentlyPlayedItem[] getItems() {
        return (RecentlyPlayedItem[]) this.items.toArray(new RecentlyPlayedItem[0]);
    }

    public int getUnfilteredLength() {
        return this.length;
    }

    public int getUnrangedLength() {
        return this.length;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.length), Boolean.valueOf(this.loaded), this.items});
    }

    public boolean isLoading() {
        return !this.loaded;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        juo.a(parcel, this.loaded);
        parcel.writeTypedList(this.items);
    }
}
