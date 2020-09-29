package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public class PlayerFactoryImpl implements PlayerFactory {
    private final ObjectMapper mObjectMapper;
    private final wzi<PlayerStateCompat> mPlayerStateCompatProvider;
    private final FireAndForgetResolver mResolver;
    private final String mVersionName;

    public PlayerFactoryImpl(String str, ObjectMapper objectMapper, wzi<PlayerStateCompat> wzi, FireAndForgetResolver fireAndForgetResolver) {
        this.mResolver = fireAndForgetResolver;
        this.mVersionName = str;
        this.mObjectMapper = objectMapper;
        this.mPlayerStateCompatProvider = wzi;
    }

    public Player create(String str, uqm uqm, gkm gkm) {
        return create(str, uqm, this.mVersionName, gkm);
    }

    public Player create(String str, uqm uqm, String str2, gkm gkm) {
        String str3 = str;
        ResolverPlayer resolverPlayer = new ResolverPlayer(this.mResolver, str, uqm.a(), str2, gkm.a().a(), this.mObjectMapper, this.mPlayerStateCompatProvider);
        return resolverPlayer;
    }
}
