package com.spotify.music.features.nowplayingbar.domain.model;

import android.os.Parcelable;

public abstract class Track implements Parcelable {

    public enum Type {
        AD,
        INTERRUPTION,
        TRACK
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract Type g();

    public static Track a(String str, String str2, String str3, String str4, boolean z, boolean z2, Type type) {
        nxl nxl = new nxl(str, str2, str3, str4, z, z2, type);
        return nxl;
    }
}
