package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import com.spotify.music.R;
import com.spotify.music.features.findfriends.legacy.logging.FindFriendsLogger;
import com.spotify.music.features.findfriends.legacy.logging.FindFriendsLogger.UserIntent;
import com.spotify.music.features.findfriends.legacy.model.ResultModel;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.follow.FollowManager.b;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: mpm reason: default package */
public final class mpm extends ArrayAdapter<ResultModel> implements b {
    public boolean a;
    private final fpt b;
    private Collection<? extends ResultModel> c;
    private int d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public final Set<ResultModel> f = new HashSet();
    /* access modifiers changed from: private */
    public final Set<ResultModel> g = new HashSet();
    private final View h;
    /* access modifiers changed from: private */
    public final FindFriendsLogger i;
    private final jww j;
    /* access modifiers changed from: private */
    public final FollowManager k;
    /* access modifiers changed from: private */
    public final spi l;
    private final OnClickListener m = new OnClickListener() {
        public final void onClick(View view) {
            mpm.this.l.a(((ResultModel) view.getTag()).getUri());
        }
    };
    private final OnClickListener n = new OnClickListener() {
        public final void onClick(View view) {
            ResultModel resultModel = (ResultModel) view.getTag();
            mpm.this.k.a(resultModel.getUri(), ((Checkable) view).isChecked());
            resultModel.toggleFollowing();
            String str = "friends";
            if (resultModel.isFollowing()) {
                if (mpm.this.g.contains(resultModel)) {
                    mpm.this.g.remove(resultModel);
                } else {
                    mpm.this.f.add(resultModel);
                }
                mpm.this.i.a(null, str, InteractionType.HIT, UserIntent.FOLLOW);
            } else {
                if (mpm.this.f.contains(resultModel)) {
                    mpm.this.f.remove(resultModel);
                } else {
                    mpm.this.g.add(resultModel);
                }
                mpm.this.i.a(null, str, InteractionType.HIT, UserIntent.UNFOLLOW);
            }
            mpm.this.e = resultModel.isFollowing() ? mpm.this.e + 1 : mpm.this.e - 1;
        }
    };

    public final int getItemViewType(int i2) {
        return i2 != 0 ? 1 : 0;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public mpm(Context context, List<ResultModel> list, fpt fpt, View view, FindFriendsLogger findFriendsLogger, jww jww, FollowManager followManager, spi spi) {
        super(context, 0, list);
        this.b = fpt;
        this.h = view;
        this.i = findFriendsLogger;
        this.j = jww;
        this.k = followManager;
        this.l = spi;
        fay.a(this.h);
        fay.a(this.b);
        fay.a(this.f);
        fay.a(this.g);
        fay.a(this.i);
        fay.a(this.j);
        fay.a(this.k);
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        if (getItemViewType(i2) == 0) {
            return this.h;
        }
        ResultModel a2 = getItem(i2);
        String title = a2.getTitle();
        fre fre = null;
        String trim = fax.a(a2.getImage()) ? null : a2.getImage().trim();
        if (view != this.h) {
            fre = (fre) fqb.b(view, fre.class);
        }
        if (fre == null) {
            fqb.b();
            fre = frq.b(getContext(), viewGroup);
            view2 = rcm.a(getContext());
            fre.a(view2);
            fre.getView().setOnClickListener(this.m);
            view2.setOnClickListener(this.n);
        } else {
            view2 = fre.a();
        }
        fre.getView().setTag(a2);
        view2.setTag(a2);
        view2.setTag(R.id.find_friends_position_key, Integer.valueOf(i2));
        ((Checkable) view2).setChecked(a2.isFollowing());
        jww.a(getContext()).b(fre.c(), trim);
        fre.a(title);
        return fre.getView();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ResultModel getItem(int i2) {
        return (ResultModel) super.getItem(i2 - 1);
    }

    public final int getCount() {
        return super.getCount() + 1;
    }

    public final void addAll(Collection<? extends ResultModel> collection) {
        super.addAll(collection);
        this.c = collection;
        for (ResultModel resultModel : collection) {
            FollowManager followManager = this.k;
            a aVar = new a(resultModel.getUri(), 0, 0, resultModel.isFollowing(), false);
            followManager.a(aVar);
            this.k.a(resultModel.getUri(), (b) this);
            this.e = resultModel.isFollowing() ? this.e + 1 : this.e;
        }
        this.d = collection.size();
    }

    public final void clear() {
        super.clear();
        this.e = 0;
    }

    public final void a(a aVar) {
        notifyDataSetChanged();
    }
}
