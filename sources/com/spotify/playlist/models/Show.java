package com.spotify.playlist.models;

public interface Show extends vkz<Show>, vla {

    public enum ConsumptionOrder {
        UNKNOWN,
        EPISODIC,
        SEQUENTIAL,
        RECENT;
        
        public static final ConsumptionOrder[] e = null;

        static {
            e = values();
        }
    }

    public enum MediaType {
        MIXED,
        AUDIO,
        VIDEO,
        UNKNOWN;
        
        public static final MediaType[] e = null;

        static {
            e = values();
        }
    }

    String a();

    Covers b();

    String c();

    String d();

    long e();

    String f();

    boolean g();

    boolean h();

    int i();

    ConsumptionOrder j();

    MediaType k();
}
