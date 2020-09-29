package com.spotify.music.features.assistedcuration.loader;

import com.spotify.base.java.logging.Logger;

/* renamed from: com.spotify.music.features.assistedcuration.loader.-$$Lambda$RecsLoader$-azYMVhlNS2V2hlRNGvfDZ8Hsbc reason: invalid class name */
public final /* synthetic */ class $$Lambda$RecsLoader$azYMVhlNS2V2hlRNGvfDZ8Hsbc implements xiy {
    public static final /* synthetic */ $$Lambda$RecsLoader$azYMVhlNS2V2hlRNGvfDZ8Hsbc INSTANCE = new $$Lambda$RecsLoader$azYMVhlNS2V2hlRNGvfDZ8Hsbc();

    private /* synthetic */ $$Lambda$RecsLoader$azYMVhlNS2V2hlRNGvfDZ8Hsbc() {
    }

    public final Object call(Object obj) {
        return Logger.e((Throwable) obj, "Assisted Curation Recs Loader: failed to parse recs: %s", ((Throwable) obj).getMessage());
    }
}
