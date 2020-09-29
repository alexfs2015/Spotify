package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.features.followfeed.views.ExpandableReleaseView;
import com.squareup.picasso.Picasso;

/* renamed from: muz reason: default package */
public final class muz implements gwi<ExpandableReleaseView> {
    private final Picasso a;

    /* renamed from: muz$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        /* access modifiers changed from: private */
        public int a;

        a(int i) {
            this.a = i;
        }

        protected a(Parcel parcel) {
            parcel.readInt();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    /* renamed from: muz$b */
    public interface b {
        void onExpand(int i);
    }

    public muz(Picasso picasso) {
        this.a = picasso;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(a aVar) {
        boolean z = true;
        if (aVar.a != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ExpandableReleaseView expandableReleaseView, View view) {
        expandableReleaseView.a(expandableReleaseView.e.getMeasuredHeight(), expandableReleaseView.g ? expandableReleaseView.c(R.dimen.feed_expandable_item_footer_height) : expandableReleaseView.a(expandableReleaseView.h));
        expandableReleaseView.g = !expandableReleaseView.g;
        expandableReleaseView.i.onExpand(expandableReleaseView.g ? 1 : 0);
        expandableReleaseView.a(expandableReleaseView.h, expandableReleaseView.g);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        return new ExpandableReleaseView(viewGroup.getContext(), this.a);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, defpackage.gwi.a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        ExpandableReleaseView expandableReleaseView = (ExpandableReleaseView) view;
        hcj custom = hcm.custom();
        String str = "";
        String string = custom.string("artist_name", str);
        String string2 = custom.string("artist_image", str);
        String string3 = custom.string("release_date", str);
        String string4 = custom.string("title", str);
        String string5 = custom.string("subtitle", str);
        String string6 = custom.string("image_url", str);
        expandableReleaseView.b.a(string);
        expandableReleaseView.b.a(string2, expandableReleaseView.a);
        expandableReleaseView.b.b(string3);
        expandableReleaseView.c.a(string6, expandableReleaseView.a);
        expandableReleaseView.c.a(string4, string5);
        expandableReleaseView.c.b();
        String[] stringArray = custom.stringArray("tracks");
        int length = stringArray != null ? stringArray.length : 1;
        boolean booleanValue = ((Boolean) Optional.c((a) bVar.a(hcm)).a((Function<? super T, V>) $$Lambda$muz$AhpUwAnqAN5DrcqGkRiejDLM4pg.INSTANCE).a(Boolean.FALSE)).booleanValue();
        expandableReleaseView.a(length, booleanValue);
        expandableReleaseView.g = booleanValue;
        expandableReleaseView.b(booleanValue ? expandableReleaseView.a(length) : expandableReleaseView.c(R.dimen.feed_expandable_item_footer_height));
        expandableReleaseView.i = new $$Lambda$muz$9FYdPhfye6hAAF0w5oWm7DK0WwA(bVar, hcm);
        if (stringArray != null) {
            ImmutableList<String> a2 = ImmutableList.a(fcp.a((E[]) stringArray).a());
            expandableReleaseView.d.removeAllViews();
            for (String str2 : a2) {
                fqv.b();
                fsb a3 = fsk.a(expandableReleaseView.getContext(), (ViewGroup) expandableReleaseView, false);
                a3.b().setText(str2);
                a3.d().setText(string);
                a3.a(jqq.a(expandableReleaseView.getContext()));
                View view2 = a3.getView();
                view2.setBackgroundColor(expandableReleaseView.getResources().getColor(R.color.gray_25));
                expandableReleaseView.d.addView(view2);
            }
            expandableReleaseView.h = a2.size();
        }
        expandableReleaseView.f.setOnClickListener(new $$Lambda$muz$AxWd6xJvqCG2WSnzCGxedf4c1Qg(expandableReleaseView));
        muq.a(expandableReleaseView.b, hcm, gwm);
        muq.b(expandableReleaseView.c, hcm, gwm);
    }
}
