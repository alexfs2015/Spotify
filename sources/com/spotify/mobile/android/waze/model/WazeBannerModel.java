package com.spotify.mobile.android.waze.model;

public abstract class WazeBannerModel {

    public enum Type {
        NO_BANNER,
        NAVIGATION_BANNER,
        GOTO_BANNER,
        GOTO_BANNER_UNIFIED,
        CONNECT_BANNER
    }

    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(String str);

        public abstract WazeBannerModel a();

        public abstract a b(int i);

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);
    }

    public static a a(Type type) {
        return new defpackage.kev.a().a(type).a(0).b(0);
    }

    public abstract Type a();

    public abstract int b();

    public abstract int c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();
}
