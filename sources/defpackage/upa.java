package defpackage;

import com.spotify.music.sociallistening.model.HostSession;
import com.spotify.music.sociallistening.model.Session;
import io.reactivex.Single;

/* renamed from: upa reason: default package */
public interface upa {
    @xhw(a = "social-connect/v1/get_or_create_session")
    Single<Session> a();

    @xhx(a = "social-connect/v1/join/{joinSessionUrl}")
    Single<Session> a(@xia(a = "joinSessionUrl") String str);

    @xhn(a = "social-connect/v1/current_session")
    Single<Session> b();

    @xhj(a = "social-connect/v1/sessions/{sessionId}/me")
    Single<xgo<Void>> b(@xia(a = "sessionId") String str);

    @xhw(a = "social-connect/v1/sessions")
    Single<HostSession> c();

    @xhj(a = "social-connect/v1/sessions/{sessionId}")
    Single<xgo<Void>> c(@xia(a = "sessionId") String str);
}
