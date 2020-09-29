package com.spotify.core.image;

import java.io.FileDescriptor;

public class ImageLoader implements ImageLoaderInterface {
    private long nImageLoaderPtr;

    private ImageLoader() {
    }

    public native boolean writeImageToPipe(String str, FileDescriptor fileDescriptor);
}
