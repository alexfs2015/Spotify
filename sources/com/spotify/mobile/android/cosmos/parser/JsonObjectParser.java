package com.spotify.mobile.android.cosmos.parser;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonObjectParser implements ResponseParser<JSONObject> {
    private static final Charset DEFAULT_CHARSET = fbi.c;

    public JSONObject parseResponse(Response response) {
        try {
            HttpCallbackReceiver.defaultVerifyResponse(response);
            return new JSONObject(new String(response.getBody(), DEFAULT_CHARSET));
        } catch (JSONException e) {
            throw new ParserException((Throwable) e);
        }
    }
}
