package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.state.ContentTypeChangeListener;
import com.spotify.mobile.android.state.ContentTypeChangeListener.ContentType;

/* renamed from: jfw reason: default package */
public final class jfw extends jht implements ContentTypeChangeListener, jgg, jhm {
    AudioStream a = AudioStream.DEFAULT;
    ContentType b = ContentType.DEFAULT;
    private final jht c;
    private Boolean f;

    public final void c() {
    }

    public jfw(jht jht) {
        super("ActiveLocalPlayback");
        this.c = jht;
        this.c.a(new jhy() {
            public final void a() {
                jfw.this.e();
            }

            public final void b() {
                jfw.this.e();
            }
        });
    }

    public final void a() {
        this.f = Boolean.TRUE;
        e();
    }

    public final void b() {
        this.f = Boolean.FALSE;
        e();
    }

    public final void a(AudioStream audioStream) {
        this.a = audioStream;
        for (jhy jhy : this.d) {
            if (jhy instanceof jfx) {
                ((jfx) jhy).c();
            }
        }
    }

    public final void a(ContentType contentType) {
        this.b = contentType;
        for (jhy jhy : this.d) {
            if (jhy instanceof jfx) {
                ((jfx) jhy).d();
            }
        }
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
}
