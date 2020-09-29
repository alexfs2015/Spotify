package com.spotify.music.features.assistedcuration.loader;

import com.spotify.base.java.logging.Logger;

/* renamed from: com.spotify.music.features.assistedcuration.loader.-$$Lambda$GenresLoader$G179XFEFgK8nveah0csqV-wfwZc reason: invalid class name */
public final /* synthetic */ class $$Lambda$GenresLoader$G179XFEFgK8nveah0csqVwfwZc implements xiy {
    public static final /* synthetic */ $$Lambda$GenresLoader$G179XFEFgK8nveah0csqVwfwZc INSTANCE = new $$Lambda$GenresLoader$G179XFEFgK8nveah0csqVwfwZc();

    private /* synthetic */ $$Lambda$GenresLoader$G179XFEFgK8nveah0csqVwfwZc() {
    }

    public final Object call(Object obj) {
        return Logger.e((Throwable) obj, "Assisted Curation Genres Loader: failed to parse genres: %s", ((Throwable) obj).getMessage());
    }
}
