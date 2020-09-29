package defpackage;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: nem reason: default package */
public final class nem {
    private final ObjectMapper a;
    private final File b;

    public nem(Context context, String str, rnf rnf) {
        this.b = new File(((Context) fay.a(context)).getFilesDir(), String.format(Locale.US, "%s/%s", new Object[]{"local_cache", Integer.valueOf(str.hashCode())}));
        this.a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.ALWAYS).a();
    }

    public final Maybe<RecentlyPlayedItems> a() {
        return Maybe.a((MaybeOnSubscribe<T>) new $$Lambda$nem$LbZ_VTIOWWl9b9x2b1iVoqrbZA<T>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MaybeEmitter maybeEmitter) {
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileInputStream(b()).getChannel();
            if (fileChannel.size() > 0) {
                ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                fileChannel.read(allocate);
                RecentlyPlayedItems recentlyPlayedItems = (RecentlyPlayedItems) this.a.readValue(allocate.array(), RecentlyPlayedItems.class);
                if (recentlyPlayedItems != null) {
                    maybeEmitter.a(recentlyPlayedItems);
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            maybeEmitter.c();
            wpf.a((Closeable) null);
            throw th;
        }
        maybeEmitter.c();
        wpf.a((Closeable) fileChannel);
    }

    private void c() {
        if (this.b.exists()) {
            if (!this.b.isDirectory() && !new File(this.b.getCanonicalPath()).isDirectory()) {
                StringBuilder sb = new StringBuilder("Existing cache folder is not a directory: ");
                sb.append(this.b.getCanonicalPath());
                throw new IOException(sb.toString());
            }
        } else if (!this.b.mkdirs()) {
            StringBuilder sb2 = new StringBuilder("Failed to create cache folder ");
            sb2.append(this.b.getCanonicalPath());
            throw new IOException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final File b() {
        c();
        File file = new File(this.b, "recently_played");
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        StringBuilder sb = new StringBuilder("Failed to create cache file: ");
        sb.append(file.getCanonicalPath());
        throw new IOException(sb.toString());
    }
}
