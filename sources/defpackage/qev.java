package defpackage;

import android.os.Bundle;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qev reason: default package */
public abstract class qev {
    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public abstract Bundle b();

    /* access modifiers changed from: 0000 */
    public abstract MediaType c();

    /* access modifiers changed from: 0000 */
    public abstract boolean d();

    public static qev a(String str, MediaType mediaType, Bundle bundle) {
        return new qem(str, bundle, mediaType, false);
    }
}
