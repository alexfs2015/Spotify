package com.spotify.voiceassistant.models.v2;

public class SearchResponse {
    @fjk(a = "action")
    public String action;
    @fjk(a = "feedback_details")
    public FeedbackDetails feedback_details;
    @fjk(a = "feedback_id")
    public String feedback_id;
    @fjk(a = "intent")
    public String intent;
    @fjk(a = "req_id")
    public String req_id;
    @fjk(a = "result")
    public String result;
}
