package defpackage;

import android.os.Bundle;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qny reason: default package */
public abstract class qny {
    public static qny a(String str, MediaType mediaType, Bundle bundle) {
        return new qnp(str, bundle, mediaType, false);
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public abstract Bundle b();

    /* access modifiers changed from: 0000 */
    public abstract MediaType c();

    /* access modifiers changed from: 0000 */
    public abstract boolean d();
}
