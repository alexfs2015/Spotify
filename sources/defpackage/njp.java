package defpackage;

import com.google.common.collect.Lists;
import com.spotify.music.R;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: njp reason: default package */
public final class njp implements Function<njs, hcs> {
    private final njn a;

    public njp(njn njn) {
        this.a = njn;
    }

    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList;
        njs njs = (njs) obj;
        vlc[] vlcArr = (vlc[]) njs.a().getItems();
        vkt[] vktArr = (vkt[]) njs.c().getItems();
        ArrayList a2 = Lists.a(20);
        int i = 0;
        int i2 = 0;
        while (true) {
            if ((i < vktArr.length || i2 < vlcArr.length) && a2.size() < 20) {
                if (i < vktArr.length && i2 < vlcArr.length) {
                    vlc vlc = vlcArr[i2];
                    vkt vkt = vktArr[i];
                    if (vlc.v() >= vkt.getAddTime()) {
                        a2.add(new njr(vlc));
                        i2++;
                    } else {
                        a2.add(new njr(vkt));
                        i++;
                    }
                } else if (i2 < vlcArr.length) {
                    while (i2 < vlcArr.length && a2.size() < 20) {
                        int i3 = i2 + 1;
                        a2.add(new njr(vlcArr[i2]));
                        i2 = i3;
                    }
                } else {
                    while (i < vktArr.length && a2.size() < 20) {
                        int i4 = i + 1;
                        a2.add(new njr(vktArr[i]));
                        i = i4;
                    }
                }
            }
        }
        vkv[] vkvArr = (vkv[]) njs.b().getItems();
        ArrayList arrayList2 = new ArrayList(4);
        String str = "";
        String str2 = "downloadedBadge";
        String str3 = "click";
        if (!a2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(a2.size());
            int i5 = 0;
            while (i5 < a2.size()) {
                njr njr = (njr) a2.get(i5);
                String str4 = "home-downloaded-music";
                String str5 = "home-downloaded-music-%d";
                if (!(!njr.a.b() && njr.b.b()) || !njr.b.b()) {
                    arrayList = a2;
                    if ((njr.a.b() && !njr.b.b()) && njr.a.b()) {
                        vlc vlc2 = (vlc) njr.a.c();
                        arrayList3.add(hcx.builder().a(String.format(Locale.US, str5, new Object[]{Integer.valueOf(i5)})).a(rqs.a).a(hcy.builder().b(fbo.b(vlc2.a())).a()).a(hcw.builder().a(hcz.builder().a(njn.a(vlc2.c())).b("playlist").a())).a(str3, gya.a(vlc2.getUri())).c(str2, Boolean.TRUE).d(nkh.a(str4, i5, str, vlc2.getUri())).a());
                    }
                } else {
                    vkt vkt2 = (vkt) njr.b.c();
                    String str6 = (String) fbm.a(vkt2.getCollectionUri(), vkt2.getUri());
                    arrayList = a2;
                    arrayList3.add(hcx.builder().a(String.format(Locale.US, str5, new Object[]{Integer.valueOf(i5)})).a(rqs.a).a(hcy.builder().b(fbo.b(vkt2.getName())).a()).a(hcw.builder().a(hcz.builder().a(njn.a(vkt2.getCovers())).b("album").a())).a(str3, gya.a(str6)).c(str2, Boolean.TRUE).d(nkh.a(str4, i5, str, str6)).a());
                }
                i5++;
                a2 = arrayList;
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(this.a.a((int) R.string.home_music_downloads));
                arrayList2.add(njn.a(true, arrayList3));
            }
        }
        if (vkvArr.length > 0) {
            ArrayList arrayList4 = new ArrayList(20);
            int min = Math.min(vkvArr.length, 20);
            for (int i6 = 0; i6 < min; i6++) {
                vkv vkv = vkvArr[i6];
                arrayList4.add(hcx.builder().a(String.format(Locale.US, "home-downloaded-episodes-%d", new Object[]{Integer.valueOf(i6)})).a("podcast:episodeImageCardSmall", "card").a(hcy.builder().a(fbo.b(vkv.a())).d(fbo.b(vkv.d())).a()).a(hcw.builder().a(hcz.builder().a(njn.a(vkv.b())).a())).a(str3, gya.a(vkv.getUri())).c(str2, Boolean.TRUE).d(nkh.a("home-downloaded-episodes", i6, str, vkv.getUri())).a());
            }
            if (!arrayList4.isEmpty()) {
                arrayList2.add(this.a.a((int) R.string.home_episode_downloads));
                arrayList2.add(njn.a(false, arrayList4));
            }
        }
        return hdb.builder().a((List<? extends hcm>) arrayList2).a();
    }
}
