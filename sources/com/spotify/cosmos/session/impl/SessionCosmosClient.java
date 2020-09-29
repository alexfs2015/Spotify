package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.BodyPart;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponseBody;
import com.spotify.cosmos.session.model.SessionInfo;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

interface SessionCosmosClient {
    @SUB("sp://session/v1")
    Observable<SessionInfo> currentSession();

    @POST("sp://session/v1")
    Single<TypedResponse<LoginResponseBody>> login(@Body LoginRequest loginRequest);

    @DELETE("sp://session/v1")
    Completable logout(@Query("forgetCredentials") boolean z);

    @POST("sp://session/v1/bootstrap-completed")
    Single<TypedResponse<LoginResponseBody>> notifyBootstrapCompleted(@Body byte[] bArr);

    @POST("sp://session/v1/resend")
    Single<TypedResponse<LoginResponseBody>> resendCode(@Query("uid") String str);

    @POST("sp://session/v1/code")
    Single<TypedResponse<LoginResponseBody>> verifyCode(@Query("uid") String str, @BodyPart("code") String str2);
}
