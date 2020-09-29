package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: rdn reason: default package */
public final class rdn extends rdq {
    private static final RootlistRequestPayload c;
    boolean a;
    private final vjp d;
    private final rgf e;
    private final jrn f;
    private final Optional<String> g;

    static {
        PlaylistUserDecorationPolicy a2 = PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a(Boolean.TRUE).b(Boolean.TRUE).a();
        PlaylistMetadataDecorationPolicy a3 = PlaylistMetadataDecorationPolicy.builder().b(Boolean.TRUE).e(Boolean.TRUE).d(Boolean.TRUE).a(a2).k(Boolean.TRUE).l(Boolean.TRUE).g(Boolean.TRUE).h(Boolean.TRUE).b(PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a(Boolean.TRUE).a()).i(Boolean.TRUE).j(Boolean.TRUE).c(Boolean.TRUE).a();
        c = RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a3).a(RootlistRequestDecorationPolicy.builder().b(Boolean.TRUE).a(Boolean.TRUE).c(Boolean.TRUE).a()).a()).a();
    }

    public rdn(String str, rbg rbg, vjp vjp, rgf rgf, jrn jrn) {
        super(rbg);
        this.g = Optional.c(str);
        this.d = vjp;
        this.e = rgf;
        this.f = jrn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(int i, rdb rdb, vky vky) {
        String str;
        String str2;
        rdn rdn = this;
        fqn d2 = rdn.f.d();
        a g2 = ImmutableList.g();
        vlc[] vlcArr = (vlc[]) vky.getItems();
        int length = vlcArr.length;
        char c2 = 0;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            vlc vlc = vlcArr[i3];
            if (vlc.f()) {
                vky r = vlc.r();
                if (r != null) {
                    rgf rgf = rdn.e;
                    int d3 = r.d();
                    int c3 = r.c();
                    if (d3 > 0 && c3 > 0) {
                        Resources resources = rgf.a.getResources();
                        Object[] objArr = new Object[1];
                        objArr[c2] = Integer.valueOf(d3);
                        String quantityString = resources.getQuantityString(R.plurals.your_library_music_pages_row_folder_subtitle, d3, objArr);
                        Resources resources2 = rgf.a.getResources();
                        Object[] objArr2 = new Object[1];
                        objArr2[c2] = Integer.valueOf(c3);
                        String quantityString2 = resources2.getQuantityString(R.plurals.your_library_music_pages_row_folder_folders_count_subtitle, c3, objArr2);
                        Context context = rgf.a;
                        Object[] objArr3 = new Object[2];
                        objArr3[c2] = quantityString;
                        objArr3[1] = quantityString2;
                        str2 = context.getString(R.string.your_library_music_pages_row_folder_combined_subtitle, objArr3);
                    } else if (c3 > 0) {
                        Resources resources3 = rgf.a.getResources();
                        Object[] objArr4 = new Object[1];
                        objArr4[c2] = Integer.valueOf(c3);
                        str2 = resources3.getQuantityString(R.plurals.your_library_music_pages_row_folder_folders_count_subtitle, c3, objArr4);
                    } else {
                        Resources resources4 = rgf.a.getResources();
                        Object[] objArr5 = new Object[1];
                        objArr5[c2] = Integer.valueOf(d3);
                        str2 = resources4.getQuantityString(R.plurals.your_library_music_pages_row_folder_subtitle, d3, objArr5);
                    }
                    String str3 = str2;
                    String b = r.b();
                    g2.c(MusicItem.a(rgf.c.a((CharSequence) b).c(), false, r.a(), str3, b, r.e(), i2));
                } else {
                    i4++;
                }
            } else {
                rgf rgf2 = rdn.e;
                long c4 = rgf2.c.a((CharSequence) vlc.getUri()).c();
                boolean h = vlc.h();
                String a2 = vlc.a();
                vlg w = vlc.w();
                String c5 = w != null ? w.c() : null;
                if (!fbo.a(c5)) {
                    Context context2 = rgf2.a;
                    Object[] objArr6 = new Object[1];
                    objArr6[c2] = c5;
                    str = context2.getString(R.string.personalized_sets_subtitle_made_for, objArr6);
                } else {
                    vlg d4 = vlc.d();
                    if (d4 == null) {
                        str = "";
                    } else {
                        Context context3 = rgf2.a;
                        Object[] objArr7 = new Object[1];
                        objArr7[c2] = d4.c();
                        str = context3.getString(R.string.your_library_music_pages_row_playlist_subtitle, objArr7);
                    }
                }
                g2.c(MusicItem.a(c4, h, false, a2, str, vlc.getUri(), vlc.getTargetUri(), vlc.getImageUri(Size.NORMAL), vlc.v(), i2, jus.c(d2) || ((Boolean) vlc.n().a(Boolean.FALSE)).booleanValue(), vlc.s()));
            }
            i2++;
            i3++;
            c2 = 0;
            rdn = this;
        }
        return rdd.a(vky.isLoading(), vky.getUnrangedLength() - i4, i, g2.a(), rdb, MusicItem.p);
    }

    /* access modifiers changed from: protected */
    public final Observable<rdc> a(rdb rdb) {
        int a2 = rdb.a();
        String b = rdb.c().b();
        C0084a c2 = a.m().e(vkg.a(a2, this.b.e)).a(b).a(!fbo.a(b)).c((this.a || ((Boolean) fbm.a(rdb.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue()) ? Optional.b(Boolean.TRUE) : Optional.e());
        way c3 = rdb.c().c();
        Optional optional = rdb.g() ? Optional.b(way.e().a(vkc.f.a()).a(true).a(c3).a()) : c3 != null ? Optional.b(c3) : Optional.e();
        return this.d.b(this.g, c2.b(optional).a(Optional.b(c)).a()).c((Function<? super T, ? extends R>) new $$Lambda$rdn$Bz8qsvI71pRvrXQ0n3OpCLzK4<Object,Object>(this, a2, rdb));
    }
}
