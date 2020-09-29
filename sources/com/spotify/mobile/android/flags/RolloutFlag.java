package com.spotify.mobile.android.flags;

public enum RolloutFlag {
    ENABLED,
    CONTROL;
    
    public static final a c = null;

    public static class a implements xiy<RolloutFlag, Boolean> {
        public final /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(((RolloutFlag) obj) == RolloutFlag.ENABLED);
        }
    }

    static {
        c = new a();
    }
}
