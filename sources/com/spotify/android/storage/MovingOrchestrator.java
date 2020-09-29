package com.spotify.android.storage;

public interface MovingOrchestrator {

    public enum State {
        IDLE,
        SYNCING,
        SYNCED,
        PRUNING,
        CANCELLED
    }

    public enum SyncingResult {
        EVERYTHING_IN_SYNC,
        SOMETHING_SYNCED,
        AN_ERROR_WHILE_SYNCING
    }

    public interface a {
        void a();

        void b();
    }

    State a();

    SyncingResult a(String str, gaj gaj);

    void a(a aVar);

    void a(String str);

    String b();

    void c();
}
