package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;

public class InsufficientStorageException extends CosmosException {
    private static final long serialVersionUID = 3273836696118735053L;

    public InsufficientStorageException(String str, Response response) {
        super(str, response, "insufficient storage");
    }
}
