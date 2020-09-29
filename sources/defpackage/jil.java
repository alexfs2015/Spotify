package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.state.ContentTypeChangeListener;
import com.spotify.mobile.android.state.ContentTypeChangeListener.ContentType;

/* renamed from: jil reason: default package */
public final class jil extends jkj implements ContentTypeChangeListener, jiv, jkc {
    AudioStream a = AudioStream.DEFAULT;
    ContentType b = ContentType.DEFAULT;
    private final jkj c;
    private Boolean f;

    public jil(jkj jkj) {
        super("ActiveLocalPlayback");
        this.c = jkj;
        this.c.a(new jko() {
            public final void a() {
                jil.this.e();
            }

            public final void b() {
                jil.this.e();
            }
        });
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.c.e) {
            Boolean bool = this.f;
            if (bool != null && bool.booleanValue()) {
                ag_();
                return;
            }
        }
        ah_();
    }

    public final void a() {
        this.f = Boolean.TRUE;
        e();
    }

    public final void a(AudioStream audioStream) {
        this.a = audioStream;
        for (jko jko : this.d) {
            if (jko instanceof jim) {
                ((jim) jko).c();
            }
        }
    }

    public final void a(ContentType contentType) {
        this.b = contentType;
        for (jko jko : this.d) {
            if (jko instanceof jim) {
                ((jim) jko).d();
            }
        }
    }

    public final void b() {
        this.f = Boolean.FALSE;
        e();
    }

    public final void c() {
    }
}
