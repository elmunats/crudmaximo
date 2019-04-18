package com.elmunats.crudmaximo.utils;

import android.content.Context;

import org.greenrobot.essentials.Base64;
import org.greenrobot.essentials.hash.Murmur3F;

/**
 * Created by Reja on 17,January,2019
 * Jakarta, Indonesia.
 */
public class StringUtils {

    /**
     * Get String resources value
     *
     * @param context
     * @param stringResource
     * @return
     */
    public static String getStringResources(Context context, int stringResource){
        return context.getResources().getString(stringResource);
    }

    /**
     * Generate hash string
     *
     * @param string
     * @return
     */
    public static String encodeHash(String string){
        Murmur3F murmur3F = new Murmur3F();
        murmur3F.update(string.getBytes());
        String hash = murmur3F.getValueHexString();
        return org.greenrobot.essentials.StringUtils.md5(hash);
    }

    /**
     * Encode string to base64
     *
     * @param string
     * @return
     */
    public static String encodeToBase64(String string){
        return Base64.encodeBytes(string.getBytes());
    }


}
