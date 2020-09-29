package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.music.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: mt reason: default package */
public final class mt extends u {
    private final ni a;
    private final a b;
    private TextView c;
    private nh d;
    private ArrayList<f> e;
    private b f;
    private ListView g;
    private boolean h;
    private long i;
    private final Handler j;

    /* renamed from: mt$a */
    final class a extends defpackage.ni.a {
        a() {
        }

        public final void a(f fVar) {
            mt.this.dismiss();
        }

        public final void a(ni niVar, f fVar) {
            mt.this.b();
        }

        public final void b(ni niVar, f fVar) {
            mt.this.b();
        }

        public final void c(ni niVar, f fVar) {
            mt.this.b();
        }
    }

    /* renamed from: mt$b */
    final class b extends ArrayAdapter<f> implements OnItemClickListener {
        private final LayoutInflater a;
        private final Drawable b;
        private final Drawable c;
        private final Drawable d;
        private final Drawable e;

        public b(Context context, List<f> list) {
            super(context, 0, list);
            this.a = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.b = obtainStyledAttributes.getDrawable(0);
            this.c = obtainStyledAttributes.getDrawable(1);
            this.d = obtainStyledAttributes.getDrawable(2);
            this.e = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        private Drawable a(f fVar) {
            Uri uri = fVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    new StringBuilder("Failed to load ").append(uri);
                }
            }
            int i = fVar.l;
            return i != 1 ? i != 2 ? fVar.f() ? this.e : this.b : this.d : this.c;
        }

        public final boolean areAllItemsEnabled() {
            return false;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.a.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
            }
            f fVar = (f) getItem(i);
            TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
            textView.setText(fVar.d);
            String str = fVar.e;
            boolean z = true;
            if (!(fVar.h == 2 || fVar.h == 1)) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(str)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(str);
            }
            view.setEnabled(fVar.g);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(a(fVar));
            }
            return view;
        }

        public final boolean isEnabled(int i) {
            return ((f) getItem(i)).g;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            f fVar = (f) getItem(i);
            if (fVar.g) {
                fVar.e();
                mt.this.dismiss();
            }
        }
    }

    /* renamed from: mt$c */
    static final class c implements Comparator<f> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((f) obj).d.compareToIgnoreCase(((f) obj2).d);
        }
    }

    public mt(Context context) {
        this(context, 0);
    }

    private mt(Context context, int i2) {
        Context a2 = nb.a(context, 0, false);
        super(a2, nb.h(a2));
        this.d = nh.c;
        this.j = new Handler() {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    mt.this.a((List) message.obj);
                }
            }
        };
        this.a = ni.a(getContext());
        this.b = new a();
    }

    private void b(List<f> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                f fVar = (f) list.get(i2);
                if (!(!fVar.c() && fVar.g && fVar.a(this.d))) {
                    list.remove(i2);
                }
                size = i2;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        getWindow().setLayout(my.a(getContext()), -2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(List<f> list) {
        this.i = SystemClock.uptimeMillis();
        this.e.clear();
        this.e.addAll(list);
        this.f.notifyDataSetChanged();
    }

    public final void a(nh nhVar) {
        if (nhVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.d.equals(nhVar)) {
            this.d = nhVar;
            if (this.h) {
                this.a.a((defpackage.ni.a) this.b);
                this.a.a(nhVar, this.b, 1);
            }
            b();
        }
    }

    public final void b() {
        if (this.h) {
            ArrayList arrayList = new ArrayList(ni.a());
            b(arrayList);
            Collections.sort(arrayList, c.a);
            if (SystemClock.uptimeMillis() - this.i >= 300) {
                a((List<f>) arrayList);
                return;
            }
            this.j.removeMessages(1);
            Handler handler = this.j;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.i + 300);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        this.a.a(this.d, this.b, 1);
        b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mr_chooser_dialog);
        this.e = new ArrayList<>();
        this.f = new b(getContext(), this.e);
        this.g = (ListView) findViewById(R.id.mr_chooser_list);
        this.g.setAdapter(this.f);
        this.g.setOnItemClickListener(this.f);
        this.g.setEmptyView(findViewById(16908292));
        this.c = (TextView) findViewById(R.id.mr_chooser_title);
        a();
    }

    public final void onDetachedFromWindow() {
        this.h = false;
        this.a.a((defpackage.ni.a) this.b);
        this.j.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void setTitle(int i2) {
        this.c.setText(i2);
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
