package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

enum ReturnTypeConverters implements ReturnTypeConverter {
    OBSERVABLE {
        public final boolean isSupported(Type type, String str) {
            return isSub(str) && isGenericTypeOf(type, Observable.class);
        }

        public final Object convert(ResponseTransformer responseTransformer, Observable<Response> observable) {
            return observable.a((ObservableTransformer<? super T, ? extends R>) responseTransformer);
        }
    },
    SINGLE {
        public final boolean isSupported(Type type, String str) {
            return !isSub(str) && isGenericTypeOf(type, Single.class);
        }

        public final Object convert(ResponseTransformer responseTransformer, Observable<Response> observable) {
            return observable.a((ObservableTransformer<? super T, ? extends R>) responseTransformer).h();
        }
    },
    COMPLETABLE {
        public final boolean isSupported(Type type, String str) {
            return !isSub(str) && !isGet(str) && type.equals(Completable.class);
        }

        public final Object convert(ResponseTransformer responseTransformer, Observable<Response> observable) {
            return observable.g();
        }
    };
    
    private static final ReturnTypeConverters[] VALUES = null;

    static {
        VALUES = values();
    }

    static ReturnTypeConverter find(Method method) {
        ReturnTypeConverters[] returnTypeConvertersArr;
        String findAction = ReflectionUtil.findAction(method);
        Type genericReturnType = method.getGenericReturnType();
        for (ReturnTypeConverters returnTypeConverters : VALUES) {
            if (returnTypeConverters.isSupported(genericReturnType, findAction)) {
                return returnTypeConverters;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(method);
        sb.append("'s (action, return type) pair is not supported: ");
        sb.append(findAction);
        sb.append(", ");
        sb.append(genericReturnType);
        throw new IllegalArgumentException(sb.toString());
    }

    static boolean isGenericTypeOf(Type type, Class<?> cls) {
        return (type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType().equals(cls);
    }

    static boolean isSub(String str) {
        return Request.SUB.equals(str);
    }

    static boolean isGet(String str) {
        return Request.GET.equals(str);
    }
}
