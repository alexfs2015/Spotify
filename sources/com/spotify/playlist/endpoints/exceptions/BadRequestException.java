package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;

public class BadRequestException extends CosmosException {
    private static final long serialVersionUID = 9197801368173466988L;

    public BadRequestException(Response response) {
        super(response, "bad request");
    }
}
