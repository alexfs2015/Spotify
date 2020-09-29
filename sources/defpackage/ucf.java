package defpackage;

import com.spotify.music.sociallistening.model.HostSession;
import com.spotify.music.sociallistening.model.Session;
import io.reactivex.Single;

/* renamed from: ucf reason: default package */
public interface ucf {
    @wtr(a = "social-connect/v1/get_or_create_session")
    Single<Session> a();

    @wts(a = "social-connect/v1/join/{joinSessionUrl}")
    Single<Session> a(@wtv(a = "joinSessionUrl") String str);

    @wti(a = "social-connect/v1/current_session")
    Single<Session> b();

    @wte(a = "social-connect/v1/sessions/{sessionId}/me")
    Single<wsj<Void>> b(@wtv(a = "sessionId") String str);

    @wtr(a = "social-connect/v1/sessions")
    Single<HostSession> c();

    @wte(a = "social-connect/v1/sessions/{sessionId}")
    Single<wsj<Void>> c(@wtv(a = "sessionId") String str);
}
