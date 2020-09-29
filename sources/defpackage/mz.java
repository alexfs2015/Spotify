package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: mz reason: default package */
public final class mz extends u {
    Context a;
    List<f> b;
    private ni c;
    private final a d;
    private nh e;
    private ImageButton f;
    private b g;
    private RecyclerView h;
    private boolean i;
    private long j;
    private long k;
    private final Handler l;

    /* renamed from: mz$a */
    final class a extends defpackage.ni.a {
        a() {
        }

        public final void a(f fVar) {
            mz.this.dismiss();
        }

        public final void a(ni niVar, f fVar) {
            mz.this.b();
        }

        public final void b(ni niVar, f fVar) {
            mz.this.b();
        }

        public final void c(ni niVar, f fVar) {
            mz.this.b();
        }
    }

    /* renamed from: mz$b */
    final class b extends androidx.recyclerview.widget.RecyclerView.a<u> {
        private final ArrayList<C0058b> d = new ArrayList<>();
        private final LayoutInflater e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;

        /* renamed from: mz$b$a */
        class a extends u {
            TextView a;

            a(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.mr_picker_header_name);
            }
        }

        /* renamed from: mz$b$b reason: collision with other inner class name */
        class C0058b {
            final Object a;
            final int b;

            C0058b(Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof f) {
                    this.b = 2;
                } else {
                    this.b = 0;
                }
            }
        }

        /* renamed from: mz$b$c */
        class c extends u {
            final View a;
            final ImageView b;
            final ProgressBar c;
            final TextView d;

            c(View view) {
                super(view);
                this.a = view;
                this.b = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                this.c = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.d = (TextView) view.findViewById(R.id.mr_picker_route_name);
                nb.a(mz.this.a, this.c);
            }
        }

        b() {
            this.e = LayoutInflater.from(mz.this.a);
            this.f = nb.c(mz.this.a);
            this.g = nb.d(mz.this.a);
            this.h = nb.e(mz.this.a);
            this.i = nb.f(mz.this.a);
            a();
        }

        public final int a(int i2) {
            return ((C0058b) this.d.get(i2)).b;
        }

        /* access modifiers changed from: 0000 */
        public final Drawable a(f fVar) {
            Uri uri = fVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(mz.this.a.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    new StringBuilder("Failed to load ").append(uri);
                }
            }
            int i2 = fVar.l;
            return i2 != 1 ? i2 != 2 ? fVar.f() ? this.i : this.f : this.h : this.g;
        }

        public final u a(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new a(this.e.inflate(R.layout.mr_picker_header_item, viewGroup, false));
            }
            if (i2 != 2) {
                return null;
            }
            return new c(this.e.inflate(R.layout.mr_picker_route_item, viewGroup, false));
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.d.clear();
            this.d.add(new C0058b(mz.this.a.getString(R.string.mr_chooser_title)));
            for (f bVar : mz.this.b) {
                this.d.add(new C0058b(bVar));
            }
            e();
        }

        public final void a(u uVar, int i2) {
            int a2 = a(i2);
            C0058b bVar = (C0058b) this.d.get(i2);
            if (a2 != 1) {
                if (a2 == 2) {
                    c cVar = (c) uVar;
                    f fVar = (f) bVar.a;
                    cVar.a.setVisibility(0);
                    cVar.c.setVisibility(4);
                    cVar.a.setOnClickListener(new OnClickListener(fVar) {
                        private /* synthetic */ f a;

                        {
                            this.a = r2;
                        }

                        public final void onClick(View view) {
                            this.a.e();
                            c.this.b.setVisibility(4);
                            c.this.c.setVisibility(0);
                        }
                    });
                    cVar.d.setText(fVar.d);
                    cVar.b.setImageDrawable(b.this.a(fVar));
                }
                return;
            }
            a aVar = (a) uVar;
            aVar.a.setText(bVar.a.toString());
        }

        public final int b() {
            return this.d.size();
        }
    }

    /* renamed from: mz$c */
    static final class c implements Comparator<f> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((f) obj).d.compareToIgnoreCase(((f) obj2).d);
        }
    }

    public mz(Context context) {
        this(context, 0);
    }

    private mz(Context context, int i2) {
        Context a2 = nb.a(context, 0, false);
        super(a2, nb.h(a2));
        this.e = nh.c;
        this.l = new Handler() {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    mz.this.a((List) message.obj);
                }
            }
        };
        Context context2 = getContext();
        this.c = ni.a(context2);
        this.d = new a();
        this.a = context2;
        this.j = (long) context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    private void b(List<f> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                f fVar = (f) list.get(i2);
                if (!(!fVar.c() && fVar.g && fVar.a(this.e))) {
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
        getWindow().setLayout(my.b(this.a), my.c(this.a));
    }

    /* access modifiers changed from: 0000 */
    public final void a(List<f> list) {
        this.k = SystemClock.uptimeMillis();
        this.b.clear();
        this.b.addAll(list);
        this.g.a();
    }

    public final void a(nh nhVar) {
        if (nhVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.e.equals(nhVar)) {
            this.e = nhVar;
            if (this.i) {
                this.c.a((defpackage.ni.a) this.d);
                this.c.a(nhVar, this.d, 1);
            }
            b();
        }
    }

    public final void b() {
        if (this.i) {
            ArrayList arrayList = new ArrayList(ni.a());
            b(arrayList);
            Collections.sort(arrayList, c.a);
            if (SystemClock.uptimeMillis() - this.k >= this.j) {
                a((List<f>) arrayList);
                return;
            }
            this.l.removeMessages(1);
            Handler handler = this.l;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.k + this.j);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.c.a(this.e, this.d, 1);
        b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mr_picker_dialog);
        nb.a(this.a, (Dialog) this);
        this.b = new ArrayList();
        this.f = (ImageButton) findViewById(R.id.mr_picker_close_button);
        this.f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                mz.this.dismiss();
            }
        });
        this.g = new b();
        this.h = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.h.a((androidx.recyclerview.widget.RecyclerView.a) this.g);
        this.h.a((i) new LinearLayoutManager(this.a));
        a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        this.c.a((defpackage.ni.a) this.d);
        this.l.removeMessages(1);
    }
}
