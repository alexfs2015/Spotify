package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.spotlets.ads.model.Video.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class AutoValue_Ad extends C$AutoValue_Ad {
    public static final Creator<AutoValue_Ad> CREATOR = new Creator<AutoValue_Ad>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
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
            Class<Ad> cls = Ad.class;
            HashMap readHashMap = parcel2.readHashMap(Ad.class.getClassLoader());
            Class<Ad> cls2 = Ad.class;
            CompanionAd companionAd = (CompanionAd) parcel2.readParcelable(Ad.class.getClassLoader());
            List createTypedArrayList = parcel.readInt() == 0 ? parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER) : null;
            List createTypedArrayList2 = parcel.readInt() == 0 ? parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER_) : null;
            List createTypedArrayList3 = parcel.readInt() == 0 ? parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER__) : null;
            List createTypedArrayList4 = parcel.readInt() == 0 ? parcel2.createTypedArrayList(AutoValue_Ad.LIST_TYPE_ADAPTER___) : null;
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String str = readString7;
            String str2 = readString7;
            int i = readInt;
            boolean z3 = z;
            boolean z4 = z;
            boolean z5 = z2;
            HashMap hashMap = readHashMap;
            CompanionAd companionAd2 = companionAd;
            List list = createTypedArrayList2;
            List list2 = createTypedArrayList3;
            String str3 = readString8;
            String str4 = readString9;
            AutoValue_Ad autoValue_Ad = new AutoValue_Ad(readString, readString2, readString3, readString4, readString5, readString6, readLong, str2, i, z4, z2, readHashMap, companionAd, createTypedArrayList, createTypedArrayList2, createTypedArrayList3, createTypedArrayList4, readString8, readString9, parcel.readString(), parcel.readInt() == 1);
            return autoValue_Ad;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_Ad[i];
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

    AutoValue_Ad(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, boolean z, boolean z2, Map<String, String> map, CompanionAd companionAd, List<Video> list, List<Image> list2, List<Display> list3, List<CompanionAd> list4, String str8, String str9, String str10, boolean z3) {
        super(str, str2, str3, str4, str5, str6, j, str7, i, z, z2, map, companionAd, list, list2, list3, list4, str8, str9, str10, z3);
    }

    public final int describeContents() {
        return 0;
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
