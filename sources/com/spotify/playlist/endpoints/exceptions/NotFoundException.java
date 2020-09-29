package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;

public class NotFoundException extends CosmosException {
    private static final long serialVersionUID = -8419609754312795844L;

    public NotFoundException(String str, Response response) {
        super(str, response, "not found");
    }
}
