package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.playlist.models.Show;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: jnd reason: default package */
public final class jnd {
    public static final jnc<uyr> a = new $$Lambda$jnd$tKCBFrh72c78bAVhsofVzSJbMF0($$Lambda$y5t8FzWLtf0wSYqVS_ullZmhD4.INSTANCE);
    public static final jnc<uzc> b = new $$Lambda$jnd$tKCBFrh72c78bAVhsofVzSJbMF0($$Lambda$fODMj3W6E_DTpKE8EWqIsXfJ4.INSTANCE);
    public static final jnc<Show> c = new $$Lambda$jnd$tKCBFrh72c78bAVhsofVzSJbMF0($$Lambda$pi6shRG9vQzWmYuSVXfIUqQsumo.INSTANCE);
    public static final jnc<uys> d = new $$Lambda$jnd$aNjFbBAZrJwv0t8EHnWxtHFeIsQ($$Lambda$3pFd0M51GR6cnOxljyqxjcfdaE.INSTANCE);

    /* renamed from: jnd$a */
    interface a<T> {
        jtu<T> create(RxResolver rxResolver, wug wug, wug wug2);
    }

    static <T> jnc<T> a(a<T> aVar) {
        return new $$Lambda$jnd$tKCBFrh72c78bAVhsofVzSJbMF0(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud b(a aVar, RxResolver rxResolver, joc joc) {
        String c2 = joc.c();
        heg heg = (heg) ggw.a(heg.class);
        return wuh.a(aVar.create(rxResolver, vun.a(heg.b()), vun.a(heg.c())).a(joc.c, c2).a(10, TimeUnit.SECONDS).c(new $$Lambda$jnd$UGriym27BpnqD65t8Tu1xc5W_0w(c2)).c(new $$Lambda$jnd$EqxmEmjqUpkDE9E2JMzbfDjyIA(joc)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(a aVar, RxResolver rxResolver, joc joc) {
        String c2 = joc.c();
        Map<String, String> map = joc.e;
        String str = map == null ? null : (String) map.get(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        heg heg = (heg) ggw.a(heg.class);
        return wuh.a(aVar.create(rxResolver, vun.a(heg.b()), vun.a(heg.c())).a(joc.c, c2).a(10, TimeUnit.SECONDS).c(new $$Lambda$jnd$okU7v9ajikNyUparQt7Jz3Pg9vw(c2))).i(new $$Lambda$jnd$PJS9e1DUmirhWUAaFzSaSezTg5c(str, wuh.a(new imu(rxResolver, vun.a(heg.b()), vun.a(heg.c())).a(joc.c, str).a(10, TimeUnit.SECONDS).c(new $$Lambda$jnd$A26mgJJLt8n2DpplddxpwANp4io(str))))).f(new $$Lambda$jnd$piZsWEiTQ_J11TsOHBcxKwZyZKE(str, joc));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ uzc b(String str, Map map) {
        return (uzc) map.get(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ uys a(String str, Map map) {
        return (uys) map.get(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(String str, wud wud, uys uys) {
        if (str == null) {
            return ScalarSynchronousObservable.d(ho.a(uys, null));
        }
        return wud.f(new $$Lambda$jnd$lcZzzOnK9677Q7k93Lh5vfuTbo(uys));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ joc a(String str, joc joc, ho hoVar) {
        if (str == null) {
            return joc.a(joc, hoVar.a);
        }
        uzc uzc = (uzc) hoVar.b;
        if (uzc != null) {
            com.google.common.collect.ImmutableMap.a g = ImmutableMap.g();
            HashMap hashMap = new HashMap(joc.e);
            g.b("audio_track_uri_in_collection", String.valueOf(uzc.inCollection()));
            List artists = uzc.getArtists();
            if (artists != null && !artists.isEmpty()) {
                g.b("audio_track_artist_name", ((uyr) artists.get(0)).getName());
                g.b("audio_track_artist_uri", ((uyr) artists.get(0)).getUri());
            }
            uyq album = uzc.getAlbum();
            if (album != null) {
                g.b("audio_track_album_name", album.getName());
                g.b("audio_track_album_uri", album.getUri());
            }
            g.a((Map<? extends K, ? extends V>) hashMap);
            joc = joc.a(joc.b, joc.c(), joc.d(), joc.c, false, (Map<String, String>) g.b());
        }
        return joc.a(joc, hoVar.a);
    }
}
