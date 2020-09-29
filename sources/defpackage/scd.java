package defpackage;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.hubslocalcache.HubsCachedFeature;
import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: scd reason: default package */
final class scd implements scc {
    private final ObjectMapper a;
    private final File b;
    private final HubsCachedFeature c;

    public scd(Context context, String str, rwl rwl, HubsCachedFeature hubsCachedFeature) {
        this.c = hubsCachedFeature;
        this.b = new File(((Context) fbp.a(context)).getFilesDir(), String.format(Locale.US, "%s/%s", new Object[]{"local_cache", Integer.valueOf(str.hashCode())}));
        this.a = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.ALWAYS).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(MaybeEmitter maybeEmitter) {
        try {
            FileChannel channel = new FileInputStream(c()).getChannel();
            if (channel.size() > 0) {
                ByteBuffer allocate = ByteBuffer.allocate((int) channel.size());
                channel.read(allocate);
                channel.close();
                HubsJsonViewModel hubsJsonViewModel = (HubsJsonViewModel) this.a.readValue(allocate.array(), HubsJsonViewModel.class);
                if (hubsJsonViewModel != null) {
                    maybeEmitter.a(hubsJsonViewModel);
                } else {
                    Assertion.c("View model could not be parsed");
                    maybeEmitter.c();
                }
            } else {
                maybeEmitter.c();
            }
        } catch (ClosedByInterruptException unused) {
            maybeEmitter.c();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Failed to read from cache file for ");
            sb.append(this.c);
            Assertion.a(sb.toString(), (Throwable) e);
            maybeEmitter.c();
        }
    }

    private void b() {
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

    private File c() {
        b();
        File file = new File(this.b, this.c.mCacheIdentifier);
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        StringBuilder sb = new StringBuilder("Failed to create cache file: ");
        sb.append(file.getCanonicalPath());
        throw new IOException(sb.toString());
    }

    public final Maybe<hcs> a() {
        Maybe a2 = Maybe.a((MaybeOnSubscribe<T>) new $$Lambda$scd$IWP0D4YF8sI4ku0k3ElXcX02fE<T>(this));
        Class<hcs> cls = hcs.class;
        ObjectHelper.a(cls, "clazz is null");
        return a2.a(Functions.a(cls));
    }

    public final void a(byte[] bArr) {
        try {
            FileChannel channel = new FileOutputStream(c()).getChannel();
            channel.lock();
            channel.write(ByteBuffer.wrap(bArr));
            channel.close();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Failed to cache response for ");
            sb.append(this.c);
            Assertion.a(sb.toString(), (Throwable) e);
        }
    }
}
