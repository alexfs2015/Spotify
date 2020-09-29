package com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened;

import java.io.Serializable;

public abstract class MinutesListened implements Serializable {
    private static final long serialVersionUID = 2;

    public interface a {
        a a(int i);

        a a(String str);

        MinutesListened a();

        a b(int i);
    }

    public abstract int a();

    public abstract String b();

    public abstract int c();

    public static MinutesListened a(int i, String str, int i2) {
        return new a().a(i).a(str).b(i2).a();
    }
}
