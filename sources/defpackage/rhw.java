package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadataFromTracks;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.io.IOException;

/* renamed from: rhw reason: default package */
public final class rhw {
    private final rhy a;
    private final String b;
    private final rhv c;
    private final rwi d;
    private SongsMetadataFromTracks e;
    private Observable<SongsMetadataFromTracks> f;

    public rhw(rhy rhy, rhv rhv, String str, rwl rwl) {
        this.a = rhy;
        this.c = rhv;
        this.b = str;
        this.d = new rwi(rwl) {
            public final rwj a(rwj rwj) {
                return rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SongsMetadataFromTracks songsMetadataFromTracks) {
        return Boolean.valueOf(songsMetadataFromTracks.length() > 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SongsMetadataFromTracks songsMetadataFromTracks) {
        this.e = songsMetadataFromTracks;
    }

    private SongsMetadataFromTracks c() {
        String a2 = this.c.a(this.b);
        if (fbo.a(a2)) {
            return SongsMetadataFromTracks.DEFAULT;
        }
        try {
            return (SongsMetadataFromTracks) this.d.a().readValue(a2, SongsMetadataFromTracks.class);
        } catch (IOException e2) {
            Assertion.a("Failed loading songs metadata!", (Throwable) e2);
            return SongsMetadataFromTracks.DEFAULT;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        SongsMetadataFromTracks songsMetadataFromTracks = this.e;
        if (songsMetadataFromTracks != null) {
            String str = null;
            try {
                str = this.d.a().writeValueAsString(songsMetadataFromTracks);
            } catch (JsonProcessingException e2) {
                Assertion.a("Failed to write songs metadata.", (Throwable) e2);
            }
            if (str != null) {
                this.c.a(this.b, str);
            }
        }
    }

    public final Observable<SongsMetadataFromTracks> a() {
        if (this.f == null) {
            this.f = this.a.a().a(Functions.a()).b((Consumer<? super T>) new $$Lambda$rhw$qtrEU9gYH_9kvGjLGYzUEvuzXM<Object>(this)).e(c()).a((Action) new $$Lambda$rhw$vrGVTG3q8mkK6ZlTzv2ejV9qLw(this)).e((Function<? super Throwable, ? extends T>) $$Lambda$rhw$AJ3yn4aJBxSzT1CPqMHQhivGYOw.INSTANCE).a(1).a();
        }
        return this.f;
    }

    public final Observable<Boolean> b() {
        return a().c((Function<? super T, ? extends R>) $$Lambda$rhw$Ch6Daf0U8fkDfSvXUp6mVVEuvg.INSTANCE);
    }
}
