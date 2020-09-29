package defpackage;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.hubs.view.proto.View;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.util.Assertion;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: ndk reason: default package */
public final class ndk {
    private final ObjectMapper a;
    private final String b;
    private final boolean c;
    private final File d;

    public ndk(Context context, String str, rnf rnf, String str2, boolean z) {
        this.b = str2;
        this.c = z;
        this.d = new File(((Context) fay.a(context)).getFilesDir(), String.format(Locale.US, "%s/%s", new Object[]{"home", Integer.valueOf(str.hashCode())}));
        this.a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.ALWAYS).a();
    }

    public final void a(byte[] bArr) {
        try {
            FileChannel channel = new FileOutputStream(c()).getChannel();
            channel.lock();
            channel.write(ByteBuffer.wrap(bArr));
            channel.close();
        } catch (IOException e) {
            Assertion.a("Failed to cache home response", (Throwable) e);
        }
    }

    public final wud<gzz> a() {
        return wud.a((wun<Emitter<T>>) new $$Lambda$ndk$M2UcA2d6p6W0VH2qQaffy1N6shc<Emitter<T>>(this), BackpressureMode.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        gzz gzz;
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileInputStream(c()).getChannel();
            if (fileChannel.size() > 0) {
                ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                fileChannel.read(allocate);
                byte[] array = allocate.array();
                Logger.b("HomeLoad: Read from Home Cache %s bytes", Integer.valueOf(array.length));
                if (this.c) {
                    gzz = rss.a(View.a(array));
                } else {
                    gzz = (gzz) this.a.readValue(array, HubsJsonViewModel.class);
                }
                if (gzz != null) {
                    emitter.onNext(gzz);
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            emitter.onCompleted();
            wpf.a((Closeable) null);
            throw th;
        }
        emitter.onCompleted();
        wpf.a((Closeable) fileChannel);
    }

    private void b() {
        if (this.d.exists()) {
            if (!this.d.isDirectory() && !new File(this.d.getCanonicalPath()).isDirectory()) {
                throw new IOException();
            }
        } else if (!this.d.mkdirs()) {
            throw new IOException();
        }
    }

    private File c() {
        b();
        File file = new File(this.d, this.b);
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        throw new IOException();
    }
}
