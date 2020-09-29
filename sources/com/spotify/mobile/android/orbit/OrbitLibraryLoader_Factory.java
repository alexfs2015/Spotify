package com.spotify.mobile.android.orbit;

import java.util.Random;

public final class OrbitLibraryLoader_Factory implements wig<OrbitLibraryLoader> {
    private final wzi<Random> randomProvider;

    public OrbitLibraryLoader_Factory(wzi<Random> wzi) {
        this.randomProvider = wzi;
    }

    public static OrbitLibraryLoader_Factory create(wzi<Random> wzi) {
        return new OrbitLibraryLoader_Factory(wzi);
    }

    public static OrbitLibraryLoader newInstance(Random random) {
        return new OrbitLibraryLoader(random);
    }

    public final OrbitLibraryLoader get() {
        return new OrbitLibraryLoader((Random) this.randomProvider.get());
    }
}
