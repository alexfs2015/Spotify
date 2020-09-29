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

/* renamed from: gxq reason: default package */
public final class gxq extends gxg<fsl> {
    private final Random a = new Random();

    /* renamed from: gxq$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        final int a;

        public final int describeContents() {
            return 0;
        }

        a(int i) {
            this.a = i;
        }

        protected a(Parcel parcel) {
            this.a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, b bVar) {
        gzt gzt2 = gzt;
        gum gum2 = gum;
        b bVar2 = bVar;
        fsl fsl = (fsl) fqe;
        gzq[] bundleArray = gzt.custom().bundleArray("tracks");
        String title = gzt.text().title();
        boolean boolValue = gzt.custom().boolValue("showArtists", true);
        int intValue = gzt.custom().intValue("maxTracksToShow", 10);
        boolean boolValue2 = gzt.custom().boolValue("showHearts", false);
        boolean boolValue3 = gzt.custom().boolValue("showNumbers", false);
        boolean boolValue4 = gzt.custom().boolValue("shuffle", false);
        int intValue2 = gzt.custom().intValue("maxLines", 3);
        String str = "";
        String string = gzt.custom().string("ellipsis", str);
        if (bundleArray != null) {
            ArrayList a2 = Lists.a(bundleArray.length);
            int length = bundleArray.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                gzq gzq = bundleArray[i];
                gzq[] gzqArr = bundleArray;
                fsl fsl2 = fsl;
                String str2 = str;
                String str3 = string;
                int i3 = intValue2;
                a2.add(new defpackage.fsj.a(gzq.string("trackName", str), gzq.string("artistName", str), gzq.boolValue("isHearted", false), gzq.boolValue("isEnabled", true)));
                i++;
                length = i2;
                bundleArray = gzqArr;
                fsl = fsl2;
                str = str2;
                string = str3;
                intValue2 = i3;
            }
            fsl fsl3 = fsl;
            String str4 = string;
            int i4 = intValue2;
            if (boolValue4) {
                a aVar = (a) bVar2.a(gzt2);
                if (aVar == null) {
                    aVar = new a(this.a.nextInt());
                    bVar2.a(gzt2, aVar);
                }
                Collections.shuffle(a2, new Random((long) aVar.a));
            }
            fsj fsj = new fsj();
            fsj.a = title;
            fsj.d = a2;
            fsj.e = boolValue;
            fsj.h = intValue;
            fsj.f = boolValue2;
            fsj.g = boolValue3;
            fsj.c = i4;
            fsj.b = str4;
            fsl fsl4 = fsl3;
            fsl4.a(fsj);
            has.a(fsl4.getView());
            gum gum3 = gum;
            guj.a(gum3, fsl4.getView(), gzt2);
            String str5 = "longClick";
            if (gzt.events().containsKey(str5)) {
                has.a(gum3.c).a(str5).a(gzt2).a(fsl4.getView()).b();
                return;
            }
            return;
        }
    }

    public gxq() {
        super(EnumSet.of(Trait.STACKABLE), fsl.class);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        fqb.g();
        return fsn.a(context, viewGroup);
    }
}
