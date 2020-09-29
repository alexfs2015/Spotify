package com.spotify.music.features.profile.domain;

import android.os.Parcelable;

public abstract class ProfileModel implements Parcelable {
    public static final ProfileModel l;

    public enum LoadingState {
        LOADED,
        LOADING,
        FAILED,
        OFFLINE,
        INIT
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(LoadingState loadingState);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract ProfileModel a();

        public abstract a b(int i);

        public abstract a b(String str);

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a c(String str);

        public abstract a c(boolean z);

        public abstract a d(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract boolean j();

    public abstract LoadingState k();

    public abstract a l();

    public final ProfileModel a(LoadingState loadingState) {
        return l().a(loadingState).a();
    }

    static {
        String str = "";
        l = new defpackage.pjo.a().a(str).b(str).c(str).d(null).a(false).b(false).a(0).b(0).c(0).c(false).a(LoadingState.INIT).a();
    }
}
