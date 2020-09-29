package com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened;

import com.google.common.collect.ImmutableList;
import com.spotify.wrapped2019.v1.proto.ListenedData;
import java.io.Serializable;
import java.util.List;

public abstract class MinutesListened implements Serializable {
    private static final long serialVersionUID = 2;

    public interface a {
        a a(int i);

        a a(String str);

        MinutesListened a();

        a b(String str);
    }

    public static ImmutableList<MinutesListened> a(List<ListenedData> list) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        for (ListenedData listenedData : list) {
            g.c(a(listenedData.e, listenedData.f, listenedData.d));
        }
        return g.a();
    }

    public static MinutesListened a(int i, String str, String str2) {
        return new a().a(i).a(str).b(str2).a();
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();
}
