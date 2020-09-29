package com.spotify.music.features.quicksilver.triggerengine.domain;

import java.io.Serializable;

public abstract class OutboundRequest implements Serializable {
    private static final long serialVersionUID = 1;

    public interface a {
        a a(String str);

        OutboundRequest a();

        a b(String str);

        a c(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static a d() {
        String str = "";
        return new a().a(str).b(str).c(str);
    }
}
