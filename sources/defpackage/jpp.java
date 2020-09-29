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

/* renamed from: jpp reason: default package */
public final class jpp {
    public static final jpo<vku> a = new $$Lambda$jpp$0ZdvuhEENMNklP0ympszhicazEw($$Lambda$esNWYfMMX6GSa4wy7BOvCnmk1E.INSTANCE);
    public static final jpo<vlf> b = new $$Lambda$jpp$0ZdvuhEENMNklP0ympszhicazEw($$Lambda$gTNgB8k_ELk0o7AA1RgI6lx6XZg.INSTANCE);
    public static final jpo<Show> c = new $$Lambda$jpp$0ZdvuhEENMNklP0ympszhicazEw($$Lambda$Mfica2DlrV14T3FHIFIC775rngY.INSTANCE);
    public static final jpo<vkv> d = new $$Lambda$jpp$9hCeWj0RjoZkxTHXFD433mVg2MU($$Lambda$qqmZbWXs8M7WA2QVEL7iXr6_VpI.INSTANCE);

    /* renamed from: jpp$a */
    interface a<T> {
        jwc<T> create(RxResolver rxResolver, xil xil, xil xil2);
    }

    static <T> jpo<T> a(a<T> aVar) {
        return new $$Lambda$jpp$0ZdvuhEENMNklP0ympszhicazEw(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jqo a(String str, jqo jqo, ho hoVar) {
        if (str == null) {
            return jqo.a(jqo, hoVar.a);
        }
        vlf vlf = (vlf) hoVar.b;
        if (vlf != null) {
            com.google.common.collect.ImmutableMap.a g = ImmutableMap.g();
            HashMap hashMap = new HashMap(jqo.e);
            g.b("audio_track_uri_in_collection", String.valueOf(vlf.inCollection()));
            List artists = vlf.getArtists();
            if (artists != null && !artists.isEmpty()) {
                g.b("audio_track_artist_name", ((vku) artists.get(0)).getName());
                g.b("audio_track_artist_uri", ((vku) artists.get(0)).getUri());
            }
            vkt album = vlf.getAlbum();
            if (album != null) {
                g.b("audio_track_album_name", album.getName());
                g.b("audio_track_album_uri", album.getUri());
            }
            g.a((Map<? extends K, ? extends V>) hashMap);
            jqo = jqo.a(jqo.b, jqo.c(), jqo.d(), jqo.c, false, (Map<String, String>) g.b());
        }
        return jqo.a(jqo, hoVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vkv a(String str, Map map) {
        return (vkv) map.get(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(String str, xii xii, vkv vkv) {
        return str == null ? ScalarSynchronousObservable.d(ho.a(vkv, null)) : xii.e((xiy<? super T, ? extends R>) new $$Lambda$jpp$sM_i0XjCW8b9Rxh9uEAoG9WH5i4<Object,Object>(vkv));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(a aVar, RxResolver rxResolver, jqo jqo) {
        String c2 = jqo.c();
        Map<String, String> map = jqo.e;
        String str = map == null ? null : (String) map.get(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        hhc hhc = (hhc) gih.a(hhc.class);
        return xim.a(aVar.create(rxResolver, wit.a(hhc.b()), wit.a(hhc.c())).a(jqo.c, c2).a(10, TimeUnit.SECONDS).c(new $$Lambda$jpp$A5WvIq879BQDvHDa63ZF8THs6w8(c2))).h(new $$Lambda$jpp$v990FrgXg4RwBKMyuIS03lEEL80(str, xim.a(new iph(rxResolver, wit.a(hhc.b()), wit.a(hhc.c())).a(jqo.c, str).a(10, TimeUnit.SECONDS).c(new $$Lambda$jpp$Ce0VvIwXNXQTRIGcvkPwcA9Ut6o(str))))).e((xiy<? super T, ? extends R>) new $$Lambda$jpp$cr9fb2mN__U5LsVL0dzfansS3uE<Object,Object>(str, jqo));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vlf b(String str, Map map) {
        return (vlf) map.get(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii b(a aVar, RxResolver rxResolver, jqo jqo) {
        String c2 = jqo.c();
        hhc hhc = (hhc) gih.a(hhc.class);
        return xim.a(aVar.create(rxResolver, wit.a(hhc.b()), wit.a(hhc.c())).a(jqo.c, c2).a(10, TimeUnit.SECONDS).c(new $$Lambda$jpp$0yK1KT8DbvO2lG7LDTt3CERHpNA(c2)).c(new $$Lambda$jpp$4RJekc0TcSY5PvID_2165W2gcqY(jqo)));
    }
}
