package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public class PlayerFactoryImpl implements PlayerFactory {
    private final ObjectMapper mObjectMapper;
    private final wlc<PlayerStateCompat> mPlayerStateCompatProvider;
    private final FireAndForgetResolver mResolver;
    private final String mVersionName;

    public PlayerFactoryImpl(String str, ObjectMapper objectMapper, wlc<PlayerStateCompat> wlc, FireAndForgetResolver fireAndForgetResolver) {
        this.mResolver = fireAndForgetResolver;
        this.mVersionName = str;
        this.mObjectMapper = objectMapper;
        this.mPlayerStateCompatProvider = wlc;
    }

    public Player create(String str, udr udr, String str2, gjb gjb) {
        ResolverPlayer resolverPlayer = new ResolverPlayer(this.mResolver, str, udr.a(), str2, gjb.a().a(), this.mObjectMapper, this.mPlayerStateCompatProvider);
        return resolverPlayer;
    }

    public Player create(String str, udr udr, gjb gjb) {
        return create(str, udr, this.mVersionName, gjb);
    }
}
