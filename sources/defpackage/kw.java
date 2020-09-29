package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: kw reason: default package */
public class kw extends Fragment {
    private final Runnable T = new Runnable() {
        public final void run() {
            kw.this.a.focusableViewAvailable(kw.this.a);
        }
    };
    private final OnItemClickListener U = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            kw.this.a((ListView) adapterView, view, i, j);
        }
    };
    private ListAdapter V;
    private View W;
    private TextView X;
    private View Y;
    private View Z;
    ListView a;
    private boolean aa;
    private final Handler b = new Handler();

    private void a(boolean z, boolean z2) {
        e();
        View view = this.Y;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.aa != z) {
            this.aa = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(n(), 17432577));
                    this.Z.startAnimation(AnimationUtils.loadAnimation(n(), 17432576));
                } else {
                    view.clearAnimation();
                    this.Z.clearAnimation();
                }
                this.Y.setVisibility(8);
                this.Z.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(n(), 17432576));
                this.Z.startAnimation(AnimationUtils.loadAnimation(n(), 17432577));
            } else {
                view.clearAnimation();
                this.Z.clearAnimation();
            }
            this.Y.setVisibility(0);
            this.Z.setVisibility(8);
        }
    }

    private void e() {
        if (this.a == null) {
            View view = this.H;
            if (view != null) {
                if (view instanceof ListView) {
                    this.a = (ListView) view;
                } else {
                    this.X = (TextView) view.findViewById(16711681);
                    TextView textView = this.X;
                    if (textView == null) {
                        this.W = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.Y = view.findViewById(16711682);
                    this.Z = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        this.a = (ListView) findViewById;
                        View view2 = this.W;
                        if (view2 != null) {
                            this.a.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.aa = true;
                this.a.setOnItemClickListener(this.U);
                ListAdapter listAdapter = this.V;
                if (listAdapter != null) {
                    this.V = null;
                    a(listAdapter);
                } else if (this.Y != null) {
                    a(false, false);
                }
                this.b.post(this.T);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context o = o();
        FrameLayout frameLayout = new FrameLayout(o);
        LinearLayout linearLayout = new LinearLayout(o);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(o, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(o);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(o);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new LayoutParams(-1, -1));
        ListView listView = new ListView(o);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        e();
    }

    public final void a(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.V != null;
        this.V = listAdapter;
        ListView listView = this.a;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.aa && !z2) {
                if (y().getWindowToken() != null) {
                    z = true;
                }
                a(true, z);
            }
        }
    }

    public void a(ListView listView, View view, int i, long j) {
    }

    public void aw_() {
        this.b.removeCallbacks(this.T);
        this.a = null;
        this.aa = false;
        this.Z = null;
        this.Y = null;
        this.W = null;
        this.X = null;
        super.aw_();
    }

    public final ListView c() {
        e();
        return this.a;
    }
}
