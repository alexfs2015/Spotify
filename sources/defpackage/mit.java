package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Single;

/* renamed from: mit reason: default package */
public final class mit {
    private static final a a;
    private final Context b;
    private final uxn c;

    static {
        PlaylistMetadataDecorationPolicy a2 = PlaylistMetadataDecorationPolicy.builder().a(Boolean.TRUE).a();
        FolderMetadataDecorationPolicy a3 = FolderMetadataDecorationPolicy.builder().b(Boolean.TRUE).a();
        a = a.m().a(true).e(uyd.a(0, 0)).d(Optional.b(Boolean.TRUE)).a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a2).a(a3).a(RootlistRequestDecorationPolicy.builder().b(Boolean.TRUE).a()).a()).a())).a();
    }

    public mit(Context context, uxn uxn) {
        this.b = context;
        this.c = uxn;
    }

    public final Single<String> a(String str) {
        return this.c.a(Optional.e(), a).f(new $$Lambda$mit$ai0zCg66webIbfHLBru4GvA9NVA(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, uyv uyv) {
        if (!fax.a(str)) {
            return str;
        }
        return this.b.getString(R.string.create_playlist_default_name, new Object[]{Integer.valueOf(uyv.getUnrangedLength() + 1)});
    }
}
