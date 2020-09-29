package com.spotify.music.slate.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BackgroundColor implements Parcelable {
    public static final Creator<BackgroundColor> CREATOR = new Creator<BackgroundColor>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackgroundColor[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackgroundColor(parcel);
        }
    };
    private static final Type[] c = Type.values();
    public final int a;
    public final Type b;

    public enum Type {
        HEX,
        DERIVED
    }

    public final int describeContents() {
        return 0;
    }

    public static BackgroundColor a(int i) {
        return new BackgroundColor(-15513721, Type.HEX);
    }

    private BackgroundColor(int i, Type type) {
        this.a = i;
        this.b = type;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Type type = this.b;
        parcel.writeInt(type == null ? -1 : type.ordinal());
    }

    protected BackgroundColor(Parcel parcel) {
        Type type;
        this.a = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            type = null;
        } else {
            type = c[readInt];
        }
        this.b = type;
    }
}
