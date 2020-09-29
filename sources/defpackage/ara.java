package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: ara reason: default package */
public final class ara {
    public final AudioManager a;
    final b b;
    int c;
    public float d = 1.0f;
    private final a e;
    private AudioFocusRequest f;

    /* renamed from: ara$a */
    class a implements OnAudioFocusChangeListener {
        private a() {
        }

        /* synthetic */ a(ara ara, byte b) {
            this();
        }

        public final void onAudioFocusChange(int i) {
            if (i == -3) {
                ara.this.c = 3;
            } else if (i == -2) {
                ara.this.c = 2;
            } else if (i == -1) {
                ara.this.c = -1;
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder("Unknown focus change type: ");
                sb.append(i);
                bdd.c("AudioFocusManager", sb.toString());
                return;
            } else {
                ara.this.c = 1;
            }
            int i2 = ara.this.c;
            if (i2 == -1) {
                ara.this.b.b(-1);
                ara.this.b(true);
            } else if (i2 != 0) {
                if (i2 == 1) {
                    ara.this.b.b(1);
                } else if (i2 == 2) {
                    ara.this.b.b(0);
                } else if (i2 != 3) {
                    StringBuilder sb2 = new StringBuilder("Unknown audio focus state: ");
                    sb2.append(ara.this.c);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            float f = ara.this.c == 3 ? 0.2f : 1.0f;
            if (ara.this.d != f) {
                ara ara = ara.this;
                ara.d = f;
                ara.b.a();
            }
        }
    }

    /* renamed from: ara$b */
    public interface b {
        void a();

        void b(int i);
    }

    public ara(Context context, b bVar) {
        this.a = context == null ? null : (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.b = bVar;
        this.e = new a(this, 0);
        this.c = 0;
    }

    public final int a(boolean z) {
        if (this.a == null) {
            return 1;
        }
        if (z) {
            return b();
        }
        return -1;
    }

    public final void a() {
        if (this.a != null) {
            b(true);
        }
    }

    public int b() {
        if (this.c != 0) {
            b(true);
        }
        return 1;
    }

    public void b(boolean z) {
        if (this.c != 0) {
            if (bdw.a >= 26) {
                d();
            } else {
                c();
            }
            this.c = 0;
        }
    }

    private void c() {
        ((AudioManager) bcu.a(this.a)).abandonAudioFocus(this.e);
    }

    private void d() {
        if (this.f != null) {
            ((AudioManager) bcu.a(this.a)).abandonAudioFocusRequest(this.f);
        }
    }
}
