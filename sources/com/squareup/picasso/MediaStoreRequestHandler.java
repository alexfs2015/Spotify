package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.squareup.picasso.Picasso.LoadedFrom;

final class MediaStoreRequestHandler extends vrv {
    private static final String[] b = {"orientation"};

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    public final boolean a(vsk vsk) {
        Uri uri = vsk.d;
        if ("content".equals(uri.getScheme())) {
            if ("media".equals(uri.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    public final a a(vsk vsk, int i) {
        PicassoKind picassoKind;
        Bitmap bitmap;
        vsk vsk2 = vsk;
        ContentResolver contentResolver = this.a.getContentResolver();
        int a = a(contentResolver, vsk2.d);
        String type = contentResolver.getType(vsk2.d);
        boolean z = type != null && type.startsWith("video/");
        if (vsk.c()) {
            int i2 = vsk2.h;
            int i3 = vsk2.i;
            if (i2 <= PicassoKind.MICRO.width && i3 <= PicassoKind.MICRO.height) {
                picassoKind = PicassoKind.MICRO;
            } else if (i2 > PicassoKind.MINI.width || i3 > PicassoKind.MINI.height) {
                picassoKind = PicassoKind.FULL;
            } else {
                picassoKind = PicassoKind.MINI;
            }
            PicassoKind picassoKind2 = picassoKind;
            if (!z && picassoKind2 == PicassoKind.FULL) {
                return new a(null, b(vsk), LoadedFrom.DISK, a);
            }
            long parseId = ContentUris.parseId(vsk2.d);
            Options c = c(vsk);
            c.inJustDecodeBounds = true;
            Options options = c;
            a(vsk2.h, vsk2.i, picassoKind2.width, picassoKind2.height, c, vsk);
            if (z) {
                bitmap = Thumbnails.getThumbnail(contentResolver, parseId, picassoKind2 == PicassoKind.FULL ? 1 : picassoKind2.androidKind, options);
            } else {
                bitmap = Images.Thumbnails.getThumbnail(contentResolver, parseId, picassoKind2.androidKind, options);
            }
            if (bitmap != null) {
                return new a(bitmap, null, LoadedFrom.DISK, a);
            }
        }
        return new a(null, b(vsk), LoadedFrom.DISK, a);
    }

    private static int a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
