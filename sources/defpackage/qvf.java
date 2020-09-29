package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.SongsMetadata;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.io.IOException;

/* renamed from: qvf reason: default package */
public final class qvf {
    private final ioo a;
    private final String b;
    private final jug c;
    private final qzg d;
    private final rnc e;
    private SongsMetadata f;
    private Observable<SongsMetadata> g;

    public qvf(ioo ioo, qze qze, String str, rnf rnf, jug jug) {
        this.a = ioo;
        this.b = str;
        this.c = jug;
        ioo ioo2 = this.a;
        Integer valueOf = Integer.valueOf(0);
        ioo2.a(valueOf, valueOf);
        this.d = new qzg() {
            public final String a(String str) {
                return (String) fay.a(qze.this.c.a(qze.this.b, str).a(qze.a, ""));
            }

            public final void a(String str, String str2) {
                qze.this.c.a(qze.this.b, str).a().a(qze.a, str2).b();
            }
        };
        this.e = new rnc(rnf) {
            public final rnd a(rnd rnd) {
                return rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
    }

    public final Observable<SongsMetadata> a() {
        if (this.g == null) {
            this.g = this.c.n.c((Function<? super T, ? extends R>) $$Lambda$LhE72knx7gatmEXGMzDHQxlsP2Y.INSTANCE).a(Functions.a()).h(new $$Lambda$qvf$K5RKVUrETaJA2AwBflxvBEvsm0(this)).c((Function<? super T, ? extends R>) $$Lambda$qvf$IR7ZIyJbhNf26lnMQhIru98LSto.INSTANCE).a(Functions.a()).b((Consumer<? super T>) new $$Lambda$qvf$MkSgLsEhpgAfxKApeTo8qMYYqiU<Object>(this)).e(c()).a((Action) new $$Lambda$qvf$hFUqN0YcGGaGaM_rXFluOjtEoE(this)).e((Function<? super Throwable, ? extends T>) $$Lambda$qvf$SM4AklY33vphCL8NA5aKTz9kcjY.INSTANCE).a(1).a();
        }
        return this.g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SongsMetadata songsMetadata) {
        this.f = songsMetadata;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        SongsMetadata songsMetadata = this.f;
        if (songsMetadata != null) {
            String str = null;
            try {
                str = this.e.a().writeValueAsString(songsMetadata);
            } catch (JsonProcessingException e2) {
                Assertion.a("Failed to write songs metadata.", (Throwable) e2);
            }
            if (str != null) {
                this.d.a(this.b, str);
            }
        }
    }

    /* access modifiers changed from: private */
    public Observable<iov> a(boolean z) {
        ioo ioo = this.a;
        ioo.g = !z;
        return ioo.b();
    }

    /* access modifiers changed from: private */
    public static SongsMetadata a(iov iov) {
        return SongsMetadata.builder().a(iov.isLoading()).a(iov.a()).a(iov.getUnrangedLength()).a();
    }

    private SongsMetadata c() {
        String a2 = this.d.a(this.b);
        if (fax.a(a2)) {
            return SongsMetadata.DEFAULT;
        }
        try {
            return (SongsMetadata) this.e.a().readValue(a2, SongsMetadata.class);
        } catch (IOException e2) {
            Assertion.a("Failed loading songs metadata!", (Throwable) e2);
            return SongsMetadata.DEFAULT;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(SongsMetadata songsMetadata) {
        return Boolean.valueOf(songsMetadata.length() > 0);
    }

    public final Observable<Boolean> b() {
        return a().c((Function<? super T, ? extends R>) $$Lambda$qvf$vpKSxU21t4Pi92nJGDWySWw10.INSTANCE);
    }
}
