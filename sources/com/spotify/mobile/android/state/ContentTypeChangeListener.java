package com.spotify.mobile.android.state;

public interface ContentTypeChangeListener {

    public enum ContentType {
        DEFAULT,
        SPEECH
    }

    void a(ContentType contentType);
}
