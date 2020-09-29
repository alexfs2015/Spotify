package com.spotify.voiceassistant.models.v2;

public class SearchResponse {
    @fiq(a = "action")
    public String action;
    @fiq(a = "feedback_details")
    public FeedbackDetails feedback_details;
    @fiq(a = "feedback_id")
    public String feedback_id;
    @fiq(a = "intent")
    public String intent;
    @fiq(a = "req_id")
    public String req_id;
    @fiq(a = "result")
    public String result;
}
