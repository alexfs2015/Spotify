package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.ViewGroup;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Random;

/* renamed from: hai reason: default package */
public final class hai extends gzu<ftf> {
    private final Random a = new Random();

    /* renamed from: hai$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        final int a;

        a(int i) {
            this.a = i;
        }

        protected a(Parcel parcel) {
            this.a = parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    public hai() {
        super(EnumSet.of(Trait.STACKABLE), ftf.class);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        fqv.g();
        return fth.a(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, b bVar) {
        hcm hcm2 = hcm;
        gwm gwm2 = gwm;
        b bVar2 = bVar;
        ftf ftf = (ftf) fqy;
        hcj[] bundleArray = hcm.custom().bundleArray("tracks");
        String title = hcm.text().title();
        boolean boolValue = hcm.custom().boolValue("showArtists", true);
        int intValue = hcm.custom().intValue("maxTracksToShow", 10);
        boolean boolValue2 = hcm.custom().boolValue("showHearts", false);
        boolean boolValue3 = hcm.custom().boolValue("showNumbers", false);
        boolean boolValue4 = hcm.custom().boolValue("shuffle", false);
        int intValue2 = hcm.custom().intValue("maxLines", 3);
        String str = "";
        String string = hcm.custom().string("ellipsis", str);
        if (bundleArray != null) {
            ArrayList a2 = Lists.a(bundleArray.length);
            int length = bundleArray.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                hcj hcj = bundleArray[i];
                hcj[] hcjArr = bundleArray;
                ftf ftf2 = ftf;
                String str2 = str;
                String str3 = string;
                int i3 = intValue2;
                a2.add(new defpackage.ftd.a(hcj.string("trackName", str), hcj.string("artistName", str), hcj.boolValue("isHearted", false), hcj.boolValue("isEnabled", true)));
                i++;
                length = i2;
                bundleArray = hcjArr;
                ftf = ftf2;
                str = str2;
                string = str3;
                intValue2 = i3;
            }
            ftf ftf3 = ftf;
            String str4 = string;
            int i4 = intValue2;
            if (boolValue4) {
                a aVar = (a) bVar2.a(hcm2);
                if (aVar == null) {
                    aVar = new a(this.a.nextInt());
                    bVar2.a(hcm2, aVar);
                }
                Collections.shuffle(a2, new Random((long) aVar.a));
            }
            ftd ftd = new ftd();
            ftd.a = title;
            ftd.d = a2;
            ftd.e = boolValue;
            ftd.h = intValue;
            ftd.f = boolValue2;
            ftd.g = boolValue3;
            ftd.c = i4;
            ftd.b = str4;
            ftf ftf4 = ftf3;
            ftf4.a(ftd);
            hdl.a(ftf4.getView());
            gwm gwm3 = gwm;
            gwj.a(gwm3, ftf4.getView(), hcm2);
            String str5 = "longClick";
            if (hcm.events().containsKey(str5)) {
                hdl.a(gwm3.c).a(str5).a(hcm2).a(ftf4.getView()).b();
                return;
            }
            return;
        }
    }
}
