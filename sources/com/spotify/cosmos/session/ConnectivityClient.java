package com.spotify.cosmos.session;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.Completable;

public interface ConnectivityClient {
    Completable setConnectivity(ConnectionType connectionType);
}
