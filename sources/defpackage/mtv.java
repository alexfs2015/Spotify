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

/* renamed from: mtv reason: default package */
public final class mtv extends ArrayAdapter<ResultModel> implements b {
    public boolean a;
    private final fqn b;
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
    private final jyx j;
    /* access modifiers changed from: private */
    public final FollowManager k;
    /* access modifiers changed from: private */
    public final szp l;
    private final OnClickListener m = new OnClickListener() {
        public final void onClick(View view) {
            mtv.this.l.a(((ResultModel) view.getTag()).getUri());
        }
    };
    private final OnClickListener n = new OnClickListener() {
        public final void onClick(View view) {
            ResultModel resultModel = (ResultModel) view.getTag();
            mtv.this.k.a(resultModel.getUri(), ((Checkable) view).isChecked());
            resultModel.toggleFollowing();
            String str = "friends";
            if (resultModel.isFollowing()) {
                if (mtv.this.g.contains(resultModel)) {
                    mtv.this.g.remove(resultModel);
                } else {
                    mtv.this.f.add(resultModel);
                }
                mtv.this.i.a(null, str, InteractionType.HIT, UserIntent.FOLLOW);
            } else {
                if (mtv.this.f.contains(resultModel)) {
                    mtv.this.f.remove(resultModel);
                } else {
                    mtv.this.g.add(resultModel);
                }
                mtv.this.i.a(null, str, InteractionType.HIT, UserIntent.UNFOLLOW);
            }
            mtv.this.e = resultModel.isFollowing() ? mtv.this.e + 1 : mtv.this.e - 1;
        }
    };

    public mtv(Context context, List<ResultModel> list, fqn fqn, View view, FindFriendsLogger findFriendsLogger, jyx jyx, FollowManager followManager, szp szp) {
        super(context, 0, list);
        this.b = fqn;
        this.h = view;
        this.i = findFriendsLogger;
        this.j = jyx;
        this.k = followManager;
        this.l = szp;
        fbp.a(this.h);
        fbp.a(this.b);
        fbp.a(this.f);
        fbp.a(this.g);
        fbp.a(this.i);
        fbp.a(this.j);
        fbp.a(this.k);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ResultModel getItem(int i2) {
        return (ResultModel) super.getItem(i2 - 1);
    }

    public final void a(a aVar) {
        notifyDataSetChanged();
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

    public final int getCount() {
        return super.getCount() + 1;
    }

    public final int getItemViewType(int i2) {
        return i2 != 0 ? 1 : 0;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        if (getItemViewType(i2) == 0) {
            return this.h;
        }
        ResultModel a2 = getItem(i2);
        String title = a2.getTitle();
        fry fry = null;
        String trim = fbo.a(a2.getImage()) ? null : a2.getImage().trim();
        if (view != this.h) {
            fry = (fry) fqv.b(view, fry.class);
        }
        if (fry == null) {
            fqv.b();
            fry = fsk.b(getContext(), viewGroup);
            view2 = rlk.a(getContext());
            fry.a(view2);
            fry.getView().setOnClickListener(this.m);
            view2.setOnClickListener(this.n);
        } else {
            view2 = fry.a();
        }
        fry.getView().setTag(a2);
        view2.setTag(a2);
        view2.setTag(R.id.find_friends_position_key, Integer.valueOf(i2));
        ((Checkable) view2).setChecked(a2.isFollowing());
        this.j.b(fry.c(), trim);
        fry.a(title);
        return fry.getView();
    }

    public final int getViewTypeCount() {
        return 3;
    }
}
