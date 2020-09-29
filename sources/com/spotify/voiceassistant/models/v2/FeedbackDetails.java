package com.spotify.voiceassistant.models.v2;

public class FeedbackDetails {
    @fjk(a = "entity_type")
    public String entity_type;
    @fjk(a = "playlist_name")
    public String playlist_name;
}
