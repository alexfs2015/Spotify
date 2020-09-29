package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Response;
import io.reactivex.ObservableTransformer;

interface ResponseTransformer extends ObservableTransformer<Response, Object> {
}
