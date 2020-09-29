package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public final class PlayerFactoryImpl_Factory implements vua<PlayerFactoryImpl> {
    private final wlc<ObjectMapper> objectMapperProvider;
    private final wlc<PlayerStateCompat> playerStateCompatProvider;
    private final wlc<FireAndForgetResolver> resolverProvider;
    private final wlc<String> versionNameProvider;

    public PlayerFactoryImpl_Factory(wlc<String> wlc, wlc<ObjectMapper> wlc2, wlc<PlayerStateCompat> wlc3, wlc<FireAndForgetResolver> wlc4) {
        this.versionNameProvider = wlc;
        this.objectMapperProvider = wlc2;
        this.playerStateCompatProvider = wlc3;
        this.resolverProvider = wlc4;
    }

    public final PlayerFactoryImpl get() {
        return new PlayerFactoryImpl((String) this.versionNameProvider.get(), (ObjectMapper) this.objectMapperProvider.get(), this.playerStateCompatProvider, (FireAndForgetResolver) this.resolverProvider.get());
    }

    public static PlayerFactoryImpl_Factory create(wlc<String> wlc, wlc<ObjectMapper> wlc2, wlc<PlayerStateCompat> wlc3, wlc<FireAndForgetResolver> wlc4) {
        return new PlayerFactoryImpl_Factory(wlc, wlc2, wlc3, wlc4);
    }

    public static PlayerFactoryImpl newInstance(String str, ObjectMapper objectMapper, wlc<PlayerStateCompat> wlc, FireAndForgetResolver fireAndForgetResolver) {
        return new PlayerFactoryImpl(str, objectMapper, wlc, fireAndForgetResolver);
    }
}
