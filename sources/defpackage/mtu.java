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

/* renamed from: mtu reason: default package */
public final class mtu extends ArrayAdapter<ResultModel> implements b {
    private final fqn a;
    private Collection<? extends ResultModel> b;
    private int c;
    /* access modifiers changed from: private */
    public int d;
    private final jyx e;
    /* access modifiers changed from: private */
    public final Set<ResultModel> f = new HashSet();
    /* access modifiers changed from: private */
    public final Set<ResultModel> g = new HashSet();
    /* access modifiers changed from: private */
    public final FindFriendsLogger h;
    /* access modifiers changed from: private */
    public final FollowManager i;
    /* access modifiers changed from: private */
    public final szp j;
    private final OnClickListener k = new OnClickListener() {
        public final void onClick(View view) {
            mtu.this.j.a(((ResultModel) view.getTag()).getUri());
        }
    };
    private final OnClickListener l = new OnClickListener() {
        public final void onClick(View view) {
            ResultModel resultModel = (ResultModel) view.getTag();
            mtu.this.i.a(resultModel.getUri(), ((Checkable) view).isChecked());
            resultModel.toggleFollowing();
            String str = "featured";
            if (resultModel.isFollowing()) {
                if (mtu.this.g.contains(resultModel)) {
                    mtu.this.g.remove(resultModel);
                } else {
                    mtu.this.f.add(resultModel);
                }
                mtu.this.h.a(resultModel.getUri(), str, InteractionType.HIT, UserIntent.FOLLOW);
            } else {
                if (mtu.this.f.contains(resultModel)) {
                    mtu.this.f.remove(resultModel);
                } else {
                    mtu.this.g.add(resultModel);
                }
                mtu.this.h.a(resultModel.getUri(), str, InteractionType.HIT, UserIntent.UNFOLLOW);
            }
            mtu.this.d = resultModel.isFollowing() ? mtu.this.d + 1 : mtu.this.d - 1;
        }
    };

    public mtu(Context context, List<ResultModel> list, fqn fqn, FindFriendsLogger findFriendsLogger, jyx jyx, FollowManager followManager, szp szp) {
        super(context, 0, list);
        this.a = fqn;
        this.h = findFriendsLogger;
        this.e = jyx;
        this.i = followManager;
        this.j = szp;
        fbp.a(this.a);
        fbp.a(this.f);
        fbp.a(this.g);
        fbp.a(findFriendsLogger);
        fbp.a(followManager);
    }

    public final void a(a aVar) {
        notifyDataSetChanged();
    }

    public final void addAll(Collection<? extends ResultModel> collection) {
        super.addAll(collection);
        this.b = collection;
        for (ResultModel resultModel : collection) {
            FollowManager followManager = this.i;
            a aVar = new a(resultModel.getUri(), 0, 0, resultModel.isFollowing(), false);
            followManager.a(aVar);
            this.i.a(resultModel.getUri(), (b) this);
            this.d = resultModel.isFollowing() ? this.d + 1 : this.d;
        }
        this.c = collection.size();
    }

    public final void clear() {
        super.clear();
        this.d = 0;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        ResultModel resultModel = (ResultModel) getItem(i2);
        String title = resultModel.getTitle();
        String trim = fbo.a(resultModel.getImage()) ? null : resultModel.getImage().trim();
        fry fry = (fry) fqv.b(view, fry.class);
        if (fry == null) {
            fqv.b();
            fry = fsk.b(getContext(), viewGroup);
            view2 = rlk.a(getContext());
            fry.a(view2);
            fry.getView().setOnClickListener(this.k);
            view2.setOnClickListener(this.l);
        } else {
            view2 = fry.a();
        }
        fry.getView().setTag(resultModel);
        view2.setTag(resultModel);
        view2.setTag(R.id.find_friends_position_key, Integer.valueOf(i2));
        ((Checkable) view2).setChecked(resultModel.isFollowing());
        this.e.b(fry.c(), trim);
        fry.a(title);
        return fry.getView();
    }
}
