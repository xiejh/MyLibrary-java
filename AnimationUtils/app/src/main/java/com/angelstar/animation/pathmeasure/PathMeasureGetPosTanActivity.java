/**
 * jackyang   2017-01-03 19:29
 * Copyright (c)2017 AngelStar Co.Ltd. All right reserved.
 */
package com.angelstar.animation.pathmeasure;

import android.os.Bundle;

import com.angelstar.animation.BaseActivity;
import com.angelstar.animation.R;

/**
 * class description here@ybj
 *
 * @author jackyang
 * @version 1.0.0
 * @since 2017-01-03 19:29
 */
public class PathMeasureGetPosTanActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_pathmeasuregetpostan);
        initToolBar(true, R.string.path_measure_getpostan);
    }
}