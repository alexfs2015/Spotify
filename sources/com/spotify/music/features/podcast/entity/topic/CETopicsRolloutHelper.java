package com.spotify.music.features.podcast.entity.topic;

import com.spotify.messages.PodcastTopicsVerification;
import java.util.Collections;
import java.util.List;

public final class CETopicsRolloutHelper {
    private final gfk<fli> a;
    private boolean b;
    private boolean c;
    private List<uei> d;
    private List<uei> e;

    public enum Source {
        WEBGATE,
        CREATOR_EXTENSION
    }

    public CETopicsRolloutHelper(gfk<fli> gfk) {
        this.a = gfk;
    }

    private static void a(List<uei> list) {
        Collections.sort(list, $$Lambda$CETopicsRolloutHelper$F9haufIXgrAH29zrK7CZnsPeFw.INSTANCE);
    }

    public final void a(List<uei> list, Source source) {
        if (!this.b && source == Source.WEBGATE && list.size() > 0) {
            this.b = true;
            this.d = list;
            a(this.d);
            this.a.a(PodcastTopicsVerification.k().a(true).g());
        }
        if (!this.c && source == Source.CREATOR_EXTENSION && list.size() > 0) {
            this.c = true;
            this.e = list;
            a(this.e);
        }
        if (this.b && this.c) {
            boolean equals = this.d.equals(this.e);
            this.a.a(PodcastTopicsVerification.k().a(String.format("%s:%s", new Object[]{this.d, this.e}), equals).g());
        }
    }
}
