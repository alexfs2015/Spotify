package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.music.R;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.follow.FollowManager.b;

/* renamed from: qos reason: default package */
public final class qos extends BaseAdapter implements b {
    public final ProfileModel[] a;
    public final FollowManager b;
    private final Context c;
    private final String d;
    private final jwv e;
    private final qoq f;

    public final long getItemId(int i) {
        return (long) i;
    }

    public qos(Context context, ProfileModel[] profileModelArr, String str, FollowManager followManager, jwv jwv, qoq qoq) {
        ProfileModel[] profileModelArr2;
        this.c = context;
        this.a = profileModelArr;
        this.d = str;
        this.b = followManager;
        for (ProfileModel profileModel : this.a) {
            this.b.a(profileModel.getFollowData());
            this.b.a(profileModel.getUri(), (b) this);
        }
        this.e = jwv;
        this.f = qoq;
    }

    public final int getCount() {
        return this.a.length;
    }

    public final Object getItem(int i) {
        return this.a[i];
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        ProfileModel profileModel = (ProfileModel) getItem(i);
        a followData = profileModel.getFollowData();
        Resources resources = this.c.getResources();
        fri fri = (fri) fqb.b(view, fri.class);
        if (fri == null) {
            fqb.b();
            fri = frq.b(this.c, viewGroup, false);
            view2 = rcm.a(this.c);
            fri.a(view2);
        } else {
            view2 = fri.a();
        }
        String imageHttpUrl = profileModel.getImageHttpUrl();
        if (imageHttpUrl != null) {
            imageHttpUrl = imageHttpUrl.trim();
        }
        jwv jwv = this.e;
        ImageView c2 = fri.c();
        if (TextUtils.isEmpty(imageHttpUrl)) {
            imageHttpUrl = null;
        }
        jwv.b(c2, imageHttpUrl);
        fri.a(profileModel.getDisplayName());
        int i2 = followData.c;
        boolean z = true;
        fri.c(resources.getQuantityString(R.plurals.profile_list_followers_count, i2, new Object[]{Integer.valueOf(i2)}));
        ((Checkable) view2).setChecked(followData.d);
        view2.setOnClickListener(new $$Lambda$qos$xxRNCcRH0K73grs7loFVQlIpxg(this, view2, profileModel));
        String username = profileModel.getUsername();
        if (username == null || !username.equals(this.d)) {
            z = false;
        }
        if (z) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
        }
        return fri.getView();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, ProfileModel profileModel, View view2) {
        boolean isChecked = ((Checkable) view).isChecked();
        String uri = profileModel.getUri();
        this.b.a(uri, isChecked);
        this.f.a(uri, isChecked);
    }

    public final void a(a aVar) {
        notifyDataSetChanged();
    }
}
