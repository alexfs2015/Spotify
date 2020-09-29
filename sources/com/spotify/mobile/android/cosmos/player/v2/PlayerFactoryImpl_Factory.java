package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public final class PlayerFactoryImpl_Factory implements wig<PlayerFactoryImpl> {
    private final wzi<ObjectMapper> objectMapperProvider;
    private final wzi<PlayerStateCompat> playerStateCompatProvider;
    private final wzi<FireAndForgetResolver> resolverProvider;
    private final wzi<String> versionNameProvider;

    public PlayerFactoryImpl_Factory(wzi<String> wzi, wzi<ObjectMapper> wzi2, wzi<PlayerStateCompat> wzi3, wzi<FireAndForgetResolver> wzi4) {
        this.versionNameProvider = wzi;
        this.objectMapperProvider = wzi2;
        this.playerStateCompatProvider = wzi3;
        this.resolverProvider = wzi4;
    }

    public static PlayerFactoryImpl_Factory create(wzi<String> wzi, wzi<ObjectMapper> wzi2, wzi<PlayerStateCompat> wzi3, wzi<FireAndForgetResolver> wzi4) {
        return new PlayerFactoryImpl_Factory(wzi, wzi2, wzi3, wzi4);
    }

    public static PlayerFactoryImpl newInstance(String str, ObjectMapper objectMapper, wzi<PlayerStateCompat> wzi, FireAndForgetResolver fireAndForgetResolver) {
        return new PlayerFactoryImpl(str, objectMapper, wzi, fireAndForgetResolver);
    }

    public final PlayerFactoryImpl get() {
        return new PlayerFactoryImpl((String) this.versionNameProvider.get(), (ObjectMapper) this.objectMapperProvider.get(), this.playerStateCompatProvider, (FireAndForgetResolver) this.resolverProvider.get());
    }
}
