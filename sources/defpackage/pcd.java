package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: pcd reason: default package */
public interface pcd extends fwk, fwn {

    /* renamed from: pcd$a */
    public interface a {
        void a(int i);

        void a(String str);

        void b(String str);
    }

    void a(int i);

    void a(Bitmap bitmap);

    void a(Drawable drawable);

    void a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void a(pci pci);
}
