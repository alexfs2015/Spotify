package com.spotify.mobile.android.cosmos.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;

public class JsonParser<T extends JacksonModel> implements ResponseParser<T> {
    private final Class<T> mClazz;
    private final ObjectMapper mObjectMapper;

    public static <T extends JacksonModel> JsonParser<T> forClass(Class<T> cls, ObjectMapper objectMapper) {
        return new JsonParser<>(cls, objectMapper);
    }

    public JsonParser(Class<T> cls, ObjectMapper objectMapper) {
        this.mClazz = (Class) fay.a(cls);
        this.mObjectMapper = (ObjectMapper) fay.a(objectMapper);
    }

    public T parseResponse(Response response) {
        String str = "Error parsing JSON String, response: %s";
        String str2 = "Model parse time: %s (%d ms)";
        long b = jrf.a.b();
        try {
            T t = (JacksonModel) this.mObjectMapper.readValue(response.getBody(), this.mClazz);
            Logger.a(str2, this.mClazz.getSimpleName(), Long.valueOf(jrf.a.b() - b));
            return t;
        } catch (ArrayStoreException e) {
            Logger.e(str, response.toString());
            Assertion.a("Caught an exception while parsing JSON string", (Throwable) e);
            Logger.a(str2, this.mClazz.getSimpleName(), Long.valueOf(jrf.a.b() - b));
            return null;
        } catch (IOException e2) {
            Logger.e(str, response.toString());
            throw new ParserException((Throwable) e2);
        } catch (Throwable th) {
            Logger.a(str2, this.mClazz.getSimpleName(), Long.valueOf(jrf.a.b() - b));
            throw th;
        }
    }
}
