package defpackage;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.contentviewstate.view.ContentFrameLayout;
import com.spotify.music.contentviewstate.view.LoadingView;

@Deprecated
/* renamed from: mis reason: default package */
public abstract class mis<T extends Parcelable> extends miu<T> {
    private ContentFrameLayout<View> a;

    /* access modifiers changed from: protected */
    public final View a(LayoutInflater layoutInflater) {
        this.a = new ContentFrameLayout<>(p());
        ContentFrameLayout<View> contentFrameLayout = this.a;
        contentFrameLayout.a(a(layoutInflater, contentFrameLayout));
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public final fvd al() {
        return this.a.a;
    }

    /* access modifiers changed from: protected */
    public final View am() {
        return this.a.c;
    }

    /* access modifiers changed from: protected */
    public final LoadingView an() {
        return this.a.b;
    }
}
