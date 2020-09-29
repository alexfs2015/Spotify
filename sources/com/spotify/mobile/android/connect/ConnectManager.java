package com.spotify.mobile.android.connect;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.connect.model.ConnectDevice;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.Observable;
import java.util.List;

public interface ConnectManager extends gtr {

    public enum ConnectManagerState {
        NOT_STARTED,
        STARTED,
        STOPPED
    }

    public enum ConnectState {
        UNKNOWN,
        NORMAL,
        DETECTED,
        ACTIVE,
        CONNECTING
    }

    public interface a {
        SpotifyIcon a(ConnectDevice connectDevice);
    }

    public interface b {
        void a();

        void b();

        void c();
    }

    public interface c {
        boolean a(float f);

        boolean d();

        boolean e();

        float f();

        boolean g();
    }

    public interface d {
        void a(float f);
    }

    GaiaDevice a(String str);

    @Deprecated
    void a(a aVar);

    void a(b bVar);

    void a(c cVar);

    void a(d dVar);

    void b(b bVar);

    void b(d dVar);

    void b(String str);

    void c(String str);

    Optional<String> d();

    void d(String str);

    Observable<List<GaiaDevice>> e();

    void e(String str);

    Observable<ConnectState> f();

    Observable<GaiaDevice> g();

    Observable<Optional<GaiaDevice>> h();

    Observable<Float> i();

    Observable<ConnectManagerState> j();

    void k();

    void l();

    List<vvj> m();

    List<vvj> n();

    boolean o();

    @Deprecated
    ConnectState p();

    @Deprecated
    ConnectDevice q();

    void r();

    void s();

    void t();

    boolean u();

    boolean v();
}
