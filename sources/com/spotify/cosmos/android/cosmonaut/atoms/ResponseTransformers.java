package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import com.spotify.cosmos.router.Response;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

class ResponseTransformers {
    static final ResponseTransformer PASS_THROUGH = $$Lambda$ResponseTransformers$fDnQqWdgzZjFZUSY3Op1gaQ_UL8.INSTANCE;
    private final List<Converter<byte[], ?>> mConverters;

    ResponseTransformers(List<Factory> list) {
        this.mConverters = new ArrayList(list.size());
        for (Factory createResponseConverter : list) {
            this.mConverters.add(createResponseConverter.createResponseConverter());
        }
    }

    static Type getActualTypeArgument(Type type) {
        fbp.a(type instanceof ParameterizedType);
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        boolean z = true;
        if (actualTypeArguments.length != 1) {
            z = false;
        }
        fbp.a(z);
        return actualTypeArguments[0];
    }

    static boolean isTypedResponse(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return false;
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        return (rawType instanceof Class) && TypedResponse.class.isAssignableFrom((Class) rawType);
    }

    static /* synthetic */ Object lambda$null$0(Response response) {
        return response;
    }

    /* access modifiers changed from: 0000 */
    public ResponseTransformer create(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return PASS_THROUGH;
        }
        Type actualTypeArgument = getActualTypeArgument(type);
        if (Response.class.equals(actualTypeArgument)) {
            return PASS_THROUGH;
        }
        if (!isTypedResponse(actualTypeArgument)) {
            return new ResponseTransformer(actualTypeArgument) {
                private final /* synthetic */ Type f$1;

                {
                    this.f$1 = r2;
                }

                public final ObservableSource apply(Observable observable) {
                    return observable.c((Function<? super T, ? extends R>) new Function(this.f$1) {
                        private final /* synthetic */ Type f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final Object apply(Object obj) {
                            return fbp.a(Converter.this.convert(this.f$1, ((Response) obj).getBody()));
                        }
                    });
                }
            };
        }
        Type actualTypeArgument2 = getActualTypeArgument(actualTypeArgument);
        return new ResponseTransformer(actualTypeArgument2) {
            private final /* synthetic */ Type f$1;

            {
                this.f$1 = r2;
            }

            public final ObservableSource apply(Observable observable) {
                return observable.c((Function<? super T, ? extends R>) new Function(this.f$1) {
                    private final /* synthetic */ Type f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final Object apply(Object obj) {
                        return TypedResponse.builder().uri(((Response) obj).getUri()).headers(((Response) obj).getHeaders()).status(((Response) obj).getStatus()).body(Converter.this.convert(this.f$1, ((Response) obj).getBody())).build();
                    }
                });
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public Converter<byte[], ?> findConverter(Type type) {
        for (Converter<byte[], ?> converter : this.mConverters) {
            if (converter.canHandle(type)) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(" is not supported by ResponseTransformers");
        throw new IllegalArgumentException(sb.toString());
    }
}
