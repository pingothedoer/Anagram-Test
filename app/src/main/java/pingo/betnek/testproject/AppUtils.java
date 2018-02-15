package pingo.betnek.testproject;

import android.widget.Toast;

/**
 * Created by M. Ali Ansari
 * on 15/02/2018.
 */

public class AppUtils {

    /**
     * Show Toast message for a short time
     *
     * @param message {@link String} message
     */
    public static void showShortToast(String message) {
        Toast.makeText(MyApplication.getContext(), message, Toast.LENGTH_SHORT).show();
    }


    /**
     * Show Toast message for a short time
     *
     * @param stringResID int resource id for string
     */
    public static void showShortToast(int stringResID) {
        Toast.makeText(MyApplication.getContext(), MyApplication.getContext().getString(stringResID), Toast.LENGTH_SHORT).show();
    }
}
