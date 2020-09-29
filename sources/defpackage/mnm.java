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

/* renamed from: mnm reason: default package */
public final class mnm {
    private static final a a;
    private final Context b;
    private final vjp c;

    static {
        PlaylistMetadataDecorationPolicy a2 = PlaylistMetadataDecorationPolicy.builder().a(Boolean.TRUE).a();
        FolderMetadataDecorationPolicy a3 = FolderMetadataDecorationPolicy.builder().b(Boolean.TRUE).a();
        a = a.m().a(true).e(vkg.a(0, 0)).d(Optional.b(Boolean.TRUE)).a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a2).a(a3).a(RootlistRequestDecorationPolicy.builder().b(Boolean.TRUE).a()).a()).a())).a();
    }

    public mnm(Context context, vjp vjp) {
        this.b = context;
        this.c = vjp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(String str, vky vky) {
        if (!fbo.a(str)) {
            return str;
        }
        return this.b.getString(R.string.create_playlist_default_name, new Object[]{Integer.valueOf(vky.getUnrangedLength() + 1)});
    }

    public final Single<String> a(String str) {
        return this.c.a(Optional.e(), a).f(new $$Lambda$mnm$tgoYaIbOxXZ5Ks123HQ1WMThas(this, str));
    }
}
