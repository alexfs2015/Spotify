package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mvj reason: default package */
public final class mvj implements knx<mvz, hcs> {
    private static hci a(String str, String str2) {
        return hct.builder().a(str2).a("id", str).a();
    }

    private static hci a(String str, String str2, String str3, String str4) {
        return hct.builder().a(str2).a("id", str).a(str3, str4).a();
    }

    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList;
        fdz fdz;
        ArrayList arrayList2;
        ArrayList arrayList3;
        hcm hcm;
        mvz mvz = (mvz) obj;
        ArrayList a = Lists.a();
        ImmutableList a2 = mvz.a();
        ArrayList a3 = Lists.a();
        fdz R_ = a2.R_();
        while (R_.hasNext()) {
            mvr mvr = (mvr) R_.next();
            String str = "image_url";
            String str2 = "";
            if (mvr instanceof mvt) {
                mvt mvt = (mvt) mvr;
                String str3 = "click";
                String str4 = "entity_uri";
                String str5 = "artist_uri";
                String str6 = "singleArtistClick";
                String str7 = "subtitle";
                String str8 = "title";
                String str9 = "release_date";
                String str10 = "artist_image";
                String str11 = "artist_name";
                fdz = R_;
                String str12 = "entityClick";
                if (!mvt.j().isEmpty()) {
                    arrayList = a;
                    if (mvt.j().size() > 1) {
                        String a4 = mvt.a();
                        arrayList3 = a3;
                        String a5 = ((mvm) mvt.b().get(0)).a();
                        String str13 = str3;
                        ImmutableList b = mvt.b();
                        String str14 = str12;
                        String b2 = ((mvm) b.get(0)).b();
                        String str15 = (String) ((mvm) b.get(0)).c().a(str2);
                        String str16 = str4;
                        String[] strArr = (String[]) fcp.a((Iterable<E>) mvt.j()).a((Function<? super E, T>) $$Lambda$Edkt7yjIJSsqVxrUHFerTBUgNv8.INSTANCE).a(String.class);
                        hcj a6 = HubsImmutableComponentBundle.builder().a(str11, b2).a(str10, str15).a(str9, mvt.c()).a(str8, mvt.e()).a(str7, mvt.f()).a(str, mvt.g()).a("tracks", strArr).a();
                        hci a7 = a(a4, str6, str5, a5);
                        String str17 = str14;
                        hcm = hcx.builder().a("feed:expandableRelease", HubsComponentCategory.ROW.mId).e(a6).a(str13, a7).a(str17, a(a4, str17, str16, mvt.h())).a();
                        Object obj2 = hcm;
                        arrayList2 = arrayList3;
                        arrayList2.add(obj2);
                    }
                } else {
                    arrayList = a;
                }
                arrayList3 = a3;
                String str18 = str4;
                String str19 = str3;
                String str20 = str12;
                ImmutableList b3 = mvt.b();
                String b4 = ((mvm) b3.get(0)).b();
                String str21 = (String) ((mvm) b3.get(0)).c().a(str2);
                String a8 = ((mvm) b3.get(0)).a();
                String c = mvt.c();
                String str22 = str19;
                String a9 = mvt.a();
                String str23 = str18;
                hcj a10 = HubsImmutableComponentBundle.builder().a(str11, b4).a(str10, str21).a(str9, c).a(str8, mvt.e()).a(str7, mvt.f()).a(str, mvt.g()).a();
                hci a11 = a(a9, str6, str5, a8);
                hcm = hcx.builder().a("feed:releaseItem", HubsComponentCategory.ROW.mId).e(a10).a(str22, a11).a(str20, a(a9, str20, str23, mvt.h())).a();
                Object obj22 = hcm;
                arrayList2 = arrayList3;
                arrayList2.add(obj22);
            } else {
                fdz = R_;
                arrayList = a;
                arrayList2 = a3;
                if (mvr instanceof mvs) {
                    mvs mvs = (mvs) mvr;
                    String b5 = mvs.b();
                    ImmutableList c2 = mvs.c();
                    hcj[] hcjArr = new hcj[mvs.c().size()];
                    for (int i = 0; i < c2.size(); i++) {
                        mvm mvm = (mvm) c2.get(i);
                        String str24 = "display_name";
                        hcjArr[i] = HubsImmutableComponentBundle.builder().a("uri", mvm.a()).a(str24, mvm.b()).a(str, (String) mvm.c().a(str2)).a();
                    }
                    String a12 = mvs.a();
                    hcj a13 = HubsImmutableComponentBundle.builder().a("section_title", b5).a("artists", hcjArr).a();
                    String str25 = "artistClick";
                    hci a14 = a(a12, str25);
                    arrayList2.add(hcx.builder().a("feed:followRecs", HubsComponentCategory.ROW.mId).e(a13).a(str25, a14).a("followClick", a(a12, "followClick")).a());
                }
            }
            a3 = arrayList2;
            R_ = fdz;
            a = arrayList;
        }
        a.addAll(a3);
        return hdb.builder().a("feed-hubs-model-id").b((List<? extends hcm>) a).a();
    }
}
