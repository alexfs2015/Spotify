package defpackage;

import com.google.common.collect.Lists;
import com.spotify.music.R;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: nea reason: default package */
public final class nea implements Function<ned, gzz> {
    private final ndy a;

    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList;
        ned ned = (ned) obj;
        uyz[] uyzArr = (uyz[]) ned.a().getItems();
        uyq[] uyqArr = (uyq[]) ned.c().getItems();
        ArrayList a2 = Lists.a(20);
        int i = 0;
        int i2 = 0;
        while (true) {
            if ((i < uyqArr.length || i2 < uyzArr.length) && a2.size() < 20) {
                if (i < uyqArr.length && i2 < uyzArr.length) {
                    uyz uyz = uyzArr[i2];
                    uyq uyq = uyqArr[i];
                    if (uyz.v() >= uyq.getAddTime()) {
                        a2.add(new nec(uyz));
                        i2++;
                    } else {
                        a2.add(new nec(uyq));
                        i++;
                    }
                } else if (i2 < uyzArr.length) {
                    while (i2 < uyzArr.length && a2.size() < 20) {
                        int i3 = i2 + 1;
                        a2.add(new nec(uyzArr[i2]));
                        i2 = i3;
                    }
                } else {
                    while (i < uyqArr.length && a2.size() < 20) {
                        int i4 = i + 1;
                        a2.add(new nec(uyqArr[i]));
                        i = i4;
                    }
                }
            }
        }
        uys[] uysArr = (uys[]) ned.b().getItems();
        ArrayList arrayList2 = new ArrayList(4);
        String str = "";
        String str2 = "downloadedBadge";
        String str3 = "click";
        if (!a2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(a2.size());
            int i5 = 0;
            while (i5 < a2.size()) {
                nec nec = (nec) a2.get(i5);
                String str4 = "home-downloaded-music";
                String str5 = "home-downloaded-music-%d";
                if (!(!nec.a.b() && nec.b.b()) || !nec.b.b()) {
                    arrayList = a2;
                    if ((nec.a.b() && !nec.b.b()) && nec.a.b()) {
                        uyz uyz2 = (uyz) nec.a.c();
                        arrayList3.add(hae.builder().a(String.format(Locale.US, str5, new Object[]{Integer.valueOf(i5)})).a(rhq.a).a(haf.builder().b(fax.b(uyz2.a())).a()).a(had.builder().a(hag.builder().a(ndy.a(uyz2.c())).b("playlist").a())).a(str3, gvz.a(uyz2.getUri())).c(str2, Boolean.TRUE).d(nes.a(str4, i5, str, uyz2.getUri())).a());
                    }
                } else {
                    uyq uyq2 = (uyq) nec.b.c();
                    String str6 = (String) fav.a(uyq2.getCollectionUri(), uyq2.getUri());
                    arrayList = a2;
                    arrayList3.add(hae.builder().a(String.format(Locale.US, str5, new Object[]{Integer.valueOf(i5)})).a(rhq.a).a(haf.builder().b(fax.b(uyq2.getName())).a()).a(had.builder().a(hag.builder().a(ndy.a(uyq2.getCovers())).b("album").a())).a(str3, gvz.a(str6)).c(str2, Boolean.TRUE).d(nes.a(str4, i5, str, str6)).a());
                }
                i5++;
                a2 = arrayList;
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(this.a.a((int) R.string.home_music_downloads));
                arrayList2.add(ndy.a(true, arrayList3));
            }
        }
        if (uysArr.length > 0) {
            ArrayList arrayList4 = new ArrayList(20);
            int min = Math.min(uysArr.length, 20);
            for (int i6 = 0; i6 < min; i6++) {
                uys uys = uysArr[i6];
                arrayList4.add(hae.builder().a(String.format(Locale.US, "home-downloaded-episodes-%d", new Object[]{Integer.valueOf(i6)})).a("podcast:episodeImageCardSmall", "card").a(haf.builder().a(fax.b(uys.a())).d(fax.b(uys.d())).a()).a(had.builder().a(hag.builder().a(ndy.a(uys.b())).a())).a(str3, gvz.a(uys.getUri())).c(str2, Boolean.TRUE).d(nes.a("home-downloaded-episodes", i6, str, uys.getUri())).a());
            }
            if (!arrayList4.isEmpty()) {
                arrayList2.add(this.a.a((int) R.string.home_episode_downloads));
                arrayList2.add(ndy.a(false, arrayList4));
            }
        }
        return hai.builder().a((List<? extends gzt>) arrayList2).a();
    }

    public nea(ndy ndy) {
        this.a = ndy;
    }
}
