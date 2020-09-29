package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import java.lang.reflect.Type;

interface ReturnTypeConverter {
    Object convert(ResponseTransformer responseTransformer, Observable<Response> observable);

    boolean isSupported(Type type, String str);
}
