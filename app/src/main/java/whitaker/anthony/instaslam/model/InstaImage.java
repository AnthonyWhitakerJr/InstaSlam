package whitaker.anthony.instaslam.model;

import android.net.Uri;

/**
 * @author Anthony Whitaker.
 */
public class InstaImage {
    private Uri imageResourceUri;

    public InstaImage(Uri imageResourceUri) {
        this.imageResourceUri = imageResourceUri;
    }

    public Uri getImageResourceUri() {
        return imageResourceUri;
    }
}
