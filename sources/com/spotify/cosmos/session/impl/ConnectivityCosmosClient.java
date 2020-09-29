package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import io.reactivex.Completable;

public interface ConnectivityCosmosClient {
    @PUT("sp://connectivity-manager/v1/connection-type")
    Completable setConnectivity(@Body SetConnectivityRequest setConnectivityRequest);
}
