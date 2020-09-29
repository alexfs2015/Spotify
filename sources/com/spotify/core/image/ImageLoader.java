package com.spotify.core.image;

import java.io.FileDescriptor;

public class ImageLoader implements ImageLoaderInterface {
    private long nImageLoaderPtr;

    public native boolean writeImageToPipe(String str, FileDescriptor fileDescriptor);

    private ImageLoader() {
    }
}
