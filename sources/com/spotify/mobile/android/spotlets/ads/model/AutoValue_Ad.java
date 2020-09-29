package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.spotlets.ads.model.Video.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class AutoValue_Ad extends C$AutoValue_Ad {
    public static final Creator<AutoValue_Ad> CREATOR = new Creator<AutoValue_Ad>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Ad[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            List list;
            List list2;
            List list3;
            List list4;
            Parcel parcel2 = parcel;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readInt() == 0 ? parcel.readString() : null;
            long readLong = parcel.readLong();
            String readString7 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt = parcel.readInt();
            boolean z = parcel.readInt() == 1;
            boolean z2 = parcel.readInt() == 1;
            HashMap readHashMap = parcel2.readHashMap(Ad.class.getClassLoader());
            CompanionAd companionAd = (CompanionAd) parcel2.readParcelable(Ad.class.getClassLoader());
            if (parcel.readInt() == 0) {
                list = parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER);
            } else {
                list = null;
            }
            if (parcel.readInt() == 0) {
                list2 = parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER_);
            } else {
                list2 = null;
            }
            if (parcel.readInt() == 0) {
                list3 = parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER__);
            } else {
                list3 = null;
            }
            if (parcel.readInt() == 0) {
                list4 = parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER___);
            } else {
                list4 = null;
            }
            AutoValue_Ad autoValue_Ad = new AutoValue_Ad(readString, readString2, readString3, readString4, readString5, readString6, readLong, readString7, readInt, z, z2, readHashMap, companionAd, list, list2, list3, list4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
            return autoValue_Ad;
        }
    };
    /* access modifiers changed from: private */
    public static final a LIST_TYPE_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final Image.a LIST_TYPE_ADAPTER_ = new Image.a();
    /* access modifiers changed from: private */
    public static final Display.a LIST_TYPE_ADAPTER__ = new Display.a();
    /* access modifiers changed from: private */
    public static final CompanionAd.a LIST_TYPE_ADAPTER___ = new CompanionAd.a();

    public final int describeContents() {
        return 0;
    }

    AutoValue_Ad(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, boolean z, boolean z2, Map<String, String> map, CompanionAd companionAd, List<Video> list, List<Image> list2, List<Display> list3, List<CompanionAd> list4, String str8, String str9, String str10, boolean z3) {
        super(str, str2, str3, str4, str5, str6, j, str7, i, z, z2, map, companionAd, list, list2, list3, list4, str8, str9, str10, z3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeString(uri());
        parcel.writeString(advertiser());
        parcel.writeString(title());
        parcel.writeString(clickUrl());
        if (clickTrackingUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(clickTrackingUrl());
        }
        parcel.writeLong(duration());
        if (caption() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(caption());
        }
        parcel.writeInt(adType());
        parcel.writeInt(testAd() ? 1 : 0);
        parcel.writeInt(nonExplicit() ? 1 : 0);
        parcel.writeMap(metadata());
        parcel.writeParcelable(companionAd(), i);
        if (videos() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            a.a(videos(), parcel);
        }
        if (images() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Image.a.a(images(), parcel);
        }
        if (displays() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            Display.a.a(displays(), parcel);
        }
        if (companionAds() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            CompanionAd.a.a(companionAds(), parcel);
        }
        parcel.writeString(lineItemId());
        parcel.writeString(creativeId());
        parcel.writeString(adPlaybackId());
        parcel.writeInt(skippable() ? 1 : 0);
    }
}
