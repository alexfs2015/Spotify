package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem.a;
import java.util.ArrayList;
import java.util.List;

final class AutoValue_TasteOnboardingItem extends C$AutoValue_TasteOnboardingItem {
    public static final Creator<AutoValue_TasteOnboardingItem> CREATOR = new Creator<AutoValue_TasteOnboardingItem>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            ArrayList createTypedArrayList = parcel2.createTypedArrayList(AutoValue_TasteOnboardingItem.LIST_TYPE_ADAPTER);
            ArrayList createTypedArrayList2 = parcel2.createTypedArrayList(AutoValue_TasteOnboardingItem.LIST_TYPE_ADAPTER_);
            qur qur = (qur) parcel2.readParcelable(TasteOnboardingItem.class.getClassLoader());
            String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            AutoValue_TasteOnboardingItem autoValue_TasteOnboardingItem = new AutoValue_TasteOnboardingItem(readString, readString2, readString3, createTypedArrayList, createTypedArrayList2, qur, readString4, z2, z3, z4, z, parcel.readInt() == 0 ? parcel.readString() : null);
            return autoValue_TasteOnboardingItem;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_TasteOnboardingItem[i];
        }
    };
    /* access modifiers changed from: private */
    public static final a LIST_TYPE_ADAPTER = new a();
    /* access modifiers changed from: private */
    public static final TasteOnboardingImage.a LIST_TYPE_ADAPTER_ = new TasteOnboardingImage.a();

    AutoValue_TasteOnboardingItem(String str, String str2, String str3, List<TasteOnboardingItem> list, List<TasteOnboardingImage> list2, qur qur, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        super(str, str2, str3, list, list2, qur, str4, z, z2, z3, z4, str5);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeString(name());
        if (image() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(image());
        }
        a.a(relatedItems(), parcel);
        TasteOnboardingImage.a.a(imagesWithSize(), parcel);
        parcel.writeParcelable(logging(), i);
        if (moreUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(moreUri());
        }
        parcel.writeInt(isArtist() ? 1 : 0);
        parcel.writeInt(isPodcast() ? 1 : 0);
        parcel.writeInt(isLiked() ? 1 : 0);
        parcel.writeInt(isExpanded() ? 1 : 0);
        if (color() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(color());
    }
}
