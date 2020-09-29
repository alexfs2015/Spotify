package com.spotify.mobile.android.cosmos.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

public class JacksonResponseParser<T extends JacksonModel> implements ObservableTransformer<Response, T> {
    private final Scheduler mComputationScheduler;
    private final JsonParser<T> mParser;

    public JacksonResponseParser(Class<T> cls, ObjectMapper objectMapper, Scheduler scheduler) {
        this.mParser = JsonParser.forClass(cls, objectMapper);
        this.mComputationScheduler = scheduler;
    }

    public static <T extends JacksonModel> JacksonResponseParser<T> forClass(Class<T> cls, ObjectMapper objectMapper, Scheduler scheduler) {
        return new JacksonResponseParser<>(cls, objectMapper, scheduler);
    }

    public ObservableSource<T> apply(Observable<Response> observable) {
        return observable.a(this.mComputationScheduler).c((Function<? super T, ? extends R>) new Function() {
            public final Object apply(Object obj) {
                return JacksonResponseParser.this.lambda$apply$0$JacksonResponseParser((Response) obj);
            }
        });
    }

    public /* synthetic */ JacksonModel lambda$apply$0$JacksonResponseParser(Response response) {
        try {
            return this.mParser.parseResponse(response);
        } catch (ParserException e) {
            throw new RuntimeException(e);
        }
    }
}
