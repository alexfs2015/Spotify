package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: arr reason: default package */
public final class arr {
    public final AudioManager a;
    final b b;
    int c;
    public float d = 1.0f;
    private final a e;
    private AudioFocusRequest f;

    /* renamed from: arr$a */
    class a implements OnAudioFocusChangeListener {
        private a() {
        }

        /* synthetic */ a(arr arr, byte b) {
            this();
        }

        public final void onAudioFocusChange(int i) {
            if (i == -3) {
                arr.this.c = 3;
            } else if (i == -2) {
                arr.this.c = 2;
            } else if (i == -1) {
                arr.this.c = -1;
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder("Unknown focus change type: ");
                sb.append(i);
                bdu.c("AudioFocusManager", sb.toString());
                return;
            } else {
                arr.this.c = 1;
            }
            int i2 = arr.this.c;
            if (i2 == -1) {
                arr.this.b.b(-1);
                arr.this.b(true);
            } else if (i2 != 0) {
                if (i2 == 1) {
                    arr.this.b.b(1);
                } else if (i2 == 2) {
                    arr.this.b.b(0);
                } else if (i2 != 3) {
                    StringBuilder sb2 = new StringBuilder("Unknown audio focus state: ");
                    sb2.append(arr.this.c);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            float f = arr.this.c == 3 ? 0.2f : 1.0f;
            if (arr.this.d != f) {
                arr arr = arr.this;
                arr.d = f;
                arr.b.a();
            }
        }
    }

    /* renamed from: arr$b */
    public interface b {
        void a();

        void b(int i);
    }

    public arr(Context context, b bVar) {
        this.a = context == null ? null : (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.b = bVar;
        this.e = new a(this, 0);
        this.c = 0;
    }

    private void c() {
        ((AudioManager) bdl.a(this.a)).abandonAudioFocus(this.e);
    }

    private void d() {
        if (this.f != null) {
            ((AudioManager) bdl.a(this.a)).abandonAudioFocusRequest(this.f);
        }
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
            if (ben.a >= 26) {
                d();
            } else {
                c();
            }
            this.c = 0;
        }
    }
}
