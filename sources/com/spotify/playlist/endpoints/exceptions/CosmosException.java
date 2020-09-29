package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import java.util.Locale;

abstract class CosmosException extends Exception {
    private static final long serialVersionUID = 6979331231113503908L;

    CosmosException(Response response, String str) {
        byte[] body = response.getBody();
        super(String.format(Locale.US, "Request with uri %s result in %d %s: %s", new Object[]{response.getUri(), Integer.valueOf(response.getStatus()), str, (body == null || body.length <= 0) ? "" : new String(body, fbi.c)}));
    }
}
