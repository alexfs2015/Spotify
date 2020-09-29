package com.spotify.music.features.assistedcuration.loader;

import com.spotify.base.java.logging.Logger;

/* renamed from: com.spotify.music.features.assistedcuration.loader.-$$Lambda$GenresLoader$IOJOUhKgO75lG14BVrae-G7ZRZQ reason: invalid class name */
public final /* synthetic */ class $$Lambda$GenresLoader$IOJOUhKgO75lG14BVraeG7ZRZQ implements xiy {
    public static final /* synthetic */ $$Lambda$GenresLoader$IOJOUhKgO75lG14BVraeG7ZRZQ INSTANCE = new $$Lambda$GenresLoader$IOJOUhKgO75lG14BVraeG7ZRZQ();

    private /* synthetic */ $$Lambda$GenresLoader$IOJOUhKgO75lG14BVraeG7ZRZQ() {
    }

    public final Object call(Object obj) {
        return Logger.e((Throwable) obj, "Assisted Curation Genres Loader: failed to load genres: %s", ((Throwable) obj).getMessage());
    }
}
