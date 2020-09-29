package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Build.VERSION;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.state.ContentTypeChangeListener.ContentType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hgi reason: default package */
public final class hgi {
    public final Context a;
    public final List<b> b = new CopyOnWriteArrayList();
    public ComponentName c;
    public final AudioManager d;
    final Handler e;
    final a f;
    public final boolean g;
    private final Runnable h = new Runnable() {
        public final void run() {
            int i;
            if (VERSION.SDK_INT >= 26) {
                AudioFocusRequest build = new Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(hgi.this.f.a.getUsage()).setContentType(hgi.this.f.b == ContentType.SPEECH ? 1 : 2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(hgi.this.f.c).setWillPauseWhenDucked(hgi.a(hgi.this)).build();
                hgi.this.f.d = build;
                i = hgi.this.d.requestAudioFocus(build);
            } else {
                i = hgi.this.d.requestAudioFocus(hgi.this.f.c, hgi.this.f.a.getStreamType(), 1);
            }
            boolean z = i == 1;
            Logger.d("Request audio focus result: HasAudioFocus = %b for AudioStreamType %s", Boolean.valueOf(z), hgi.this.f.a);
            hgi.this.f.e = z;
            if (z) {
                for (b c : hgi.this.b) {
                    c.c();
                }
                return;
            }
            if (i == 0) {
                hgi.this.e.postDelayed(this, 5000);
            }
        }
    };
    private final OnAudioFocusChangeListener i = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
            if (i == -3) {
                hgi.this.f.e = false;
                boolean z = !hgi.a(hgi.this);
                for (b a2 : hgi.this.b) {
                    a2.a(true, z);
                }
            } else if (i == -2) {
                hgi.this.f.e = false;
                for (b a3 : hgi.this.b) {
                    a3.a(true, false);
                }
            } else if (i == -1) {
                hgi.this.f.e = false;
                for (b a4 : hgi.this.b) {
                    a4.a(false, false);
                }
            } else if (i == 1) {
                hgi.this.f.e = true;
                for (b c : hgi.this.b) {
                    c.c();
                }
            }
            Logger.d("Audio focus change: %d, HasAudioFocus = %b for AudioStreamType %s", Integer.valueOf(i), Boolean.valueOf(hgi.this.a()), hgi.this.f.a);
        }
    };

    /* renamed from: hgi$a */
    static final class a {
        AudioStream a;
        ContentType b = ContentType.DEFAULT;
        final OnAudioFocusChangeListener c;
        AudioFocusRequest d;
        boolean e;

        public a(AudioStream audioStream, OnAudioFocusChangeListener onAudioFocusChangeListener) {
            this.a = audioStream;
            this.c = onAudioFocusChangeListener;
        }
    }

    /* renamed from: hgi$b */
    public interface b {
        void a();

        void a(boolean z, boolean z2);

        void b();

        void c();
    }

    public hgi(Context context) {
        fay.a(context);
        jrh.b("Not called on main looper");
        this.a = context;
        this.d = (AudioManager) context.getSystemService("audio");
        this.e = new Handler();
        this.f = new a(AudioStream.DEFAULT, this.i);
        this.g = VERSION.SDK_INT < 21;
    }

    public final void a(b bVar) {
        fay.a(bVar);
        this.b.add(bVar);
    }

    public final boolean a() {
        return this.f.e;
    }

    private boolean b(AudioStream audioStream, ContentType contentType) {
        a aVar = this.f;
        return aVar.a == audioStream && aVar.e && aVar.b == contentType;
    }

    public final void a(AudioStream audioStream, ContentType contentType) {
        Logger.d("Request audio focus: HasAudioFocus = %b for AudioStreamType %s", Boolean.valueOf(b(audioStream, contentType)), audioStream);
        if (!b(audioStream, contentType)) {
            if (!(this.f.a == audioStream && this.f.b == contentType)) {
                b();
                a aVar = this.f;
                aVar.a = audioStream;
                aVar.b = contentType;
            }
            this.e.removeCallbacks(this.h);
            this.e.post(this.h);
        }
    }

    public void b() {
        Logger.d("Abandon audio focus: HasAudioFocus = %b for AudioStreamType %s", Boolean.valueOf(a()), this.f.a);
        this.e.removeCallbacks(this.h);
        this.f.e = false;
        if (VERSION.SDK_INT < 26 || this.f.d == null) {
            this.d.abandonAudioFocus(this.f.c);
        } else {
            this.d.abandonAudioFocusRequest(this.f.d);
        }
    }

    static /* synthetic */ boolean a(hgi hgi) {
        return hgi.f.b == ContentType.SPEECH;
    }
}
