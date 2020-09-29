package com.spotify.mobile.android.cosmos.player.v2.queue;

public final class PlayerQueueUtil_Factory implements vua<PlayerQueueUtil> {
    private static final PlayerQueueUtil_Factory INSTANCE = new PlayerQueueUtil_Factory();

    public final PlayerQueueUtil get() {
        return new PlayerQueueUtil();
    }

    public static PlayerQueueUtil_Factory create() {
        return INSTANCE;
    }

    public static PlayerQueueUtil newInstance() {
        return new PlayerQueueUtil();
    }
}
