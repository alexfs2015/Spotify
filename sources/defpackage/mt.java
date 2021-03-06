package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.spotify.music.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: mt reason: default package */
final class mt {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        if (typedValue.type == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (typedValue.type != 6) {
            return -2;
        } else {
            fraction = typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
        }
        return (int) fraction;
    }

    public static int b(Context context) {
        if (!context.getResources().getBoolean(R.bool.is_tablet)) {
            return -1;
        }
        return a(context);
    }

    public static int c(Context context) {
        return !context.getResources().getBoolean(R.bool.is_tablet) ? -1 : -2;
    }

    public static <E> Set<E> a(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    public static <E> HashMap<E, Rect> a(ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, Rect> hashMap = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            Object item = arrayAdapter.getItem(firstVisiblePosition + i);
            View childAt = listView.getChildAt(i);
            hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return hashMap;
    }

    public static <E> HashMap<E, BitmapDrawable> a(Context context, ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, BitmapDrawable> hashMap = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            hashMap.put(arrayAdapter.getItem(firstVisiblePosition + i), a(context, listView.getChildAt(i)));
        }
        return hashMap;
    }

    private static BitmapDrawable a(Context context, View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
