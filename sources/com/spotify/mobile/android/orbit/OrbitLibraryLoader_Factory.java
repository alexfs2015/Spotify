package com.spotify.mobile.android.orbit;

import java.util.Random;

public final class OrbitLibraryLoader_Factory implements vua<OrbitLibraryLoader> {
    private final wlc<Random> randomProvider;

    public OrbitLibraryLoader_Factory(wlc<Random> wlc) {
        this.randomProvider = wlc;
    }

    public final OrbitLibraryLoader get() {
        return new OrbitLibraryLoader((Random) this.randomProvider.get());
    }

    public static OrbitLibraryLoader_Factory create(wlc<Random> wlc) {
        return new OrbitLibraryLoader_Factory(wlc);
    }

    public static OrbitLibraryLoader newInstance(Random random) {
        return new OrbitLibraryLoader(random);
    }
}
