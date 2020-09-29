package com.squareup.picasso;

public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    public static boolean a(int i) {
        return (i & NO_CACHE.index) == 0;
    }

    public static boolean b(int i) {
        return (i & NO_STORE.index) == 0;
    }

    private MemoryPolicy(int i) {
        this.index = i;
    }
}
