package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import java.util.Locale;

abstract class CosmosException extends Exception {
    private static final long serialVersionUID = 6979331231113503908L;

    CosmosException(String str, Response response, String str2) {
        byte[] body = response.getBody();
        super(String.format(Locale.US, "Request with uri %s result in %d %s: %s", new Object[]{str, Integer.valueOf(response.getStatus()), str2, (body == null || body.length <= 0) ? "" : new String(body, far.c)}));
    }
}
