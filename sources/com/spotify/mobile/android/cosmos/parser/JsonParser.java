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

    public JsonParser(Class<T> cls, ObjectMapper objectMapper) {
        this.mClazz = (Class) fbp.a(cls);
        this.mObjectMapper = (ObjectMapper) fbp.a(objectMapper);
    }

    public static <T extends JacksonModel> JsonParser<T> forClass(Class<T> cls, ObjectMapper objectMapper) {
        return new JsonParser<>(cls, objectMapper);
    }

    public T parseResponse(Response response) {
        String str = "srsNn rpiier rpgS:a,nss%S JOE  gotorsnr";
        String str2 = "Error parsing JSON String, response: %s";
        String str3 = "Model parse time: %s (%d ms)";
        long b = jtp.a.b();
        try {
            T t = (JacksonModel) this.mObjectMapper.readValue(response.getBody(), this.mClazz);
            Logger.a(str3, this.mClazz.getSimpleName(), Long.valueOf(jtp.a.b() - b));
            return t;
        } catch (ArrayStoreException e) {
            Logger.e(str2, response.toString());
            Assertion.a("Caught an exception while parsing JSON string", (Throwable) e);
            Logger.a(str3, this.mClazz.getSimpleName(), Long.valueOf(jtp.a.b() - b));
            return null;
        } catch (IOException e2) {
            Logger.e(str2, response.toString());
            throw new ParserException((Throwable) e2);
        } catch (Throwable th) {
            Logger.a(str3, this.mClazz.getSimpleName(), Long.valueOf(jtp.a.b() - b));
            throw th;
        }
    }
}
