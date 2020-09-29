package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;

public class NotFoundException extends CosmosException {
    private static final long serialVersionUID = -8419609754312795844L;

    public NotFoundException(Response response) {
        super(response, "not found");
    }
}
