package com.spotify.cosmos.session;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.Single;
import io.reactivex.functions.Function;

public interface BootstrapHandler {
    Function<LoginResponse, Single<LoginResponse>> continueWith(Function<byte[], Single<LoginResponse>> function);
}
