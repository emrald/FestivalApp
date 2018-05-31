package interfaces;

import android.graphics.Bitmap;

/**
 * Created by TI A1 on 11-08-2017.
 */
public interface ScreenShotable {
    public void takeScreenShot();

    public Bitmap getBitmap();
}