package com.squareup.picasso;

public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    public final int index;

    private NetworkPolicy(int i) {
        this.index = i;
    }

    public static boolean a(int i) {
        return (i & NO_CACHE.index) == 0;
    }

    public static boolean b(int i) {
        return (i & NO_STORE.index) == 0;
    }

    public static boolean c(int i) {
        return (i & OFFLINE.index) != 0;
    }
}
