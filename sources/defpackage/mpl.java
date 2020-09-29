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

/* renamed from: mpl reason: default package */
public final class mpl extends ArrayAdapter<ResultModel> implements b {
    private final fpt a;
    private Collection<? extends ResultModel> b;
    private int c;
    /* access modifiers changed from: private */
    public int d;
    private final jwv e;
    /* access modifiers changed from: private */
    public final Set<ResultModel> f = new HashSet();
    /* access modifiers changed from: private */
    public final Set<ResultModel> g = new HashSet();
    /* access modifiers changed from: private */
    public final FindFriendsLogger h;
    /* access modifiers changed from: private */
    public final FollowManager i;
    /* access modifiers changed from: private */
    public final spi j;
    private final OnClickListener k = new OnClickListener() {
        public final void onClick(View view) {
            mpl.this.j.a(((ResultModel) view.getTag()).getUri());
        }
    };
    private final OnClickListener l = new OnClickListener() {
        public final void onClick(View view) {
            ResultModel resultModel = (ResultModel) view.getTag();
            mpl.this.i.a(resultModel.getUri(), ((Checkable) view).isChecked());
            resultModel.toggleFollowing();
            String str = "featured";
            if (resultModel.isFollowing()) {
                if (mpl.this.g.contains(resultModel)) {
                    mpl.this.g.remove(resultModel);
                } else {
                    mpl.this.f.add(resultModel);
                }
                mpl.this.h.a(resultModel.getUri(), str, InteractionType.HIT, UserIntent.FOLLOW);
            } else {
                if (mpl.this.f.contains(resultModel)) {
                    mpl.this.f.remove(resultModel);
                } else {
                    mpl.this.g.add(resultModel);
                }
                mpl.this.h.a(resultModel.getUri(), str, InteractionType.HIT, UserIntent.UNFOLLOW);
            }
            mpl.this.d = resultModel.isFollowing() ? mpl.this.d + 1 : mpl.this.d - 1;
        }
    };

    public mpl(Context context, List<ResultModel> list, fpt fpt, FindFriendsLogger findFriendsLogger, jww jww, FollowManager followManager, spi spi) {
        super(context, 0, list);
        this.a = fpt;
        this.h = findFriendsLogger;
        this.e = jww.a(context);
        this.i = followManager;
        this.j = spi;
        fay.a(this.a);
        fay.a(this.f);
        fay.a(this.g);
        fay.a(findFriendsLogger);
        fay.a(followManager);
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        ResultModel resultModel = (ResultModel) getItem(i2);
        String title = resultModel.getTitle();
        String trim = fax.a(resultModel.getImage()) ? null : resultModel.getImage().trim();
        fre fre = (fre) fqb.b(view, fre.class);
        if (fre == null) {
            fqb.b();
            fre = frq.b(getContext(), viewGroup);
            view2 = rcm.a(getContext());
            fre.a(view2);
            fre.getView().setOnClickListener(this.k);
            view2.setOnClickListener(this.l);
        } else {
            view2 = fre.a();
        }
        fre.getView().setTag(resultModel);
        view2.setTag(resultModel);
        view2.setTag(R.id.find_friends_position_key, Integer.valueOf(i2));
        ((Checkable) view2).setChecked(resultModel.isFollowing());
        this.e.b(fre.c(), trim);
        fre.a(title);
        return fre.getView();
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

    public final void a(a aVar) {
        notifyDataSetChanged();
    }
}
