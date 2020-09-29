package com.spotify.music.features.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class ProfileListItem implements Parcelable {

    public enum Type {
        PROFILE,
        ARTIST,
        PLAYLIST,
        UNKNOWN
    }

    public static abstract class a {
        public abstract a a(Type type);

        public abstract a a(String str);

        public abstract ProfileListItem a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);
    }

    public static a f() {
        return new defpackage.prd.a();
    }

    public static Creator<ProfileListItem> g() {
        return new Creator<ProfileListItem>() {
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return (ProfileListItem) prf.CREATOR.createFromParcel(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new prf[i];
            }
        };
    }

    public abstract Type a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
