package com.spotify.cosmos.android.cosmonaut;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import com.spotify.cosmos.router.RxRouter;
import java.util.List;

public class Cosmonaut {
    private final CosmonautHandler mCosmonautHandler;

    public Cosmonaut(List<Factory> list) {
        this.mCosmonautHandler = new CosmonautHandler(list);
    }

    public <T> T createCosmosService(Class<T> cls, RxRouter rxRouter) {
        return this.mCosmonautHandler.create(cls, rxRouter);
    }
}
