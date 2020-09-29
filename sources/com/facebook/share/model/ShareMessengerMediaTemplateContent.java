package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerMediaTemplateContent extends aon<ShareMessengerMediaTemplateContent, Object> {
    public static final Creator<ShareMessengerMediaTemplateContent> CREATOR = new Creator<ShareMessengerMediaTemplateContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }
    };
    public final MediaType a;
    public final String b;
    public final Uri c;
    public final aor d;

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    public final int describeContents() {
        return 0;
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.a = (MediaType) parcel.readSerializable();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = (aor) parcel.readParcelable(aor.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
