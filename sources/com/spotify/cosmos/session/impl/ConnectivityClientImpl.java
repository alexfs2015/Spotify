package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.session.ConnectivityClient;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Completable;

public class ConnectivityClientImpl implements ConnectivityClient {
    private final ConnectivityCosmosClient mConnectivityCosmosClient;

    public ConnectivityClientImpl(Cosmonaut cosmonaut, RxRouter rxRouter) {
        this.mConnectivityCosmosClient = (ConnectivityCosmosClient) cosmonaut.createCosmosService(ConnectivityCosmosClient.class, rxRouter);
    }

    public Completable setConnectivity(ConnectionType connectionType) {
        return this.mConnectivityCosmosClient.setConnectivity(SetConnectivityRequest.builder().connectionType(connectionType).build());
    }
}
