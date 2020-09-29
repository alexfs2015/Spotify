package com.spotify.cosmos.session;

import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.Completable;
import io.reactivex.Single;

public interface SessionClient {
    Single<LoginResponse> login(LoginRequest loginRequest);

    Completable logout();

    Completable logoutAndForgetCredentials();

    Single<LoginResponse> notifyBootstrapCompleted(byte[] bArr);

    Single<LoginResponse> resendCode(String str);

    Single<LoginResponse> verifyCode(String str, String str2);
}
