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

/* renamed from: quy reason: default package */
public final class quy extends qvb {
    private static final RootlistRequestPayload c;
    boolean a;
    private final uxn d;
    private final qxq e;
    private final jpb f;
    private final Optional<String> g;

    static {
        PlaylistUserDecorationPolicy a2 = PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a(Boolean.TRUE).b(Boolean.TRUE).a();
        PlaylistMetadataDecorationPolicy a3 = PlaylistMetadataDecorationPolicy.builder().b(Boolean.TRUE).e(Boolean.TRUE).d(Boolean.TRUE).a(a2).k(Boolean.TRUE).l(Boolean.TRUE).g(Boolean.TRUE).h(Boolean.TRUE).b(PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a(Boolean.TRUE).a()).i(Boolean.TRUE).j(Boolean.TRUE).c(Boolean.TRUE).a();
        c = RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a3).a(RootlistRequestDecorationPolicy.builder().b(Boolean.TRUE).a(Boolean.TRUE).c(Boolean.TRUE).a()).a()).a();
    }

    public quy(String str, qsr qsr, uxn uxn, qxq qxq, jpb jpb) {
        super(qsr);
        this.g = Optional.c(str);
        this.d = uxn;
        this.e = qxq;
        this.f = jpb;
    }

    /* access modifiers changed from: protected */
    public final Observable<qun> a(qum qum) {
        Optional optional;
        Optional optional2;
        int a2 = qum.a();
        String b = qum.c().b();
        boolean booleanValue = ((Boolean) fav.a(qum.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue();
        C0082a a3 = a.m().e(uyd.a(a2, this.b.c)).a(b).a(!fax.a(b));
        if (this.a || booleanValue) {
            optional = Optional.b(Boolean.TRUE);
        } else {
            optional = Optional.e();
        }
        C0082a c2 = a3.c(optional);
        vns c3 = qum.c().c();
        if (qum.g()) {
            optional2 = Optional.b(vns.e().a(uya.f.a()).a(true).a(c3).a());
        } else if (c3 != null) {
            optional2 = Optional.b(c3);
        } else {
            optional2 = Optional.e();
        }
        return this.d.b(this.g, c2.b(optional2).a(Optional.b(c)).a()).c((Function<? super T, ? extends R>) new $$Lambda$quy$ZdN_zp89dH6LBtEXCLdBJnf12s<Object,Object>(this, a2, qum));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(int i, qum qum, uyv uyv) {
        String str;
        String str2;
        String str3;
        quy quy = this;
        fpt b = quy.f.b();
        a g2 = ImmutableList.g();
        uyz[] uyzArr = (uyz[]) uyv.getItems();
        int length = uyzArr.length;
        char c2 = 0;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            uyz uyz = uyzArr[i3];
            if (uyz.f()) {
                uyv r = uyz.r();
                if (r != null) {
                    qxq qxq = quy.e;
                    int d2 = r.d();
                    int c3 = r.c();
                    if (d2 > 0 && c3 > 0) {
                        Resources resources = qxq.a.getResources();
                        Object[] objArr = new Object[1];
                        objArr[c2] = Integer.valueOf(d2);
                        String quantityString = resources.getQuantityString(R.plurals.your_library_music_pages_row_folder_subtitle, d2, objArr);
                        Resources resources2 = qxq.a.getResources();
                        Object[] objArr2 = new Object[1];
                        objArr2[c2] = Integer.valueOf(c3);
                        String quantityString2 = resources2.getQuantityString(R.plurals.your_library_music_pages_row_folder_folders_count_subtitle, c3, objArr2);
                        Context context = qxq.a;
                        Object[] objArr3 = new Object[2];
                        objArr3[c2] = quantityString;
                        objArr3[1] = quantityString2;
                        str3 = context.getString(R.string.your_library_music_pages_row_folder_combined_subtitle, objArr3);
                    } else if (c3 > 0) {
                        Resources resources3 = qxq.a.getResources();
                        Object[] objArr4 = new Object[1];
                        objArr4[c2] = Integer.valueOf(c3);
                        str3 = resources3.getQuantityString(R.plurals.your_library_music_pages_row_folder_folders_count_subtitle, c3, objArr4);
                    } else {
                        Resources resources4 = qxq.a.getResources();
                        Object[] objArr5 = new Object[1];
                        objArr5[c2] = Integer.valueOf(d2);
                        str3 = resources4.getQuantityString(R.plurals.your_library_music_pages_row_folder_subtitle, d2, objArr5);
                    }
                    String str4 = str3;
                    String b2 = r.b();
                    g2.c(MusicItem.a(qxq.c.a((CharSequence) b2).c(), false, r.a(), str4, b2, r.e(), i2));
                } else {
                    i4++;
                }
            } else {
                qxq qxq2 = quy.e;
                long c4 = qxq2.c.a((CharSequence) uyz.getUri()).c();
                boolean h = uyz.h();
                String a2 = uyz.a();
                uzd w = uyz.w();
                if (w != null) {
                    str = w.c();
                } else {
                    str = null;
                }
                if (!fax.a(str)) {
                    Context context2 = qxq2.a;
                    Object[] objArr6 = new Object[1];
                    objArr6[c2] = str;
                    str2 = context2.getString(R.string.personalized_sets_subtitle_made_for, objArr6);
                } else {
                    uzd d3 = uyz.d();
                    if (d3 == null) {
                        str2 = "";
                    } else {
                        Context context3 = qxq2.a;
                        Object[] objArr7 = new Object[1];
                        objArr7[c2] = d3.c();
                        str2 = context3.getString(R.string.your_library_music_pages_row_playlist_subtitle, objArr7);
                    }
                }
                g2.c(MusicItem.a(c4, h, false, a2, str2, uyz.getUri(), uyz.getTargetUri(), uyz.getImageUri(Size.NORMAL), uyz.v(), i2, jsl.c(b) || ((Boolean) uyz.n().a(Boolean.FALSE)).booleanValue(), uyz.s()));
            }
            i2++;
            i3++;
            c2 = 0;
            quy = this;
        }
        return quo.a(uyv.isLoading(), uyv.getUnrangedLength() - i4, i, g2.a(), qum, MusicItem.p);
    }
}
