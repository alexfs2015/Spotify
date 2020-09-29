package com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton;

public interface DrivingShowVoiceViewButtonViewBinder {

    public enum Type {
        UNKNOWN,
        NOW_PLAYING,
        HOME_FEED
    }

    public interface a {
        void a(Type type);
    }

    void a(a aVar);

    void e();

    void f();
}
