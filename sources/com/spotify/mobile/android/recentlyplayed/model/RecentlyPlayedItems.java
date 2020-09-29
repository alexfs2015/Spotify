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
public class RecentlyPlayedItems implements Parcelable, JacksonModel, uyy<RecentlyPlayedItem> {
    public static final Creator<RecentlyPlayedItems> CREATOR = new Creator<RecentlyPlayedItems>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecentlyPlayedItems[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RecentlyPlayedItems(parcel);
        }
    };
    public List<RecentlyPlayedItem> items;
    public int length;
    public boolean loaded;

    public int describeContents() {
        return 0;
    }

    public RecentlyPlayedItems(@JsonProperty("length") int i, @JsonProperty("loaded") boolean z, @JsonProperty("items") List<RecentlyPlayedItem> list) {
        this.length = i;
        this.loaded = z;
        if (list == null) {
            list = new ArrayList<>(0);
        }
        this.items = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        jse.a(parcel, this.loaded);
        parcel.writeTypedList(this.items);
    }

    private RecentlyPlayedItems(Parcel parcel) {
        this.length = parcel.readInt();
        this.loaded = jse.a(parcel);
        this.items = Lists.a();
        parcel.readTypedList(this.items, RecentlyPlayedItem.CREATOR);
    }

    public RecentlyPlayedItem[] getItems() {
        return (RecentlyPlayedItem[]) this.items.toArray(new RecentlyPlayedItem[0]);
    }

    public boolean isLoading() {
        return !this.loaded;
    }

    public int getUnfilteredLength() {
        return this.length;
    }

    public int getUnrangedLength() {
        return this.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyPlayedItems)) {
            return false;
        }
        RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) obj;
        return this.length == recentlyPlayedItems.length && this.loaded == recentlyPlayedItems.loaded && this.items.equals(recentlyPlayedItems.items);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.length), Boolean.valueOf(this.loaded), this.items});
    }
}
