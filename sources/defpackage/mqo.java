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

/* renamed from: mqo reason: default package */
public final class mqo implements gui<ExpandableReleaseView> {
    private final Picasso a;

    /* renamed from: mqo$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        /* access modifiers changed from: private */
        public int a;

        public final int describeContents() {
            return 0;
        }

        a(int i) {
            this.a = i;
        }

        protected a(Parcel parcel) {
            parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    /* renamed from: mqo$b */
    public interface b {
        void onExpand(int i);
    }

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, defpackage.gui.a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, gzt gzt, gum gum, defpackage.gui.b bVar) {
        int i;
        ExpandableReleaseView expandableReleaseView = (ExpandableReleaseView) view;
        gzq custom = gzt.custom();
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
        boolean booleanValue = ((Boolean) Optional.c((a) bVar.a(gzt)).a((Function<? super T, V>) $$Lambda$mqo$YaC5SpTWRp6wonaBS3eQEqYwKd4.INSTANCE).a(Boolean.FALSE)).booleanValue();
        expandableReleaseView.a(length, booleanValue);
        expandableReleaseView.g = booleanValue;
        if (booleanValue) {
            i = expandableReleaseView.a(length);
        } else {
            i = expandableReleaseView.c(R.dimen.feed_expandable_item_footer_height);
        }
        expandableReleaseView.b(i);
        expandableReleaseView.i = new $$Lambda$mqo$Ng49DUmgfJ2E2Zg2yvIOuGvSUsk(bVar, gzt);
        if (stringArray != null) {
            ImmutableList<String> a2 = ImmutableList.a(fbx.a((E[]) stringArray).a());
            expandableReleaseView.d.removeAllViews();
            for (String str2 : a2) {
                fqb.b();
                frh a3 = frq.a(expandableReleaseView.getContext(), (ViewGroup) expandableReleaseView, false);
                a3.b().setText(str2);
                a3.d().setText(string);
                a3.a(joe.a(expandableReleaseView.getContext()));
                View view2 = a3.getView();
                view2.setBackgroundColor(expandableReleaseView.getResources().getColor(R.color.gray_25));
                expandableReleaseView.d.addView(view2);
            }
            expandableReleaseView.h = a2.size();
        }
        expandableReleaseView.f.setOnClickListener(new $$Lambda$mqo$MMsgFAed4OtJc9YQPHibfgmYka8(expandableReleaseView));
        mqd.a(expandableReleaseView.b, gzt, gum);
        mqd.b(expandableReleaseView.c, gzt, gum);
    }

    public mqo(Picasso picasso) {
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

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        return new ExpandableReleaseView(viewGroup.getContext(), this.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ExpandableReleaseView expandableReleaseView, View view) {
        int i;
        if (expandableReleaseView.g) {
            i = expandableReleaseView.c(R.dimen.feed_expandable_item_footer_height);
        } else {
            i = expandableReleaseView.a(expandableReleaseView.h);
        }
        expandableReleaseView.a(expandableReleaseView.e.getMeasuredHeight(), i);
        expandableReleaseView.g = !expandableReleaseView.g;
        expandableReleaseView.i.onExpand(expandableReleaseView.g ? 1 : 0);
        expandableReleaseView.a(expandableReleaseView.h, expandableReleaseView.g);
    }
}
