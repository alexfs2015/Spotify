package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mqv reason: default package */
public final class mqv implements kko<mrj, gzz> {
    public final /* synthetic */ Object apply(Object obj) {
        return a((mrj) obj);
    }

    private static gzp a(String str, String str2) {
        return haa.builder().a(str2).a("id", str).a();
    }

    private static gzp a(String str, String str2, String str3, String str4) {
        return haa.builder().a(str2).a("id", str).a(str3, str4).a();
    }

    public static gzz a(mrj mrj) {
        ArrayList arrayList;
        fdh fdh;
        ArrayList arrayList2;
        ArrayList arrayList3;
        gzt gzt;
        ArrayList a = Lists.a();
        ImmutableList a2 = mrj.a();
        ArrayList a3 = Lists.a();
        fdh R_ = a2.R_();
        while (R_.hasNext()) {
            mrb mrb = (mrb) R_.next();
            String str = "image_url";
            if (mrb instanceof mrd) {
                mrd mrd = (mrd) mrb;
                String str2 = "click";
                String str3 = "entity_uri";
                String str4 = "artist_uri";
                String str5 = "singleArtistClick";
                String str6 = "subtitle";
                String str7 = "title";
                String str8 = "release_date";
                String str9 = "artist_image";
                String str10 = "artist_name";
                String str11 = "entityClick";
                if (!mrd.j().isEmpty()) {
                    fdh = R_;
                    if (mrd.j().size() > 1) {
                        String a4 = mrd.a();
                        arrayList = a;
                        String a5 = ((mqw) mrd.b().get(0)).a();
                        arrayList3 = a3;
                        ImmutableList b = mrd.b();
                        String str12 = str2;
                        String b2 = ((mqw) b.get(0)).b();
                        String c = ((mqw) b.get(0)).c();
                        String c2 = mrd.c();
                        String str13 = str11;
                        String str14 = str3;
                        gzq a6 = HubsImmutableComponentBundle.builder().a(str10, b2).a(str9, c).a(str8, c2).a(str7, mrd.e()).a(str6, mrd.f()).a(str, mrd.g()).a("tracks", (String[]) fbx.a((Iterable<E>) mrd.j()).a((Function<? super E, T>) $$Lambda$S0EY_UZ4k0lEdssKRdKOrOvwiRI.INSTANCE).a(String.class)).a();
                        gzp a7 = a(a4, str5, str4, a5);
                        String str15 = str13;
                        gzt = hae.builder().a("feed:expandableRelease", HubsComponentCategory.ROW.mId).e(a6).a(str12, a7).a(str15, a(a4, str15, str14, mrd.h())).a();
                        Object obj = gzt;
                        arrayList2 = arrayList3;
                        arrayList2.add(obj);
                    } else {
                        arrayList = a;
                    }
                } else {
                    arrayList = a;
                    fdh = R_;
                }
                arrayList3 = a3;
                String str16 = str3;
                ImmutableList b3 = mrd.b();
                String b4 = ((mqw) b3.get(0)).b();
                String c3 = ((mqw) b3.get(0)).c();
                String a8 = ((mqw) b3.get(0)).a();
                String c4 = mrd.c();
                String str17 = str2;
                String a9 = mrd.a();
                String str18 = str16;
                gzq a10 = HubsImmutableComponentBundle.builder().a(str10, b4).a(str9, c3).a(str8, c4).a(str7, mrd.e()).a(str6, mrd.f()).a(str, mrd.g()).a();
                gzp a11 = a(a9, str5, str4, a8);
                gzt = hae.builder().a("feed:releaseItem", HubsComponentCategory.ROW.mId).e(a10).a(str17, a11).a(str11, a(a9, str11, str18, mrd.h())).a();
                Object obj2 = gzt;
                arrayList2 = arrayList3;
                arrayList2.add(obj2);
            } else {
                arrayList = a;
                fdh = R_;
                arrayList2 = a3;
                if (mrb instanceof mrc) {
                    mrc mrc = (mrc) mrb;
                    String b5 = mrc.b();
                    ImmutableList c5 = mrc.c();
                    gzq[] gzqArr = new gzq[mrc.c().size()];
                    for (int i = 0; i < c5.size(); i++) {
                        mqw mqw = (mqw) c5.get(i);
                        String str19 = "display_name";
                        gzqArr[i] = HubsImmutableComponentBundle.builder().a("uri", mqw.a()).a(str19, mqw.b()).a(str, mqw.c()).a();
                    }
                    String a12 = mrc.a();
                    gzq a13 = HubsImmutableComponentBundle.builder().a("section_title", b5).a("artists", gzqArr).a();
                    String str20 = "artistClick";
                    gzp a14 = a(a12, str20);
                    String str21 = "followClick";
                    arrayList2.add(hae.builder().a("feed:followRecs", HubsComponentCategory.ROW.mId).e(a13).a(str20, a14).a(str21, a(a12, str21)).a());
                }
            }
            a3 = arrayList2;
            R_ = fdh;
            a = arrayList;
        }
        ArrayList arrayList4 = a;
        arrayList4.addAll(a3);
        return hai.builder().a("feed-hubs-model-id").b((List<? extends gzt>) arrayList4).a();
    }
}
