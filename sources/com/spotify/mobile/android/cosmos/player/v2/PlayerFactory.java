package com.spotify.mobile.android.cosmos.player.v2;

public interface PlayerFactory {
    Player create(String str, uqm uqm, gkm gkm);

    Player create(String str, uqm uqm, String str2, gkm gkm);
}
